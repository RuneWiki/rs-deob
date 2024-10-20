package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class7 implements Comparator {

    @ObfuscatedName("u.d(Ln;Ln;I)I")
    public int method84(class3 arg0, class3 arg1) {
        return arg0.method26().compareTo(arg1.method26());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method84((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
