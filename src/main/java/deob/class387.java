package deob;

import java.util.Comparator;

@ObfuscatedName("nw")
public class class387 implements Comparator {

    @ObfuscatedName("nw.f")
    public final boolean field4212;

    public class387(boolean arg0) {
        this.field4212 = arg0;
    }

    @ObfuscatedName("nw.f(Llt;Llt;I)I")
    public int method6100(class321 arg0, class321 arg1) {
        return this.field4212 ? arg0.method5062(arg1) : arg1.method5062(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6100((class321) arg0, (class321) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
