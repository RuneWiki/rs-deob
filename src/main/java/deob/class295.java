package deob;

@ObfuscatedName("kh")
public class class295 {

    @ObfuscatedName("kh.t")
    public long field3814 = -1L;

    @ObfuscatedName("kh.q")
    public long field3813 = -1L;

    @ObfuscatedName("kh.i")
    public boolean field3812 = false;

    @ObfuscatedName("kh.a")
    public long field3815 = 0L;

    @ObfuscatedName("kh.l")
    public long field3816 = 0L;

    @ObfuscatedName("kh.b")
    public long field3817 = 0L;

    @ObfuscatedName("kh.e")
    public int field3820 = 0;

    @ObfuscatedName("kh.x")
    public int field3822 = 0;

    @ObfuscatedName("kh.p")
    public int field3819 = 0;

    @ObfuscatedName("kh.g")
    public int field3821 = 0;

    @ObfuscatedName("kh.t(I)V")
    public void method4818() {
        this.field3814 = Statics.method426();
    }

    @ObfuscatedName("kh.q(I)V")
    public void method4814() {
        if (this.field3814 != -1L) {
            this.field3816 = Statics.method426() - this.field3814;
            this.field3814 = -1L;
        }
    }

    @ObfuscatedName("kh.i(II)V")
    public void method4815(int arg0) {
        this.field3813 = Statics.method426();
        this.field3820 = arg0;
    }

    @ObfuscatedName("kh.a(S)V")
    public void method4834() {
        if (this.field3813 != -1L) {
            this.field3815 = Statics.method426() - this.field3813;
            this.field3813 = -1L;
        }
        this.field3819++;
        this.field3812 = true;
    }

    @ObfuscatedName("kh.l(B)V")
    public void method4826() {
        this.field3812 = false;
        this.field3822 = 0;
    }

    @ObfuscatedName("kh.b(I)V")
    public void method4817() {
        this.method4834();
    }

    @ObfuscatedName("kh.e(Lgb;B)V")
    public void method4812(class195 arg0) {
        long var2 = this.field3816;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3323((int) var4);
        long var6 = this.field3815;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3323((int) var8);
        long var10 = this.field3817;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3323((int) var12);
        arg0.method3323(this.field3820);
        arg0.method3323(this.field3822);
        arg0.method3323(this.field3819);
        arg0.method3323(this.field3821);
    }
}
