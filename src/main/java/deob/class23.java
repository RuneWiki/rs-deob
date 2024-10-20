package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class23 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class23(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("t.l(Lha;Lha;I)I")
    public int method586(class218 arg0, class218 arg1) {
        if (arg0.field3209 == arg1.field3209) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field408 == arg0.field3209) {
                return -1;
            }
            if (client.field408 == arg1.field3209) {
                return 1;
            }
        }
        return arg0.field3209 < arg1.field3209 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method586((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
