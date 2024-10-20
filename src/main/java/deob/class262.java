package deob;

@ObfuscatedName("kd")
public class class262 implements class278 {

    @ObfuscatedName("kd.aw")
    public int field2941;

    @ObfuscatedName("kd.ay")
    public int field2939;

    @ObfuscatedName("kd.ar")
    public int field2940;

    @ObfuscatedName("kd.am")
    public int field2947;

    @ObfuscatedName("kd.as")
    public int field2942;

    @ObfuscatedName("kd.aj")
    public int field2948;

    @ObfuscatedName("kd.ag")
    public int field2943;

    @ObfuscatedName("kd.az")
    public int field2945;

    @ObfuscatedName("kd.av")
    public int field2946;

    @ObfuscatedName("kd.ap")
    public int field2949;

    @ObfuscatedName("kd.aw(Ljs;I)V")
    public void method4695(class258 arg0) {
        if (arg0.field2892 > this.field2942) {
            arg0.field2892 = this.field2942;
        }
        if (arg0.field2893 < this.field2942) {
            arg0.field2893 = this.field2942;
        }
        if (arg0.field2889 > this.field2948) {
            arg0.field2889 = this.field2948;
        }
        if (arg0.field2894 < this.field2948) {
            arg0.field2894 = this.field2948;
        }
    }

    @ObfuscatedName("kd.ay(IIIB)Z")
    public boolean method4697(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2941 && arg0 < this.field2941 + this.field2939) {
            return arg1 >= (this.field2943 << 3) + (this.field2940 << 6) && arg1 <= (this.field2943 << 3) + (this.field2940 << 6) + 7 && arg2 >= (this.field2947 << 6) + (this.field2945 << 3) && arg2 <= (this.field2947 << 6) + (this.field2945 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kd.ar(III)Z")
    public boolean method4709(int arg0, int arg1) {
        return arg0 >= (this.field2946 << 3) + (this.field2942 << 6) && arg0 <= (this.field2946 << 3) + (this.field2942 << 6) + 7 && arg1 >= (this.field2949 << 3) + (this.field2948 << 6) && arg1 <= (this.field2949 << 3) + (this.field2948 << 6) + 7;
    }

    @ObfuscatedName("kd.am(IIII)[I")
    public int[] method4715(int arg0, int arg1, int arg2) {
        return this.method4697(arg0, arg1, arg2) ? new int[] { this.field2946 * 8 - this.field2943 * 8 + this.field2942 * 64 - this.field2940 * 64 + arg1, this.field2949 * 8 - this.field2945 * 8 + this.field2948 * 64 - this.field2947 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kd.as(IIB)Lmr;")
    public class324 method4699(int arg0, int arg1) {
        if (this.method4709(arg0, arg1)) {
            int var3 = this.field2943 * 8 - this.field2946 * 8 + this.field2940 * 64 - this.field2942 * 64 + arg0;
            int var4 = this.field2945 * 8 - this.field2949 * 8 + this.field2947 * 64 - this.field2948 * 64 + arg1;
            return new class324(this.field2941, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kd.aj(Lty;I)V")
    public void method4698(class514 arg0) {
        this.field2941 = arg0.method8244();
        this.field2939 = arg0.method8244();
        this.field2940 = arg0.method8246();
        this.field2943 = arg0.method8244();
        this.field2947 = arg0.method8246();
        this.field2945 = arg0.method8244();
        this.field2942 = arg0.method8246();
        this.field2946 = arg0.method8244();
        this.field2948 = arg0.method8246();
        this.field2949 = arg0.method8244();
        this.method4978();
    }

    @ObfuscatedName("kd.ag(I)V")
    public void method4978() {
    }
}
