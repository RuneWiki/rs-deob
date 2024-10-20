package deob;

@ObfuscatedName("lu")
public class class287 extends class293 {

    @ObfuscatedName("lu.ab")
    public int field3101;

    @ObfuscatedName("lu.ay")
    public int field3100;

    @ObfuscatedName("lu.an")
    public int field3102;

    @ObfuscatedName("lu.au")
    public int field3103;

    @ObfuscatedName("lu.ab(Lvg;B)V")
    public void method5387(class549 arg0) {
        int var2 = arg0.method9025();
        if (class299.field3192.field3194 != var2) {
            throw new IllegalStateException("");
        }
        this.field3162 = arg0.method9025();
        this.field3154 = arg0.method9025();
        this.field3157 = arg0.method8968();
        this.field3150 = arg0.method8968();
        this.field3101 = arg0.method9025();
        this.field3100 = arg0.method9025();
        this.field3163 = arg0.method8968();
        this.field3164 = arg0.method8968();
        this.field3102 = arg0.method9025();
        this.field3103 = arg0.method9025();
        this.field3155 = arg0.method8863();
        this.field3151 = arg0.method8863();
    }

    @ObfuscatedName("lu.ay(Lvg;I)V")
    public void method5082(class549 arg0) {
        this.field3154 = Math.min(this.field3154, 4);
        this.field3152 = new short[1][64][64];
        this.field3158 = new short[this.field3154][64][64];
        this.field3159 = new byte[this.field3154][64][64];
        this.field3160 = new byte[this.field3154][64][64];
        this.field3161 = new class295[this.field3154][64][64][];
        int var2 = arg0.method9025();
        if (class298.field3191.field3190 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method9025();
        int var4 = arg0.method9025();
        int var5 = arg0.method9025();
        int var6 = arg0.method9025();
        if (this.field3163 != var3 || this.field3164 != var4 || this.field3102 != var5 || this.field3103 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5431(this.field3102 * 8 + var7, this.field3103 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class287)) {
            return false;
        }
        class287 var2 = (class287) arg0;
        if (this.field3163 == var2.field3163 && this.field3164 == var2.field3164) {
            return this.field3102 == var2.field3102 && this.field3103 == var2.field3103;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3163 | this.field3164 << 8 | this.field3102 << 16 | this.field3103 << 24;
    }

    @ObfuscatedName("lu.an(B)I")
    public int method5390() {
        return this.field3101;
    }

    @ObfuscatedName("lu.ac(I)I")
    public int method5384() {
        return this.field3100;
    }

    @ObfuscatedName("lu.ae(I)I")
    public int method5388() {
        return this.field3102;
    }

    @ObfuscatedName("lu.ad(I)I")
    public int method5404() {
        return this.field3103;
    }
}
