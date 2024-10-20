package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class217 implements Comparator {

    @ObfuscatedName("hp.x(Lhu;Lhu;I)I")
    public int method3709(class218 arg0, class218 arg1) {
        return arg0.method3719().compareTo(arg1.method3719());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3709((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
