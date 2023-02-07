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

    public void invokeService(String cloud, String service){

        this.cloudProviders.add(new Amazon());
        this.cloudProviders.add(new Google());
        this.cloudProviders.add(new Microsoft());

        serviceOfferings.add(new Bastion());
        serviceOfferings.add(new Bot());
        serviceOfferings.add(new DialogFlow());
        serviceOfferings.add(new Lambda());
        serviceOfferings.add(new SQS());
        serviceOfferings.add(new Vertex());

        this.cloudProviders.stream()
            .filter( provider -> provider.detect(cloud))
            .map(provider -> provider.getProvider())
            .findFirst()
            .ifPresent(cloudProvider -> this.serviceOfferings.stream()
                .filter( serviceOffer -> serviceOffer.detect(service))
                .findFirst()
                .ifPresent(serviceOffer -> serviceOffer.runCommand(cloudProvider)));
    }

}
