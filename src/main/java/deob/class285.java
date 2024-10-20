package deob;

@ObfuscatedName("jd")
public class class285 implements Comparable {

    @ObfuscatedName("jd.n")
    public class294 field3666;

    @ObfuscatedName("jd.u")
    public class294 field3665;

    @ObfuscatedName("jd.g(I)Lkx;")
    public class294 method4962() {
        return this.field3666;
    }

    @ObfuscatedName("jd.d(I)Ljava/lang/String;")
    public String method4960() {
        return this.field3666 == null ? "" : this.field3666.method5079();
    }

    @ObfuscatedName("jd.m(B)Ljava/lang/String;")
    public String method4961() {
        return this.field3665 == null ? "" : this.field3665.method5079();
    }

    @ObfuscatedName("jd.t(Lkx;Lkx;S)V")
    public void method4975(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3666 = arg0;
        this.field3665 = arg1;
    }

    @ObfuscatedName("jd.h(Ljd;B)I")
    public int method4963(class285 arg0) {
        return this.field3666.method5080(arg0.field3666);
    }

    public int compareTo(Object arg0) {
        return this.method4963((class285) arg0);
    }
}
