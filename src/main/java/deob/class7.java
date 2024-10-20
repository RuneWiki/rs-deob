package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class7 implements Comparator {

    @ObfuscatedName("n.b(Li;Li;B)I")
    public int method88(class3 arg0, class3 arg1) {
        return arg0.method23().compareTo(arg1.method23());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method88((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
