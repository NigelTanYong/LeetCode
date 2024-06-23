class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        total_tank = 0
        curr_tank = 0
        starting_station = 0
        
        for i in range(len(gas)):
            total_tank += gas[i] - cost[i]
            curr_tank += gas[i] - cost[i]
            
            # If car cannot reach the next station
            if curr_tank < 0:
                # Start from the next station
                starting_station = i + 1
                curr_tank = 0
        
        return starting_station if total_tank >= 0 else -1