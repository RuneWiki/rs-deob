package deob;

import java.util.Comparator;

@ObfuscatedName("hs")
public final class class213 implements Comparator {

    @ObfuscatedName("hs.o(Lhv;Lhv;I)I")
    public int method3696(class214 arg0, class214 arg1) {
        return arg0.method3698().compareTo(arg1.method3698());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3696((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
