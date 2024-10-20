package deob;

@ObfuscatedName("j")
public class class23 extends class29 {

    @ObfuscatedName("j.s(Lgy;Lgy;I)V")
    public void method159(class185 arg0, class185 arg1) {
        int var3 = arg1.method3239();
        if (class37.field481.field479 != var3) {
            throw new IllegalStateException("");
        }
        this.field392 = arg1.method3239();
        this.field394 = arg1.method3239();
        this.field399 = arg1.method3241();
        this.field390 = arg1.method3241();
        this.field391 = arg1.method3241();
        this.field395 = arg1.method3241();
        this.field394 = Math.min(this.field394, 4);
        this.field389 = new short[1][64][64];
        this.field396 = new short[this.field394][64][64];
        this.field397 = new byte[this.field394][64][64];
        this.field398 = new byte[this.field394][64][64];
        this.field393 = new class32[this.field394][64][64][];
        int var4 = arg0.method3239();
        if (class36.field478.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3239();
        int var6 = arg0.method3239();
        if (this.field391 != var5 || this.field395 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method207(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field391 == var2.field391 && this.field395 == var2.field395;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field391 | this.field395 << 8;
    }
}
