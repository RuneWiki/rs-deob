package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sw")
public class class675 {

    @OriginalMember(owner = "client!jagdx/sw", name = "a", descriptor = "(BI)Z")
    public static final boolean method3703(byte arg0, int arg1) {
        if (arg0 != -58) {
            method3703((byte) 82, -3);
        }
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/sw", name = "a", descriptor = "(II)Z")
    public static final boolean method3704(int arg0, int arg1) {
        if (arg1 > -47) {
            return true;
        } else {
            return arg0 < 0;
        }
    }
}
