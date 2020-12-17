package noxus.draven.ilford.rc.feginclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CLOUD-PROVIDER")
public interface ProviderFegins {

    @RequestMapping("/pro/provider")
    public String provider();


}
