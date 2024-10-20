package deob;

@ObfuscatedName("jr")
public class class283 {

    @ObfuscatedName("jr.v")
    public long field3634 = -1L;

    @ObfuscatedName("jr.s")
    public long field3633 = -1L;

    @ObfuscatedName("jr.o")
    public boolean field3632 = false;

    @ObfuscatedName("jr.k")
    public long field3635 = 0L;

    @ObfuscatedName("jr.u")
    public long field3640 = 0L;

    @ObfuscatedName("jr.i")
    public long field3637 = 0L;

    @ObfuscatedName("jr.t")
    public int field3638 = 0;

    @ObfuscatedName("jr.p")
    public int field3636 = 0;

    @ObfuscatedName("jr.l")
    public int field3639 = 0;

    @ObfuscatedName("jr.b")
    public int field3641 = 0;

    @ObfuscatedName("jr.v(I)V")
    public void method4906() {
        this.field3634 = class187.method3154();
    }

    @ObfuscatedName("jr.s(I)V")
    public void method4928() {
        if (this.field3634 != -1L) {
            this.field3640 = class187.method3154() - this.field3634;
            this.field3634 = -1L;
        }
    }

    @ObfuscatedName("jr.o(IS)V")
    public void method4900(int arg0) {
        this.field3633 = class187.method3154();
        this.field3638 = arg0;
    }

    @ObfuscatedName("jr.k(I)V")
    public void method4899() {
        if (this.field3633 != -1L) {
            this.field3635 = class187.method3154() - this.field3633;
            this.field3633 = -1L;
        }
        this.field3639++;
        this.field3632 = true;
    }

    @ObfuscatedName("jr.u(I)V")
    public void method4914() {
        this.field3632 = false;
        this.field3636 = 0;
    }

    @ObfuscatedName("jr.i(I)V")
    public void method4901() {
        this.method4899();
    }

    @ObfuscatedName("jr.t(Lgx;B)V")
    public void method4904(class185 arg0) {
        method17(arg0, this.field3640);
        method17(arg0, this.field3635);
        method17(arg0, this.field3637);
        arg0.method3259(this.field3638);
        arg0.method3259(this.field3636);
        arg0.method3259(this.field3639);
        arg0.method3259(this.field3641);
    }

    @ObfuscatedName("s.c(Lgx;J)V")
    public static void method17(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3259((int) var3);
    }
}
