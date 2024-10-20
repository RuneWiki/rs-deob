package deob;

@ObfuscatedName("ag")
public class class31 implements class43 {

    @ObfuscatedName("ag.j")
    public int field439;

    @ObfuscatedName("ag.h")
    public int field437;

    @ObfuscatedName("ag.f")
    public int field436;

    @ObfuscatedName("ag.p")
    public int field446;

    @ObfuscatedName("ag.x")
    public int field440;

    @ObfuscatedName("ag.g")
    public int field438;

    @ObfuscatedName("ag.c")
    public int field442;

    @ObfuscatedName("ag.l")
    public int field443;

    @ObfuscatedName("ag.w")
    public int field444;

    @ObfuscatedName("ag.b")
    public int field445;

    @ObfuscatedName("ag.j(Lab;I)V")
    public void method188(class33 arg0) {
        if (arg0.field465 > this.field442) {
            arg0.field465 = this.field442;
        }
        if (arg0.field466 < this.field444) {
            arg0.field466 = this.field444;
        }
        if (arg0.field461 > this.field443) {
            arg0.field461 = this.field443;
        }
        if (arg0.field468 < this.field445) {
            arg0.field468 = this.field445;
        }
    }

    @ObfuscatedName("ag.h(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field439 && arg0 < this.field439 + this.field437) {
            return arg1 >> 6 >= this.field436 && arg1 >> 6 <= this.field440 && arg2 >> 6 >= this.field446 && arg2 >> 6 <= this.field438;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.f(IIB)Z")
    public boolean method190(int arg0, int arg1) {
        return arg0 >> 6 >= this.field442 && arg0 >> 6 <= this.field444 && arg1 >> 6 >= this.field443 && arg1 >> 6 <= this.field445;
    }

    @ObfuscatedName("ag.p(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field442 * 64 - this.field436 * 64 + arg1, this.field443 * 64 - this.field446 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.x(IIB)Lhh;")
    public class214 method192(int arg0, int arg1) {
        if (this.method190(arg0, arg1)) {
            int var3 = this.field436 * 64 - this.field442 * 64 + arg0;
            int var4 = this.field446 * 64 - this.field443 * 64 + arg1;
            return new class214(this.field439, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.g(Lfb;I)V")
    public void method187(class175 arg0) {
        this.field439 = arg0.method2903();
        this.field437 = arg0.method2903();
        this.field436 = arg0.method3023();
        this.field446 = arg0.method3023();
        this.field440 = arg0.method3023();
        this.field438 = arg0.method3023();
        this.field442 = arg0.method3023();
        this.field443 = arg0.method3023();
        this.field444 = arg0.method3023();
        this.field445 = arg0.method3023();
        this.method247();
    }

    @ObfuscatedName("ag.c(B)V")
    public void method247() {
    }
}
