package deob;

@ObfuscatedName("kn")
public class class277 implements class293 {

    @ObfuscatedName("kn.az")
    public int field3047;

    @ObfuscatedName("kn.ah")
    public int field3042;

    @ObfuscatedName("kn.af")
    public int field3043;

    @ObfuscatedName("kn.at")
    public int field3044;

    @ObfuscatedName("kn.an")
    public int field3045;

    @ObfuscatedName("kn.ao")
    public int field3050;

    @ObfuscatedName("kn.ab")
    public int field3051;

    @ObfuscatedName("kn.aw")
    public int field3048;

    @ObfuscatedName("kn.ad")
    public int field3049;

    @ObfuscatedName("kn.al")
    public int field3052;

    @ObfuscatedName("kn.az(Lkf;I)V")
    public void method4856(class273 arg0) {
        if (arg0.field2996 > this.field3045) {
            arg0.field2996 = this.field3045;
        }
        if (arg0.field3002 < this.field3045) {
            arg0.field3002 = this.field3045;
        }
        if (arg0.field2998 > this.field3050) {
            arg0.field2998 = this.field3050;
        }
        if (arg0.field2999 < this.field3050) {
            arg0.field2999 = this.field3050;
        }
    }

    @ObfuscatedName("kn.ah(IIII)Z")
    public boolean method4857(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3047 && arg0 < this.field3047 + this.field3042) {
            return arg1 >= (this.field3051 << 3) + (this.field3043 << 6) && arg1 <= (this.field3051 << 3) + (this.field3043 << 6) + 7 && arg2 >= (this.field3048 << 3) + (this.field3044 << 6) && arg2 <= (this.field3048 << 3) + (this.field3044 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kn.af(III)Z")
    public boolean method4870(int arg0, int arg1) {
        return arg0 >= (this.field3049 << 3) + (this.field3045 << 6) && arg0 <= (this.field3049 << 3) + (this.field3045 << 6) + 7 && arg1 >= (this.field3052 << 3) + (this.field3050 << 6) && arg1 <= (this.field3052 << 3) + (this.field3050 << 6) + 7;
    }

    @ObfuscatedName("kn.at(IIII)[I")
    public int[] method4859(int arg0, int arg1, int arg2) {
        return this.method4857(arg0, arg1, arg2) ? new int[] { this.field3049 * 8 - this.field3051 * 8 + this.field3045 * 64 - this.field3043 * 64 + arg1, this.field3052 * 8 - this.field3048 * 8 + this.field3050 * 64 - this.field3044 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kn.an(IIB)Lnn;")
    public class339 method4860(int arg0, int arg1) {
        if (this.method4870(arg0, arg1)) {
            int var3 = this.field3051 * 8 - this.field3049 * 8 + this.field3043 * 64 - this.field3045 * 64 + arg0;
            int var4 = this.field3048 * 8 - this.field3052 * 8 + this.field3044 * 64 - this.field3050 * 64 + arg1;
            return new class339(this.field3047, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.ao(Lur;I)V")
    public void method4872(class535 arg0) {
        this.field3047 = arg0.method8462();
        this.field3042 = arg0.method8462();
        this.field3043 = arg0.method8670();
        this.field3051 = arg0.method8462();
        this.field3044 = arg0.method8670();
        this.field3048 = arg0.method8462();
        this.field3045 = arg0.method8670();
        this.field3049 = arg0.method8462();
        this.field3050 = arg0.method8670();
        this.field3052 = arg0.method8462();
        this.method5143();
    }

    @ObfuscatedName("kn.ab(I)V")
    public void method5143() {
    }
}
