package deob;

@ObfuscatedName("ao")
public class class29 implements class47 {

    @ObfuscatedName("ao.m")
    public int field158;

    @ObfuscatedName("ao.o")
    public int field148;

    @ObfuscatedName("ao.q")
    public int field149;

    @ObfuscatedName("ao.j")
    public int field150;

    @ObfuscatedName("ao.p")
    public int field152;

    @ObfuscatedName("ao.g")
    public int field154;

    @ObfuscatedName("ao.n")
    public int field153;

    @ObfuscatedName("ao.u")
    public int field162;

    @ObfuscatedName("ao.a")
    public int field155;

    @ObfuscatedName("ao.z")
    public int field156;

    @ObfuscatedName("ao.w")
    public int field151;

    @ObfuscatedName("ao.y")
    public int field157;

    @ObfuscatedName("ao.c")
    public int field159;

    @ObfuscatedName("ao.h")
    public int field160;

    @ObfuscatedName("ao.m(Lad;I)V")
    public void method244(class36 arg0) {
        if (arg0.field247 > this.field152) {
            arg0.field247 = this.field152;
        }
        if (arg0.field248 < this.field152) {
            arg0.field248 = this.field152;
        }
        if (arg0.field249 > this.field154) {
            arg0.field249 = this.field154;
        }
        if (arg0.field241 < this.field154) {
            arg0.field241 = this.field154;
        }
    }

    @ObfuscatedName("ao.o(IIIB)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field158 && arg0 < this.field158 + this.field148) {
            return arg1 >= (this.field153 << 3) + (this.field149 << 6) && arg1 <= (this.field155 << 3) + (this.field149 << 6) + 7 && arg2 >= (this.field162 << 3) + (this.field150 << 6) && arg2 <= (this.field156 << 3) + (this.field150 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.q(IIB)Z")
    public boolean method246(int arg0, int arg1) {
        return arg0 >= (this.field152 << 6) + (this.field151 << 3) && arg0 <= (this.field159 << 3) + (this.field152 << 6) + 7 && arg1 >= (this.field157 << 3) + (this.field154 << 6) && arg1 <= (this.field160 << 3) + (this.field154 << 6) + 7;
    }

    @ObfuscatedName("ao.j(IIII)[I")
    public int[] method247(int arg0, int arg1, int arg2) {
        return this.method245(arg0, arg1, arg2) ? new int[] { this.field151 * 8 - this.field153 * 8 + this.field152 * 64 - this.field149 * 64 + arg1, this.field157 * 8 - this.field162 * 8 + this.field154 * 64 - this.field150 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.p(III)Lhg;")
    public class223 method248(int arg0, int arg1) {
        if (this.method246(arg0, arg1)) {
            int var3 = this.field153 * 8 - this.field151 * 8 + this.field149 * 64 - this.field152 * 64 + arg0;
            int var4 = this.field162 * 8 - this.field157 * 8 + this.field150 * 64 - this.field154 * 64 + arg1;
            return new class223(this.field158, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.g(Lkn;B)V")
    public void method249(class310 arg0) {
        this.field158 = arg0.method5227();
        this.field148 = arg0.method5227();
        this.field149 = arg0.method5283();
        this.field153 = arg0.method5227();
        this.field155 = arg0.method5227();
        this.field150 = arg0.method5283();
        this.field162 = arg0.method5227();
        this.field156 = arg0.method5227();
        this.field152 = arg0.method5283();
        this.field151 = arg0.method5227();
        this.field159 = arg0.method5227();
        this.field154 = arg0.method5283();
        this.field157 = arg0.method5227();
        this.field160 = arg0.method5227();
        this.method250();
    }

    @ObfuscatedName("ao.n(I)V")
    public void method250() {
    }
}
