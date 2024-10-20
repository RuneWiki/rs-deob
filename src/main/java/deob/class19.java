package deob;

import java.util.Comparator;

@ObfuscatedName("y")
public final class class19 implements Comparator {

    @ObfuscatedName("y.b(Lj;Lj;B)I")
    public int method123(class15 arg0, class15 arg1) {
        return arg0.method74().compareTo(arg1.method74());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method123((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
