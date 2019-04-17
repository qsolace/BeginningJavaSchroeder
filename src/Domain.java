public class Domain {
    private String domainName;
    public void setDomainName(String domainName1){domainName=domainName1;}
    public String toString(){return domainName;}
    public boolean hasWWW(){
        if (domainName.indexOf("www")==0){
            return true;
        }
        else{
            return false;
        }
    }
    public String extension(){
        String ending = domainName;
        int indexDot;
        if (ending.indexOf('.')!=-1){
            while (ending.indexOf('.')!=-1){
                indexDot = ending.indexOf('.');
                ending = ending.substring(indexDot+1);
            }
            return ending;
        }
        else{
            return "unknown";
        }
    }
    public String name(){
        String mainName = domainName;
        int indexDot;
        int indexDot2;
        if (mainName.indexOf('.')!=-1){
            indexDot = mainName.indexOf('.');
            mainName=mainName.substring(indexDot+1);
            if (mainName.indexOf('.')!=-1){
                indexDot2 = mainName.indexOf('.');
                mainName=mainName.substring(0,indexDot2);
                return mainName;
            }
            else{
                return "unknown";
            }
        }
        else{
            return "unknown";
        }
    }

}

