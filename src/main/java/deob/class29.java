package deob;

@ObfuscatedName("ao")
public class class29 implements class47 {

    @ObfuscatedName("ao.f")
    public int field170;

    @ObfuscatedName("ao.b")
    public int field171;

    @ObfuscatedName("ao.l")
    public int field164;

    @ObfuscatedName("ao.m")
    public int field163;

    @ObfuscatedName("ao.z")
    public int field167;

    @ObfuscatedName("ao.q")
    public int field168;

    @ObfuscatedName("ao.k")
    public int field169;

    @ObfuscatedName("ao.c")
    public int field165;

    @ObfuscatedName("ao.u")
    public int field176;

    @ObfuscatedName("ao.t")
    public int field166;

    @ObfuscatedName("ao.e")
    public int field173;

    @ObfuscatedName("ao.o")
    public int field174;

    @ObfuscatedName("ao.n")
    public int field175;

    @ObfuscatedName("ao.x")
    public int field178;

    @ObfuscatedName("ao.f(Lak;I)V")
    public void method268(class36 arg0) {
        if (arg0.field244 > this.field167) {
            arg0.field244 = this.field167;
        }
        if (arg0.field238 < this.field167) {
            arg0.field238 = this.field167;
        }
        if (arg0.field239 > this.field168) {
            arg0.field239 = this.field168;
        }
        if (arg0.field240 < this.field168) {
            arg0.field240 = this.field168;
        }
    }

    @ObfuscatedName("ao.b(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field170 && arg0 < this.field171 + this.field170) {
            return arg1 >= (this.field169 << 3) + (this.field164 << 6) && arg1 <= (this.field176 << 3) + (this.field164 << 6) + 7 && arg2 >= (this.field165 << 3) + (this.field163 << 6) && arg2 <= (this.field166 << 3) + (this.field163 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.l(IIB)Z")
    public boolean method284(int arg0, int arg1) {
        return arg0 >= (this.field173 << 3) + (this.field167 << 6) && arg0 <= (this.field175 << 3) + (this.field167 << 6) + 7 && arg1 >= (this.field174 << 3) + (this.field168 << 6) && arg1 <= (this.field178 << 3) + (this.field168 << 6) + 7;
    }

    @ObfuscatedName("ao.m(IIIB)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field173 * 8 - this.field169 * 8 + this.field167 * 64 - this.field164 * 64 + arg1, this.field174 * 8 - this.field165 * 8 + this.field168 * 64 - this.field163 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.z(IIB)Lhw;")
    public class223 method271(int arg0, int arg1) {
        if (this.method284(arg0, arg1)) {
            int var3 = this.field169 * 8 - this.field173 * 8 + this.field164 * 64 - this.field167 * 64 + arg0;
            int var4 = this.field165 * 8 - this.field174 * 8 + this.field163 * 64 - this.field168 * 64 + arg1;
            return new class223(this.field170, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.q(Lkb;I)V")
    public void method288(class311 arg0) {
        this.field170 = arg0.method5276();
        this.field171 = arg0.method5276();
        this.field164 = arg0.method5163();
        this.field169 = arg0.method5276();
        this.field176 = arg0.method5276();
        this.field163 = arg0.method5163();
        this.field165 = arg0.method5276();
        this.field166 = arg0.method5276();
        this.field167 = arg0.method5163();
        this.field173 = arg0.method5276();
        this.field175 = arg0.method5276();
        this.field168 = arg0.method5163();
        this.field174 = arg0.method5276();
        this.field178 = arg0.method5276();
        this.method273();
    }

    @ObfuscatedName("ao.k(I)V")
    public void method273() {
    }
}
