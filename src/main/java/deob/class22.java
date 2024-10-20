package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("f.a(Lhd;Lhd;I)I")
    public int method638(class215 arg0, class215 arg1) {
        if (arg0.field3156 == arg1.field3156) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field297 == arg0.field3156) {
                return -1;
            }
            if (client.field297 == arg1.field3156) {
                return 1;
            }
        }
        return arg0.field3156 < arg1.field3156 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method638((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
