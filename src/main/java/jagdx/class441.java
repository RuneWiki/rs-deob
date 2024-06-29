package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hb")
public class class441 {

    @OriginalMember(owner = "client!jagdx/hb", name = "a", descriptor = "(IB)Z")
    public static final boolean method2451(int arg0, byte arg1) {
        if (arg1 >= -36) {
            method2452(-22, (byte) -67);
        }
        return arg0 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/hb", name = "b", descriptor = "(IB)Z")
    public static final boolean method2452(int arg0, byte arg1) {
        if (arg1 <= 85) {
            return false;
        } else {
            return arg0 < 0;
        }
    }
}
