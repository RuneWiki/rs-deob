package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ue")
public class class483 {

    @OriginalMember(owner = "client!jagdx/ue", name = "a", descriptor = "(BI)Z")
    public static final boolean method2835(byte arg0, int arg1) {
        if (arg0 != 97) {
            method2836(-85, false);
        }
        return arg1 < 0;
    }

    @OriginalMember(owner = "client!jagdx/ue", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2836(int arg0, boolean arg1) {
        if (arg1) {
            method2836(-39, false);
        }
        return arg0 >= 0;
    }
}
