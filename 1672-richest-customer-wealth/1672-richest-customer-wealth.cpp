class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) { //2D vector; & is to reference to the 2d vector of accounts
        int latestMaxWealth = 0;
//         auto deduces the type of each element in the container being iterated. & denotes that customer is a reference variable.
        for (const auto& customer : accounts) {
            int curWealth = 0;
            
            for (int bank : customer) {
                curWealth += bank;
            }
            
            latestMaxWealth = max(latestMaxWealth, curWealth);
        }
        
        return latestMaxWealth;
    }
};