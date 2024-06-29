package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/raa")
public class class487 {

    @OriginalMember(owner = "client!jagdx/raa", name = "a", descriptor = "(IB)Z")
    public static final boolean method2767(int arg0, byte arg1) {
        if (arg1 <= 93) {
            return false;
        } else {
            return arg0 >= 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/raa", name = "a", descriptor = "(II)Z")
    public static final boolean method2768(int arg0, int arg1) {
        if (arg1 > -24) {
            return true;
        } else {
            return arg0 < 0;
        }
    }
}
