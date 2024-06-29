package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/mo")
public class class399 {

    @OriginalMember(owner = "client!jagdx/mo", name = "a", descriptor = "(II)Z")
    public static final boolean method2378(int arg0, int arg1) {
        if (arg1 != -1) {
            method2378(46, -31);
        }
        return arg0 < 0;
    }

    @OriginalMember(owner = "client!jagdx/mo", name = "b", descriptor = "(II)Z")
    public static final boolean method2379(int arg0, int arg1) {
        if (arg1 == 28658) {
            return arg0 >= 0;
        } else {
            return true;
        }
    }
}
