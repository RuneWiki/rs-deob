package deob;

@ObfuscatedName("an")
public class class43 implements class47 {

    @ObfuscatedName("an.f")
    public int field306;

    @ObfuscatedName("an.b")
    public int field308;

    @ObfuscatedName("an.l")
    public int field302;

    @ObfuscatedName("an.m")
    public int field305;

    @ObfuscatedName("an.z")
    public int field303;

    @ObfuscatedName("an.q")
    public int field307;

    @ObfuscatedName("an.f(Lak;I)V")
    public void method268(class36 arg0) {
        if (arg0.field244 > this.field303) {
            arg0.field244 = this.field303;
        }
        if (arg0.field238 < this.field303) {
            arg0.field238 = this.field303;
        }
        if (arg0.field239 > this.field307) {
            arg0.field239 = this.field307;
        }
        if (arg0.field240 < this.field307) {
            arg0.field240 = this.field307;
        }
    }

    @ObfuscatedName("an.b(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field306 && arg0 < this.field308 + this.field306) {
            return arg1 >> 6 == this.field302 && arg2 >> 6 == this.field305;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.l(IIB)Z")
    public boolean method284(int arg0, int arg1) {
        return arg0 >> 6 == this.field303 && arg1 >> 6 == this.field307;
    }

    @ObfuscatedName("an.m(IIIB)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field303 * 64 - this.field302 * 64 + arg1, this.field307 * 64 - this.field305 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.z(IIB)Lhw;")
    public class223 method271(int arg0, int arg1) {
        if (this.method284(arg0, arg1)) {
            int var3 = this.field302 * 64 - this.field303 * 64 + arg0;
            int var4 = this.field305 * 64 - this.field307 * 64 + arg1;
            return new class223(this.field306, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.q(Lkb;I)V")
    public void method288(class311 arg0) {
        this.field306 = arg0.method5276();
        this.field308 = arg0.method5276();
        this.field302 = arg0.method5163();
        this.field305 = arg0.method5163();
        this.field303 = arg0.method5163();
        this.field307 = arg0.method5163();
        this.method596();
    }

    @ObfuscatedName("an.k(B)V")
    public void method596() {
    }
}
