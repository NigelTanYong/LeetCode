int maximumWealth(int** accounts, int accountsSize, int* accountsColSize){
        int latestMaxWealth = 0;

   for (int i = 0; i < accountsSize; i++) {

        int curWealth = 0;
        
        for (int j = 0; j < accountsColSize[i]; j++) {
            curWealth += accounts[i][j];
        }
        
        latestMaxWealth = (curWealth > latestMaxWealth) ? curWealth : latestMaxWealth;
    }
    
    return latestMaxWealth;
}