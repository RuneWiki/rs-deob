package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rl")
public class class451 {

    @OriginalMember(owner = "client!jagdx/rl", name = "a", descriptor = "(IB)Z")
    public static final boolean method2726(int arg0, byte arg1) {
        int var2 = 94 % ((arg1 - 23) / 53);
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/rl", name = "a", descriptor = "(II)Z")
    public static final boolean method2727(int arg0, int arg1) {
        if (arg1 == 3102) {
            return arg0 >= 0;
        } else {
            return true;
        }
    }
}
