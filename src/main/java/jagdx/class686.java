package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/te")
public class class686 {

    @OriginalMember(owner = "client!jagdx/te", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method3804(int arg0, int arg1) {
        if (arg0 != 2005530599) {
            method3804(-103, -13);
        }
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/te", name = "a", descriptor = "(BI)Z", line = 34)
    public static final boolean method3805(byte arg0, int arg1) {
        if (arg0 == 112) {
            return arg1 < 0;
        } else {
            return true;
        }
    }
}
