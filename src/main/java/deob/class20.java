package deob;

@ObfuscatedName("y")
public class class20 implements class38 {

    @ObfuscatedName("y.c")
    public int field152;

    @ObfuscatedName("y.t")
    public int field151;

    @ObfuscatedName("y.o")
    public int field153;

    @ObfuscatedName("y.e")
    public int field154;

    @ObfuscatedName("y.i")
    public int field155;

    @ObfuscatedName("y.g")
    public int field161;

    @ObfuscatedName("y.d")
    public int field157;

    @ObfuscatedName("y.l")
    public int field158;

    @ObfuscatedName("y.j")
    public int field159;

    @ObfuscatedName("y.m")
    public int field160;

    @ObfuscatedName("y.p")
    public int field163;

    @ObfuscatedName("y.h")
    public int field162;

    @ObfuscatedName("y.v")
    public int field165;

    @ObfuscatedName("y.n")
    public int field164;

    @ObfuscatedName("y.c(Lae;I)V")
    public void method209(class27 arg0) {
        if (arg0.field233 > this.field155) {
            arg0.field233 = this.field155;
        }
        if (arg0.field234 < this.field155) {
            arg0.field234 = this.field155;
        }
        if (arg0.field230 > this.field161) {
            arg0.field230 = this.field161;
        }
        if (arg0.field235 < this.field161) {
            arg0.field235 = this.field161;
        }
    }

    @ObfuscatedName("y.t(IIIB)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field152 && arg0 < this.field152 + this.field151) {
            return arg1 >= (this.field157 << 3) + (this.field153 << 6) && arg1 <= (this.field159 << 3) + (this.field153 << 6) + 7 && arg2 >= (this.field158 << 3) + (this.field154 << 6) && arg2 <= (this.field160 << 3) + (this.field154 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.o(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field163 << 3) + (this.field155 << 6) && arg0 <= (this.field165 << 3) + (this.field155 << 6) + 7 && arg1 >= (this.field162 << 3) + (this.field161 << 6) && arg1 <= (this.field164 << 3) + (this.field161 << 6) + 7;
    }

    @ObfuscatedName("y.e(IIII)[I")
    public int[] method199(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field163 * 8 - this.field157 * 8 + this.field155 * 64 - this.field153 * 64 + arg1, this.field162 * 8 - this.field158 * 8 + this.field161 * 64 - this.field154 * 64 + arg2 } : null;
    }

    @ObfuscatedName("y.i(III)Lhj;")
    public class214 method213(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field157 * 8 - this.field163 * 8 + this.field153 * 64 - this.field155 * 64 + arg0;
            int var4 = this.field158 * 8 - this.field162 * 8 + this.field154 * 64 - this.field161 * 64 + arg1;
            return new class214(this.field152, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("y.g(Lkp;B)V")
    public void method205(class301 arg0) {
        this.field152 = arg0.method5129();
        this.field151 = arg0.method5129();
        this.field153 = arg0.method5124();
        this.field157 = arg0.method5129();
        this.field159 = arg0.method5129();
        this.field154 = arg0.method5124();
        this.field158 = arg0.method5129();
        this.field160 = arg0.method5129();
        this.field155 = arg0.method5124();
        this.field163 = arg0.method5129();
        this.field165 = arg0.method5129();
        this.field161 = arg0.method5124();
        this.field162 = arg0.method5129();
        this.field164 = arg0.method5129();
        this.method196();
    }

    @ObfuscatedName("y.d(B)V")
    public void method196() {
    }
}
