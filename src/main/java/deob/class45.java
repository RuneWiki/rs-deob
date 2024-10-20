package deob;

import java.util.Comparator;

@ObfuscatedName("ax")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ax.k(Lo;Lo;I)I")
    public int method795(class3 arg0, class3 arg1) {
        if (arg0.field24 == arg1.field24) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field329 == arg0.field24) {
                return -1;
            }
            if (client.field329 == arg1.field24) {
                return 1;
            }
        }
        return arg0.field24 < arg1.field24 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method795((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
