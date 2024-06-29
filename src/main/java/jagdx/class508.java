package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hc")
public class class508 {

    @OriginalMember(owner = "client!jagdx/hc", name = "a", descriptor = "(BI)Z", line = 28)
    public static final boolean method3821(byte arg0, int arg1) {
        int var2 = -49 % ((37 - arg0) / 56);
        return arg1 < 0;
    }

    @OriginalMember(owner = "client!jagdx/hc", name = "a", descriptor = "(IZ)Z", line = 37)
    public static final boolean method3822(int arg0, boolean arg1) {
        if (arg1) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }
}
