package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/aha")
public class class509 {

    @OriginalMember(owner = "client!jagdx/aha", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method3048(int arg0, int arg1) {
        if (arg0 == -1) {
            return arg1 >= 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jagdx/aha", name = "b", descriptor = "(II)Z", line = 34)
    public static final boolean method3049(int arg0, int arg1) {
        if (arg0 == -1) {
            return arg1 < 0;
        } else {
            return false;
        }
    }
}
