def isConvertable(dataset):
    result = []
    for s in dataset:
        result.append(can_balance(s))
    return result
    
def is_balanced(s):
    stack = []
    for char in s:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if not stack:
                return False
            stack.pop()
    return not stack

def can_balance(s):
    if is_balanced(s):
        return 1
    
    for i in range(len(s)):
        for j in range(i+1,len(s)):
                new_s = s[:i] + s[j] + s[i+1:j] + s[i] + s[j+1:]
                if is_balanced(new_s):
                    return 1
    return 0
