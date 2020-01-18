package de.naserbayat.restapispk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpkDomainRoleController {

    @RequestMapping("/spkdomainrole")
    public SpkDomainRole spkdomainrole(@RequestParam (value="deviceId", defaultValue="3" ) long deviceId) {
        return new SpkDomainRole(deviceId);
    }
}
