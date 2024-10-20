package deob;

import java.util.Comparator;

@ObfuscatedName("ge")
public final class class204 implements Comparator {

    @ObfuscatedName("ge.n(Lgg;Lgg;I)I")
    public int method3583(class205 arg0, class205 arg1) {
        return arg0.method3595().compareTo(arg1.method3595());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3583((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
