package deob;

import java.util.Comparator;

@ObfuscatedName("an")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("an.q(Lh;Lh;I)I")
    public int method874(class3 arg0, class3 arg1) {
        if (arg0.field31 == arg1.field31) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field303 == arg0.field31) {
                return -1;
            }
            if (client.field303 == arg1.field31) {
                return 1;
            }
        }
        return arg0.field31 < arg1.field31 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method874((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
