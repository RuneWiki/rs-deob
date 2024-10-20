package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class19 implements Comparator {

    @ObfuscatedName("r.p(Lg;Lg;I)I")
    public int method133(class15 arg0, class15 arg1) {
        return arg0.method72().compareTo(arg1.method72());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method133((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
