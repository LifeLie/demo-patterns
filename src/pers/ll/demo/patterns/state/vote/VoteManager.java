package pers.ll.demo.patterns.state.vote;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 * @author ll
 * @date 2018/12/6 4:35 PM
 */
public class VoteManager {

    /**
     * 持有状态处理对象
     */
    private VoteState voteState = null;

    /**
     * 记录用户投票结果，《用户名称，投票选项》
     */
    private Map<String, String> voteMap = new HashMap<>();

    /**
     * 记录用户投票次数，《用户名称，投票次数》
     */
    private Map<String, Integer> voteCountMap = new HashMap<>();

    /**
     * 投票
     * @param user  投票人
     * @param voteItem  投票选项
     */
    public void vote(String user, String voteItem) {
        // TODO
        // 1.从记录中取出该用户的已有的投票次数，增加
        Integer count = voteCountMap.get(user);
        if (count == null) {
            count = 0;
        }
        count++;
        voteCountMap.put(user, count);

        // 2.判断用户的投票状态，是正常投票、重复投票、恶意投票还是上黑名单的状态
        if (count == 1) {
            voteState = new NormalVoteState();
        }

    }


    public Map<String, String> getVoteMap() {
        return voteMap;
    }
}
