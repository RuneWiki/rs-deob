package deob;

import java.util.Comparator;

@ObfuscatedName("ov")
public class class405 implements Comparator {

    @ObfuscatedName("ov.n")
    public final boolean field4335;

    public class405(boolean arg0) {
        this.field4335 = arg0;
    }

    @ObfuscatedName("ov.n(Lle;Lle;I)I")
    public int method6491(class337 arg0, class337 arg1) {
        return this.field4335 ? arg0.method5424(arg1) : arg1.method5424(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6491((class337) arg0, (class337) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
