package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/co")
public class class484 {

    @OriginalMember(owner = "client!jagdx/co", name = "a", descriptor = "(BI)Z")
    public static final boolean method2892(byte arg0, int arg1) {
        if (arg0 < 44) {
            method2892((byte) 75, 38);
        }
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/co", name = "a", descriptor = "(II)Z")
    public static final boolean method2893(int arg0, int arg1) {
        if (arg1 == 2005530599) {
            return arg0 < 0;
        } else {
            return false;
        }
    }
}
