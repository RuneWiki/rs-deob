package deob;

@ObfuscatedName("jn")
public class class253 extends class267 {

    @ObfuscatedName("jn.aw(Lty;I)V")
    public void method4663(class514 arg0) {
        int var2 = arg0.method8244();
        if (class273.field3025.field3024 != var2) {
            throw new IllegalStateException("");
        }
        this.field2992 = arg0.method8244();
        this.field2987 = arg0.method8244();
        this.field2986 = arg0.method8246();
        this.field2983 = arg0.method8246();
        this.field2984 = arg0.method8246();
        this.field2989 = arg0.method8246();
        this.field2988 = arg0.method8310();
        this.field2985 = arg0.method8310();
    }

    @ObfuscatedName("jn.ay(Lty;B)V")
    public void method4660(class514 arg0) {
        this.field2987 = Math.min(this.field2987, 4);
        this.field2990 = new short[1][64][64];
        this.field2991 = new short[this.field2987][64][64];
        this.field2982 = new byte[this.field2987][64][64];
        this.field2993 = new byte[this.field2987][64][64];
        this.field2994 = new class269[this.field2987][64][64][];
        int var2 = arg0.method8244();
        if (class272.field3022.field3019 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8244();
        int var4 = arg0.method8244();
        if (this.field2984 != var3 || this.field2989 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4990(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class253)) {
            class253 var2 = (class253) arg0;
            return this.field2984 == var2.field2984 && this.field2989 == var2.field2989;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2984 | this.field2989 << 8;
    }
}
