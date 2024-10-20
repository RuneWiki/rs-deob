package deob;

import java.util.Comparator;

@ObfuscatedName("cb")
public final class class97 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class97(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cb.j(Lr;Lr;I)I")
    public int method1626(class15 arg0, class15 arg1) {
        if (arg0.field294 == arg1.field294) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field935 == arg0.field294) {
                return -1;
            }
            if (client.field935 == arg1.field294) {
                return 1;
            }
        }
        return arg0.field294 < arg1.field294 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1626((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
