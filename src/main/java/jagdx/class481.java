package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ec")
public class class481 {

    @OriginalMember(owner = "client!jagdx/ec", name = "a", descriptor = "(II)Z", line = 30)
    public static final boolean method2896(int arg0, int arg1) {
        if (arg1 == 2005530520) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/ec", name = "b", descriptor = "(II)Z", line = 40)
    public static final boolean method2897(int arg0, int arg1) {
        if (arg1 == -15560) {
            return arg0 < 0;
        } else {
            return false;
        }
    }
}
