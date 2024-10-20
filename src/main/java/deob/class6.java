package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class6 implements Comparator {

    @ObfuscatedName("p.u(Ly;Ly;I)I")
    public int method52(class8 arg0, class8 arg1) {
        return arg0.field50 < arg1.field50 ? -1 : (arg0.field50 == arg1.field50 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method52((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
