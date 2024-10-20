package deob;

@ObfuscatedName("kb")
public class class261 implements class277 {

    @ObfuscatedName("kb.au")
    public int field2963;

    @ObfuscatedName("kb.ae")
    public int field2955;

    @ObfuscatedName("kb.ao")
    public int field2967;

    @ObfuscatedName("kb.at")
    public int field2958;

    @ObfuscatedName("kb.ac")
    public int field2959;

    @ObfuscatedName("kb.ai")
    public int field2961;

    @ObfuscatedName("kb.az")
    public int field2957;

    @ObfuscatedName("kb.ap")
    public int field2962;

    @ObfuscatedName("kb.aa")
    public int field2956;

    @ObfuscatedName("kb.af")
    public int field2964;

    @ObfuscatedName("kb.au(Ljf;I)V")
    public void method4712(class257 arg0) {
        if (arg0.field2911 > this.field2959) {
            arg0.field2911 = this.field2959;
        }
        if (arg0.field2905 < this.field2959) {
            arg0.field2905 = this.field2959;
        }
        if (arg0.field2913 > this.field2961) {
            arg0.field2913 = this.field2961;
        }
        if (arg0.field2907 < this.field2961) {
            arg0.field2907 = this.field2961;
        }
    }

    @ObfuscatedName("kb.ae(IIII)Z")
    public boolean method4714(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2963 && arg0 < this.field2963 + this.field2955) {
            return arg1 >= (this.field2967 << 6) + (this.field2957 << 3) && arg1 <= (this.field2967 << 6) + (this.field2957 << 3) + 7 && arg2 >= (this.field2962 << 3) + (this.field2958 << 6) && arg2 <= (this.field2962 << 3) + (this.field2958 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kb.ao(IIB)Z")
    public boolean method4713(int arg0, int arg1) {
        return arg0 >= (this.field2959 << 6) + (this.field2956 << 3) && arg0 <= (this.field2959 << 6) + (this.field2956 << 3) + 7 && arg1 >= (this.field2964 << 3) + (this.field2961 << 6) && arg1 <= (this.field2964 << 3) + (this.field2961 << 6) + 7;
    }

    @ObfuscatedName("kb.at(IIII)[I")
    public int[] method4718(int arg0, int arg1, int arg2) {
        return this.method4714(arg0, arg1, arg2) ? new int[] { this.field2956 * 8 - this.field2957 * 8 + this.field2959 * 64 - this.field2967 * 64 + arg1, this.field2964 * 8 - this.field2962 * 8 + this.field2961 * 64 - this.field2958 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kb.ac(III)Lmc;")
    public class323 method4715(int arg0, int arg1) {
        if (this.method4713(arg0, arg1)) {
            int var3 = this.field2957 * 8 - this.field2956 * 8 + this.field2967 * 64 - this.field2959 * 64 + arg0;
            int var4 = this.field2962 * 8 - this.field2964 * 8 + this.field2958 * 64 - this.field2961 * 64 + arg1;
            return new class323(this.field2963, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kb.ai(Ltm;B)V")
    public void method4716(class515 arg0) {
        this.field2963 = arg0.method8300();
        this.field2955 = arg0.method8300();
        this.field2967 = arg0.method8448();
        this.field2957 = arg0.method8300();
        this.field2958 = arg0.method8448();
        this.field2962 = arg0.method8300();
        this.field2959 = arg0.method8448();
        this.field2956 = arg0.method8300();
        this.field2961 = arg0.method8448();
        this.field2964 = arg0.method8300();
        this.method4993();
    }

    @ObfuscatedName("kb.az(I)V")
    public void method4993() {
    }
}
