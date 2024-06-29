package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rn")
public class class510 {

    @OriginalMember(owner = "client!jagdx/rn", name = "a", descriptor = "(II)Z")
    public static final boolean method2912(int arg0, int arg1) {
        if (arg1 > -5) {
            return false;
        } else {
            return arg0 >= 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/rn", name = "b", descriptor = "(II)Z")
    public static final boolean method2913(int arg0, int arg1) {
        if (arg1 == -18558) {
            return arg0 < 0;
        } else {
            return false;
        }
    }
}
