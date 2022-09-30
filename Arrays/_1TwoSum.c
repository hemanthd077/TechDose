int* twoSum(int* nums, int numsSize, int target, int* returnSize){

    int *ptr=NULL;
    ptr=(int*)malloc(sizeof(int)*2);
    *returnSize=2;
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                ptr[0]=i;
                ptr[1]=j;
                break;
            }
        }
    }
    return ptr;
    
}