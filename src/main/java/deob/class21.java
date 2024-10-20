package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class21 implements Comparator {

    @ObfuscatedName("v.f(Ly;Ly;I)I")
    public int method198(class17 arg0, class17 arg1) {
        return arg0.method141().compareTo(arg1.method141());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method198((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
