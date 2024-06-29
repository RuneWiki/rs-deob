package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/em")
public class class742 {

    @OriginalMember(owner = "client!jagdx/em", name = "a", descriptor = "(IB)Z")
    public static final boolean method4136(int arg0, byte arg1) {
        int var2 = 99 % ((53 - arg1) / 56);
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/em", name = "a", descriptor = "(II)Z")
    public static final boolean method4137(int arg0, int arg1) {
        if (arg1 != -1) {
            method4137(-56, -3);
        }
        return arg0 >= 0;
    }
}
