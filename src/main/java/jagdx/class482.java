package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bba")
public class class482 {

    @OriginalMember(owner = "client!jagdx/bba", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2873(int arg0, int arg1) {
        if (arg0 > -68) {
            return false;
        } else {
            return arg1 >= 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/bba", name = "b", descriptor = "(II)Z", line = 35)
    public static final boolean method2874(int arg0, int arg1) {
        if (arg1 == 0) {
            return arg0 < 0;
        } else {
            return true;
        }
    }
}
