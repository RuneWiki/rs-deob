package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class7 implements Comparator {

    @ObfuscatedName("l.o(Lb;Lb;I)I")
    public int method66(class3 arg0, class3 arg1) {
        return arg0.method25().compareTo(arg1.method25());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method66((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
