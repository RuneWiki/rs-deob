package deob;

@ObfuscatedName("ky")
public class class263 implements class276 {

    @ObfuscatedName("ky.at")
    public int field2964;

    @ObfuscatedName("ky.an")
    public int field2953;

    @ObfuscatedName("ky.av")
    public int field2963;

    @ObfuscatedName("ky.as")
    public int field2961;

    @ObfuscatedName("ky.ax")
    public int field2956;

    @ObfuscatedName("ky.ap")
    public int field2957;

    @ObfuscatedName("ky.ab")
    public int field2958;

    @ObfuscatedName("ky.ak")
    public int field2959;

    @ObfuscatedName("ky.ae")
    public int field2955;

    @ObfuscatedName("ky.af")
    public int field2952;

    @ObfuscatedName("ky.ao")
    public int field2960;

    @ObfuscatedName("ky.aa")
    public int field2954;

    @ObfuscatedName("ky.aj")
    public int field2962;

    @ObfuscatedName("ky.ad")
    public int field2965;

    @ObfuscatedName("ky.at(Lji;I)V")
    public void method4691(class256 arg0) {
        if (arg0.field2890 > this.field2956) {
            arg0.field2890 = this.field2956;
        }
        if (arg0.field2894 < this.field2956) {
            arg0.field2894 = this.field2956;
        }
        if (arg0.field2887 > this.field2957) {
            arg0.field2887 = this.field2957;
        }
        if (arg0.field2896 < this.field2957) {
            arg0.field2896 = this.field2957;
        }
    }

    @ObfuscatedName("ky.an(IIIB)Z")
    public boolean method4682(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2964 && arg0 < this.field2964 + this.field2953) {
            return arg1 >= (this.field2963 << 6) + (this.field2958 << 3) && arg1 <= (this.field2963 << 6) + (this.field2955 << 3) + 7 && arg2 >= (this.field2961 << 6) + (this.field2959 << 3) && arg2 <= (this.field2961 << 6) + (this.field2952 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.av(III)Z")
    public boolean method4681(int arg0, int arg1) {
        return arg0 >= (this.field2960 << 3) + (this.field2956 << 6) && arg0 <= (this.field2962 << 3) + (this.field2956 << 6) + 7 && arg1 >= (this.field2957 << 6) + (this.field2954 << 3) && arg1 <= (this.field2965 << 3) + (this.field2957 << 6) + 7;
    }

    @ObfuscatedName("ky.as(IIII)[I")
    public int[] method4673(int arg0, int arg1, int arg2) {
        return this.method4682(arg0, arg1, arg2) ? new int[] { this.field2960 * 8 - this.field2958 * 8 + this.field2956 * 64 - this.field2963 * 64 + arg1, this.field2954 * 8 - this.field2959 * 8 + this.field2957 * 64 - this.field2961 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ky.ax(III)Lmg;")
    public class321 method4674(int arg0, int arg1) {
        if (this.method4681(arg0, arg1)) {
            int var3 = this.field2958 * 8 - this.field2960 * 8 + this.field2963 * 64 - this.field2956 * 64 + arg0;
            int var4 = this.field2959 * 8 - this.field2954 * 8 + this.field2961 * 64 - this.field2957 * 64 + arg1;
            return new class321(this.field2964, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ky.ap(Ltz;I)V")
    public void method4670(class501 arg0) {
        this.field2964 = arg0.method8129();
        this.field2953 = arg0.method8129();
        this.field2963 = arg0.method8195();
        this.field2958 = arg0.method8129();
        this.field2955 = arg0.method8129();
        this.field2961 = arg0.method8195();
        this.field2959 = arg0.method8129();
        this.field2952 = arg0.method8129();
        this.field2956 = arg0.method8195();
        this.field2960 = arg0.method8129();
        this.field2962 = arg0.method8129();
        this.field2957 = arg0.method8195();
        this.field2954 = arg0.method8129();
        this.field2965 = arg0.method8129();
        this.method4949();
    }

    @ObfuscatedName("ky.ab(I)V")
    public void method4949() {
    }
}
