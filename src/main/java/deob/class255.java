package deob;

@ObfuscatedName("ju")
public class class255 implements class276 {

    @ObfuscatedName("ju.at")
    public int field2880;

    @ObfuscatedName("ju.an")
    public int field2878;

    @ObfuscatedName("ju.av")
    public int field2879;

    @ObfuscatedName("ju.as")
    public int field2877;

    @ObfuscatedName("ju.ax")
    public int field2886;

    @ObfuscatedName("ju.ap")
    public int field2882;

    @ObfuscatedName("ju.ab")
    public int field2883;

    @ObfuscatedName("ju.ak")
    public int field2884;

    @ObfuscatedName("ju.ae")
    public int field2885;

    @ObfuscatedName("ju.af")
    public int field2881;

    @ObfuscatedName("ju.at(Lji;I)V")
    public void method4691(class256 arg0) {
        if (arg0.field2890 > this.field2883) {
            arg0.field2890 = this.field2883;
        }
        if (arg0.field2894 < this.field2885) {
            arg0.field2894 = this.field2885;
        }
        if (arg0.field2887 > this.field2884) {
            arg0.field2887 = this.field2884;
        }
        if (arg0.field2896 < this.field2881) {
            arg0.field2896 = this.field2881;
        }
    }

    @ObfuscatedName("ju.an(IIIB)Z")
    public boolean method4682(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2880 && arg0 < this.field2880 + this.field2878) {
            return arg1 >> 6 >= this.field2879 && arg1 >> 6 <= this.field2886 && arg2 >> 6 >= this.field2877 && arg2 >> 6 <= this.field2882;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ju.av(III)Z")
    public boolean method4681(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2883 && arg0 >> 6 <= this.field2885 && arg1 >> 6 >= this.field2884 && arg1 >> 6 <= this.field2881;
    }

    @ObfuscatedName("ju.as(IIII)[I")
    public int[] method4673(int arg0, int arg1, int arg2) {
        return this.method4682(arg0, arg1, arg2) ? new int[] { this.field2883 * 64 - this.field2879 * 64 + arg1, this.field2884 * 64 - this.field2877 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ju.ax(III)Lmg;")
    public class321 method4674(int arg0, int arg1) {
        if (this.method4681(arg0, arg1)) {
            int var3 = this.field2879 * 64 - this.field2883 * 64 + arg0;
            int var4 = this.field2877 * 64 - this.field2884 * 64 + arg1;
            return new class321(this.field2880, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ju.ap(Ltz;I)V")
    public void method4670(class501 arg0) {
        this.field2880 = arg0.method8129();
        this.field2878 = arg0.method8129();
        this.field2879 = arg0.method8195();
        this.field2877 = arg0.method8195();
        this.field2886 = arg0.method8195();
        this.field2882 = arg0.method8195();
        this.field2883 = arg0.method8195();
        this.field2884 = arg0.method8195();
        this.field2885 = arg0.method8195();
        this.field2881 = arg0.method8195();
        this.method4676();
    }

    @ObfuscatedName("ju.ab(I)V")
    public void method4676() {
    }
}
