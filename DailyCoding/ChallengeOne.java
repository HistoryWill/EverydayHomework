  public class ChallengeOne{
/*
Description

No more hiding from your alarm clock! You've decided you want your computer to keep you updated on the time so you're never late again. A talking clock takes a 24-hour time and translates it into words.

Input Description

An hour (0-23) followed by a colon followed by the minute (0-59).

Output Description

The time in words, using 12-hour format followed by am or pm.

Sample Input data

00:00
01:30
12:05
14:01
20:29
21:00
Sample Output data

It's twelve am
It's one thirty am
It's twelve oh five pm
It's two oh one pm
It's eight twenty nine pm
It's nine pm
*/
    public static void main(String args[]){
        String x=wordtalker("13:31");
        System.out.println(x);
    }


    public static String wordtalker(String x){
        String q = hourdecoder(x.substring(0,x.indexOf(":")));
        System.out.println(q);

        String m = minuteedcoder(x.substring(x.indexOf(":")));
        System.out.println(m);

        q = q.replace(":", m);

        return (("It's " +q));
    }

      public static String hourdecoder(String x){
          int y = Integer.valueOf(x);
          if(y-12 < 0){

              return (indexHour(y) + ":" + " am");
          }else
              return (indexHour(y-12) + ":" + " pm");

      }

      public static String indexHour(int x){

        switch(x){
            case 1:
                return ("one");

            case 2:
                return ("two");

            case 3:
                return ("three");

            case 4:
                return ("four");

            case 5:
                return ("five");

            case 6:
                return ("six");

            case 7:
                return ("seven");

            case 8:
                return ("eight");

            case 9:
                return ("nine");

            case 10:
                return ("ten");

            case 11:
                return ("eleven");

            case 12:
                return ("twelve");
            case 13:
                return ("thirteen");
            case 14:
                return ("fourteen");
            case 15:
                return ("fifteen");
            case 16:
                return ("sixteen");
            case 17:
                return ("seventeen");
            case 18:
                return ("eighteen");
            case 19:
                return ("nineteen");

            default:
                return ("F");



        }

      }

    public static String minuteedcoder(String x){
//        System.out.println(Integer.valueOf(x.charAt())
        switch(Integer.
                valueOf(""+(x.charAt(1)))){

            case 0:
                return ("oh " + indexHour(Integer.valueOf(""+(x.charAt(2)))));
            case 1:
                return (" "+indexHour(Integer.valueOf(x.substring(1)))+" ");
            case 2:
                return (" twenty " +indexHour((Integer.valueOf(""+(x.charAt(2))))));
            case 3:
                return (" thirty " +indexHour((Integer.valueOf(""+(x.charAt(2))))));
            case 4:
                return (" fourty " +indexHour((Integer.valueOf(""+(x.charAt(2))))));
            case 5:
                return (" fifty " +indexHour((Integer.valueOf(""+(x.charAt(2))))));
           default:
               return ("f");
        }

    }



  }
