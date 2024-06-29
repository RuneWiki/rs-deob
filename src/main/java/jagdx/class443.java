package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/vba")
public class class443 {

    @OriginalMember(owner = "client!jagdx/vba", name = "a", descriptor = "(II)Z", line = 21)
    public static final boolean method2538(int arg0, int arg1) {
        if (arg0 == -1) {
            return arg1 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/vba", name = "a", descriptor = "(IB)Z", line = 32)
    public static final boolean method2539(int arg0, byte arg1) {
        if (arg1 > -63) {
            return false;
        } else {
            return arg0 < 0;
        }
    }
}
