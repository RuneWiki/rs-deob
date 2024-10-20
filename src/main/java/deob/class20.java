package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("u.e(Lgx;Lgx;B)I")
    public int method455(class195 arg0, class195 arg1) {
        if (arg0.field2926 == arg1.field2926) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field244 == arg0.field2926) {
                return -1;
            }
            if (client.field244 == arg1.field2926) {
                return 1;
            }
        }
        return arg0.field2926 < arg1.field2926 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method455((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
