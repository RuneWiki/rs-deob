package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/hl")
public class class448 {

    @OriginalMember(owner = "client!jagdx/hl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2665(int arg0, boolean arg1) {
        if (arg1) {
            return arg0 < 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/hl", name = "a", descriptor = "(BI)Z")
    public static final boolean method2666(byte arg0, int arg1) {
        int var2 = -73 % ((arg0 - 58) / 38);
        return arg1 >= 0;
    }
}
