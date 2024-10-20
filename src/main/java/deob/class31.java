package deob;

@ObfuscatedName("ay")
public class class31 implements class43 {

    @ObfuscatedName("ay.p")
    public int field399;

    @ObfuscatedName("ay.i")
    public int field402;

    @ObfuscatedName("ay.w")
    public int field398;

    @ObfuscatedName("ay.s")
    public int field400;

    @ObfuscatedName("ay.j")
    public int field401;

    @ObfuscatedName("ay.a")
    public int field404;

    @ObfuscatedName("ay.t")
    public int field409;

    @ObfuscatedName("ay.r")
    public int field403;

    @ObfuscatedName("ay.m")
    public int field405;

    @ObfuscatedName("ay.h")
    public int field406;

    @ObfuscatedName("ay.p(Lae;I)V")
    public void method184(class33 arg0) {
        if (arg0.field427 > this.field409) {
            arg0.field427 = this.field409;
        }
        if (arg0.field434 < this.field405) {
            arg0.field434 = this.field405;
        }
        if (arg0.field429 > this.field403) {
            arg0.field429 = this.field403;
        }
        if (arg0.field423 < this.field406) {
            arg0.field423 = this.field406;
        }
    }

    @ObfuscatedName("ay.i(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field399 && arg0 < this.field402 + this.field399) {
            return arg1 >> 6 >= this.field398 && arg1 >> 6 <= this.field401 && arg2 >> 6 >= this.field400 && arg2 >> 6 <= this.field404;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.w(III)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >> 6 >= this.field409 && arg0 >> 6 <= this.field405 && arg1 >> 6 >= this.field403 && arg1 >> 6 <= this.field406;
    }

    @ObfuscatedName("ay.s(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field409 * 64 - this.field398 * 64 + arg1, this.field403 * 64 - this.field400 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.j(III)Lhn;")
    public class224 method213(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field398 * 64 - this.field409 * 64 + arg0;
            int var4 = this.field400 * 64 - this.field403 * 64 + arg1;
            return new class224(this.field399, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.a(Lgj;B)V")
    public void method189(class185 arg0) {
        this.field399 = arg0.method3197();
        this.field402 = arg0.method3197();
        this.field398 = arg0.method3124();
        this.field400 = arg0.method3124();
        this.field401 = arg0.method3124();
        this.field404 = arg0.method3124();
        this.field409 = arg0.method3124();
        this.field403 = arg0.method3124();
        this.field405 = arg0.method3124();
        this.field406 = arg0.method3124();
        this.method249();
    }

    @ObfuscatedName("ay.t(I)V")
    public void method249() {
    }
}
