public class reverseWordsInAnArray {

        public String reverseWords(String s) {
            s= s.trim();
            String res="";
            String str[]= s.split("\\s+");
            int left=0;
            int right=str.length-1;
            for(int i=str.length-1;i>=0;i--)
            {
                res+=str[i];
                if(i!=0)
                    res+=" ";

            }
            return res;


        }
    }

