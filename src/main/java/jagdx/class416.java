package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/qc")
public class class416 {

    @OriginalMember(owner = "client!jagdx/qc", name = "a", descriptor = "(II)Z")
    public static final boolean method2640(int arg0, int arg1) {
        if (arg1 != -2005530517) {
            method2641((byte) 106, 16);
        }
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/qc", name = "a", descriptor = "(BI)Z")
    public static final boolean method2641(byte arg0, int arg1) {
        if (arg0 != 48) {
            method2640(-29, 70);
        }
        return arg1 >= 0;
    }
}
