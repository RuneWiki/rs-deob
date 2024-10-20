package deob;

@ObfuscatedName("kj")
public class class295 {

    @ObfuscatedName("kj.g")
    public long field3818 = -1L;

    @ObfuscatedName("kj.e")
    public long field3819 = -1L;

    @ObfuscatedName("kj.b")
    public boolean field3820 = false;

    @ObfuscatedName("kj.z")
    public long field3821 = 0L;

    @ObfuscatedName("kj.n")
    public long field3822 = 0L;

    @ObfuscatedName("kj.l")
    public long field3823 = 0L;

    @ObfuscatedName("kj.s")
    public int field3824 = 0;

    @ObfuscatedName("kj.y")
    public int field3825 = 0;

    @ObfuscatedName("kj.c")
    public int field3826 = 0;

    @ObfuscatedName("kj.h")
    public int field3827 = 0;

    @ObfuscatedName("kj.g(B)V")
    public void method4878() {
        this.field3818 = class197.method4873();
    }

    @ObfuscatedName("kj.e(I)V")
    public void method4879() {
        if (this.field3818 != -1L) {
            this.field3822 = class197.method4873() - this.field3818;
            this.field3818 = -1L;
        }
    }

    @ObfuscatedName("kj.b(II)V")
    public void method4880(int arg0) {
        this.field3819 = class197.method4873();
        this.field3824 = arg0;
    }

    @ObfuscatedName("kj.z(I)V")
    public void method4881() {
        if (this.field3819 != -1L) {
            this.field3821 = class197.method4873() - this.field3819;
            this.field3819 = -1L;
        }
        this.field3826++;
        this.field3820 = true;
    }

    @ObfuscatedName("kj.n(I)V")
    public void method4882() {
        this.field3820 = false;
        this.field3825 = 0;
    }

    @ObfuscatedName("kj.l(I)V")
    public void method4883() {
        this.method4881();
    }

    @ObfuscatedName("kj.s(Lgg;I)V")
    public void method4884(class195 arg0) {
        long var2 = this.field3822;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3476((int) var4);
        long var6 = this.field3821;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3476((int) var8);
        long var10 = this.field3823;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3476((int) var12);
        arg0.method3476(this.field3824);
        arg0.method3476(this.field3825);
        arg0.method3476(this.field3826);
        arg0.method3476(this.field3827);
    }
}
