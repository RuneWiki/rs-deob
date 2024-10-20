package deob;

import java.util.Comparator;

@ObfuscatedName("py")
public final class class395 implements Comparator {

    @ObfuscatedName("py.aq(Lpm;Lpm;I)I")
    public int method6690(class396 arg0, class396 arg1) {
        return arg0.field4594 < arg1.field4594 ? -1 : (arg0.field4594 == arg1.field4594 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6690((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
