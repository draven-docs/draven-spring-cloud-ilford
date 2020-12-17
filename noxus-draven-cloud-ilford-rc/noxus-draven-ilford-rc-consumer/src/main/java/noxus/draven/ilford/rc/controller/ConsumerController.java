package noxus.draven.ilford.rc.controller;

import noxus.draven.ilford.rc.feginclients.ProviderFegins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能概述〉<br>
 *
 * @className: ConsumerController
 * @package: noxus.draven.ilford.rc.controller
 * @author: draven
 * @date: 2020/12/17 14:46
 */

@RestController
@RequestMapping
public class ConsumerController {


    @Autowired
    private ProviderFegins providerFegins;


    @RequestMapping("/consumer")
    public String testComsumer(){
        String provider = providerFegins.provider();
        return provider;
    }

}
