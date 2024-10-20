package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("g.b(Lgk;Lgk;I)I")
    public int method505(class205 arg0, class205 arg1) {
        if (arg0.field3042 == arg1.field3042) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field478 == arg0.field3042) {
                return -1;
            }
            if (client.field478 == arg1.field3042) {
                return 1;
            }
        }
        return arg0.field3042 < arg1.field3042 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method505((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
