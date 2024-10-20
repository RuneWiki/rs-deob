package deob;

@ObfuscatedName("js")
public class class283 {

    @ObfuscatedName("js.f")
    public long field3673 = -1L;

    @ObfuscatedName("js.h")
    public long field3665 = -1L;

    @ObfuscatedName("js.e")
    public boolean field3668 = false;

    @ObfuscatedName("js.b")
    public long field3666 = 0L;

    @ObfuscatedName("js.l")
    public long field3667 = 0L;

    @ObfuscatedName("js.w")
    public long field3671 = 0L;

    @ObfuscatedName("js.d")
    public int field3669 = 0;

    @ObfuscatedName("js.n")
    public int field3670 = 0;

    @ObfuscatedName("js.s")
    public int field3664 = 0;

    @ObfuscatedName("js.g")
    public int field3672 = 0;

    @ObfuscatedName("js.f(I)V")
    public void method4881() {
        this.field3673 = class187.method2864();
    }

    @ObfuscatedName("js.h(I)V")
    public void method4884() {
        if (this.field3673 != -1L) {
            this.field3667 = class187.method2864() - this.field3673;
            this.field3673 = -1L;
        }
    }

    @ObfuscatedName("js.e(II)V")
    public void method4883(int arg0) {
        this.field3665 = class187.method2864();
        this.field3669 = arg0;
    }

    @ObfuscatedName("js.b(I)V")
    public void method4899() {
        if (this.field3665 != -1L) {
            this.field3666 = class187.method2864() - this.field3665;
            this.field3665 = -1L;
        }
        this.field3664++;
        this.field3668 = true;
    }

    @ObfuscatedName("js.l(I)V")
    public void method4885() {
        this.field3668 = false;
        this.field3670 = 0;
    }

    @ObfuscatedName("js.w(B)V")
    public void method4888() {
        this.method4899();
    }

    @ObfuscatedName("js.d(Lgx;I)V")
    public void method4890(class185 arg0) {
        long var2 = this.field3667;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3449((int) var4);
        long var6 = this.field3666;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3449((int) var8);
        long var10 = this.field3671;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3449((int) var12);
        arg0.method3449(this.field3669);
        arg0.method3449(this.field3670);
        arg0.method3449(this.field3664);
        arg0.method3449(this.field3672);
    }
}
