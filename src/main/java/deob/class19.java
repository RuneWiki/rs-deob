package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class19 implements Comparator {

    @ObfuscatedName("b.d(Lu;Lu;I)I")
    public int method119(class15 arg0, class15 arg1) {
        return arg0.method76().compareTo(arg1.method76());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method119((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
