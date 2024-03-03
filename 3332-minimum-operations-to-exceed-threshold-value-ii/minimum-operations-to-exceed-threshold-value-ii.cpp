class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
    priority_queue < long, vector < long >, greater < long >>mh;
	int len = nums.size ();
	for (int i = 0; i < len; i++)
	  {
		mh.push (nums[i]);
    }
		int ans = 0;
		while (mh.top () < k)
		  {
			if (mh.top () < k)
			  {
				long long one = mh.top ();
				  mh.pop ();
				long long two = mh.top ();
				  mh.pop ();
				long long nw = one * 2 + two;
				  mh.push (nw);
				  ans++;

			  }
		  }
		return ans;

    }
};
