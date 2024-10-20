package deob;

import java.util.Comparator;

@ObfuscatedName("cc")
public final class class94 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class94(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cc.w(La;La;I)I")
    public int method1661(class15 arg0, class15 arg1) {
        if (arg0.field297 == arg1.field297) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field1074 == arg0.field297) {
                return -1;
            }
            if (client.field1074 == arg1.field297) {
                return 1;
            }
        }
        return arg0.field297 < arg1.field297 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1661((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
