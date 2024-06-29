package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/aq")
public class class507 {

    @OriginalMember(owner = "client!jagdx/aq", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2946(int arg0, int arg1) {
        int var2 = 25 / ((25 - arg0) / 61);
        return arg1 < 0;
    }

    @OriginalMember(owner = "client!jagdx/aq", name = "b", descriptor = "(II)Z", line = 33)
    public static final boolean method2947(int arg0, int arg1) {
        if (arg1 > -2) {
            return false;
        } else {
            return arg0 >= 0;
        }
    }
}
