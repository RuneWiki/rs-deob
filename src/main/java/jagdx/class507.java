package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mk")
public class class507 {

    @OriginalMember(owner = "client!jagdx/mk", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method3052(int arg0, int arg1) {
        int var2 = -98 / ((-arg1 - 38) / 54);
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/mk", name = "b", descriptor = "(II)Z", line = 29)
    public static final boolean method3053(int arg0, int arg1) {
        if (arg1 == -1) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }
}
