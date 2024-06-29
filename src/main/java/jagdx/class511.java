package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/gh")
public class class511 {

    @OriginalMember(owner = "client!jagdx/gh", name = "a", descriptor = "(II)Z")
    public static final boolean method3844(int arg0, int arg1) {
        if (arg0 == -2005530585) {
            return arg1 >= 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jagdx/gh", name = "a", descriptor = "(BI)Z")
    public static final boolean method3845(byte arg0, int arg1) {
        if (arg0 != 110) {
            method3844(83, 77);
        }
        return arg1 < 0;
    }
}
