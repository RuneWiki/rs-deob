package deob;

@ObfuscatedName("kv")
public class class300 {

    @ObfuscatedName("kv.p")
    public long field3818 = -1L;

    @ObfuscatedName("kv.i")
    public long field3815 = -1L;

    @ObfuscatedName("kv.w")
    public boolean field3816 = false;

    @ObfuscatedName("kv.s")
    public long field3814 = 0L;

    @ObfuscatedName("kv.j")
    public long field3822 = 0L;

    @ObfuscatedName("kv.a")
    public long field3819 = 0L;

    @ObfuscatedName("kv.t")
    public int field3820 = 0;

    @ObfuscatedName("kv.r")
    public int field3821 = 0;

    @ObfuscatedName("kv.m")
    public int field3817 = 0;

    @ObfuscatedName("kv.h")
    public int field3823 = 0;

    @ObfuscatedName("kv.p(I)V")
    public void method4939() {
        this.field3818 = class187.method35();
    }

    @ObfuscatedName("kv.i(I)V")
    public void method4940() {
        if (this.field3818 != -1L) {
            this.field3822 = class187.method35() - this.field3818;
            this.field3818 = -1L;
        }
    }

    @ObfuscatedName("kv.w(II)V")
    public void method4941(int arg0) {
        this.field3815 = class187.method35();
        this.field3820 = arg0;
    }

    @ObfuscatedName("kv.s(I)V")
    public void method4950() {
        if (this.field3815 != -1L) {
            this.field3814 = class187.method35() - this.field3815;
            this.field3815 = -1L;
        }
        this.field3817++;
        this.field3816 = true;
    }

    @ObfuscatedName("kv.j(B)V")
    public void method4942() {
        this.field3816 = false;
        this.field3821 = 0;
    }

    @ObfuscatedName("kv.a(I)V")
    public void method4952() {
        this.method4950();
    }

    @ObfuscatedName("kv.t(Lgj;I)V")
    public void method4945(class185 arg0) {
        method2369(arg0, this.field3822);
        method2369(arg0, this.field3814);
        method2369(arg0, this.field3819);
        arg0.method3250(this.field3820);
        arg0.method3250(this.field3821);
        arg0.method3250(this.field3817);
        arg0.method3250(this.field3823);
    }

    @ObfuscatedName("dg.r(Lgj;J)V")
    public static void method2369(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3250((int) var3);
    }
}
