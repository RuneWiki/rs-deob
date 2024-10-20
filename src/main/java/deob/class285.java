package deob;

@ObfuscatedName("jx")
public class class285 implements Comparable {

    @ObfuscatedName("jx.m")
    public class294 field3659;

    @ObfuscatedName("jx.j")
    public class294 field3658;

    @ObfuscatedName("jx.r(B)Lkz;")
    public class294 method4943() {
        return this.field3659;
    }

    @ObfuscatedName("jx.x(I)Ljava/lang/String;")
    public String method4934() {
        return this.field3659 == null ? "" : this.field3659.method5075();
    }

    @ObfuscatedName("jx.b(I)Ljava/lang/String;")
    public String method4949() {
        return this.field3658 == null ? "" : this.field3658.method5075();
    }

    @ObfuscatedName("jx.w(Lkz;Lkz;I)V")
    public void method4940(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3659 = arg0;
        this.field3658 = arg1;
    }

    @ObfuscatedName("jx.a(Ljx;B)I")
    public int method4937(class285 arg0) {
        return this.field3659.method5077(arg0.field3659);
    }

    public int compareTo(Object arg0) {
        return this.method4937((class285) arg0);
    }
}
