package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class15 implements Comparator {

    @ObfuscatedName("q.z(Lf;Lf;I)I")
    public int method108(class17 arg0, class17 arg1) {
        return arg0.field79 < arg1.field79 ? -1 : (arg0.field79 == arg1.field79 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method108((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
