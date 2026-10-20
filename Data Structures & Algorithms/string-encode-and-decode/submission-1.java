class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();
        int length;
        for(String st: strs)
        {
            length = st.length();
            res.append(length).append('#');
            res.append(st);
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int i = 0, j=0;
        int s=0, e=0;
        int sAct, eAct,len;
        

        for(i=0;i<str.length();)
        {
            j = i;

            while(str.charAt(j)!='#')
            {
                j++;
            }

            len= Integer.parseInt(str.substring(i,j));
            sAct = j+1;
            eAct = sAct + len;
            temp.append(str.substring(sAct,eAct));
            i = eAct;
            res.add(temp.toString());
            temp.setLength(0);
            //s = ;
        }

        return res;
    }
}
