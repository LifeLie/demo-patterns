package pers.ll.demo.patterns.state.vote;

/**
 * 正常投票
 * @author ll
 * @date 2018/12/5 10:39 AM
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getVoteMap().put(user, voteItem);
        System.out.println("投票成功！");
    }
}
