package deob;

import java.util.Comparator;

@ObfuscatedName("pp")
public final class class392 implements Comparator {

    @ObfuscatedName("pp.ak(Lpm;Lpm;I)I")
    public int method6719(class395 arg0, class395 arg1) {
        return arg0.field4565 < arg1.field4565 ? -1 : (arg0.field4565 == arg1.field4565 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6719((class395) arg0, (class395) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
