package deob;

@ObfuscatedName("ao")
public class class29 implements class47 {

    @ObfuscatedName("ao.z")
    public int field161;

    @ObfuscatedName("ao.k")
    public int field159;

    @ObfuscatedName("ao.s")
    public int field160;

    @ObfuscatedName("ao.t")
    public int field172;

    @ObfuscatedName("ao.i")
    public int field162;

    @ObfuscatedName("ao.o")
    public int field163;

    @ObfuscatedName("ao.x")
    public int field164;

    @ObfuscatedName("ao.w")
    public int field165;

    @ObfuscatedName("ao.g")
    public int field170;

    @ObfuscatedName("ao.m")
    public int field167;

    @ObfuscatedName("ao.n")
    public int field168;

    @ObfuscatedName("ao.d")
    public int field171;

    @ObfuscatedName("ao.h")
    public int field169;

    @ObfuscatedName("ao.a")
    public int field158;

    @ObfuscatedName("ao.z(Lar;B)V")
    public void method265(class36 arg0) {
        if (arg0.field242 > this.field162) {
            arg0.field242 = this.field162;
        }
        if (arg0.field243 < this.field162) {
            arg0.field243 = this.field162;
        }
        if (arg0.field247 > this.field163) {
            arg0.field247 = this.field163;
        }
        if (arg0.field241 < this.field163) {
            arg0.field241 = this.field163;
        }
    }

    @ObfuscatedName("ao.k(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field161 && arg0 < this.field161 + this.field159) {
            return arg1 >= (this.field164 << 3) + (this.field160 << 6) && arg1 <= (this.field170 << 3) + (this.field160 << 6) + 7 && arg2 >= (this.field172 << 6) + (this.field165 << 3) && arg2 <= (this.field172 << 6) + (this.field167 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.s(III)Z")
    public boolean method279(int arg0, int arg1) {
        return arg0 >= (this.field168 << 3) + (this.field162 << 6) && arg0 <= (this.field169 << 3) + (this.field162 << 6) + 7 && arg1 >= (this.field171 << 3) + (this.field163 << 6) && arg1 <= (this.field163 << 6) + (this.field158 << 3) + 7;
    }

    @ObfuscatedName("ao.t(IIII)[I")
    public int[] method267(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field168 * 8 - this.field164 * 8 + this.field162 * 64 - this.field160 * 64 + arg1, this.field171 * 8 - this.field165 * 8 + this.field163 * 64 - this.field172 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.i(III)Lhg;")
    public class223 method284(int arg0, int arg1) {
        if (this.method279(arg0, arg1)) {
            int var3 = this.field164 * 8 - this.field168 * 8 + this.field160 * 64 - this.field162 * 64 + arg0;
            int var4 = this.field165 * 8 - this.field171 * 8 + this.field172 * 64 - this.field163 * 64 + arg1;
            return new class223(this.field161, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.o(Lkf;I)V")
    public void method269(class310 arg0) {
        this.field161 = arg0.method5193();
        this.field159 = arg0.method5193();
        this.field160 = arg0.method5195();
        this.field164 = arg0.method5193();
        this.field170 = arg0.method5193();
        this.field172 = arg0.method5195();
        this.field165 = arg0.method5193();
        this.field167 = arg0.method5193();
        this.field162 = arg0.method5195();
        this.field168 = arg0.method5193();
        this.field169 = arg0.method5193();
        this.field163 = arg0.method5195();
        this.field171 = arg0.method5193();
        this.field158 = arg0.method5193();
        this.method270();
    }

    @ObfuscatedName("ao.x(B)V")
    public void method270() {
    }
}
