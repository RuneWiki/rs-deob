package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/qi")
public class class439 {

    @OriginalMember(owner = "client!jagdx/qi", name = "a", descriptor = "(BI)Z")
    public static final boolean method2511(byte arg0, int arg1) {
        if (arg0 != 35) {
            method2512(-124, -96);
        }
        return arg1 >= 0;
    }

    @OriginalMember(owner = "client!jagdx/qi", name = "a", descriptor = "(II)Z")
    public static final boolean method2512(int arg0, int arg1) {
        if (arg1 == 0) {
            return arg0 < 0;
        } else {
            return false;
        }
    }
}
