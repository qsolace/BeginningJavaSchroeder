/*
Ryan Schroeder
16 April 2019

 */

public class Domain {
    private String domainName;
    public void setDomainName(String domainName1){domainName=domainName1;}//a mutator for the domainName object

    public String toString(){return domainName;}//accessor for domainName

    public boolean hasWWW(){
        if (domainName.indexOf("www")==0){//checks to see if "www" is the first 3 chars.
            return true;
        }
        else{
            return false;
        }
    }
    public String extension(){
        String ending = domainName;
        int indexDot;
        if (ending.indexOf('.')!=-1){//checks to see if there is a '.'
            while (ending.indexOf('.')!=-1){
                indexDot = ending.indexOf('.');//goes through all '.'s and deletes them (as well as everything before them)
                ending = ending.substring(indexDot+1);
            }
            return ending;//returns what's after the last '.'
        }
        else{
            return "unknown";
        }
    }
    public String name(){
        String mainName = domainName;
        int indexDot;
        if (mainName.indexOf('.')!=-1){//removes the first '.', and everything before
            indexDot = mainName.indexOf('.');
            mainName=mainName.substring(indexDot+1);

            if (mainName.indexOf('.')!=-1){
                indexDot = mainName.indexOf('.');//removes the last dot, and everything after
                mainName=mainName.substring(0,indexDot);
                return mainName;//returns what's left
            }
            else{
                return "unknown";//if only one '.', return "unknown"
            }
        }
        else{
            return "unknown";//if no '.', return "unknown"
        }
    }

}

