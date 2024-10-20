package deob;

import java.util.Comparator;

@ObfuscatedName("hu")
public final class class213 implements Comparator {

    @ObfuscatedName("hu.o(Lhh;Lhh;I)I")
    public int method3628(class214 arg0, class214 arg1) {
        return arg0.method3644().compareTo(arg1.method3644());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3628((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
