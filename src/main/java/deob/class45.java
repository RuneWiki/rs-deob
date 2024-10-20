package deob;

import java.util.Comparator;

@ObfuscatedName("ab")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ab.b(Lc;Lc;S)I")
    public int method814(class3 arg0, class3 arg1) {
        if (arg0.field29 == arg1.field29) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field287 == arg0.field29) {
                return -1;
            }
            if (client.field287 == arg1.field29) {
                return 1;
            }
        }
        return arg0.field29 < arg1.field29 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method814((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
