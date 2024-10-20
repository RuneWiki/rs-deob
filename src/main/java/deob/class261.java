package deob;

@ObfuscatedName("kt")
public class class261 extends class267 {

    @ObfuscatedName("kt.aw")
    public int field2933;

    @ObfuscatedName("kt.ay")
    public int field2935;

    @ObfuscatedName("kt.ar")
    public int field2936;

    @ObfuscatedName("kt.am")
    public int field2934;

    @ObfuscatedName("kt.aw(Lty;B)V")
    public void method4959(class514 arg0) {
        int var2 = arg0.method8244();
        if (class273.field3023.field3024 != var2) {
            throw new IllegalStateException("");
        }
        this.field2992 = arg0.method8244();
        this.field2987 = arg0.method8244();
        this.field2986 = arg0.method8246();
        this.field2983 = arg0.method8246();
        this.field2933 = arg0.method8244();
        this.field2935 = arg0.method8244();
        this.field2984 = arg0.method8246();
        this.field2989 = arg0.method8246();
        this.field2936 = arg0.method8244();
        this.field2934 = arg0.method8244();
        this.field2988 = arg0.method8310();
        this.field2985 = arg0.method8310();
    }

    @ObfuscatedName("kt.ay(Lty;B)V")
    public void method4660(class514 arg0) {
        this.field2987 = Math.min(this.field2987, 4);
        this.field2990 = new short[1][64][64];
        this.field2991 = new short[this.field2987][64][64];
        this.field2982 = new byte[this.field2987][64][64];
        this.field2993 = new byte[this.field2987][64][64];
        this.field2994 = new class269[this.field2987][64][64][];
        int var2 = arg0.method8244();
        if (class272.field3018.field3019 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8244();
        int var4 = arg0.method8244();
        int var5 = arg0.method8244();
        int var6 = arg0.method8244();
        if (this.field2984 != var3 || this.field2989 != var4 || this.field2936 != var5 || this.field2934 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4990(this.field2936 * 8 + var7, this.field2934 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class261)) {
            return false;
        }
        class261 var2 = (class261) arg0;
        if (this.field2984 == var2.field2984 && this.field2989 == var2.field2989) {
            return this.field2936 == var2.field2936 && this.field2934 == var2.field2934;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2984 | this.field2989 << 8 | this.field2936 << 16 | this.field2934 << 24;
    }

    @ObfuscatedName("kt.aj(S)I")
    public int method4960() {
        return this.field2933;
    }

    @ObfuscatedName("kt.ag(I)I")
    public int method4961() {
        return this.field2935;
    }

    @ObfuscatedName("kt.az(B)I")
    public int method4962() {
        return this.field2936;
    }

    @ObfuscatedName("kt.av(I)I")
    public int method4967() {
        return this.field2934;
    }
}
