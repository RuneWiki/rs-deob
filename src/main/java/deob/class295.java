package deob;

@ObfuscatedName("kb")
public class class295 {

    @ObfuscatedName("kb.o")
    public long field3819 = -1L;

    @ObfuscatedName("kb.k")
    public long field3818 = -1L;

    @ObfuscatedName("kb.t")
    public boolean field3826 = false;

    @ObfuscatedName("kb.d")
    public long field3820 = 0L;

    @ObfuscatedName("kb.h")
    public long field3821 = 0L;

    @ObfuscatedName("kb.m")
    public long field3822 = 0L;

    @ObfuscatedName("kb.z")
    public int field3825 = 0;

    @ObfuscatedName("kb.i")
    public int field3824 = 0;

    @ObfuscatedName("kb.u")
    public int field3817 = 0;

    @ObfuscatedName("kb.x")
    public int field3823 = 0;

    @ObfuscatedName("kb.o(I)V")
    public void method4822() {
        this.field3819 = class197.method1005();
    }

    @ObfuscatedName("kb.k(B)V")
    public void method4823() {
        if (this.field3819 != -1L) {
            this.field3821 = class197.method1005() - this.field3819;
            this.field3819 = -1L;
        }
    }

    @ObfuscatedName("kb.t(II)V")
    public void method4824(int arg0) {
        this.field3818 = class197.method1005();
        this.field3825 = arg0;
    }

    @ObfuscatedName("kb.d(I)V")
    public void method4825() {
        if (this.field3818 != -1L) {
            this.field3820 = class197.method1005() - this.field3818;
            this.field3818 = -1L;
        }
        this.field3817++;
        this.field3826 = true;
    }

    @ObfuscatedName("kb.h(I)V")
    public void method4826() {
        this.field3826 = false;
        this.field3824 = 0;
    }

    @ObfuscatedName("kb.m(I)V")
    public void method4842() {
        this.method4825();
    }

    @ObfuscatedName("kb.z(Lgc;I)V")
    public void method4837(class195 arg0) {
        long var2 = this.field3821;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3190((int) var4);
        long var6 = this.field3820;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3190((int) var8);
        long var10 = this.field3822;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3190((int) var12);
        arg0.method3190(this.field3825);
        arg0.method3190(this.field3824);
        arg0.method3190(this.field3817);
        arg0.method3190(this.field3823);
    }
}
