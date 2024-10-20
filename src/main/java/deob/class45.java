package deob;

import java.util.Comparator;

@ObfuscatedName("al")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("al.b(Li;Li;I)I")
    public int method850(class3 arg0, class3 arg1) {
        if (arg0.field25 == arg1.field25) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field282 == arg0.field25) {
                return -1;
            }
            if (client.field282 == arg1.field25) {
                return 1;
            }
        }
        return arg0.field25 < arg1.field25 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method850((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
