// set per environment MongoDB
environments {
	development {
		grails {
			mongo {
				host = 'ec2-50-18-138-171.us-west-1.compute.amazonaws.com'
				port = 27017
				databaseName = 'dev'
				username = 'dev'
				password = 'dev'
			}
		}
	}

	test {
		grails {
			mongo {
				host = 'ec2-50-18-138-171.us-west-1.compute.amazonaws.com'
				port = 27017
				databaseName = 'test'
				username = 'test'
				password = 'test'
			}
		}
	}

	stage {
		grails {
			mongo {
				host = 'ec2-50-18-138-171.us-west-1.compute.amazonaws.com'
				port = 27017
				databaseName = 'stage'
				username = 'stage'
				password = 'stage'
			}
		}
	}

	production {
		grails {
			mongo {
				host = 'ec2-50-18-138-171.us-west-1.compute.amazonaws.com'
				port = 27017
				databaseName = 'test'
				username = 'test'
				password = 'test'
			}
		}
	}
}