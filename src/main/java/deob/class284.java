package deob;

@ObfuscatedName("jl")
public class class284 {

    @ObfuscatedName("jl.m")
    public long field3775 = -1L;

    @ObfuscatedName("jl.p")
    public long field3780 = -1L;

    @ObfuscatedName("jl.i")
    public boolean field3777 = false;

    @ObfuscatedName("jl.j")
    public long field3778 = 0L;

    @ObfuscatedName("jl.v")
    public long field3779 = 0L;

    @ObfuscatedName("jl.x")
    public long field3776 = 0L;

    @ObfuscatedName("jl.e")
    public int field3781 = 0;

    @ObfuscatedName("jl.l")
    public int field3782 = 0;

    @ObfuscatedName("jl.b")
    public int field3783 = 0;

    @ObfuscatedName("jl.n")
    public int field3784 = 0;

    @ObfuscatedName("jl.m(I)V")
    public void method4731() {
        this.field3775 = class183.method4541();
    }

    @ObfuscatedName("jl.p(B)V")
    public void method4725() {
        if (this.field3775 != -1L) {
            this.field3779 = class183.method4541() - this.field3775;
            this.field3775 = -1L;
        }
    }

    @ObfuscatedName("jl.i(II)V")
    public void method4726(int arg0) {
        this.field3780 = class183.method4541();
        this.field3781 = arg0;
    }

    @ObfuscatedName("jl.j(I)V")
    public void method4723() {
        if (this.field3780 != -1L) {
            this.field3778 = class183.method4541() - this.field3780;
            this.field3780 = -1L;
        }
        this.field3783++;
        this.field3777 = true;
    }

    @ObfuscatedName("jl.v(I)V")
    public void method4728() {
        this.field3777 = false;
        this.field3782 = 0;
    }

    @ObfuscatedName("jl.x(I)V")
    public void method4743() {
        this.method4723();
    }

    @ObfuscatedName("jl.e(Lfv;I)V")
    public void method4730(class181 arg0) {
        long var2 = this.field3779;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method2997((int) var4);
        long var6 = this.field3778;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method2997((int) var8);
        method1469(arg0, this.field3776);
        arg0.method2997(this.field3781);
        arg0.method2997(this.field3782);
        arg0.method2997(this.field3783);
        arg0.method2997(this.field3784);
    }

    @ObfuscatedName("bv.l(Lfv;J)V")
    public static void method1469(class181 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method2997((int) var3);
    }
}
