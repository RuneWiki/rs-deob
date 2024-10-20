package deob;

@ObfuscatedName("kr")
public class class273 implements class276 {

    @ObfuscatedName("kr.at")
    public int field3038;

    @ObfuscatedName("kr.an")
    public int field3032;

    @ObfuscatedName("kr.av")
    public int field3033;

    @ObfuscatedName("kr.as")
    public int field3034;

    @ObfuscatedName("kr.ax")
    public int field3035;

    @ObfuscatedName("kr.ap")
    public int field3036;

    @ObfuscatedName("kr.at(Lji;I)V")
    public void method4691(class256 arg0) {
        if (arg0.field2890 > this.field3035) {
            arg0.field2890 = this.field3035;
        }
        if (arg0.field2894 < this.field3035) {
            arg0.field2894 = this.field3035;
        }
        if (arg0.field2887 > this.field3036) {
            arg0.field2887 = this.field3036;
        }
        if (arg0.field2896 < this.field3036) {
            arg0.field2896 = this.field3036;
        }
    }

    @ObfuscatedName("kr.an(IIIB)Z")
    public boolean method4682(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3038 && arg0 < this.field3038 + this.field3032) {
            return arg1 >> 6 == this.field3033 && arg2 >> 6 == this.field3034;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kr.av(III)Z")
    public boolean method4681(int arg0, int arg1) {
        return arg0 >> 6 == this.field3035 && arg1 >> 6 == this.field3036;
    }

    @ObfuscatedName("kr.as(IIII)[I")
    public int[] method4673(int arg0, int arg1, int arg2) {
        return this.method4682(arg0, arg1, arg2) ? new int[] { this.field3035 * 64 - this.field3033 * 64 + arg1, this.field3036 * 64 - this.field3034 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kr.ax(III)Lmg;")
    public class321 method4674(int arg0, int arg1) {
        if (this.method4681(arg0, arg1)) {
            int var3 = this.field3033 * 64 - this.field3035 * 64 + arg0;
            int var4 = this.field3034 * 64 - this.field3036 * 64 + arg1;
            return new class321(this.field3038, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kr.ap(Ltz;I)V")
    public void method4670(class501 arg0) {
        this.field3038 = arg0.method8129();
        this.field3032 = arg0.method8129();
        this.field3033 = arg0.method8195();
        this.field3034 = arg0.method8195();
        this.field3035 = arg0.method8195();
        this.field3036 = arg0.method8195();
        this.method5010();
    }

    @ObfuscatedName("kr.ab(B)V")
    public void method5010() {
    }
}
