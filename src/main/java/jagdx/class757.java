package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/saa")
public class class757 {

    @OriginalMember(owner = "client!jagdx/saa", name = "a", descriptor = "(IB)Z")
    public static final boolean method4191(int arg0, byte arg1) {
        if (arg1 == 84) {
            return arg0 < 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/saa", name = "b", descriptor = "(IB)Z")
    public static final boolean method4192(int arg0, byte arg1) {
        int var2 = 33 % ((arg1 - 28) / 58);
        return arg0 >= 0;
    }
}
