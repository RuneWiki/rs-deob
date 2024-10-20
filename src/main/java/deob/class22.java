package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("x.t(Lhw;Lhw;I)I")
    public int method543(class215 arg0, class215 arg1) {
        if (arg0.field3161 == arg1.field3161) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field479 == arg0.field3161) {
                return -1;
            }
            if (client.field479 == arg1.field3161) {
                return 1;
            }
        }
        return arg0.field3161 < arg1.field3161 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method543((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
