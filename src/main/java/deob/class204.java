package deob;

import java.util.Comparator;

@ObfuscatedName("gb")
public final class class204 implements Comparator {

    @ObfuscatedName("gb.p(Lge;Lge;B)I")
    public int method3566(class205 arg0, class205 arg1) {
        return arg0.method3568().compareTo(arg1.method3568());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3566((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
