class t{
  public static void main(String[] args) {
    String s="abcdefghijklmnopqrst";
    int n=s.length();
    String gh=s.toLowerCase();
    System.out.println(gh);
    for (int i=0;i<n ;i++ ) {
    if (gh.charAt(i)=='a' || gh.charAt(i)=='e' || gh.charAt(i)=='i' ||
     gh.charAt(i)=='o' ||gh.charAt(i)=='u' ) {
      System.out.println("vowels");
      System.out.println("Index of the vowels is : " + i);
    }
    }

    }
  }
