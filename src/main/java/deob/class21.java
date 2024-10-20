package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("y.n(Lgy;Lgy;S)I")
    public int method510(class205 arg0, class205 arg1) {
        if (arg0.field3050 == arg1.field3050) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field281 == arg0.field3050) {
                return -1;
            }
            if (client.field281 == arg1.field3050) {
                return 1;
            }
        }
        return arg0.field3050 < arg1.field3050 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method510((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
