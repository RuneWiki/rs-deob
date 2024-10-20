package deob;

import java.util.Comparator;

@ObfuscatedName("z")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("z.o(Lhv;Lhv;I)I")
    public int method571(class214 arg0, class214 arg1) {
        if (arg0.field3138 == arg1.field3138) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field543 == arg0.field3138) {
                return -1;
            }
            if (client.field543 == arg1.field3138) {
                return 1;
            }
        }
        return arg0.field3138 < arg1.field3138 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method571((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
