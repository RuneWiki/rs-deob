package deob;

import java.util.Comparator;

@ObfuscatedName("c")
public final class class7 implements Comparator {

    @ObfuscatedName("c.f(Lw;Lw;I)I")
    public int method64(class3 arg0, class3 arg1) {
        return arg0.method15().compareTo(arg1.method15());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method64((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
