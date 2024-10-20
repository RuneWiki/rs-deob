package deob;

@ObfuscatedName("kj")
public class class264 implements class277 {

    @ObfuscatedName("kj.au")
    public int field2975;

    @ObfuscatedName("kj.ae")
    public int field2977;

    @ObfuscatedName("kj.ao")
    public int field2981;

    @ObfuscatedName("kj.at")
    public int field2985;

    @ObfuscatedName("kj.ac")
    public int field2979;

    @ObfuscatedName("kj.ai")
    public int field2987;

    @ObfuscatedName("kj.az")
    public int field2976;

    @ObfuscatedName("kj.ap")
    public int field2982;

    @ObfuscatedName("kj.aa")
    public int field2983;

    @ObfuscatedName("kj.af")
    public int field2984;

    @ObfuscatedName("kj.ad")
    public int field2980;

    @ObfuscatedName("kj.aq")
    public int field2986;

    @ObfuscatedName("kj.al")
    public int field2978;

    @ObfuscatedName("kj.an")
    public int field2988;

    @ObfuscatedName("kj.au(Ljf;I)V")
    public void method4712(class257 arg0) {
        if (arg0.field2911 > this.field2979) {
            arg0.field2911 = this.field2979;
        }
        if (arg0.field2905 < this.field2979) {
            arg0.field2905 = this.field2979;
        }
        if (arg0.field2913 > this.field2987) {
            arg0.field2913 = this.field2987;
        }
        if (arg0.field2907 < this.field2987) {
            arg0.field2907 = this.field2987;
        }
    }

    @ObfuscatedName("kj.ae(IIII)Z")
    public boolean method4714(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2975 && arg0 < this.field2977 + this.field2975) {
            return arg1 >= (this.field2981 << 6) + (this.field2976 << 3) && arg1 <= (this.field2983 << 3) + (this.field2981 << 6) + 7 && arg2 >= (this.field2985 << 6) + (this.field2982 << 3) && arg2 <= (this.field2985 << 6) + (this.field2984 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kj.ao(IIB)Z")
    public boolean method4713(int arg0, int arg1) {
        return arg0 >= (this.field2980 << 3) + (this.field2979 << 6) && arg0 <= (this.field2979 << 6) + (this.field2978 << 3) + 7 && arg1 >= (this.field2987 << 6) + (this.field2986 << 3) && arg1 <= (this.field2988 << 3) + (this.field2987 << 6) + 7;
    }

    @ObfuscatedName("kj.at(IIII)[I")
    public int[] method4718(int arg0, int arg1, int arg2) {
        return this.method4714(arg0, arg1, arg2) ? new int[] { this.field2980 * 8 - this.field2976 * 8 + this.field2979 * 64 - this.field2981 * 64 + arg1, this.field2986 * 8 - this.field2982 * 8 + this.field2987 * 64 - this.field2985 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kj.ac(III)Lmc;")
    public class323 method4715(int arg0, int arg1) {
        if (this.method4713(arg0, arg1)) {
            int var3 = this.field2976 * 8 - this.field2980 * 8 + this.field2981 * 64 - this.field2979 * 64 + arg0;
            int var4 = this.field2982 * 8 - this.field2986 * 8 + this.field2985 * 64 - this.field2987 * 64 + arg1;
            return new class323(this.field2975, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kj.ai(Ltm;B)V")
    public void method4716(class515 arg0) {
        this.field2975 = arg0.method8300();
        this.field2977 = arg0.method8300();
        this.field2981 = arg0.method8448();
        this.field2976 = arg0.method8300();
        this.field2983 = arg0.method8300();
        this.field2985 = arg0.method8448();
        this.field2982 = arg0.method8300();
        this.field2984 = arg0.method8300();
        this.field2979 = arg0.method8448();
        this.field2980 = arg0.method8300();
        this.field2978 = arg0.method8300();
        this.field2987 = arg0.method8448();
        this.field2986 = arg0.method8300();
        this.field2988 = arg0.method8300();
        this.method5005();
    }

    @ObfuscatedName("kj.az(I)V")
    public void method5005() {
    }
}
