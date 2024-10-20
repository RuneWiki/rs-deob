package deob;

@ObfuscatedName("ih")
public class class237 extends class251 {

    @ObfuscatedName("ih.f(Lrd;I)V")
    public void method4501(class474 arg0) {
        int var2 = arg0.method7964();
        if (class257.field2993.field2992 != var2) {
            throw new IllegalStateException("");
        }
        this.field2948 = arg0.method7964();
        this.field2949 = arg0.method7964();
        this.field2955 = arg0.method8032();
        this.field2945 = arg0.method8032();
        this.field2946 = arg0.method8032();
        this.field2947 = arg0.method8032();
        this.field2950 = arg0.method8029();
        this.field2951 = arg0.method8029();
    }

    @ObfuscatedName("ih.w(Lrd;B)V")
    public void method4506(class474 arg0) {
        this.field2949 = Math.min(this.field2949, 4);
        this.field2944 = new short[1][64][64];
        this.field2954 = new short[this.field2949][64][64];
        this.field2961 = new byte[this.field2949][64][64];
        this.field2957 = new byte[this.field2949][64][64];
        this.field2956 = new class253[this.field2949][64][64][];
        int var2 = arg0.method7964();
        if (class256.field2991.field2989 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method7964();
        int var4 = arg0.method7964();
        if (this.field2946 != var3 || this.field2947 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4876(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class237)) {
            class237 var2 = (class237) arg0;
            return this.field2946 == var2.field2946 && this.field2947 == var2.field2947;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2946 | this.field2947 << 8;
    }
}
