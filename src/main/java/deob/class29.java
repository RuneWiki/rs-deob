package deob;

@ObfuscatedName("ax")
public class class29 implements class47 {

    @ObfuscatedName("ax.h")
    public int field162;

    @ObfuscatedName("ax.v")
    public int field158;

    @ObfuscatedName("ax.x")
    public int field154;

    @ObfuscatedName("ax.w")
    public int field156;

    @ObfuscatedName("ax.t")
    public int field157;

    @ObfuscatedName("ax.j")
    public int field155;

    @ObfuscatedName("ax.n")
    public int field159;

    @ObfuscatedName("ax.p")
    public int field160;

    @ObfuscatedName("ax.l")
    public int field161;

    @ObfuscatedName("ax.z")
    public int field164;

    @ObfuscatedName("ax.u")
    public int field163;

    @ObfuscatedName("ax.e")
    public int field153;

    @ObfuscatedName("ax.m")
    public int field165;

    @ObfuscatedName("ax.c")
    public int field166;

    @ObfuscatedName("ax.h(Lav;S)V")
    public void method252(class36 arg0) {
        if (arg0.field235 > this.field157) {
            arg0.field235 = this.field157;
        }
        if (arg0.field229 < this.field157) {
            arg0.field229 = this.field157;
        }
        if (arg0.field237 > this.field155) {
            arg0.field237 = this.field155;
        }
        if (arg0.field240 < this.field155) {
            arg0.field240 = this.field155;
        }
    }

    @ObfuscatedName("ax.v(IIII)Z")
    public boolean method253(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field162 && arg0 < this.field162 + this.field158) {
            return arg1 >= (this.field159 << 3) + (this.field154 << 6) && arg1 <= (this.field161 << 3) + (this.field154 << 6) + 7 && arg2 >= (this.field160 << 3) + (this.field156 << 6) && arg2 <= (this.field164 << 3) + (this.field156 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.x(III)Z")
    public boolean method254(int arg0, int arg1) {
        return arg0 >= (this.field163 << 3) + (this.field157 << 6) && arg0 <= (this.field165 << 3) + (this.field157 << 6) + 7 && arg1 >= (this.field155 << 6) + (this.field153 << 3) && arg1 <= (this.field166 << 3) + (this.field155 << 6) + 7;
    }

    @ObfuscatedName("ax.w(IIII)[I")
    public int[] method255(int arg0, int arg1, int arg2) {
        return this.method253(arg0, arg1, arg2) ? new int[] { this.field163 * 8 - this.field159 * 8 + this.field157 * 64 - this.field154 * 64 + arg1, this.field153 * 8 - this.field160 * 8 + this.field155 * 64 - this.field156 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.t(IIB)Lhs;")
    public class223 method256(int arg0, int arg1) {
        if (this.method254(arg0, arg1)) {
            int var3 = this.field159 * 8 - this.field163 * 8 + this.field154 * 64 - this.field157 * 64 + arg0;
            int var4 = this.field160 * 8 - this.field153 * 8 + this.field156 * 64 - this.field155 * 64 + arg1;
            return new class223(this.field162, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.j(Lkj;B)V")
    public void method257(class311 arg0) {
        this.field162 = arg0.method5274();
        this.field158 = arg0.method5274();
        this.field154 = arg0.method5342();
        this.field159 = arg0.method5274();
        this.field161 = arg0.method5274();
        this.field156 = arg0.method5342();
        this.field160 = arg0.method5274();
        this.field164 = arg0.method5274();
        this.field157 = arg0.method5342();
        this.field163 = arg0.method5274();
        this.field165 = arg0.method5274();
        this.field155 = arg0.method5342();
        this.field153 = arg0.method5274();
        this.field166 = arg0.method5274();
        this.method270();
    }

    @ObfuscatedName("ax.n(I)V")
    public void method270() {
    }
}
