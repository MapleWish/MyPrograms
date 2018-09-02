/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdlib.h>//使用malloc
int* twoSum(int* nums, int numsSize, int target) {
    int i;
    int j;
    int *a = (int*)malloc(2*sizeof(int));//此处使用2*sizeof(int) 是让a指向两个int类型的数据
    for(i=0;i<numsSize;i++)
        for(j=i+1;j<numsSize&&j!=i;j++)
            if(nums[i]+nums[j]==target)
            {
                a[0]=i;
                a[1]=j;
            }
    return a;
}