package logbacktasks;

import org.slf4j.*;

public class Solution {

    private static final Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int add(int arg1, int arg2) {
        int sum = arg1 + arg2;

        LOGGER.debug("arg1={}, arg2={}, sum={}", arg1, arg2, sum);

        return sum;
    }

}
