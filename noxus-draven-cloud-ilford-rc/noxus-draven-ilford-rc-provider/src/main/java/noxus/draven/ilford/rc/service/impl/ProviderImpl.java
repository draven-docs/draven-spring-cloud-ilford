package noxus.draven.ilford.rc.service.impl;

import noxus.draven.ilford.rc.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * 〈功能概述〉<br>
 *
 * @className: ProviderImpl
 * @package: noxus.draven.ilford.rc.service.impl
 * @author: draven
 * @date: 2020/12/17 14:49
 */
@Service
public class ProviderImpl implements ProviderService {
    @Override
    public String provider() {

        return "巴扎黑";
    }
}
