package deob;

@ObfuscatedName("kr")
public class class300 {

    @ObfuscatedName("kr.s")
    public long field3847 = -1L;

    @ObfuscatedName("kr.g")
    public long field3844 = -1L;

    @ObfuscatedName("kr.m")
    public boolean field3845 = false;

    @ObfuscatedName("kr.h")
    public long field3846 = 0L;

    @ObfuscatedName("kr.i")
    public long field3851 = 0L;

    @ObfuscatedName("kr.w")
    public long field3852 = 0L;

    @ObfuscatedName("kr.t")
    public int field3849 = 0;

    @ObfuscatedName("kr.d")
    public int field3850 = 0;

    @ObfuscatedName("kr.z")
    public int field3848 = 0;

    @ObfuscatedName("kr.k")
    public int field3843 = 0;

    @ObfuscatedName("kr.s(I)V")
    public void method5141() {
        this.field3847 = class187.method2705();
    }

    @ObfuscatedName("kr.g(I)V")
    public void method5142() {
        if (this.field3847 != -1L) {
            this.field3851 = class187.method2705() - this.field3847;
            this.field3847 = -1L;
        }
    }

    @ObfuscatedName("kr.m(IB)V")
    public void method5155(int arg0) {
        this.field3844 = class187.method2705();
        this.field3849 = arg0;
    }

    @ObfuscatedName("kr.h(I)V")
    public void method5144() {
        if (this.field3844 != -1L) {
            this.field3846 = class187.method2705() - this.field3844;
            this.field3844 = -1L;
        }
        this.field3848++;
        this.field3845 = true;
    }

    @ObfuscatedName("kr.i(I)V")
    public void method5145() {
        this.field3845 = false;
        this.field3850 = 0;
    }

    @ObfuscatedName("kr.w(I)V")
    public void method5146() {
        this.method5144();
    }

    @ObfuscatedName("kr.t(Lgy;I)V")
    public void method5154(class185 arg0) {
        method984(arg0, this.field3851);
        method984(arg0, this.field3846);
        method984(arg0, this.field3852);
        arg0.method3403(this.field3849);
        arg0.method3403(this.field3850);
        arg0.method3403(this.field3848);
        arg0.method3403(this.field3843);
    }

    @ObfuscatedName("bz.d(Lgy;J)V")
    public static void method984(class185 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3403((int) var3);
    }
}
