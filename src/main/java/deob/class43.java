package deob;

@ObfuscatedName("aa")
public class class43 implements class47 {

    @ObfuscatedName("aa.x")
    public int field325;

    @ObfuscatedName("aa.m")
    public int field320;

    @ObfuscatedName("aa.k")
    public int field321;

    @ObfuscatedName("aa.d")
    public int field322;

    @ObfuscatedName("aa.w")
    public int field323;

    @ObfuscatedName("aa.v")
    public int field324;

    @ObfuscatedName("aa.x(Las;I)V")
    public void method293(class36 arg0) {
        if (arg0.field259 > this.field323) {
            arg0.field259 = this.field323;
        }
        if (arg0.field260 < this.field323) {
            arg0.field260 = this.field323;
        }
        if (arg0.field262 > this.field324) {
            arg0.field262 = this.field324;
        }
        if (arg0.field254 < this.field324) {
            arg0.field254 = this.field324;
        }
    }

    @ObfuscatedName("aa.m(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field325 && arg0 < this.field325 + this.field320) {
            return arg1 >> 6 == this.field321 && arg2 >> 6 == this.field322;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.k(III)Z")
    public boolean method281(int arg0, int arg1) {
        return arg0 >> 6 == this.field323 && arg1 >> 6 == this.field324;
    }

    @ObfuscatedName("aa.d(IIII)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field323 * 64 - this.field321 * 64 + arg1, this.field324 * 64 - this.field322 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.w(III)Lhj;")
    public class223 method283(int arg0, int arg1) {
        if (this.method281(arg0, arg1)) {
            int var3 = this.field321 * 64 - this.field323 * 64 + arg0;
            int var4 = this.field322 * 64 - this.field324 * 64 + arg1;
            return new class223(this.field325, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.v(Lkb;I)V")
    public void method284(class310 arg0) {
        this.field325 = arg0.method5137();
        this.field320 = arg0.method5137();
        this.field321 = arg0.method5139();
        this.field322 = arg0.method5139();
        this.field323 = arg0.method5139();
        this.field324 = arg0.method5139();
        this.method585();
    }

    @ObfuscatedName("aa.q(I)V")
    public void method585() {
    }
}
