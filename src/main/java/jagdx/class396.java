package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fe")
public class class396 {

    @OriginalMember(owner = "client!jagdx/fe", name = "a", descriptor = "(II)Z")
    public static final boolean method2411(int arg0, int arg1) {
        if (arg0 == 32025) {
            return arg1 < 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/fe", name = "a", descriptor = "(BI)Z")
    public static final boolean method2412(byte arg0, int arg1) {
        if (arg0 > -12) {
            return true;
        } else {
            return arg1 >= 0;
        }
    }
}
