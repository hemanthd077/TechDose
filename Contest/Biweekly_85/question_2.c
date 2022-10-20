

int secondsToRemoveOccurrences(char * s){
    int len=strlen(s);
    int cnt=0;
    int flag=0;
    for(int i=0;i<len;i++){
        if(s[i]<s[i+1]){
            flag=1;
            break;
        }
    }
    if(flag==0){
        return cnt;
    }
    while(true){
        int tag=0;
        for(int i=0;i<len;i++){
            if(s[i]=='0' && s[i+1]=='1'){
                s[i]='1';
                s[i+1]='0';
                i+=1;
            }
        }
        for(int i=0;i<len-1;i++){
            if(s[i]<s[i+1]){
                tag=0;
                break;
            }
            else{
                tag=1;
            }
        }
        cnt++;
        if(tag==1){
            return cnt;
        }
    }
    return cnt;
}