package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pda")
public class class509 {

    @OriginalMember(owner = "client!jagdx/pda", name = "a", descriptor = "(II)Z")
    public static final boolean method2977(int arg0, int arg1) {
        if (arg1 == 17527) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/pda", name = "b", descriptor = "(II)Z")
    public static final boolean method2978(int arg0, int arg1) {
        if (arg0 == 0) {
            return arg1 < 0;
        } else {
            return true;
        }
    }
}
