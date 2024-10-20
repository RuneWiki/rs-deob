package deob;

@ObfuscatedName("as")
public class class49 implements class43 {

    @ObfuscatedName("as.p")
    public int field566;

    @ObfuscatedName("as.i")
    public int field558;

    @ObfuscatedName("as.w")
    public int field560;

    @ObfuscatedName("as.s")
    public int field561;

    @ObfuscatedName("as.j")
    public int field559;

    @ObfuscatedName("as.a")
    public int field565;

    @ObfuscatedName("as.t")
    public int field564;

    @ObfuscatedName("as.r")
    public int field562;

    @ObfuscatedName("as.m")
    public int field563;

    @ObfuscatedName("as.h")
    public int field567;

    @ObfuscatedName("as.p(Lae;I)V")
    public void method184(class33 arg0) {
        if (arg0.field427 > this.field559) {
            arg0.field427 = this.field559;
        }
        if (arg0.field434 < this.field559) {
            arg0.field434 = this.field559;
        }
        if (arg0.field429 > this.field565) {
            arg0.field429 = this.field565;
        }
        if (arg0.field423 < this.field565) {
            arg0.field423 = this.field565;
        }
    }

    @ObfuscatedName("as.i(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field566 && arg0 < this.field566 + this.field558) {
            return arg1 >= (this.field564 << 3) + (this.field560 << 6) && arg1 <= (this.field564 << 3) + (this.field560 << 6) + 7 && arg2 >= (this.field562 << 3) + (this.field561 << 6) && arg2 <= (this.field562 << 3) + (this.field561 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.w(III)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >= (this.field563 << 3) + (this.field559 << 6) && arg0 <= (this.field563 << 3) + (this.field559 << 6) + 7 && arg1 >= (this.field567 << 3) + (this.field565 << 6) && arg1 <= (this.field567 << 3) + (this.field565 << 6) + 7;
    }

    @ObfuscatedName("as.s(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field563 * 8 - this.field564 * 8 + this.field559 * 64 - this.field560 * 64 + arg1, this.field567 * 8 - this.field562 * 8 + this.field565 * 64 - this.field561 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.j(III)Lhn;")
    public class224 method213(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field564 * 8 - this.field563 * 8 + this.field560 * 64 - this.field559 * 64 + arg0;
            int var4 = this.field562 * 8 - this.field567 * 8 + this.field561 * 64 - this.field565 * 64 + arg1;
            return new class224(this.field566, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.a(Lgj;B)V")
    public void method189(class185 arg0) {
        this.field566 = arg0.method3197();
        this.field558 = arg0.method3197();
        this.field560 = arg0.method3124();
        this.field564 = arg0.method3197();
        this.field561 = arg0.method3124();
        this.field562 = arg0.method3197();
        this.field559 = arg0.method3124();
        this.field563 = arg0.method3197();
        this.field565 = arg0.method3124();
        this.field567 = arg0.method3197();
        this.method630();
    }

    @ObfuscatedName("as.t(I)V")
    public void method630() {
    }
}
