package deob;

import java.util.Comparator;

@ObfuscatedName("pn")
public final class class393 implements Comparator {

    @ObfuscatedName("pn.aq(Lpm;Lpm;B)I")
    public int method6678(class396 arg0, class396 arg1) {
        return arg0.field4592 < arg1.field4592 ? -1 : (arg0.field4592 == arg1.field4592 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6678((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
