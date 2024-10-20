package deob;

@ObfuscatedName("jp")
public class class256 implements class277 {

    @ObfuscatedName("jp.au")
    public int field2900;

    @ObfuscatedName("jp.ae")
    public int field2903;

    @ObfuscatedName("jp.ao")
    public int field2896;

    @ObfuscatedName("jp.at")
    public int field2897;

    @ObfuscatedName("jp.ac")
    public int field2898;

    @ObfuscatedName("jp.ai")
    public int field2899;

    @ObfuscatedName("jp.az")
    public int field2901;

    @ObfuscatedName("jp.ap")
    public int field2895;

    @ObfuscatedName("jp.aa")
    public int field2902;

    @ObfuscatedName("jp.af")
    public int field2894;

    @ObfuscatedName("jp.au(Ljf;I)V")
    public void method4712(class257 arg0) {
        if (arg0.field2911 > this.field2901) {
            arg0.field2911 = this.field2901;
        }
        if (arg0.field2905 < this.field2902) {
            arg0.field2905 = this.field2902;
        }
        if (arg0.field2913 > this.field2895) {
            arg0.field2913 = this.field2895;
        }
        if (arg0.field2907 < this.field2894) {
            arg0.field2907 = this.field2894;
        }
    }

    @ObfuscatedName("jp.ae(IIII)Z")
    public boolean method4714(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2900 && arg0 < this.field2903 + this.field2900) {
            return arg1 >> 6 >= this.field2896 && arg1 >> 6 <= this.field2898 && arg2 >> 6 >= this.field2897 && arg2 >> 6 <= this.field2899;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jp.ao(IIB)Z")
    public boolean method4713(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2901 && arg0 >> 6 <= this.field2902 && arg1 >> 6 >= this.field2895 && arg1 >> 6 <= this.field2894;
    }

    @ObfuscatedName("jp.at(IIII)[I")
    public int[] method4718(int arg0, int arg1, int arg2) {
        return this.method4714(arg0, arg1, arg2) ? new int[] { this.field2901 * 64 - this.field2896 * 64 + arg1, this.field2895 * 64 - this.field2897 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jp.ac(III)Lmc;")
    public class323 method4715(int arg0, int arg1) {
        if (this.method4713(arg0, arg1)) {
            int var3 = this.field2896 * 64 - this.field2901 * 64 + arg0;
            int var4 = this.field2897 * 64 - this.field2895 * 64 + arg1;
            return new class323(this.field2900, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jp.ai(Ltm;B)V")
    public void method4716(class515 arg0) {
        this.field2900 = arg0.method8300();
        this.field2903 = arg0.method8300();
        this.field2896 = arg0.method8448();
        this.field2897 = arg0.method8448();
        this.field2898 = arg0.method8448();
        this.field2899 = arg0.method8448();
        this.field2901 = arg0.method8448();
        this.field2895 = arg0.method8448();
        this.field2902 = arg0.method8448();
        this.field2894 = arg0.method8448();
        this.method4717();
    }

    @ObfuscatedName("jp.az(B)V")
    public void method4717() {
    }
}
