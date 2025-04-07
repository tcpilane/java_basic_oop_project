package Bakery.NonAbstract;

class MatchaCookie extends Cookie{
    MatchaCookie() {
        super( "Matcha");
    }
    public static void main(String[] args){
        MatchaCookie mc = new MatchaCookie();
        System.out.println("We now have " + flavor + " flavored cookies!" );
    }
}