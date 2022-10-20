

int longestContinuousSubstring(char * s){
    int len=strlen(s);
    int max=0,ctr=0;
        for(int i=0;i<len;i++){
            ctr=1;
            if((s[i]+1) == s[i+1]){
                for(int j=i;j<=len;j++){
                    if((s[j]+1) == s[j+1]){
                        ctr++;
                    }
                    else{
                        i=j;
                        break;
                    }
                }
            }
            if(max<ctr){
                max=ctr;
            }
        }
    if(len==1 || max==0){
        return 1;
    }
    return max;
}