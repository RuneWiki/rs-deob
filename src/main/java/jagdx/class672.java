package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/gfa")
public class class672 {

    @OriginalMember(owner = "client!jagdx/gfa", name = "a", descriptor = "(II)Z")
    public static final boolean method3775(int arg0, int arg1) {
        if (arg1 != 10067) {
            method3776(2, (byte) -78);
        }
        return arg0 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/gfa", name = "a", descriptor = "(IB)Z")
    public static final boolean method3776(int arg0, byte arg1) {
        if (arg1 <= 31) {
            return true;
        } else {
            return arg0 < 0;
        }
    }
}
