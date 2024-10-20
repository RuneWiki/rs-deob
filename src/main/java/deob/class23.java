package deob;

@ObfuscatedName("g")
public class class23 extends class29 {

    @ObfuscatedName("g.n(Lgv;Lgv;B)V")
    public void method148(class185 arg0, class185 arg1) {
        int var3 = arg1.method3021();
        if (class37.field485.field486 != var3) {
            throw new IllegalStateException("");
        }
        this.field390 = arg1.method3021();
        this.field394 = arg1.method3021();
        this.field391 = arg1.method3015();
        this.field389 = arg1.method3015();
        this.field393 = arg1.method3015();
        this.field392 = arg1.method3015();
        this.field394 = Math.min(this.field394, 4);
        this.field395 = new short[1][64][64];
        this.field396 = new short[this.field394][64][64];
        this.field397 = new byte[this.field394][64][64];
        this.field398 = new byte[this.field394][64][64];
        this.field399 = new class32[this.field394][64][64][];
        int var4 = arg0.method3021();
        if (class36.field473.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3021();
        int var6 = arg0.method3021();
        if (this.field393 != var5 || this.field392 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method202(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field393 == var2.field393 && this.field392 == var2.field392;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field393 | this.field392 << 8;
    }
}
