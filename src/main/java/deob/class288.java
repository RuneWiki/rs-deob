package deob;

@ObfuscatedName("ke")
public class class288 {

    @ObfuscatedName("ke.n")
    public long field3801 = -1L;

    @ObfuscatedName("ke.v")
    public long field3802 = -1L;

    @ObfuscatedName("ke.y")
    public boolean field3803 = false;

    @ObfuscatedName("ke.r")
    public long field3804 = 0L;

    @ObfuscatedName("ke.h")
    public long field3805 = 0L;

    @ObfuscatedName("ke.d")
    public long field3809 = 0L;

    @ObfuscatedName("ke.s")
    public int field3806 = 0;

    @ObfuscatedName("ke.b")
    public int field3808 = 0;

    @ObfuscatedName("ke.e")
    public int field3807 = 0;

    @ObfuscatedName("ke.f")
    public int field3810 = 0;

    @ObfuscatedName("ke.n(B)V")
    public void method4708() {
        this.field3801 = class187.method938();
    }

    @ObfuscatedName("ke.v(I)V")
    public void method4686() {
        if (this.field3801 != -1L) {
            this.field3805 = class187.method938() - this.field3801;
            this.field3801 = -1L;
        }
    }

    @ObfuscatedName("ke.y(IS)V")
    public void method4687(int arg0) {
        this.field3802 = class187.method938();
        this.field3806 = arg0;
    }

    @ObfuscatedName("ke.r(I)V")
    public void method4688() {
        if (this.field3802 != -1L) {
            this.field3804 = class187.method938() - this.field3802;
            this.field3802 = -1L;
        }
        this.field3807++;
        this.field3803 = true;
    }

    @ObfuscatedName("ke.h(I)V")
    public void method4689() {
        this.field3803 = false;
        this.field3808 = 0;
    }

    @ObfuscatedName("ke.d(I)V")
    public void method4690() {
        this.method4688();
    }

    @ObfuscatedName("ke.s(Lgv;B)V")
    public void method4684(class185 arg0) {
        method160(arg0, this.field3805);
        method160(arg0, this.field3804);
        method160(arg0, this.field3809);
        arg0.method3006(this.field3806);
        arg0.method3006(this.field3808);
        arg0.method3006(this.field3807);
        arg0.method3006(this.field3810);
    }

    @ObfuscatedName("g.b(Lgv;J)V")
    public static void method160(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3006((int) var3);
    }
}
