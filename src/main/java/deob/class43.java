package deob;

@ObfuscatedName("ad")
public class class43 implements class38 {

    @ObfuscatedName("ad.c")
    public int field372;

    @ObfuscatedName("ad.t")
    public int field368;

    @ObfuscatedName("ad.o")
    public int field367;

    @ObfuscatedName("ad.e")
    public int field370;

    @ObfuscatedName("ad.i")
    public int field373;

    @ObfuscatedName("ad.g")
    public int field371;

    @ObfuscatedName("ad.d")
    public int field377;

    @ObfuscatedName("ad.l")
    public int field369;

    @ObfuscatedName("ad.j")
    public int field375;

    @ObfuscatedName("ad.m")
    public int field376;

    @ObfuscatedName("ad.c(Lae;I)V")
    public void method209(class27 arg0) {
        if (arg0.field233 > this.field373) {
            arg0.field233 = this.field373;
        }
        if (arg0.field234 < this.field373) {
            arg0.field234 = this.field373;
        }
        if (arg0.field230 > this.field371) {
            arg0.field230 = this.field371;
        }
        if (arg0.field235 < this.field371) {
            arg0.field235 = this.field371;
        }
    }

    @ObfuscatedName("ad.t(IIIB)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field372 && arg0 < this.field372 + this.field368) {
            return arg1 >= (this.field377 << 3) + (this.field367 << 6) && arg1 <= (this.field377 << 3) + (this.field367 << 6) + 7 && arg2 >= (this.field370 << 6) + (this.field369 << 3) && arg2 <= (this.field370 << 6) + (this.field369 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.o(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >= (this.field375 << 3) + (this.field373 << 6) && arg0 <= (this.field375 << 3) + (this.field373 << 6) + 7 && arg1 >= (this.field376 << 3) + (this.field371 << 6) && arg1 <= (this.field376 << 3) + (this.field371 << 6) + 7;
    }

    @ObfuscatedName("ad.e(IIII)[I")
    public int[] method199(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field375 * 8 - this.field377 * 8 + this.field373 * 64 - this.field367 * 64 + arg1, this.field376 * 8 - this.field369 * 8 + this.field371 * 64 - this.field370 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.i(III)Lhj;")
    public class214 method213(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field377 * 8 - this.field375 * 8 + this.field367 * 64 - this.field373 * 64 + arg0;
            int var4 = this.field369 * 8 - this.field376 * 8 + this.field370 * 64 - this.field371 * 64 + arg1;
            return new class214(this.field372, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.g(Lkp;B)V")
    public void method205(class301 arg0) {
        this.field372 = arg0.method5129();
        this.field368 = arg0.method5129();
        this.field367 = arg0.method5124();
        this.field377 = arg0.method5129();
        this.field370 = arg0.method5124();
        this.field369 = arg0.method5129();
        this.field373 = arg0.method5124();
        this.field375 = arg0.method5129();
        this.field371 = arg0.method5124();
        this.field376 = arg0.method5129();
        this.method660();
    }

    @ObfuscatedName("ad.d(B)V")
    public void method660() {
    }
}
