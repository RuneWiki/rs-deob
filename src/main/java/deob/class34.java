package deob;

@ObfuscatedName("at")
public class class34 implements class47 {

    @ObfuscatedName("at.x")
    public int field234;

    @ObfuscatedName("at.m")
    public int field241;

    @ObfuscatedName("at.k")
    public int field239;

    @ObfuscatedName("at.d")
    public int field236;

    @ObfuscatedName("at.w")
    public int field237;

    @ObfuscatedName("at.v")
    public int field238;

    @ObfuscatedName("at.q")
    public int field233;

    @ObfuscatedName("at.z")
    public int field240;

    @ObfuscatedName("at.t")
    public int field235;

    @ObfuscatedName("at.e")
    public int field242;

    @ObfuscatedName("at.x(Las;I)V")
    public void method293(class36 arg0) {
        if (arg0.field259 > this.field233) {
            arg0.field259 = this.field233;
        }
        if (arg0.field260 < this.field235) {
            arg0.field260 = this.field235;
        }
        if (arg0.field262 > this.field240) {
            arg0.field262 = this.field240;
        }
        if (arg0.field254 < this.field242) {
            arg0.field254 = this.field242;
        }
    }

    @ObfuscatedName("at.m(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field234 && arg0 < this.field241 + this.field234) {
            return arg1 >> 6 >= this.field239 && arg1 >> 6 <= this.field237 && arg2 >> 6 >= this.field236 && arg2 >> 6 <= this.field238;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.k(III)Z")
    public boolean method281(int arg0, int arg1) {
        return arg0 >> 6 >= this.field233 && arg0 >> 6 <= this.field235 && arg1 >> 6 >= this.field240 && arg1 >> 6 <= this.field242;
    }

    @ObfuscatedName("at.d(IIII)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field233 * 64 - this.field239 * 64 + arg1, this.field240 * 64 - this.field236 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.w(III)Lhj;")
    public class223 method283(int arg0, int arg1) {
        if (this.method281(arg0, arg1)) {
            int var3 = this.field239 * 64 - this.field233 * 64 + arg0;
            int var4 = this.field236 * 64 - this.field240 * 64 + arg1;
            return new class223(this.field234, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.v(Lkb;I)V")
    public void method284(class310 arg0) {
        this.field234 = arg0.method5137();
        this.field241 = arg0.method5137();
        this.field239 = arg0.method5139();
        this.field236 = arg0.method5139();
        this.field237 = arg0.method5139();
        this.field238 = arg0.method5139();
        this.field233 = arg0.method5139();
        this.field240 = arg0.method5139();
        this.field235 = arg0.method5139();
        this.field242 = arg0.method5139();
        this.method360();
    }

    @ObfuscatedName("at.q(I)V")
    public void method360() {
    }
}
