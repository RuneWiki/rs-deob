package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class213 implements Comparator {

    @ObfuscatedName("hc.a(Lhg;Lhg;I)I")
    public int method3690(class214 arg0, class214 arg1) {
        return arg0.method3700().compareTo(arg1.method3700());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3690((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
