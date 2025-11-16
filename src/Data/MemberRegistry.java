package Data;

import Member.Member;

import java.util.*;

public class MemberRegistry {
    private List<Member> memberreg = new ArrayList<>();

    public MemberRegistry() {
    }
    //Laddar in alla medlemmar i listan
    public void loadMemberData() {
        memberreg.add(new Member(0, "Melker", "Standard"));
        memberreg.add(new Member(1, "Albert", "Standard"));
        memberreg.add(new Member(2, "Bertil", "Standard"));
        memberreg.add(new Member(3, "Carl",   "Premium"));
        memberreg.add(new Member(4, "Daniel", "Premium"));
        memberreg.add(new Member(5, "Erik",   "Premium"));
    }

    public List<Member> getMemberreg() {
        return this.memberreg;
    }
    //Logiken för att lägga till medlemmar
    public Member addMember(String name, String level){
        int newId = generateNextId();
        Member member = new Member(newId, name, level);
        memberreg.add(member);
        return member;
    }
    //logiken för att lägga till nya id på medlemmar
    private int generateNextId() {
        int maxId = -1;
        for (Member m : memberreg) {
            if (m.getId() > maxId) {
                maxId = m.getId();
            }
        }
        return maxId + 1;
    }
    //Söker på medlemmar via ID
    public Member findById(Integer id) {
        for (Member m : memberreg)
            if (id == m.getId()){
                return m;
            }
        return null;
    }
}