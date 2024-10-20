package deob;

@ObfuscatedName("lo")
public class class326 {

    @ObfuscatedName("lo.i")
    public long field3897 = -1L;

    @ObfuscatedName("lo.w")
    public long field3896 = -1L;

    @ObfuscatedName("lo.s")
    public boolean field3901 = false;

    @ObfuscatedName("lo.a")
    public long field3898 = 0L;

    @ObfuscatedName("lo.o")
    public long field3899 = 0L;

    @ObfuscatedName("lo.g")
    public long field3895 = 0L;

    @ObfuscatedName("lo.e")
    public int field3900 = 0;

    @ObfuscatedName("lo.p")
    public int field3902 = 0;

    @ObfuscatedName("lo.j")
    public int field3903 = 0;

    @ObfuscatedName("lo.b")
    public int field3904 = 0;

    @ObfuscatedName("lo.i(I)V")
    public void method5381() {
        this.field3897 = class398.method2381();
    }

    @ObfuscatedName("lo.w(I)V")
    public void method5387() {
        if (this.field3897 != -1L) {
            this.field3899 = class398.method2381() - this.field3897;
            this.field3897 = -1L;
        }
    }

    @ObfuscatedName("lo.s(IB)V")
    public void method5382(int arg0) {
        this.field3896 = class398.method2381();
        this.field3900 = arg0;
    }

    @ObfuscatedName("lo.a(I)V")
    public void method5383() {
        if (this.field3896 != -1L) {
            this.field3898 = class398.method2381() - this.field3896;
            this.field3896 = -1L;
        }
        this.field3903++;
        this.field3901 = true;
    }

    @ObfuscatedName("lo.o(I)V")
    public void method5384() {
        this.field3901 = false;
        this.field3902 = 0;
    }

    @ObfuscatedName("lo.g(I)V")
    public void method5379() {
        this.method5383();
    }

    @ObfuscatedName("lo.e(Lop;I)V")
    public void method5386(class401 arg0) {
        method4614(arg0, this.field3899);
        method4614(arg0, this.field3898);
        method4614(arg0, this.field3895);
        arg0.method6224(this.field3900);
        arg0.method6224(this.field3902);
        arg0.method6224(this.field3903);
        arg0.method6224(this.field3904);
    }

    @ObfuscatedName("jw.p(Lop;J)V")
    public static void method4614(class401 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method6224((int) var3);
    }
}
