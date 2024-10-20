package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class7 implements Comparator {

    @ObfuscatedName("k.s(Lf;Lf;B)I")
    public int method71(class3 arg0, class3 arg1) {
        return arg0.method18().compareTo(arg1.method18());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method71((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
