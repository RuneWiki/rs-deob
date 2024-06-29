package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/qr")
public class class439 {

    @OriginalMember(owner = "client!jagdx/qr", name = "a", descriptor = "(ZI)Z", line = 14)
    public static final boolean method2332(boolean arg0, int arg1) {
        if (arg0) {
            return arg1 < 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jagdx/qr", name = "a", descriptor = "(II)Z", line = 36)
    public static final boolean method2333(int arg0, int arg1) {
        if (arg1 == -2005530519) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }
}
