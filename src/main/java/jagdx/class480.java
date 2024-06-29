package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/op")
public class class480 {

    @OriginalMember(owner = "client!jagdx/op", name = "a", descriptor = "(IB)Z", line = 17)
    public static final boolean method2879(int arg0, byte arg1) {
        if (arg1 > -93) {
            return true;
        } else {
            return arg0 >= 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/op", name = "a", descriptor = "(BI)Z", line = 27)
    public static final boolean method2880(byte arg0, int arg1) {
        if (arg0 > -25) {
            return true;
        } else {
            return arg1 < 0;
        }
    }
}
