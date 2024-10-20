package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class7 implements Comparator {

    @ObfuscatedName("h.c(Lm;Lm;B)I")
    public int method87(class3 arg0, class3 arg1) {
        return arg0.method20().compareTo(arg1.method20());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method87((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
