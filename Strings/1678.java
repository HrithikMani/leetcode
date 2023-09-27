class Solution(object):
    def interpret(self, command):
        """
        :type command: str
        :rtype: str
        """
        ans = ""
        i=0
        while(i<len(command)):
            if(command[i] == '('):
                if(command[i+1]==')'):
                    ans = ans + "o"
                    i=i+1
                else:
                    ans=ans+"al"
                    i=i+4
                    
            elif(command[i] == ')'):
                i=i+1
                continue
            else:
                ans = ans+command[i]
                i=i+1
        return ans
        