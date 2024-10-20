package deob;

import java.util.Comparator;

@ObfuscatedName("kp")
public class class309 implements Comparator {

    @ObfuscatedName("kp.z")
    public final boolean field3739;

    public class309(boolean arg0) {
        this.field3739 = arg0;
    }

    @ObfuscatedName("kp.z(Ljx;Ljx;B)I")
    public int method5232(class283 arg0, class283 arg1) {
        return this.field3739 ? arg0.method4901(arg1) : arg1.method4901(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5232((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
