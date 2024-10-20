package deob;

@ObfuscatedName("au")
public class class39 implements class43 {

    @ObfuscatedName("au.j")
    public int field529;

    @ObfuscatedName("au.h")
    public int field526;

    @ObfuscatedName("au.f")
    public int field527;

    @ObfuscatedName("au.p")
    public int field528;

    @ObfuscatedName("au.x")
    public int field533;

    @ObfuscatedName("au.g")
    public int field530;

    @ObfuscatedName("au.j(Lab;I)V")
    public void method188(class33 arg0) {
        if (arg0.field465 > this.field533) {
            arg0.field465 = this.field533;
        }
        if (arg0.field466 < this.field533) {
            arg0.field466 = this.field533;
        }
        if (arg0.field461 > this.field530) {
            arg0.field461 = this.field530;
        }
        if (arg0.field468 < this.field530) {
            arg0.field468 = this.field530;
        }
    }

    @ObfuscatedName("au.h(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field529 && arg0 < this.field529 + this.field526) {
            return arg1 >> 6 == this.field527 && arg2 >> 6 == this.field528;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.f(IIB)Z")
    public boolean method190(int arg0, int arg1) {
        return arg0 >> 6 == this.field533 && arg1 >> 6 == this.field530;
    }

    @ObfuscatedName("au.p(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field533 * 64 - this.field527 * 64 + arg1, this.field530 * 64 - this.field528 * 64 + arg2 } : null;
    }

    @ObfuscatedName("au.x(IIB)Lhh;")
    public class214 method192(int arg0, int arg1) {
        if (this.method190(arg0, arg1)) {
            int var3 = this.field527 * 64 - this.field533 * 64 + arg0;
            int var4 = this.field528 * 64 - this.field530 * 64 + arg1;
            return new class214(this.field529, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.g(Lfb;I)V")
    public void method187(class175 arg0) {
        this.field529 = arg0.method2903();
        this.field526 = arg0.method2903();
        this.field527 = arg0.method3023();
        this.field528 = arg0.method3023();
        this.field533 = arg0.method3023();
        this.field530 = arg0.method3023();
        this.method486();
    }

    @ObfuscatedName("au.c(I)V")
    public void method486() {
    }
}
