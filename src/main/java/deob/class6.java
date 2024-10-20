package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class6 implements Comparator {

    @ObfuscatedName("g.c(Ll;Ll;I)I")
    public int method48(class8 arg0, class8 arg1) {
        return arg0.field41 < arg1.field41 ? -1 : (arg0.field41 == arg1.field41 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method48((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
