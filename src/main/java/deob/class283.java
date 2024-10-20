package deob;

@ObfuscatedName("je")
public class class283 {

    @ObfuscatedName("je.f")
    public long field3680 = -1L;

    @ObfuscatedName("je.l")
    public long field3670 = -1L;

    @ObfuscatedName("je.w")
    public boolean field3675 = false;

    @ObfuscatedName("je.s")
    public long field3672 = 0L;

    @ObfuscatedName("je.e")
    public long field3673 = 0L;

    @ObfuscatedName("je.a")
    public long field3674 = 0L;

    @ObfuscatedName("je.c")
    public int field3669 = 0;

    @ObfuscatedName("je.p")
    public int field3671 = 0;

    @ObfuscatedName("je.r")
    public int field3677 = 0;

    @ObfuscatedName("je.m")
    public int field3678 = 0;

    @ObfuscatedName("je.f(I)V")
    public void method4943() {
        this.field3680 = Statics.method1926();
    }

    @ObfuscatedName("je.l(I)V")
    public void method4959() {
        if (this.field3680 != -1L) {
            this.field3673 = Statics.method1926() - this.field3680;
            this.field3680 = -1L;
        }
    }

    @ObfuscatedName("je.w(II)V")
    public void method4944(int arg0) {
        this.field3670 = Statics.method1926();
        this.field3669 = arg0;
    }

    @ObfuscatedName("je.s(I)V")
    public void method4950() {
        if (this.field3670 != -1L) {
            this.field3672 = Statics.method1926() - this.field3670;
            this.field3670 = -1L;
        }
        this.field3677++;
        this.field3675 = true;
    }

    @ObfuscatedName("je.e(I)V")
    public void method4947() {
        this.field3675 = false;
        this.field3671 = 0;
    }

    @ObfuscatedName("je.c(B)V")
    public void method4963() {
        this.method4950();
    }

    @ObfuscatedName("je.p(Lgm;I)V")
    public void method4949(class185 arg0) {
        method277(arg0, this.field3673);
        method277(arg0, this.field3672);
        method277(arg0, this.field3674);
        arg0.method3330(this.field3669);
        arg0.method3330(this.field3671);
        arg0.method3330(this.field3677);
        arg0.method3330(this.field3678);
    }

    @ObfuscatedName("o.r(Lgm;J)V")
    public static void method277(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3330((int) var3);
    }
}
