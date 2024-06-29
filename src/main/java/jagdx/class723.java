package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pp")
public class class723 {

    @OriginalMember(owner = "client!jagdx/pp", name = "a", descriptor = "(II)Z")
    public static final boolean method3997(int arg0, int arg1) {
        if (arg1 > -75) {
            return true;
        } else {
            return arg0 < 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/pp", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3998(boolean arg0, int arg1) {
        if (arg0) {
            method3997(-46, 30);
        }
        return arg1 >= 0;
    }
}
