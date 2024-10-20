package deob;

@ObfuscatedName("kj")
public class class288 {

    @ObfuscatedName("kj.a")
    public long field3794 = -1L;

    @ObfuscatedName("kj.w")
    public long field3793 = -1L;

    @ObfuscatedName("kj.e")
    public boolean field3797 = false;

    @ObfuscatedName("kj.k")
    public long field3795 = 0L;

    @ObfuscatedName("kj.u")
    public long field3796 = 0L;

    @ObfuscatedName("kj.z")
    public long field3792 = 0L;

    @ObfuscatedName("kj.t")
    public int field3798 = 0;

    @ObfuscatedName("kj.f")
    public int field3799 = 0;

    @ObfuscatedName("kj.g")
    public int field3800 = 0;

    @ObfuscatedName("kj.j")
    public int field3801 = 0;

    @ObfuscatedName("kj.a(I)V")
    public void method4649() {
        this.field3794 = class187.method1411();
    }

    @ObfuscatedName("kj.w(B)V")
    public void method4665() {
        if (this.field3794 != -1L) {
            this.field3796 = class187.method1411() - this.field3794;
            this.field3794 = -1L;
        }
    }

    @ObfuscatedName("kj.e(IB)V")
    public void method4651(int arg0) {
        this.field3793 = class187.method1411();
        this.field3798 = arg0;
    }

    @ObfuscatedName("kj.k(I)V")
    public void method4650() {
        if (this.field3793 != -1L) {
            this.field3795 = class187.method1411() - this.field3793;
            this.field3793 = -1L;
        }
        this.field3800++;
        this.field3797 = true;
    }

    @ObfuscatedName("kj.u(I)V")
    public void method4653() {
        this.field3797 = false;
        this.field3799 = 0;
    }

    @ObfuscatedName("kj.z(I)V")
    public void method4662() {
        this.method4650();
    }

    @ObfuscatedName("kj.t(Lgh;I)V")
    public void method4674(class185 arg0) {
        method974(arg0, this.field3796);
        method974(arg0, this.field3795);
        method974(arg0, this.field3792);
        arg0.method2944(this.field3798);
        arg0.method2944(this.field3799);
        arg0.method2944(this.field3800);
        arg0.method2944(this.field3801);
    }

    @ObfuscatedName("bv.f(Lgh;J)V")
    public static void method974(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method2944((int) var3);
    }
}
