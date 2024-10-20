package deob;

@ObfuscatedName("ks")
public class class279 extends class293 {

    @ObfuscatedName("ks.ab(Lvg;I)V")
    public void method5081(class549 arg0) {
        int var2 = arg0.method9025();
        if (class299.field3193.field3194 != var2) {
            throw new IllegalStateException("");
        }
        this.field3162 = arg0.method9025();
        this.field3154 = arg0.method9025();
        this.field3157 = arg0.method8968();
        this.field3150 = arg0.method8968();
        this.field3163 = arg0.method8968();
        this.field3164 = arg0.method8968();
        this.field3155 = arg0.method8863();
        this.field3151 = arg0.method8863();
    }

    @ObfuscatedName("ks.ay(Lvg;I)V")
    public void method5082(class549 arg0) {
        this.field3154 = Math.min(this.field3154, 4);
        this.field3152 = new short[1][64][64];
        this.field3158 = new short[this.field3154][64][64];
        this.field3159 = new byte[this.field3154][64][64];
        this.field3160 = new byte[this.field3154][64][64];
        this.field3161 = new class295[this.field3154][64][64][];
        int var2 = arg0.method9025();
        if (class298.field3188.field3190 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method9025();
        int var4 = arg0.method9025();
        if (this.field3163 != var3 || this.field3164 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5431(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class279)) {
            class279 var2 = (class279) arg0;
            return this.field3163 == var2.field3163 && this.field3164 == var2.field3164;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3163 | this.field3164 << 8;
    }
}
