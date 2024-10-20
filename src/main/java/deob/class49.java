package deob;

@ObfuscatedName("ab")
public class class49 implements class43 {

    @ObfuscatedName("ab.b")
    public int field567;

    @ObfuscatedName("ab.q")
    public int field559;

    @ObfuscatedName("ab.o")
    public int field560;

    @ObfuscatedName("ab.p")
    public int field561;

    @ObfuscatedName("ab.a")
    public int field562;

    @ObfuscatedName("ab.h")
    public int field558;

    @ObfuscatedName("ab.l")
    public int field564;

    @ObfuscatedName("ab.y")
    public int field565;

    @ObfuscatedName("ab.g")
    public int field566;

    @ObfuscatedName("ab.c")
    public int field563;

    @ObfuscatedName("ab.b(Lai;B)V")
    public void method193(class33 arg0) {
        if (arg0.field420 > this.field562) {
            arg0.field420 = this.field562;
        }
        if (arg0.field421 < this.field562) {
            arg0.field421 = this.field562;
        }
        if (arg0.field414 > this.field558) {
            arg0.field414 = this.field558;
        }
        if (arg0.field423 < this.field558) {
            arg0.field423 = this.field558;
        }
    }

    @ObfuscatedName("ab.q(IIII)Z")
    public boolean method194(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field567 && arg0 < this.field567 + this.field559) {
            return arg1 >= (this.field564 << 3) + (this.field560 << 6) && arg1 <= (this.field564 << 3) + (this.field560 << 6) + 7 && arg2 >= (this.field565 << 3) + (this.field561 << 6) && arg2 <= (this.field565 << 3) + (this.field561 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.o(IIB)Z")
    public boolean method195(int arg0, int arg1) {
        return arg0 >= (this.field566 << 3) + (this.field562 << 6) && arg0 <= (this.field566 << 3) + (this.field562 << 6) + 7 && arg1 >= (this.field563 << 3) + (this.field558 << 6) && arg1 <= (this.field563 << 3) + (this.field558 << 6) + 7;
    }

    @ObfuscatedName("ab.p(IIII)[I")
    public int[] method214(int arg0, int arg1, int arg2) {
        return this.method194(arg0, arg1, arg2) ? new int[] { this.field566 * 8 - this.field564 * 8 + this.field562 * 64 - this.field560 * 64 + arg1, this.field563 * 8 - this.field565 * 8 + this.field558 * 64 - this.field561 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.a(III)Lhp;")
    public class233 method192(int arg0, int arg1) {
        if (this.method195(arg0, arg1)) {
            int var3 = this.field564 * 8 - this.field566 * 8 + this.field560 * 64 - this.field562 * 64 + arg0;
            int var4 = this.field565 * 8 - this.field563 * 8 + this.field561 * 64 - this.field558 * 64 + arg1;
            return new class233(this.field567, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.h(Lgn;I)V")
    public void method197(class194 arg0) {
        this.field567 = arg0.method3247();
        this.field559 = arg0.method3247();
        this.field560 = arg0.method3249();
        this.field564 = arg0.method3247();
        this.field561 = arg0.method3249();
        this.field565 = arg0.method3247();
        this.field562 = arg0.method3249();
        this.field566 = arg0.method3247();
        this.field558 = arg0.method3249();
        this.field563 = arg0.method3247();
        this.method659();
    }

    @ObfuscatedName("ab.l(I)V")
    public void method659() {
    }
}
