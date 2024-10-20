package deob;

@ObfuscatedName("jf")
public class class260 implements class276 {

    @ObfuscatedName("jf.at")
    public int field2940;

    @ObfuscatedName("jf.an")
    public int field2934;

    @ObfuscatedName("jf.av")
    public int field2935;

    @ObfuscatedName("jf.as")
    public int field2944;

    @ObfuscatedName("jf.ax")
    public int field2937;

    @ObfuscatedName("jf.ap")
    public int field2933;

    @ObfuscatedName("jf.ab")
    public int field2939;

    @ObfuscatedName("jf.ak")
    public int field2943;

    @ObfuscatedName("jf.ae")
    public int field2941;

    @ObfuscatedName("jf.af")
    public int field2942;

    @ObfuscatedName("jf.at(Lji;I)V")
    public void method4691(class256 arg0) {
        if (arg0.field2890 > this.field2937) {
            arg0.field2890 = this.field2937;
        }
        if (arg0.field2894 < this.field2937) {
            arg0.field2894 = this.field2937;
        }
        if (arg0.field2887 > this.field2933) {
            arg0.field2887 = this.field2933;
        }
        if (arg0.field2896 < this.field2933) {
            arg0.field2896 = this.field2933;
        }
    }

    @ObfuscatedName("jf.an(IIIB)Z")
    public boolean method4682(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2940 && arg0 < this.field2940 + this.field2934) {
            return arg1 >= (this.field2939 << 3) + (this.field2935 << 6) && arg1 <= (this.field2939 << 3) + (this.field2935 << 6) + 7 && arg2 >= (this.field2944 << 6) + (this.field2943 << 3) && arg2 <= (this.field2944 << 6) + (this.field2943 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jf.av(III)Z")
    public boolean method4681(int arg0, int arg1) {
        return arg0 >= (this.field2941 << 3) + (this.field2937 << 6) && arg0 <= (this.field2941 << 3) + (this.field2937 << 6) + 7 && arg1 >= (this.field2942 << 3) + (this.field2933 << 6) && arg1 <= (this.field2942 << 3) + (this.field2933 << 6) + 7;
    }

    @ObfuscatedName("jf.as(IIII)[I")
    public int[] method4673(int arg0, int arg1, int arg2) {
        return this.method4682(arg0, arg1, arg2) ? new int[] { this.field2941 * 8 - this.field2939 * 8 + this.field2937 * 64 - this.field2935 * 64 + arg1, this.field2942 * 8 - this.field2943 * 8 + this.field2933 * 64 - this.field2944 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jf.ax(III)Lmg;")
    public class321 method4674(int arg0, int arg1) {
        if (this.method4681(arg0, arg1)) {
            int var3 = this.field2939 * 8 - this.field2941 * 8 + this.field2935 * 64 - this.field2937 * 64 + arg0;
            int var4 = this.field2943 * 8 - this.field2942 * 8 + this.field2944 * 64 - this.field2933 * 64 + arg1;
            return new class321(this.field2940, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jf.ap(Ltz;I)V")
    public void method4670(class501 arg0) {
        this.field2940 = arg0.method8129();
        this.field2934 = arg0.method8129();
        this.field2935 = arg0.method8195();
        this.field2939 = arg0.method8129();
        this.field2944 = arg0.method8195();
        this.field2943 = arg0.method8129();
        this.field2937 = arg0.method8195();
        this.field2941 = arg0.method8129();
        this.field2933 = arg0.method8195();
        this.field2942 = arg0.method8129();
        this.method4941();
    }

    @ObfuscatedName("jf.ab(I)V")
    public void method4941() {
    }
}
