package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/dt")
public class class407 {

    @OriginalMember(owner = "client!jagdx/dt", name = "a", descriptor = "(II)Z")
    public static final boolean method2320(int arg0, int arg1) {
        if (arg1 == -2005530590) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/dt", name = "a", descriptor = "(BI)Z")
    public static final boolean method2321(byte arg0, int arg1) {
        if (arg0 < 8) {
            return false;
        } else {
            return arg1 < 0;
        }
    }
}
