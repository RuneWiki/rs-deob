package deob;

@ObfuscatedName("ku")
public class class297 implements Comparable {

    @ObfuscatedName("ku.t")
    public class306 field3830;

    @ObfuscatedName("ku.d")
    public class306 field3831;

    @ObfuscatedName("ku.p(I)Lkz;")
    public class306 method4883() {
        return this.field3830;
    }

    @ObfuscatedName("ku.e(I)Ljava/lang/String;")
    public String method4879() {
        return this.field3830 == null ? "" : this.field3830.method5015();
    }

    @ObfuscatedName("ku.c(I)Ljava/lang/String;")
    public String method4875() {
        return this.field3831 == null ? "" : this.field3831.method5015();
    }

    @ObfuscatedName("ku.ag(Lkz;Lkz;I)V")
    public void method4876(class306 arg0, class306 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3830 = arg0;
        this.field3831 = arg1;
    }

    @ObfuscatedName("ku.at(Lku;I)I")
    public int method4880(class297 arg0) {
        return this.field3830.method5020(arg0.field3830);
    }

    public int compareTo(Object arg0) {
        return this.method4880((class297) arg0);
    }
}
