package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("c.j(Lgs;Lgs;I)I")
    public int method571(class208 arg0, class208 arg1) {
        if (arg0.field3075 == arg1.field3075) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field397 == arg0.field3075) {
                return -1;
            }
            if (client.field397 == arg1.field3075) {
                return 1;
            }
        }
        return arg0.field3075 < arg1.field3075 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method571((class208) arg0, (class208) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
