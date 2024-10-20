package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("k.v(Lhu;Lhu;I)I")
    public int method544(class214 arg0, class214 arg1) {
        if (arg0.field3142 == arg1.field3142) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field289 == arg0.field3142) {
                return -1;
            }
            if (client.field289 == arg1.field3142) {
                return 1;
            }
        }
        return arg0.field3142 < arg1.field3142 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method544((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
