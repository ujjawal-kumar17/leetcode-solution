class Solution:
    def candy(self, ratings: List[int]) -> int:
        ratings_length = len(ratings)
        ans = [1] * ratings_length

        for i in range(1, ratings_length):
            print(ratings[i], ratings[i - 1])
            if ratings[i] > ratings[i - 1]:
                ans[i] = ans[i - 1] + 1

            print(f"Index {i}: {ans[i]}")

        for i in range(ratings_length - 2, -1, -1):
            print(ratings[i], ratings[i + 1])
            if ratings[i] > ratings[i + 1]:
                ans[i] = max(ans[i + 1] + 1, ans[i])
        
            print(f"Index {i}: {ans[i]}")

        return sum(ans)