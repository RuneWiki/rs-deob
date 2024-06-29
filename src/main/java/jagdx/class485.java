package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/lg")
public class class485 {

    @OriginalMember(owner = "client!jagdx/lg", name = "a", descriptor = "(II)Z")
    public static final boolean method2864(int arg0, int arg1) {
        if (arg0 != -2005530522) {
            method2865(74, -123);
        }
        return arg1 < 0;
    }

    @OriginalMember(owner = "client!jagdx/lg", name = "b", descriptor = "(II)Z")
    public static final boolean method2865(int arg0, int arg1) {
        if (arg1 == 25499) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }
}
