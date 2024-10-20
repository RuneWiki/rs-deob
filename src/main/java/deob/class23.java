package deob;

@ObfuscatedName("g")
public class class23 extends class29 {

    @ObfuscatedName("g.p(Lgj;Lgj;I)V")
    public void method164(class185 arg0, class185 arg1) {
        int var3 = arg1.method3197();
        if (class37.field467.field468 != var3) {
            throw new IllegalStateException("");
        }
        this.field380 = arg1.method3197();
        this.field382 = arg1.method3197();
        this.field385 = arg1.method3124();
        this.field377 = arg1.method3124();
        this.field378 = arg1.method3124();
        this.field379 = arg1.method3124();
        this.field382 = Math.min(this.field382, 4);
        this.field381 = new short[1][64][64];
        this.field383 = new short[this.field382][64][64];
        this.field387 = new byte[this.field382][64][64];
        this.field384 = new byte[this.field382][64][64];
        this.field386 = new class32[this.field382][64][64][];
        int var4 = arg0.method3197();
        if (class36.field461.field463 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3197();
        int var6 = arg0.method3197();
        if (this.field378 != var5 || this.field379 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method239(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field378 == var2.field378 && this.field379 == var2.field379;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field378 | this.field379 << 8;
    }
}
