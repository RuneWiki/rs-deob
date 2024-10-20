package deob;

@ObfuscatedName("kv")
public class class281 extends class295 {

    @ObfuscatedName("kv.ac(Lvf;I)V")
    public void method5224(class551 arg0) {
        int var2 = arg0.method8955();
        if (class301.field3234.field3236 != var2) {
            throw new IllegalStateException("");
        }
        this.field3194 = arg0.method8955();
        this.field3195 = arg0.method8955();
        this.field3200 = arg0.method9119();
        this.field3191 = arg0.method9119();
        this.field3190 = arg0.method9119();
        this.field3193 = arg0.method9119();
        this.field3196 = arg0.method9205();
        this.field3197 = arg0.method9205();
    }

    @ObfuscatedName("kv.ae(Lvf;I)V")
    public void method5225(class551 arg0) {
        this.field3195 = Math.min(this.field3195, 4);
        this.field3192 = new short[1][64][64];
        this.field3199 = new short[this.field3195][64][64];
        this.field3198 = new byte[this.field3195][64][64];
        this.field3201 = new byte[this.field3195][64][64];
        this.field3202 = new class297[this.field3195][64][64][];
        int var2 = arg0.method8955();
        if (class300.field3233.field3229 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8955();
        int var4 = arg0.method8955();
        if (this.field3190 != var3 || this.field3193 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5572(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class281)) {
            class281 var2 = (class281) arg0;
            return this.field3190 == var2.field3190 && this.field3193 == var2.field3193;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3190 | this.field3193 << 8;
    }
}
