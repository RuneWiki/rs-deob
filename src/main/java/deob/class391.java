package deob;

import java.util.Comparator;

@ObfuscatedName("pj")
public final class class391 implements Comparator {

    @ObfuscatedName("pj.aq(Lpm;Lpm;B)I")
    public int method6663(class396 arg0, class396 arg1) {
        return arg0.field4593.field4598 < arg1.field4593.field4598 ? -1 : (arg0.field4593.field4598 == arg1.field4593.field4598 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6663((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
