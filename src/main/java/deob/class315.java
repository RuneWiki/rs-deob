package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public class class315 implements Comparator {

    @ObfuscatedName("lq.f")
    public final boolean field3826;

    public class315(boolean arg0) {
        this.field3826 = arg0;
    }

    @ObfuscatedName("lq.f(Ljb;Ljb;I)I")
    public int method5396(class285 arg0, class285 arg1) {
        return this.field3826 ? arg0.method5002().method5149(arg1.method5002()) : arg1.method5002().method5149(arg0.method5002());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5396((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
