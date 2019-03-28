package pers.ll.demo.patterns.state.vote;

/**
 * 黑名单
 *
 * @author ll
 * @date 2018/12/11 10:57 AM
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
