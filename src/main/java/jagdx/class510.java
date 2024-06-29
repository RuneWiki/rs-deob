package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ud")
public class class510 {

    @OriginalMember(owner = "client!jagdx/ud", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method2954(int arg0, int arg1) {
        if (arg0 != 0) {
            method2954(-28, 97);
        }
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/ud", name = "a", descriptor = "(IB)Z", line = 33)
    public static final boolean method2955(int arg0, byte arg1) {
        if (arg1 == -100) {
            return arg0 < 0;
        } else {
            return true;
        }
    }
}
