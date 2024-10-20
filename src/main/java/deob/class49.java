package deob;

@ObfuscatedName("ai")
public class class49 implements class43 {

    @ObfuscatedName("ai.j")
    public int field624;

    @ObfuscatedName("ai.h")
    public int field617;

    @ObfuscatedName("ai.f")
    public int field618;

    @ObfuscatedName("ai.p")
    public int field616;

    @ObfuscatedName("ai.x")
    public int field620;

    @ObfuscatedName("ai.g")
    public int field621;

    @ObfuscatedName("ai.c")
    public int field629;

    @ObfuscatedName("ai.l")
    public int field623;

    @ObfuscatedName("ai.w")
    public int field627;

    @ObfuscatedName("ai.b")
    public int field625;

    @ObfuscatedName("ai.j(Lab;I)V")
    public void method188(class33 arg0) {
        if (arg0.field465 > this.field620) {
            arg0.field465 = this.field620;
        }
        if (arg0.field466 < this.field620) {
            arg0.field466 = this.field620;
        }
        if (arg0.field461 > this.field621) {
            arg0.field461 = this.field621;
        }
        if (arg0.field468 < this.field621) {
            arg0.field468 = this.field621;
        }
    }

    @ObfuscatedName("ai.h(IIIB)Z")
    public boolean method189(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field624 && arg0 < this.field624 + this.field617) {
            return arg1 >= (this.field629 << 3) + (this.field618 << 6) && arg1 <= (this.field629 << 3) + (this.field618 << 6) + 7 && arg2 >= (this.field623 << 3) + (this.field616 << 6) && arg2 <= (this.field623 << 3) + (this.field616 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.f(IIB)Z")
    public boolean method190(int arg0, int arg1) {
        return arg0 >= (this.field627 << 3) + (this.field620 << 6) && arg0 <= (this.field627 << 3) + (this.field620 << 6) + 7 && arg1 >= (this.field625 << 3) + (this.field621 << 6) && arg1 <= (this.field625 << 3) + (this.field621 << 6) + 7;
    }

    @ObfuscatedName("ai.p(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method189(arg0, arg1, arg2) ? new int[] { this.field627 * 8 - this.field629 * 8 + this.field620 * 64 - this.field618 * 64 + arg1, this.field625 * 8 - this.field623 * 8 + this.field621 * 64 - this.field616 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.x(IIB)Lhh;")
    public class214 method192(int arg0, int arg1) {
        if (this.method190(arg0, arg1)) {
            int var3 = this.field629 * 8 - this.field627 * 8 + this.field618 * 64 - this.field620 * 64 + arg0;
            int var4 = this.field623 * 8 - this.field625 * 8 + this.field616 * 64 - this.field621 * 64 + arg1;
            return new class214(this.field624, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.g(Lfb;I)V")
    public void method187(class175 arg0) {
        this.field624 = arg0.method2903();
        this.field617 = arg0.method2903();
        this.field618 = arg0.method3023();
        this.field629 = arg0.method2903();
        this.field616 = arg0.method3023();
        this.field623 = arg0.method2903();
        this.field620 = arg0.method3023();
        this.field627 = arg0.method2903();
        this.field621 = arg0.method3023();
        this.field625 = arg0.method2903();
        this.method652();
    }

    @ObfuscatedName("ai.c(I)V")
    public void method652() {
    }
}
