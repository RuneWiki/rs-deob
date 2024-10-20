package deob;

import java.util.Comparator;

@ObfuscatedName("cd")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cd.p(Lg;Lg;B)I")
    public int method1558(class15 arg0, class15 arg1) {
        if (arg0.field298 == arg1.field298) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field902 == arg0.field298) {
                return -1;
            }
            if (client.field902 == arg1.field298) {
                return 1;
            }
        }
        return arg0.field298 < arg1.field298 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1558((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
