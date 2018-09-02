#include <stdio.h>

int main()
{
    int n, i;
    scanf("%d",&n);

    while(n!=1)
    {
        if(n%2==0)
            n = n / 2;
        else
            n=(3*n+1)/2;
        i=i+1;
    }
    printf("%d",i);
    return 0;
}
