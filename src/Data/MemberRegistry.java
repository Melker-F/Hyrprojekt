package Data;

import Member.Member;

import java.util.ArrayList;

public class MemberRegistry {
    private ArrayList<Member> memberreg = new ArrayList<>();

    public MemberRegistry() {
    }

    public void loadMemberData() {
        memberreg.add(new Member(0, "Melker", "Standard"));
        memberreg.add(new Member(1, "Albert", "Standard"));
        memberreg.add(new Member(2, "Bertil", "Standard"));
        memberreg.add(new Member(3, "Carl",   "Premium"));
        memberreg.add(new Member(4, "Daniel", "Premium"));
        memberreg.add(new Member(5, "Erik",   "Premium"));
    }

    public ArrayList<Member> getMemberreg() {
        return this.memberreg;
    }
}