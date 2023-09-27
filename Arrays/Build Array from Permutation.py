class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        k=[]
        for i in range(len(nums)):
            k.append(nums[nums[i]])

        return k
            