package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("p.n(Lgg;Lgg;I)I")
    public int method528(class205 arg0, class205 arg1) {
        if (arg0.field3047 == arg1.field3047) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field240 == arg0.field3047) {
                return -1;
            }
            if (client.field240 == arg1.field3047) {
                return 1;
            }
        }
        return arg0.field3047 < arg1.field3047 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method528((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
