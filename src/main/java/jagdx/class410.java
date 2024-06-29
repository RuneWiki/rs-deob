package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/wu")
public class class410 {

    @OriginalMember(owner = "client!jagdx/wu", name = "a", descriptor = "(II)Z")
    public static final boolean method2427(int arg0, int arg1) {
        if (arg0 < 98) {
            return false;
        } else {
            return arg1 < 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/wu", name = "a", descriptor = "(IB)Z")
    public static final boolean method2428(int arg0, byte arg1) {
        int var2 = -57 % ((-arg1 - 18) / 32);
        return arg0 >= 0;
    }
}
