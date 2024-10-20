package deob;

import java.util.Comparator;

@ObfuscatedName("ll")
public class class314 implements Comparator {

    @ObfuscatedName("ll.f")
    public final boolean field3824;

    public class314(boolean arg0) {
        this.field3824 = arg0;
    }

    @ObfuscatedName("ll.f(Ljb;Ljb;I)I")
    public int method5386(class285 arg0, class285 arg1) {
        return this.field3824 ? arg0.method4995(arg1) : arg1.method4995(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5386((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
