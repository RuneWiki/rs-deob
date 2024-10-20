package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class213 implements Comparator {

    @ObfuscatedName("hp.z(Lhh;Lhh;I)I")
    public int method3602(class214 arg0, class214 arg1) {
        return arg0.method3609().compareTo(arg1.method3609());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3602((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
