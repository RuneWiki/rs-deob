package deob;

import java.util.Comparator;

@ObfuscatedName("pt")
public final class class394 implements Comparator {

    @ObfuscatedName("pt.ak(Lpm;Lpm;I)I")
    public int method6732(class395 arg0, class395 arg1) {
        return arg0.field4568 < arg1.field4568 ? -1 : (arg0.field4568 == arg1.field4568 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6732((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
