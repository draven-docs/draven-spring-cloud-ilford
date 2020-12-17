package noxus.draven.ilford.rc.controller;

import noxus.draven.ilford.rc.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能概述〉<br>
 *
 * @className: ProviderController
 * @package: noxus.draven.ilford.rc.controller
 * @author: draven
 * @date: 2020/12/17 14:48
 */
@RestController
@RequestMapping("pro")
public class ProviderController {

    @Autowired
    private ProviderService providerService;


    @RequestMapping("/provider")
    public String testComsumer() {
        String provider = providerService.provider();
        return provider;
    }
}
