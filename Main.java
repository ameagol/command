import command.Commander;

public class Main {
    public static void main(String[] args) {
//        String cloudProvider = "gcp";
//        String serviceProvider = "vertex";
//
//        System.out.println(getCloudData(cloudProvider, serviceProvider));

        Commander commander = new Commander();
        commander.invokeService("azzure", "lambda");

    }

//    public static String getCloudData(String cloudProvider, String serviceProvider){
//        if(cloudProvider.equals("aws")){
//            if(serviceProvider.equals("lambda")){
//                return "https://docs.aws.amazon.com/lambda";
//            } else if (serviceProvider.equals("sqs")){
//                return "https://docs.aws.amazon.com/sqs";
//            }
//        }else if(cloudProvider.equals("azzure")){
//            if(serviceProvider.equals("bot")){
//                return "https://azure.microsoft.com/en-us/products/bot-services/";
//            } else if (serviceProvider.equals("bastion")){
//                return "https://azure.microsoft.com/en-us/services/azure-bastion/";
//            } else if (serviceProvider.equals("edge")){
//                return "https://azure.microsoft.com/en-us/products/azure-sql/edge/";
//            }
//        }else if(cloudProvider.equals("gcp")){
//            if(serviceProvider.equals("vertex")){
//                return "https://cloud.google.com/vertex-ai";
//            } else if (serviceProvider.equals("dialogflow")){
//                return "https://cloud.google.com/dialogflow";
//            } else if (serviceProvider.equals("visionai")){
//                return "https://cloud.google.com/vision";
//            }
//        }
//        return null;
//    }
}