package deob;

@ObfuscatedName("ky")
public class class274 implements class277 {

    @ObfuscatedName("ky.au")
    public int field3052;

    @ObfuscatedName("ky.ae")
    public int field3054;

    @ObfuscatedName("ky.ao")
    public int field3051;

    @ObfuscatedName("ky.at")
    public int field3053;

    @ObfuscatedName("ky.ac")
    public int field3057;

    @ObfuscatedName("ky.ai")
    public int field3049;

    @ObfuscatedName("ky.au(Ljf;I)V")
    public void method4712(class257 arg0) {
        if (arg0.field2911 > this.field3057) {
            arg0.field2911 = this.field3057;
        }
        if (arg0.field2905 < this.field3057) {
            arg0.field2905 = this.field3057;
        }
        if (arg0.field2913 > this.field3049) {
            arg0.field2913 = this.field3049;
        }
        if (arg0.field2907 < this.field3049) {
            arg0.field2907 = this.field3049;
        }
    }

    @ObfuscatedName("ky.ae(IIII)Z")
    public boolean method4714(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3052 && arg0 < this.field3054 + this.field3052) {
            return arg1 >> 6 == this.field3051 && arg2 >> 6 == this.field3053;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.ao(IIB)Z")
    public boolean method4713(int arg0, int arg1) {
        return arg0 >> 6 == this.field3057 && arg1 >> 6 == this.field3049;
    }

    @ObfuscatedName("ky.at(IIII)[I")
    public int[] method4718(int arg0, int arg1, int arg2) {
        return this.method4714(arg0, arg1, arg2) ? new int[] { this.field3057 * 64 - this.field3051 * 64 + arg1, this.field3049 * 64 - this.field3053 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ky.ac(III)Lmc;")
    public class323 method4715(int arg0, int arg1) {
        if (this.method4713(arg0, arg1)) {
            int var3 = this.field3051 * 64 - this.field3057 * 64 + arg0;
            int var4 = this.field3053 * 64 - this.field3049 * 64 + arg1;
            return new class323(this.field3052, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ky.ai(Ltm;B)V")
    public void method4716(class515 arg0) {
        this.field3052 = arg0.method8300();
        this.field3054 = arg0.method8300();
        this.field3051 = arg0.method8448();
        this.field3053 = arg0.method8448();
        this.field3057 = arg0.method8448();
        this.field3049 = arg0.method8448();
        this.method5064();
    }

    @ObfuscatedName("ky.az(B)V")
    public void method5064() {
    }
}
