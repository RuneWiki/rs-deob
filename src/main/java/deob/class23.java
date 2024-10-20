package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class23 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class23(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("p.f(Lhn;Lhn;I)I")
    public int method575(class218 arg0, class218 arg1) {
        if (arg0.field3197 == arg1.field3197) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field492 == arg0.field3197) {
                return -1;
            }
            if (client.field492 == arg1.field3197) {
                return 1;
            }
        }
        return arg0.field3197 < arg1.field3197 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method575((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
