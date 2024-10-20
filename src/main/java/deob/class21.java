package deob;

import java.util.Comparator;

@ObfuscatedName("a")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("a.y(Lgv;Lgv;I)I")
    public int method512(class205 arg0, class205 arg1) {
        if (arg0.field3056 == arg1.field3056) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field261 == arg0.field3056) {
                return -1;
            }
            if (client.field261 == arg1.field3056) {
                return 1;
            }
        }
        return arg0.field3056 < arg1.field3056 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method512((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
