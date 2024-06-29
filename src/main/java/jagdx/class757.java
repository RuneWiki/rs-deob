package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/pia")
public class class757 {

    @OriginalMember(owner = "client!jagdx/pia", name = "a", descriptor = "(BI)Z", line = 15)
    public static final boolean method4190(byte arg0, int arg1) {
        if (arg0 == -110) {
            return arg1 < 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jagdx/pia", name = "a", descriptor = "(II)Z", line = 42)
    public static final boolean method4191(int arg0, int arg1) {
        if (arg0 == -2005530600) {
            return arg1 >= 0;
        } else {
            return false;
        }
    }
}
