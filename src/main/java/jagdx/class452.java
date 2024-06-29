package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/nba")
public class class452 {

    @OriginalMember(owner = "client!jagdx/nba", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method2565(int arg0, int arg1) {
        int var2 = 34 % ((arg1 - 27) / 42);
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/nba", name = "a", descriptor = "(IB)Z", line = 31)
    public static final boolean method2566(int arg0, byte arg1) {
        if (arg1 >= -18) {
            method2566(22, (byte) -15);
        }
        return arg0 >= 0;
    }
}
