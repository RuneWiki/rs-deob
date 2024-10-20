package deob;

@ObfuscatedName("aw")
public class class43 implements class47 {

    @ObfuscatedName("aw.h")
    public int field315;

    @ObfuscatedName("aw.v")
    public int field316;

    @ObfuscatedName("aw.x")
    public int field305;

    @ObfuscatedName("aw.w")
    public int field308;

    @ObfuscatedName("aw.t")
    public int field307;

    @ObfuscatedName("aw.j")
    public int field310;

    @ObfuscatedName("aw.h(Lav;S)V")
    public void method252(class36 arg0) {
        if (arg0.field235 > this.field307) {
            arg0.field235 = this.field307;
        }
        if (arg0.field229 < this.field307) {
            arg0.field229 = this.field307;
        }
        if (arg0.field237 > this.field310) {
            arg0.field237 = this.field310;
        }
        if (arg0.field240 < this.field310) {
            arg0.field240 = this.field310;
        }
    }

    @ObfuscatedName("aw.v(IIII)Z")
    public boolean method253(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field315 && arg0 < this.field316 + this.field315) {
            return arg1 >> 6 == this.field305 && arg2 >> 6 == this.field308;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.x(III)Z")
    public boolean method254(int arg0, int arg1) {
        return arg0 >> 6 == this.field307 && arg1 >> 6 == this.field310;
    }

    @ObfuscatedName("aw.w(IIII)[I")
    public int[] method255(int arg0, int arg1, int arg2) {
        return this.method253(arg0, arg1, arg2) ? new int[] { this.field307 * 64 - this.field305 * 64 + arg1, this.field310 * 64 - this.field308 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.t(IIB)Lhs;")
    public class223 method256(int arg0, int arg1) {
        if (this.method254(arg0, arg1)) {
            int var3 = this.field305 * 64 - this.field307 * 64 + arg0;
            int var4 = this.field308 * 64 - this.field310 * 64 + arg1;
            return new class223(this.field315, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.j(Lkj;B)V")
    public void method257(class311 arg0) {
        this.field315 = arg0.method5274();
        this.field316 = arg0.method5274();
        this.field305 = arg0.method5342();
        this.field308 = arg0.method5342();
        this.field307 = arg0.method5342();
        this.field310 = arg0.method5342();
        this.method550();
    }

    @ObfuscatedName("aw.n(I)V")
    public void method550() {
    }
}
