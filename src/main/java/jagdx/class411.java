package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/fo")
public class class411 {

    @OriginalMember(owner = "client!jagdx/fo", name = "a", descriptor = "(IZ)Z", line = 24)
    public static final boolean method2435(int arg0, boolean arg1) {
        if (!arg1) {
            method2435(12, true);
        }
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/fo", name = "a", descriptor = "(IB)Z", line = 37)
    public static final boolean method2436(int arg0, byte arg1) {
        if (arg1 <= 35) {
            method2436(-4, (byte) -98);
        }
        return arg0 >= 0;
    }
}
