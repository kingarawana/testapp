package com.test.admin

import com.test.Asset

class UserController {

    def hitme = {
		println "hello3"
//		Asset newAss = new Asset();
//		newAss.setName("myTestAsset");
//		newAss.save();
		println Asset.findByName("0000.jpg").getData();
		
//		Madeup up = new Madeup();
//		up.setName("hello2");
//		up.setAlias('alias')
//		up.setData "data"
//		up.setKind "kind"
//		up.setShop "shop"
//		println up;
//		up.save(flush: true);
//		println up;
		
//		println Madeup.findByName("hello").getName();
		//Asset asset = Asset.get("4e37737dde72420b5c0fdd91");
		//println asset.getAlias();
	}
}
