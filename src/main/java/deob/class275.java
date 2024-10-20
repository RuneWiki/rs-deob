package deob;

@ObfuscatedName("ky")
public class class275 implements class278 {

    @ObfuscatedName("ky.aw")
    public int field3037;

    @ObfuscatedName("ky.ay")
    public int field3031;

    @ObfuscatedName("ky.ar")
    public int field3032;

    @ObfuscatedName("ky.am")
    public int field3035;

    @ObfuscatedName("ky.as")
    public int field3034;

    @ObfuscatedName("ky.aj")
    public int field3036;

    @ObfuscatedName("ky.aw(Ljs;I)V")
    public void method4695(class258 arg0) {
        if (arg0.field2892 > this.field3034) {
            arg0.field2892 = this.field3034;
        }
        if (arg0.field2893 < this.field3034) {
            arg0.field2893 = this.field3034;
        }
        if (arg0.field2889 > this.field3036) {
            arg0.field2889 = this.field3036;
        }
        if (arg0.field2894 < this.field3036) {
            arg0.field2894 = this.field3036;
        }
    }

    @ObfuscatedName("ky.ay(IIIB)Z")
    public boolean method4697(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3037 && arg0 < this.field3037 + this.field3031) {
            return arg1 >> 6 == this.field3032 && arg2 >> 6 == this.field3035;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.ar(III)Z")
    public boolean method4709(int arg0, int arg1) {
        return arg0 >> 6 == this.field3034 && arg1 >> 6 == this.field3036;
    }

    @ObfuscatedName("ky.am(IIII)[I")
    public int[] method4715(int arg0, int arg1, int arg2) {
        return this.method4697(arg0, arg1, arg2) ? new int[] { this.field3034 * 64 - this.field3032 * 64 + arg1, this.field3036 * 64 - this.field3035 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ky.as(IIB)Lmr;")
    public class324 method4699(int arg0, int arg1) {
        if (this.method4709(arg0, arg1)) {
            int var3 = this.field3032 * 64 - this.field3034 * 64 + arg0;
            int var4 = this.field3035 * 64 - this.field3036 * 64 + arg1;
            return new class324(this.field3037, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ky.aj(Lty;I)V")
    public void method4698(class514 arg0) {
        this.field3037 = arg0.method8244();
        this.field3031 = arg0.method8244();
        this.field3032 = arg0.method8246();
        this.field3035 = arg0.method8246();
        this.field3034 = arg0.method8246();
        this.field3036 = arg0.method8246();
        this.method5041();
    }

    @ObfuscatedName("ky.ag(I)V")
    public void method5041() {
    }
}
