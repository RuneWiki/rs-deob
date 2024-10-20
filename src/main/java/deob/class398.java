package deob;

import java.util.Comparator;

@ObfuscatedName("px")
public final class class398 implements Comparator {

    @ObfuscatedName("px.aq(Lpm;Lpm;I)I")
    public int method6723(class396 arg0, class396 arg1) {
        return arg0.field4593.field4599 < arg1.field4593.field4599 ? -1 : (arg0.field4593.field4599 == arg1.field4593.field4599 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6723((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
