package deob;

import java.util.Comparator;

@ObfuscatedName("la")
public final class class320 implements Comparator {

    @ObfuscatedName("la.o(Lln;Lln;I)I")
    public int method5301(class324 arg0, class324 arg1) {
        return arg0.method5327().compareTo(arg1.method5327());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5301((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
