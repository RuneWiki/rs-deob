package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/oo")
public class class771 {

    @OriginalMember(owner = "client!jagdx/oo", name = "a", descriptor = "(ZI)Z")
    public static final boolean method4195(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            return arg1 >= 0;
        }
    }

    @OriginalMember(owner = "client!jagdx/oo", name = "a", descriptor = "(BI)Z")
    public static final boolean method4196(byte arg0, int arg1) {
        if (arg0 > -45) {
            method4196((byte) 95, -99);
        }
        return arg1 < 0;
    }
}
