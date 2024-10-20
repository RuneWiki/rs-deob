package deob;

@ObfuscatedName("kg")
public class class265 implements class278 {

    @ObfuscatedName("kg.aw")
    public int field2963;

    @ObfuscatedName("kg.ay")
    public int field2962;

    @ObfuscatedName("kg.ar")
    public int field2960;

    @ObfuscatedName("kg.am")
    public int field2961;

    @ObfuscatedName("kg.as")
    public int field2969;

    @ObfuscatedName("kg.aj")
    public int field2965;

    @ObfuscatedName("kg.ag")
    public int field2964;

    @ObfuscatedName("kg.az")
    public int field2970;

    @ObfuscatedName("kg.av")
    public int field2966;

    @ObfuscatedName("kg.ap")
    public int field2967;

    @ObfuscatedName("kg.aq")
    public int field2968;

    @ObfuscatedName("kg.at")
    public int field2959;

    @ObfuscatedName("kg.ah")
    public int field2958;

    @ObfuscatedName("kg.ax")
    public int field2971;

    @ObfuscatedName("kg.aw(Ljs;I)V")
    public void method4695(class258 arg0) {
        if (arg0.field2892 > this.field2969) {
            arg0.field2892 = this.field2969;
        }
        if (arg0.field2893 < this.field2969) {
            arg0.field2893 = this.field2969;
        }
        if (arg0.field2889 > this.field2965) {
            arg0.field2889 = this.field2965;
        }
        if (arg0.field2894 < this.field2965) {
            arg0.field2894 = this.field2965;
        }
    }

    @ObfuscatedName("kg.ay(IIIB)Z")
    public boolean method4697(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2963 && arg0 < this.field2963 + this.field2962) {
            return arg1 >= (this.field2964 << 3) + (this.field2960 << 6) && arg1 <= (this.field2966 << 3) + (this.field2960 << 6) + 7 && arg2 >= (this.field2970 << 3) + (this.field2961 << 6) && arg2 <= (this.field2967 << 3) + (this.field2961 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kg.ar(III)Z")
    public boolean method4709(int arg0, int arg1) {
        return arg0 >= (this.field2969 << 6) + (this.field2968 << 3) && arg0 <= (this.field2969 << 6) + (this.field2958 << 3) + 7 && arg1 >= (this.field2965 << 6) + (this.field2959 << 3) && arg1 <= (this.field2971 << 3) + (this.field2965 << 6) + 7;
    }

    @ObfuscatedName("kg.am(IIII)[I")
    public int[] method4715(int arg0, int arg1, int arg2) {
        return this.method4697(arg0, arg1, arg2) ? new int[] { this.field2968 * 8 - this.field2964 * 8 + this.field2969 * 64 - this.field2960 * 64 + arg1, this.field2959 * 8 - this.field2970 * 8 + this.field2965 * 64 - this.field2961 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kg.as(IIB)Lmr;")
    public class324 method4699(int arg0, int arg1) {
        if (this.method4709(arg0, arg1)) {
            int var3 = this.field2964 * 8 - this.field2968 * 8 + this.field2960 * 64 - this.field2969 * 64 + arg0;
            int var4 = this.field2970 * 8 - this.field2959 * 8 + this.field2961 * 64 - this.field2965 * 64 + arg1;
            return new class324(this.field2963, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kg.aj(Lty;I)V")
    public void method4698(class514 arg0) {
        this.field2963 = arg0.method8244();
        this.field2962 = arg0.method8244();
        this.field2960 = arg0.method8246();
        this.field2964 = arg0.method8244();
        this.field2966 = arg0.method8244();
        this.field2961 = arg0.method8246();
        this.field2970 = arg0.method8244();
        this.field2967 = arg0.method8244();
        this.field2969 = arg0.method8246();
        this.field2968 = arg0.method8244();
        this.field2958 = arg0.method8244();
        this.field2965 = arg0.method8246();
        this.field2959 = arg0.method8244();
        this.field2971 = arg0.method8244();
        this.method4982();
    }

    @ObfuscatedName("kg.ag(B)V")
    public void method4982() {
    }
}
