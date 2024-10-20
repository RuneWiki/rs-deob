package deob;

import java.util.Comparator;

@ObfuscatedName("ca")
public final class class94 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class94(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ca.d(Lb;Lb;I)I")
    public int method1682(class15 arg0, class15 arg1) {
        if (arg0.field298 == arg1.field298) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field1121 == arg0.field298) {
                return -1;
            }
            if (client.field1121 == arg1.field298) {
                return 1;
            }
        }
        return arg0.field298 < arg1.field298 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1682((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
