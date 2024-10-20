package deob;

@ObfuscatedName("ai")
public class class38 implements class32 {

    @ObfuscatedName("ai.y")
    public int field344;

    @ObfuscatedName("ai.c")
    public int field343;

    @ObfuscatedName("ai.n")
    public int field342;

    @ObfuscatedName("ai.u")
    public int field345;

    @ObfuscatedName("ai.i")
    public int field346;

    @ObfuscatedName("ai.r")
    public int field347;

    @ObfuscatedName("ai.j")
    public int field351;

    @ObfuscatedName("ai.p")
    public int field349;

    @ObfuscatedName("ai.e")
    public int field352;

    @ObfuscatedName("ai.s")
    public int field350;

    @ObfuscatedName("ai.y(Lw;S)V")
    public void method119(class21 arg0) {
        if (arg0.field185 > this.field346) {
            arg0.field185 = this.field346;
        }
        if (arg0.field195 < this.field346) {
            arg0.field195 = this.field346;
        }
        if (arg0.field187 > this.field347) {
            arg0.field187 = this.field347;
        }
        if (arg0.field188 < this.field347) {
            arg0.field188 = this.field347;
        }
    }

    @ObfuscatedName("ai.c(IIIS)Z")
    public boolean method129(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field344 && arg0 < this.field344 + this.field343) {
            return arg1 >= (this.field351 << 3) + (this.field342 << 6) && arg1 <= (this.field351 << 3) + (this.field342 << 6) + 7 && arg2 >= (this.field349 << 3) + (this.field345 << 6) && arg2 <= (this.field349 << 3) + (this.field345 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.n(III)Z")
    public boolean method121(int arg0, int arg1) {
        return arg0 >= (this.field352 << 3) + (this.field346 << 6) && arg0 <= (this.field352 << 3) + (this.field346 << 6) + 7 && arg1 >= (this.field350 << 3) + (this.field347 << 6) && arg1 <= (this.field350 << 3) + (this.field347 << 6) + 7;
    }

    @ObfuscatedName("ai.u(IIIB)[I")
    public int[] method118(int arg0, int arg1, int arg2) {
        return this.method129(arg0, arg1, arg2) ? new int[] { this.field352 * 8 - this.field351 * 8 + this.field346 * 64 - this.field342 * 64 + arg1, this.field350 * 8 - this.field349 * 8 + this.field347 * 64 - this.field345 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.i(III)Lhm;")
    public class229 method123(int arg0, int arg1) {
        if (this.method121(arg0, arg1)) {
            int var3 = this.field351 * 8 - this.field352 * 8 + this.field342 * 64 - this.field346 * 64 + arg0;
            int var4 = this.field349 * 8 - this.field350 * 8 + this.field345 * 64 - this.field347 * 64 + arg1;
            return new class229(this.field344, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.p(Lge;I)V")
    public void method122(class185 arg0) {
        this.field344 = arg0.method3299();
        this.field343 = arg0.method3299();
        this.field342 = arg0.method3280();
        this.field351 = arg0.method3299();
        this.field345 = arg0.method3280();
        this.field349 = arg0.method3299();
        this.field346 = arg0.method3280();
        this.field352 = arg0.method3299();
        this.field347 = arg0.method3280();
        this.field350 = arg0.method3299();
        this.method604();
    }

    @ObfuscatedName("ai.e(I)V")
    public void method604() {
    }
}
