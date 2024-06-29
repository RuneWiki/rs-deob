package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bea")
public class class446 {

    @OriginalMember(owner = "client!jagdx/bea", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method2640(int arg0, int arg1) {
        int var2 = 67 / ((arg0 - 53) / 48);
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/bea", name = "b", descriptor = "(II)Z", line = 41)
    public static final boolean method2641(int arg0, int arg1) {
        if (arg1 > -15) {
            return false;
        } else {
            return arg0 < 0;
        }
    }
}
