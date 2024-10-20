package deob;

@ObfuscatedName("jt")
public class class272 {

    @ObfuscatedName("jt.a")
    public long field3568 = -1L;

    @ObfuscatedName("jt.t")
    public long field3570 = -1L;

    @ObfuscatedName("jt.n")
    public boolean field3569 = false;

    @ObfuscatedName("jt.q")
    public long field3571 = 0L;

    @ObfuscatedName("jt.v")
    public long field3572 = 0L;

    @ObfuscatedName("jt.l")
    public long field3573 = 0L;

    @ObfuscatedName("jt.c")
    public int field3574 = 0;

    @ObfuscatedName("jt.o")
    public int field3575 = 0;

    @ObfuscatedName("jt.i")
    public int field3576 = 0;

    @ObfuscatedName("jt.d")
    public int field3577 = 0;

    @ObfuscatedName("jt.a(I)V")
    public void method4666() {
        this.field3568 = class297.method3777();
    }

    @ObfuscatedName("jt.t(I)V")
    public void method4674() {
        if (this.field3568 != -1L) {
            this.field3572 = class297.method3777() - this.field3568;
            this.field3568 = -1L;
        }
    }

    @ObfuscatedName("jt.n(II)V")
    public void method4669(int arg0) {
        this.field3570 = class297.method3777();
        this.field3574 = arg0;
    }

    @ObfuscatedName("jt.q(I)V")
    public void method4670() {
        if (this.field3570 != -1L) {
            this.field3571 = class297.method3777() - this.field3570;
            this.field3570 = -1L;
        }
        this.field3576++;
        this.field3569 = true;
    }

    @ObfuscatedName("jt.v(I)V")
    public void method4671() {
        this.field3569 = false;
        this.field3575 = 0;
    }

    @ObfuscatedName("jt.l(I)V")
    public void method4672() {
        this.method4670();
    }

    @ObfuscatedName("jt.c(Lkc;I)V")
    public void method4684(class300 arg0) {
        method301(arg0, this.field3572);
        method301(arg0, this.field3571);
        method301(arg0, this.field3573);
        arg0.method5128(this.field3574);
        arg0.method5128(this.field3575);
        arg0.method5128(this.field3576);
        arg0.method5128(this.field3577);
    }

    @ObfuscatedName("w.o(Lkc;J)V")
    public static void method301(class300 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5128((int) var3);
    }
}
