package deob;

@ObfuscatedName("at")
public class class52 implements class47 {

    @ObfuscatedName("at.h")
    public int field392;

    @ObfuscatedName("at.v")
    public int field384;

    @ObfuscatedName("at.x")
    public int field385;

    @ObfuscatedName("at.w")
    public int field386;

    @ObfuscatedName("at.t")
    public int field393;

    @ObfuscatedName("at.j")
    public int field388;

    @ObfuscatedName("at.n")
    public int field389;

    @ObfuscatedName("at.p")
    public int field390;

    @ObfuscatedName("at.l")
    public int field391;

    @ObfuscatedName("at.z")
    public int field394;

    @ObfuscatedName("at.h(Lav;S)V")
    public void method252(class36 arg0) {
        if (arg0.field235 > this.field393) {
            arg0.field235 = this.field393;
        }
        if (arg0.field229 < this.field393) {
            arg0.field229 = this.field393;
        }
        if (arg0.field237 > this.field388) {
            arg0.field237 = this.field388;
        }
        if (arg0.field240 < this.field388) {
            arg0.field240 = this.field388;
        }
    }

    @ObfuscatedName("at.v(IIII)Z")
    public boolean method253(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field392 && arg0 < this.field392 + this.field384) {
            return arg1 >= (this.field389 << 3) + (this.field385 << 6) && arg1 <= (this.field389 << 3) + (this.field385 << 6) + 7 && arg2 >= (this.field390 << 3) + (this.field386 << 6) && arg2 <= (this.field390 << 3) + (this.field386 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.x(III)Z")
    public boolean method254(int arg0, int arg1) {
        return arg0 >= (this.field393 << 6) + (this.field391 << 3) && arg0 <= (this.field393 << 6) + (this.field391 << 3) + 7 && arg1 >= (this.field394 << 3) + (this.field388 << 6) && arg1 <= (this.field394 << 3) + (this.field388 << 6) + 7;
    }

    @ObfuscatedName("at.w(IIII)[I")
    public int[] method255(int arg0, int arg1, int arg2) {
        return this.method253(arg0, arg1, arg2) ? new int[] { this.field391 * 8 - this.field389 * 8 + this.field393 * 64 - this.field385 * 64 + arg1, this.field394 * 8 - this.field390 * 8 + this.field388 * 64 - this.field386 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.t(IIB)Lhs;")
    public class223 method256(int arg0, int arg1) {
        if (this.method254(arg0, arg1)) {
            int var3 = this.field389 * 8 - this.field391 * 8 + this.field385 * 64 - this.field393 * 64 + arg0;
            int var4 = this.field390 * 8 - this.field394 * 8 + this.field386 * 64 - this.field388 * 64 + arg1;
            return new class223(this.field392, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.j(Lkj;B)V")
    public void method257(class311 arg0) {
        this.field392 = arg0.method5274();
        this.field384 = arg0.method5274();
        this.field385 = arg0.method5342();
        this.field389 = arg0.method5274();
        this.field386 = arg0.method5342();
        this.field390 = arg0.method5274();
        this.field393 = arg0.method5342();
        this.field391 = arg0.method5274();
        this.field388 = arg0.method5342();
        this.field394 = arg0.method5274();
        this.method707();
    }

    @ObfuscatedName("at.n(B)V")
    public void method707() {
    }
}
