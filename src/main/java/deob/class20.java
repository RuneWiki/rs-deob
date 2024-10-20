package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("a.p(Lgp;Lgp;I)I")
    public int method506(class197 arg0, class197 arg1) {
        if (arg0.field2940 == arg1.field2940) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field269 == arg0.field2940) {
                return -1;
            }
            if (client.field269 == arg1.field2940) {
                return 1;
            }
        }
        return arg0.field2940 < arg1.field2940 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method506((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
