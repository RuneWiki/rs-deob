package deob;

@ObfuscatedName("ka")
public class class287 {

    @ObfuscatedName("ka.a")
    public long field3691 = -1L;

    @ObfuscatedName("ka.s")
    public long field3683 = -1L;

    @ObfuscatedName("ka.g")
    public boolean field3684 = false;

    @ObfuscatedName("ka.x")
    public long field3685 = 0L;

    @ObfuscatedName("ka.h")
    public long field3686 = 0L;

    @ObfuscatedName("ka.f")
    public long field3687 = 0L;

    @ObfuscatedName("ka.p")
    public int field3688 = 0;

    @ObfuscatedName("ka.m")
    public int field3689 = 0;

    @ObfuscatedName("ka.q")
    public int field3682 = 0;

    @ObfuscatedName("ka.b")
    public int field3690 = 0;

    @ObfuscatedName("ka.a(I)V")
    public void method5044() {
        this.field3691 = class192.method183();
    }

    @ObfuscatedName("ka.s(I)V")
    public void method5048() {
        if (this.field3691 != -1L) {
            this.field3686 = class192.method183() - this.field3691;
            this.field3691 = -1L;
        }
    }

    @ObfuscatedName("ka.g(IB)V")
    public void method5046(int arg0) {
        this.field3683 = class192.method183();
        this.field3688 = arg0;
    }

    @ObfuscatedName("ka.x(I)V")
    public void method5054() {
        if (this.field3683 != -1L) {
            this.field3685 = class192.method183() - this.field3683;
            this.field3683 = -1L;
        }
        this.field3682++;
        this.field3684 = true;
    }

    @ObfuscatedName("ka.h(I)V")
    public void method5060() {
        this.field3684 = false;
        this.field3689 = 0;
    }

    @ObfuscatedName("ka.f(B)V")
    public void method5047() {
        this.method5054();
    }

    @ObfuscatedName("ka.p(Lgx;I)V")
    public void method5049(class190 arg0) {
        method2509(arg0, this.field3686);
        method2509(arg0, this.field3685);
        method2509(arg0, this.field3687);
        arg0.method3440(this.field3688);
        arg0.method3440(this.field3689);
        arg0.method3440(this.field3682);
        arg0.method3440(this.field3690);
    }

    @ObfuscatedName("dx.m(Lgx;J)V")
    public static void method2509(class190 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method3440((int) var3);
    }
}
