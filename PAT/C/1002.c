/*
1002 写出这个数 (20)（20 分）
读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10^100^。

输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：

1234567890987654321123456789
输出样例：

yi san wu
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{
    char a;
    int  sum=0;
    char *array[]={"ling", "yi", "er", "san", "si", 
                          "wu", "liu", "qi", "ba", "jiu"};
    while (1)//监视键盘活动
    {
        scanf("%c", &a);
        if(a=='\n')
            break;//当输入回车时跳出
        a = a - '0';
        sum = sum + a;
    }
    if(sum/1000)//千分位，存在就输出
        printf("%s ", array[sum / 1000]);
    if(sum/100)//百分位
        printf("%s ", array[sum / 100%10]);
    if(sum/10)//十分位
        printf("%s ", array[sum / 10 % 10]);
    printf("%s", array[sum %10]);//靠%10求出各末位的数字

    return 0;
}
