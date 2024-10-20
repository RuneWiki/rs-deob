package deob;

import java.util.Comparator;

@ObfuscatedName("ac")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ac.x(Lc;Lc;I)I")
    public int method858(class3 arg0, class3 arg1) {
        if (arg0.field27 == arg1.field27) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field583 == arg0.field27) {
                return -1;
            }
            if (client.field583 == arg1.field27) {
                return 1;
            }
        }
        return arg0.field27 < arg1.field27 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method858((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
