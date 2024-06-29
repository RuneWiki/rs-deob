package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/eo")
public class class672 {

    @OriginalMember(owner = "client!jagdx/eo", name = "a", descriptor = "(II)Z")
    public static final boolean method3806(int arg0, int arg1) {
        int var2 = -59 / ((arg0 + 21) / 45);
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/eo", name = "b", descriptor = "(II)Z")
    public static final boolean method3807(int arg0, int arg1) {
        if (arg1 == -1) {
            return arg0 < 0;
        } else {
            return true;
        }
    }
}
