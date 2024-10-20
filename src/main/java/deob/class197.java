package deob;

import java.util.Comparator;

@ObfuscatedName("gs")
public final class class197 implements Comparator {

    @ObfuscatedName("gs.f(Lgg;Lgg;I)I")
    public int method3407(class195 arg0, class195 arg1) {
        return arg0.field2912.field2935 < arg1.field2912.field2935 ? -1 : (arg0.field2912.field2935 == arg1.field2912.field2935 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3407((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
