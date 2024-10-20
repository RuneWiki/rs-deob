package deob;

import java.util.Comparator;

@ObfuscatedName("ky")
public class class310 implements Comparator {

    @ObfuscatedName("ky.w")
    public final boolean field3748;

    public class310(boolean arg0) {
        this.field3748 = arg0;
    }

    @ObfuscatedName("ky.w(Ljn;Ljn;I)I")
    public int method5282(class283 arg0, class283 arg1) {
        return this.field3748 ? arg0.method4910().method5050(arg1.method4910()) : arg1.method4910().method5050(arg0.method4910());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5282((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
