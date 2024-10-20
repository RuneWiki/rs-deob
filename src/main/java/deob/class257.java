package deob;

@ObfuscatedName("jx")
public class class257 implements class278 {

    @ObfuscatedName("jx.aw")
    public int field2882;

    @ObfuscatedName("jx.ay")
    public int field2874;

    @ObfuscatedName("jx.ar")
    public int field2875;

    @ObfuscatedName("jx.am")
    public int field2880;

    @ObfuscatedName("jx.as")
    public int field2877;

    @ObfuscatedName("jx.aj")
    public int field2873;

    @ObfuscatedName("jx.ag")
    public int field2879;

    @ObfuscatedName("jx.az")
    public int field2878;

    @ObfuscatedName("jx.av")
    public int field2881;

    @ObfuscatedName("jx.ap")
    public int field2876;

    @ObfuscatedName("jx.aw(Ljs;I)V")
    public void method4695(class258 arg0) {
        if (arg0.field2892 > this.field2879) {
            arg0.field2892 = this.field2879;
        }
        if (arg0.field2893 < this.field2881) {
            arg0.field2893 = this.field2881;
        }
        if (arg0.field2889 > this.field2878) {
            arg0.field2889 = this.field2878;
        }
        if (arg0.field2894 < this.field2876) {
            arg0.field2894 = this.field2876;
        }
    }

    @ObfuscatedName("jx.ay(IIIB)Z")
    public boolean method4697(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2882 && arg0 < this.field2882 + this.field2874) {
            return arg1 >> 6 >= this.field2875 && arg1 >> 6 <= this.field2877 && arg2 >> 6 >= this.field2880 && arg2 >> 6 <= this.field2873;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jx.ar(III)Z")
    public boolean method4709(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2879 && arg0 >> 6 <= this.field2881 && arg1 >> 6 >= this.field2878 && arg1 >> 6 <= this.field2876;
    }

    @ObfuscatedName("jx.am(IIII)[I")
    public int[] method4715(int arg0, int arg1, int arg2) {
        return this.method4697(arg0, arg1, arg2) ? new int[] { this.field2879 * 64 - this.field2875 * 64 + arg1, this.field2878 * 64 - this.field2880 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jx.as(IIB)Lmr;")
    public class324 method4699(int arg0, int arg1) {
        if (this.method4709(arg0, arg1)) {
            int var3 = this.field2875 * 64 - this.field2879 * 64 + arg0;
            int var4 = this.field2880 * 64 - this.field2878 * 64 + arg1;
            return new class324(this.field2882, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jx.aj(Lty;I)V")
    public void method4698(class514 arg0) {
        this.field2882 = arg0.method8244();
        this.field2874 = arg0.method8244();
        this.field2875 = arg0.method8246();
        this.field2880 = arg0.method8246();
        this.field2877 = arg0.method8246();
        this.field2873 = arg0.method8246();
        this.field2879 = arg0.method8246();
        this.field2878 = arg0.method8246();
        this.field2881 = arg0.method8246();
        this.field2876 = arg0.method8246();
        this.method4701();
    }

    @ObfuscatedName("jx.ag(I)V")
    public void method4701() {
    }
}
