package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class19 implements Comparator {

    @ObfuscatedName("n.i(Lc;Lc;I)I")
    public int method118(class15 arg0, class15 arg1) {
        return arg0.method58().compareTo(arg1.method58());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method118((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
