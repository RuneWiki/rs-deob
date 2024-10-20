package deob;

@ObfuscatedName("kt")
public class class280 implements class293 {

    @ObfuscatedName("kt.az")
    public int field3065;

    @ObfuscatedName("kt.ah")
    public int field3066;

    @ObfuscatedName("kt.af")
    public int field3067;

    @ObfuscatedName("kt.at")
    public int field3073;

    @ObfuscatedName("kt.an")
    public int field3077;

    @ObfuscatedName("kt.ao")
    public int field3070;

    @ObfuscatedName("kt.ab")
    public int field3071;

    @ObfuscatedName("kt.aw")
    public int field3072;

    @ObfuscatedName("kt.ad")
    public int field3069;

    @ObfuscatedName("kt.al")
    public int field3074;

    @ObfuscatedName("kt.as")
    public int field3075;

    @ObfuscatedName("kt.ag")
    public int field3076;

    @ObfuscatedName("kt.ai")
    public int field3068;

    @ObfuscatedName("kt.ax")
    public int field3078;

    @ObfuscatedName("kt.az(Lkf;I)V")
    public void method4856(class273 arg0) {
        if (arg0.field2996 > this.field3077) {
            arg0.field2996 = this.field3077;
        }
        if (arg0.field3002 < this.field3077) {
            arg0.field3002 = this.field3077;
        }
        if (arg0.field2998 > this.field3070) {
            arg0.field2998 = this.field3070;
        }
        if (arg0.field2999 < this.field3070) {
            arg0.field2999 = this.field3070;
        }
    }

    @ObfuscatedName("kt.ah(IIII)Z")
    public boolean method4857(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3065 && arg0 < this.field3066 + this.field3065) {
            return arg1 >= (this.field3071 << 3) + (this.field3067 << 6) && arg1 <= (this.field3069 << 3) + (this.field3067 << 6) + 7 && arg2 >= (this.field3073 << 6) + (this.field3072 << 3) && arg2 <= (this.field3074 << 3) + (this.field3073 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kt.af(III)Z")
    public boolean method4870(int arg0, int arg1) {
        return arg0 >= (this.field3077 << 6) + (this.field3075 << 3) && arg0 <= (this.field3077 << 6) + (this.field3068 << 3) + 7 && arg1 >= (this.field3076 << 3) + (this.field3070 << 6) && arg1 <= (this.field3078 << 3) + (this.field3070 << 6) + 7;
    }

    @ObfuscatedName("kt.at(IIII)[I")
    public int[] method4859(int arg0, int arg1, int arg2) {
        return this.method4857(arg0, arg1, arg2) ? new int[] { this.field3075 * 8 - this.field3071 * 8 + this.field3077 * 64 - this.field3067 * 64 + arg1, this.field3076 * 8 - this.field3072 * 8 + this.field3070 * 64 - this.field3073 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kt.an(IIB)Lnn;")
    public class339 method4860(int arg0, int arg1) {
        if (this.method4870(arg0, arg1)) {
            int var3 = this.field3071 * 8 - this.field3075 * 8 + this.field3067 * 64 - this.field3077 * 64 + arg0;
            int var4 = this.field3072 * 8 - this.field3076 * 8 + this.field3073 * 64 - this.field3070 * 64 + arg1;
            return new class339(this.field3065, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kt.ao(Lur;I)V")
    public void method4872(class535 arg0) {
        this.field3065 = arg0.method8462();
        this.field3066 = arg0.method8462();
        this.field3067 = arg0.method8670();
        this.field3071 = arg0.method8462();
        this.field3069 = arg0.method8462();
        this.field3073 = arg0.method8670();
        this.field3072 = arg0.method8462();
        this.field3074 = arg0.method8462();
        this.field3077 = arg0.method8670();
        this.field3075 = arg0.method8462();
        this.field3068 = arg0.method8462();
        this.field3070 = arg0.method8670();
        this.field3076 = arg0.method8462();
        this.field3078 = arg0.method8462();
        this.method5163();
    }

    @ObfuscatedName("kt.ab(I)V")
    public void method5163() {
    }
}
