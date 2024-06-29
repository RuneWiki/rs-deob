package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/dm")
public class class398 {

    @OriginalMember(owner = "client!jagdx/dm", name = "a", descriptor = "(BI)Z")
    public static final boolean method2383(byte arg0, int arg1) {
        int var2 = 86 % ((60 - arg0) / 47);
        return arg1 < 0;
    }

    @OriginalMember(owner = "client!jagdx/dm", name = "a", descriptor = "(II)Z")
    public static final boolean method2384(int arg0, int arg1) {
        if (arg0 == 7155) {
            return arg1 >= 0;
        } else {
            return true;
        }
    }
}
