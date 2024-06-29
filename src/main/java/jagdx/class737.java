package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/wd")
public class class737 {

    @OriginalMember(owner = "client!jagdx/wd", name = "a", descriptor = "(IB)Z")
    public static final boolean method4095(int arg0, byte arg1) {
        int var2 = 69 % ((arg1 - 35) / 33);
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/wd", name = "a", descriptor = "(II)Z")
    public static final boolean method4096(int arg0, int arg1) {
        if (arg0 < 25) {
            return false;
        } else {
            return arg1 >= 0;
        }
    }
}
