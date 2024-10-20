package deob;

@ObfuscatedName("it")
public class class245 extends class251 {

    @ObfuscatedName("it.f")
    public int field2896;

    @ObfuscatedName("it.w")
    public int field2895;

    @ObfuscatedName("it.v")
    public int field2894;

    @ObfuscatedName("it.s")
    public int field2897;

    @ObfuscatedName("it.f(Lrd;B)V")
    public void method4832(class474 arg0) {
        int var2 = arg0.method7964();
        if (class257.field2994.field2992 != var2) {
            throw new IllegalStateException("");
        }
        this.field2948 = arg0.method7964();
        this.field2949 = arg0.method7964();
        this.field2955 = arg0.method8032();
        this.field2945 = arg0.method8032();
        this.field2896 = arg0.method7964();
        this.field2895 = arg0.method7964();
        this.field2946 = arg0.method8032();
        this.field2947 = arg0.method8032();
        this.field2894 = arg0.method7964();
        this.field2897 = arg0.method7964();
        this.field2950 = arg0.method8029();
        this.field2951 = arg0.method8029();
    }

    @ObfuscatedName("it.w(Lrd;B)V")
    public void method4506(class474 arg0) {
        this.field2949 = Math.min(this.field2949, 4);
        this.field2944 = new short[1][64][64];
        this.field2954 = new short[this.field2949][64][64];
        this.field2961 = new byte[this.field2949][64][64];
        this.field2957 = new byte[this.field2949][64][64];
        this.field2956 = new class253[this.field2949][64][64][];
        int var2 = arg0.method7964();
        if (class256.field2990.field2989 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7964();
        int var4 = arg0.method7964();
        int var5 = arg0.method7964();
        int var6 = arg0.method7964();
        if (this.field2946 != var3 || this.field2947 != var4 || this.field2894 != var5 || this.field2897 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4876(this.field2894 * 8 + var7, this.field2897 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class245)) {
            return false;
        }
        class245 var2 = (class245) arg0;
        if (this.field2946 == var2.field2946 && this.field2947 == var2.field2947) {
            return this.field2894 == var2.field2894 && this.field2897 == var2.field2897;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2946 | this.field2947 << 8 | this.field2894 << 16 | this.field2897 << 24;
    }

    @ObfuscatedName("it.v(I)I")
    public int method4835() {
        return this.field2896;
    }

    @ObfuscatedName("it.s(B)I")
    public int method4841() {
        return this.field2895;
    }

    @ObfuscatedName("it.z(B)I")
    public int method4837() {
        return this.field2894;
    }

    @ObfuscatedName("it.j(B)I")
    public int method4838() {
        return this.field2897;
    }
}
