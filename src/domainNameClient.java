public class domainNameClient {
    public static void main(String[] args){
        Domain yahoo = new Domain();
        Domain google = new Domain();
        Domain blah = new Domain();
        google.setDomainName("google.com");
        yahoo.setDomainName("www.yahoo.com");
        blah.setDomainName("blahblahblah,,,sdf");
        System.out.println(yahoo.toString());
        System.out.println(yahoo.hasWWW()+", "+google.hasWWW());
        System.out.println(yahoo.extension());
        System.out.println(yahoo.name());
    }
}
