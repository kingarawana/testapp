// BootStrap.groovy
import com.test.User
 
class BootStrap {
    def springSecurityService
 
    def init = { servletContext ->
        User admin = User.findByUsername('admin') ?:
            new User(username: 'admin',
                    password: springSecurityService.encodePassword('admin'),
                    enabled: true, accountLocked: false,
                    accountExpired: false, passwordExpired: false).save(flush: true)
 
        if (admin.hasErrors()) {
            admin.errors.each { println it }
        }
    }
 
    def destroy = {
    }
}