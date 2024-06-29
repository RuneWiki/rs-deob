package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/ck")
public class class402 {

    @OriginalMember(owner = "client!jagdx/ck", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method3156(int arg0, int arg1) {
        if (arg1 == -1) {
            return arg0 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/ck", name = "b", descriptor = "(II)Z", line = 28)
    public static final boolean method3157(int arg0, int arg1) {
        if (arg1 != -2005530585) {
            method3157(84, -70);
        }
        return arg0 < 0;
    }
}
