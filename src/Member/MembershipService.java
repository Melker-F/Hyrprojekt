package Member;

import Data.MemberRegistry;

import java.util.List;

public class MembershipService {
    private MemberRegistry memberRegistry;

    public MembershipService(MemberRegistry memberRegistry) {
        this.memberRegistry = memberRegistry;
    }

    public Member findById(int id) {
        return memberRegistry.findById(id);
    }

    public Member addMember(String name, String level) {
        return memberRegistry.addMember(name, level);
    }

    public List<Member> getAllMembers() {
        return memberRegistry.getMemberreg();
    }
    //Logiken för att ändra medlemmar
    public Member changeMember(int memberId, String name, String level) {
        Member m = findById(memberId);
        m.setName(name);
        m.setLevel(level);
        return m;
    }
}
