package pers.ll.demo.patterns.state.vote;

/**
 * 投票状态抽象类
 * @author ll
 * @date 2018/12/5 10:34 AM
 */
public interface VoteState {

    /**
     * 投票方法
     * @param user  投票人
     * @param voteItem  投票项
     * @param voteManager   投票上下文，用来在实现状态对应的功能处理时，可以回调上下文的数据
     */
    public void vote(String user, String voteItem, VoteManager voteManager);

}
