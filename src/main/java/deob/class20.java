package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("j.a(Lgr;Lgr;B)I")
    public int method501(class197 arg0, class197 arg1) {
        if (arg0.field2939 == arg1.field2939) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field256 == arg0.field2939) {
                return -1;
            }
            if (client.field256 == arg1.field2939) {
                return 1;
            }
        }
        return arg0.field2939 < arg1.field2939 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method501((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
