package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class6 implements Comparator {

    @ObfuscatedName("l.a(Lo;Lo;I)I")
    public int method61(class8 arg0, class8 arg1) {
        return arg0.field43 < arg1.field43 ? -1 : (arg0.field43 == arg1.field43 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method61((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
