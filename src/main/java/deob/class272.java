package deob;

@ObfuscatedName("jg")
public class class272 {

    @ObfuscatedName("jg.c")
    public long field3555 = -1L;

    @ObfuscatedName("jg.x")
    public long field3551 = -1L;

    @ObfuscatedName("jg.t")
    public boolean field3550 = false;

    @ObfuscatedName("jg.g")
    public long field3548 = 0L;

    @ObfuscatedName("jg.l")
    public long field3552 = 0L;

    @ObfuscatedName("jg.u")
    public long field3553 = 0L;

    @ObfuscatedName("jg.j")
    public int field3554 = 0;

    @ObfuscatedName("jg.v")
    public int field3549 = 0;

    @ObfuscatedName("jg.d")
    public int field3556 = 0;

    @ObfuscatedName("jg.z")
    public int field3558 = 0;

    @ObfuscatedName("jg.c(I)V")
    public void method4636() {
        this.field3555 = Statics.method2303();
    }

    @ObfuscatedName("jg.x(B)V")
    public void method4652() {
        if (this.field3555 != -1L) {
            this.field3552 = Statics.method2303() - this.field3555;
            this.field3555 = -1L;
        }
    }

    @ObfuscatedName("jg.t(II)V")
    public void method4638(int arg0) {
        this.field3551 = Statics.method2303();
        this.field3554 = arg0;
    }

    @ObfuscatedName("jg.g(I)V")
    public void method4639() {
        if (this.field3551 != -1L) {
            this.field3548 = Statics.method2303() - this.field3551;
            this.field3551 = -1L;
        }
        this.field3556++;
        this.field3550 = true;
    }

    @ObfuscatedName("jg.l(I)V")
    public void method4640() {
        this.field3550 = false;
        this.field3549 = 0;
    }

    @ObfuscatedName("jg.u(B)V")
    public void method4649() {
        this.method4639();
    }

    @ObfuscatedName("jg.j(Lkz;I)V")
    public void method4641(class300 arg0) {
        long var2 = this.field3552;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5145((int) var4);
        method2752(arg0, this.field3548);
        long var6 = this.field3553;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5145((int) var8);
        arg0.method5145(this.field3554);
        arg0.method5145(this.field3549);
        arg0.method5145(this.field3556);
        arg0.method5145(this.field3558);
    }

    @ObfuscatedName("df.v(Lkz;J)V")
    public static void method2752(class300 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5145((int) var3);
    }
}
