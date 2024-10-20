package deob;

@ObfuscatedName("ad")
public class class34 implements class38 {

    @ObfuscatedName("ad.c")
    public int field284;

    @ObfuscatedName("ad.x")
    public int field275;

    @ObfuscatedName("ad.t")
    public int field281;

    @ObfuscatedName("ad.g")
    public int field278;

    @ObfuscatedName("ad.l")
    public int field279;

    @ObfuscatedName("ad.u")
    public int field280;

    @ObfuscatedName("ad.c(Lag;S)V")
    public void method185(class27 arg0) {
        if (arg0.field220 > this.field279) {
            arg0.field220 = this.field279;
        }
        if (arg0.field217 < this.field279) {
            arg0.field217 = this.field279;
        }
        if (arg0.field214 > this.field280) {
            arg0.field214 = this.field280;
        }
        if (arg0.field215 < this.field280) {
            arg0.field215 = this.field280;
        }
    }

    @ObfuscatedName("ad.x(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field284 && arg0 < this.field284 + this.field275) {
            return arg1 >> 6 == this.field281 && arg2 >> 6 == this.field278;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.t(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >> 6 == this.field279 && arg1 >> 6 == this.field280;
    }

    @ObfuscatedName("ad.g(IIII)[I")
    public int[] method198(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field279 * 64 - this.field281 * 64 + arg1, this.field280 * 64 - this.field278 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ad.l(IIB)Lhj;")
    public class214 method188(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field281 * 64 - this.field279 * 64 + arg0;
            int var4 = this.field278 * 64 - this.field280 * 64 + arg1;
            return new class214(this.field284, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.u(Lkz;I)V")
    public void method189(class300 arg0) {
        this.field284 = arg0.method5103();
        this.field275 = arg0.method5103();
        this.field281 = arg0.method5304();
        this.field278 = arg0.method5304();
        this.field279 = arg0.method5304();
        this.field280 = arg0.method5304();
        this.method476();
    }

    @ObfuscatedName("ad.j(I)V")
    public void method476() {
    }
}
