package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class15 implements Comparator {

    @ObfuscatedName("p.f(Ly;Ly;B)I")
    public int method120(class17 arg0, class17 arg1) {
        return arg0.field77 < arg1.field77 ? -1 : (arg0.field77 == arg1.field77 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method120((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
