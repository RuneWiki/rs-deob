package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("p.o(Lgp;Lgp;I)I")
    public int method539(class205 arg0, class205 arg1) {
        if (arg0.field3052 == arg1.field3052) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field256 == arg0.field3052) {
                return -1;
            }
            if (client.field256 == arg1.field3052) {
                return 1;
            }
        }
        return arg0.field3052 < arg1.field3052 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method539((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
