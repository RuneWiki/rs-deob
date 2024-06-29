package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/js")
public class class447 {

    @OriginalMember(owner = "client!jagdx/js", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method2813(int arg0, int arg1) {
        if (arg1 == 0) {
            return arg0 < 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jagdx/js", name = "b", descriptor = "(II)Z", line = 24)
    public static final boolean method2814(int arg0, int arg1) {
        if (arg1 == 141953135) {
            return arg0 >= 0;
        } else {
            return true;
        }
    }
}
