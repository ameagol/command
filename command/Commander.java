package command;

import clouds.Amazon;
import clouds.Google;
import clouds.Microsoft;
import repository.ICloudProvider;
import repository.IServiceOffering;
import services.*;

import java.util.*;

public class Commander {

    private Set<ICloudProvider> cloudProviders = new HashSet<>();
    private Set<IServiceOffering> serviceOfferings = new HashSet<>();

    public String getCloudService(String cloud, String service){

        this.cloudProviders.add(new Amazon());
        this.cloudProviders.add(new Google());
        this.cloudProviders.add(new Microsoft());

        serviceOfferings.add(new Bastion());
        serviceOfferings.add(new Bot());
        serviceOfferings.add(new DialogFlow());
        serviceOfferings.add(new Lambda());
        serviceOfferings.add(new SQS());
        serviceOfferings.add(new Vertex());

        String cloudBase = this.cloudProviders.stream()
                .filter( c -> c.detect(cloud))
                .map(p -> p.getProvider())
                .findFirst().orElseThrow();

        String servicePath =  this.serviceOfferings.stream()
                .filter( c -> c.detect(service))
                .map(p -> p.getOffering())
                .findFirst().orElseThrow();

        return cloudBase.concat(servicePath);
    }

}
