package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/kg")
public class class483 {

    @OriginalMember(owner = "client!jagdx/kg", name = "a", descriptor = "(II)Z")
    public static final boolean method2718(int arg0, int arg1) {
        if (arg0 == -21593) {
            return arg1 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/kg", name = "b", descriptor = "(II)Z")
    public static final boolean method2719(int arg0, int arg1) {
        if (arg0 == -7175) {
            return arg1 < 0;
        } else {
            return true;
        }
    }
}
