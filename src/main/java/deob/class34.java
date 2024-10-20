package deob;

@ObfuscatedName("aa")
public class class34 implements class38 {

    @ObfuscatedName("aa.c")
    public int field293;

    @ObfuscatedName("aa.t")
    public int field288;

    @ObfuscatedName("aa.o")
    public int field289;

    @ObfuscatedName("aa.e")
    public int field290;

    @ObfuscatedName("aa.i")
    public int field295;

    @ObfuscatedName("aa.g")
    public int field292;

    @ObfuscatedName("aa.c(Lae;I)V")
    public void method209(class27 arg0) {
        if (arg0.field233 > this.field295) {
            arg0.field233 = this.field295;
        }
        if (arg0.field234 < this.field295) {
            arg0.field234 = this.field295;
        }
        if (arg0.field230 > this.field292) {
            arg0.field230 = this.field292;
        }
        if (arg0.field235 < this.field292) {
            arg0.field235 = this.field292;
        }
    }

    @ObfuscatedName("aa.t(IIIB)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field293 && arg0 < this.field293 + this.field288) {
            return arg1 >> 6 == this.field289 && arg2 >> 6 == this.field290;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.o(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 == this.field295 && arg1 >> 6 == this.field292;
    }

    @ObfuscatedName("aa.e(IIII)[I")
    public int[] method199(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field295 * 64 - this.field289 * 64 + arg1, this.field292 * 64 - this.field290 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.i(III)Lhj;")
    public class214 method213(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field289 * 64 - this.field295 * 64 + arg0;
            int var4 = this.field290 * 64 - this.field292 * 64 + arg1;
            return new class214(this.field293, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.g(Lkp;B)V")
    public void method205(class301 arg0) {
        this.field293 = arg0.method5129();
        this.field288 = arg0.method5129();
        this.field289 = arg0.method5124();
        this.field290 = arg0.method5124();
        this.field295 = arg0.method5124();
        this.field292 = arg0.method5124();
        this.method515();
    }

    @ObfuscatedName("aa.d(I)V")
    public void method515() {
    }
}
