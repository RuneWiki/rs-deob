package deob;

@ObfuscatedName("jn")
public class class273 {

    @ObfuscatedName("jn.c")
    public long field3576 = -1L;

    @ObfuscatedName("jn.t")
    public long field3569 = -1L;

    @ObfuscatedName("jn.o")
    public boolean field3570 = false;

    @ObfuscatedName("jn.e")
    public long field3571 = 0L;

    @ObfuscatedName("jn.i")
    public long field3572 = 0L;

    @ObfuscatedName("jn.g")
    public long field3568 = 0L;

    @ObfuscatedName("jn.d")
    public int field3573 = 0;

    @ObfuscatedName("jn.l")
    public int field3575 = 0;

    @ObfuscatedName("jn.j")
    public int field3574 = 0;

    @ObfuscatedName("jn.m")
    public int field3577 = 0;

    @ObfuscatedName("jn.c(B)V")
    public void method4642() {
        this.field3576 = Statics.method184();
    }

    @ObfuscatedName("jn.t(I)V")
    public void method4643() {
        if (this.field3576 != -1L) {
            this.field3572 = Statics.method184() - this.field3576;
            this.field3576 = -1L;
        }
    }

    @ObfuscatedName("jn.o(II)V")
    public void method4660(int arg0) {
        this.field3569 = Statics.method184();
        this.field3573 = arg0;
    }

    @ObfuscatedName("jn.e(I)V")
    public void method4645() {
        if (this.field3569 != -1L) {
            this.field3571 = Statics.method184() - this.field3569;
            this.field3569 = -1L;
        }
        this.field3574++;
        this.field3570 = true;
    }

    @ObfuscatedName("jn.i(I)V")
    public void method4655() {
        this.field3570 = false;
        this.field3575 = 0;
    }

    @ObfuscatedName("jn.g(I)V")
    public void method4644() {
        this.method4645();
    }

    @ObfuscatedName("jn.d(Lkp;I)V")
    public void method4648(class301 arg0) {
        method2095(arg0, this.field3572);
        method2095(arg0, this.field3571);
        method2095(arg0, this.field3568);
        arg0.method5114(this.field3573);
        arg0.method5114(this.field3575);
        arg0.method5114(this.field3574);
        arg0.method5114(this.field3577);
    }

    @ObfuscatedName("cw.l(Lkp;J)V")
    public static void method2095(class301 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5114((int) var3);
    }
}
