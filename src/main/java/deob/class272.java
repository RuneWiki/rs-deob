package deob;

@ObfuscatedName("jl")
public class class272 {

    @ObfuscatedName("jl.u")
    public long field3585 = -1L;

    @ObfuscatedName("jl.f")
    public long field3581 = -1L;

    @ObfuscatedName("jl.b")
    public boolean field3582 = false;

    @ObfuscatedName("jl.g")
    public long field3583 = 0L;

    @ObfuscatedName("jl.z")
    public long field3584 = 0L;

    @ObfuscatedName("jl.p")
    public long field3580 = 0L;

    @ObfuscatedName("jl.h")
    public int field3586 = 0;

    @ObfuscatedName("jl.y")
    public int field3587 = 0;

    @ObfuscatedName("jl.w")
    public int field3589 = 0;

    @ObfuscatedName("jl.i")
    public int field3588 = 0;

    @ObfuscatedName("jl.u(I)V")
    public void method4661() {
        this.field3585 = class297.method3217();
    }

    @ObfuscatedName("jl.f(I)V")
    public void method4662() {
        if (this.field3585 != -1L) {
            this.field3584 = class297.method3217() - this.field3585;
            this.field3585 = -1L;
        }
    }

    @ObfuscatedName("jl.b(II)V")
    public void method4663(int arg0) {
        this.field3581 = class297.method3217();
        this.field3586 = arg0;
    }

    @ObfuscatedName("jl.g(I)V")
    public void method4669() {
        if (this.field3581 != -1L) {
            this.field3583 = class297.method3217() - this.field3581;
            this.field3581 = -1L;
        }
        this.field3589++;
        this.field3582 = true;
    }

    @ObfuscatedName("jl.z(I)V")
    public void method4665() {
        this.field3582 = false;
        this.field3587 = 0;
    }

    @ObfuscatedName("jl.p(I)V")
    public void method4666() {
        this.method4669();
    }

    @ObfuscatedName("jl.h(Lkg;I)V")
    public void method4678(class300 arg0) {
        method2754(arg0, this.field3584);
        method2754(arg0, this.field3583);
        method2754(arg0, this.field3580);
        arg0.method5123(this.field3586);
        arg0.method5123(this.field3587);
        arg0.method5123(this.field3589);
        arg0.method5123(this.field3588);
    }

    @ObfuscatedName("dy.y(Lkg;J)V")
    public static void method2754(class300 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5123((int) var3);
    }
}
