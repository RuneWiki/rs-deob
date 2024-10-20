package deob;

import java.util.Comparator;

@ObfuscatedName("od")
public class class406 implements Comparator {

    @ObfuscatedName("od.n")
    public final boolean field4338;

    public class406(boolean arg0) {
        this.field4338 = arg0;
    }

    @ObfuscatedName("od.n(Lle;Lle;I)I")
    public int method6504(class337 arg0, class337 arg1) {
        return this.field4338 ? arg0.method5455().method6784(arg1.method5455()) : arg1.method5455().method6784(arg0.method5455());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6504((class337) arg0, (class337) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
