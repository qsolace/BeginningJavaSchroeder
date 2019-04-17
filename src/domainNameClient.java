public class domainNameClient {
    public static void main(String[] args){
        Domain domain1 = new Domain();
        Domain domain2 = new Domain();//making objects
        Domain blah = new Domain();
        domain1.setDomainName("mcdmproductions.com");
        domain2.setDomainName("www.critrole.com");
        blah.setDomainName("blahblahblah,,,sdf");//assigning values
        System.out.println(domain2.toString());//printing the String
        System.out.println(domain2.hasWWW()+", "+domain1.hasWWW());//printing whether or not it has a www
        System.out.println(domain2.extension());//printing the extension (com)
        System.out.println(domain2.name());//printing the main part (critrole)
    }
}
