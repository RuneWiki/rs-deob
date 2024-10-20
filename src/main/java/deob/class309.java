package deob;

import java.util.Comparator;

@ObfuscatedName("kz")
public class class309 implements Comparator {

    @ObfuscatedName("kz.w")
    public final boolean field3746;

    public class309(boolean arg0) {
        this.field3746 = arg0;
    }

    @ObfuscatedName("kz.w(Ljn;Ljn;I)I")
    public int method5271(class283 arg0, class283 arg1) {
        return this.field3746 ? arg0.method4914(arg1) : arg1.method4914(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5271((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
