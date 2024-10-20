package deob;

@ObfuscatedName("kw")
public class class311 {

    @ObfuscatedName("kw.b")
    public long field3848 = -1L;

    @ObfuscatedName("kw.q")
    public long field3842 = -1L;

    @ObfuscatedName("kw.o")
    public boolean field3844 = false;

    @ObfuscatedName("kw.p")
    public long field3845 = 0L;

    @ObfuscatedName("kw.a")
    public long field3846 = 0L;

    @ObfuscatedName("kw.h")
    public long field3847 = 0L;

    @ObfuscatedName("kw.l")
    public int field3849 = 0;

    @ObfuscatedName("kw.y")
    public int field3850 = 0;

    @ObfuscatedName("kw.g")
    public int field3843 = 0;

    @ObfuscatedName("kw.c")
    public int field3851 = 0;

    @ObfuscatedName("kw.b(B)V")
    public void method5149() {
        this.field3848 = class196.method3211();
    }

    @ObfuscatedName("kw.q(I)V")
    public void method5145() {
        if (this.field3848 != -1L) {
            this.field3846 = class196.method3211() - this.field3848;
            this.field3848 = -1L;
        }
    }

    @ObfuscatedName("kw.o(II)V")
    public void method5146(int arg0) {
        this.field3842 = class196.method3211();
        this.field3849 = arg0;
    }

    @ObfuscatedName("kw.p(I)V")
    public void method5147() {
        if (this.field3842 != -1L) {
            this.field3845 = class196.method3211() - this.field3842;
            this.field3842 = -1L;
        }
        this.field3843++;
        this.field3844 = true;
    }

    @ObfuscatedName("kw.a(I)V")
    public void method5148() {
        this.field3844 = false;
        this.field3850 = 0;
    }

    @ObfuscatedName("kw.h(I)V")
    public void method5166() {
        this.method5147();
    }

    @ObfuscatedName("kw.l(Lgn;I)V")
    public void method5150(class194 arg0) {
        method4760(arg0, this.field3846);
        method4760(arg0, this.field3845);
        method4760(arg0, this.field3847);
        arg0.method3233(this.field3849);
        arg0.method3233(this.field3850);
        arg0.method3233(this.field3843);
        arg0.method3233(this.field3851);
    }

    @ObfuscatedName("jc.y(Lgn;J)V")
    public static void method4760(class194 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3233((int) var3);
    }
}
