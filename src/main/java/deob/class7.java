package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class7 implements Comparator {

    @ObfuscatedName("r.q(Lh;Lh;I)I")
    public int method72(class3 arg0, class3 arg1) {
        return arg0.method21().compareTo(arg1.method21());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method72((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
