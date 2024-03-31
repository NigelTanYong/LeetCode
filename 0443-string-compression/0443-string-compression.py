class Solution:
    def compress(self, chars: List[str]) -> int:
        index = 0  # Index to track the current position in the modified list
        i = 0  # Index to iterate through the original list
        
        while i < len(chars):
            current_char = chars[i]
            count = 0
            # Count consecutive occurrences of the current character
            while i < len(chars) and chars[i] == current_char:
                i += 1
                count += 1
            # Write the character to the compressed list
            chars[index] = current_char
            index += 1
            # If count is greater than 1, write its digits to the compressed list
            if count > 1:
                for digit in str(count):
                    chars[index] = digit
                    index += 1
        
        return index  # Return the new length of the compressed list