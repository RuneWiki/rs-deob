package deob;

@ObfuscatedName("ky")
public class class272 implements class293 {

    @ObfuscatedName("ky.az")
    public int field2983;

    @ObfuscatedName("ky.ah")
    public int field2977;

    @ObfuscatedName("ky.af")
    public int field2976;

    @ObfuscatedName("ky.at")
    public int field2979;

    @ObfuscatedName("ky.an")
    public int field2980;

    @ObfuscatedName("ky.ao")
    public int field2978;

    @ObfuscatedName("ky.ab")
    public int field2982;

    @ObfuscatedName("ky.aw")
    public int field2988;

    @ObfuscatedName("ky.ad")
    public int field2984;

    @ObfuscatedName("ky.al")
    public int field2985;

    @ObfuscatedName("ky.az(Lkf;I)V")
    public void method4856(class273 arg0) {
        if (arg0.field2996 > this.field2982) {
            arg0.field2996 = this.field2982;
        }
        if (arg0.field3002 < this.field2984) {
            arg0.field3002 = this.field2984;
        }
        if (arg0.field2998 > this.field2988) {
            arg0.field2998 = this.field2988;
        }
        if (arg0.field2999 < this.field2985) {
            arg0.field2999 = this.field2985;
        }
    }

    @ObfuscatedName("ky.ah(IIII)Z")
    public boolean method4857(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2983 && arg0 < this.field2983 + this.field2977) {
            return arg1 >> 6 >= this.field2976 && arg1 >> 6 <= this.field2980 && arg2 >> 6 >= this.field2979 && arg2 >> 6 <= this.field2978;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.af(III)Z")
    public boolean method4870(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2982 && arg0 >> 6 <= this.field2984 && arg1 >> 6 >= this.field2988 && arg1 >> 6 <= this.field2985;
    }

    @ObfuscatedName("ky.at(IIII)[I")
    public int[] method4859(int arg0, int arg1, int arg2) {
        return this.method4857(arg0, arg1, arg2) ? new int[] { this.field2982 * 64 - this.field2976 * 64 + arg1, this.field2988 * 64 - this.field2979 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ky.an(IIB)Lnn;")
    public class339 method4860(int arg0, int arg1) {
        if (this.method4870(arg0, arg1)) {
            int var3 = this.field2976 * 64 - this.field2982 * 64 + arg0;
            int var4 = this.field2979 * 64 - this.field2988 * 64 + arg1;
            return new class339(this.field2983, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ky.ao(Lur;I)V")
    public void method4872(class535 arg0) {
        this.field2983 = arg0.method8462();
        this.field2977 = arg0.method8462();
        this.field2976 = arg0.method8670();
        this.field2979 = arg0.method8670();
        this.field2980 = arg0.method8670();
        this.field2978 = arg0.method8670();
        this.field2982 = arg0.method8670();
        this.field2988 = arg0.method8670();
        this.field2984 = arg0.method8670();
        this.field2985 = arg0.method8670();
        this.method4862();
    }

    @ObfuscatedName("ky.ab(I)V")
    public void method4862() {
    }
}
