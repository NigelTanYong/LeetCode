int numberOfSteps(int num){
    int numStep=0;
    while(num>0){
        if(num%2==0)
            num/=2;
        else
            num--;
        numStep++;
    }
    return numStep;
}