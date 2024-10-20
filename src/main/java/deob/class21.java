package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("d.n(Lgk;Lgk;I)I")
    public int method503(class205 arg0, class205 arg1) {
        if (arg0.field3052 == arg1.field3052) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field282 == arg0.field3052) {
                return -1;
            }
            if (client.field282 == arg1.field3052) {
                return 1;
            }
        }
        return arg0.field3052 < arg1.field3052 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method503((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
