package deob;

@ObfuscatedName("aw")
public class class52 implements class47 {

    @ObfuscatedName("aw.x")
    public int field399;

    @ObfuscatedName("aw.m")
    public int field394;

    @ObfuscatedName("aw.k")
    public int field395;

    @ObfuscatedName("aw.d")
    public int field398;

    @ObfuscatedName("aw.w")
    public int field397;

    @ObfuscatedName("aw.v")
    public int field402;

    @ObfuscatedName("aw.q")
    public int field403;

    @ObfuscatedName("aw.z")
    public int field400;

    @ObfuscatedName("aw.t")
    public int field401;

    @ObfuscatedName("aw.e")
    public int field396;

    @ObfuscatedName("aw.x(Las;I)V")
    public void method293(class36 arg0) {
        if (arg0.field259 > this.field397) {
            arg0.field259 = this.field397;
        }
        if (arg0.field260 < this.field397) {
            arg0.field260 = this.field397;
        }
        if (arg0.field262 > this.field402) {
            arg0.field262 = this.field402;
        }
        if (arg0.field254 < this.field402) {
            arg0.field254 = this.field402;
        }
    }

    @ObfuscatedName("aw.m(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field399 && arg0 < this.field399 + this.field394) {
            return arg1 >= (this.field403 << 3) + (this.field395 << 6) && arg1 <= (this.field403 << 3) + (this.field395 << 6) + 7 && arg2 >= (this.field400 << 3) + (this.field398 << 6) && arg2 <= (this.field400 << 3) + (this.field398 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.k(III)Z")
    public boolean method281(int arg0, int arg1) {
        return arg0 >= (this.field401 << 3) + (this.field397 << 6) && arg0 <= (this.field401 << 3) + (this.field397 << 6) + 7 && arg1 >= (this.field402 << 6) + (this.field396 << 3) && arg1 <= (this.field402 << 6) + (this.field396 << 3) + 7;
    }

    @ObfuscatedName("aw.d(IIII)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field401 * 8 - this.field403 * 8 + this.field397 * 64 - this.field395 * 64 + arg1, this.field396 * 8 - this.field400 * 8 + this.field402 * 64 - this.field398 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.w(III)Lhj;")
    public class223 method283(int arg0, int arg1) {
        if (this.method281(arg0, arg1)) {
            int var3 = this.field403 * 8 - this.field401 * 8 + this.field395 * 64 - this.field397 * 64 + arg0;
            int var4 = this.field400 * 8 - this.field396 * 8 + this.field398 * 64 - this.field402 * 64 + arg1;
            return new class223(this.field399, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.v(Lkb;I)V")
    public void method284(class310 arg0) {
        this.field399 = arg0.method5137();
        this.field394 = arg0.method5137();
        this.field395 = arg0.method5139();
        this.field403 = arg0.method5137();
        this.field398 = arg0.method5139();
        this.field400 = arg0.method5137();
        this.field397 = arg0.method5139();
        this.field401 = arg0.method5137();
        this.field402 = arg0.method5139();
        this.field396 = arg0.method5137();
        this.method736();
    }

    @ObfuscatedName("aw.q(I)V")
    public void method736() {
    }
}
