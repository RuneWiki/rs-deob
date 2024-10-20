package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("u.e(Lhx;Lhx;I)I")
    public int method562(class215 arg0, class215 arg1) {
        if (arg0.field3150 == arg1.field3150) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field280 == arg0.field3150) {
                return -1;
            }
            if (client.field280 == arg1.field3150) {
                return 1;
            }
        }
        return arg0.field3150 < arg1.field3150 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method562((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
