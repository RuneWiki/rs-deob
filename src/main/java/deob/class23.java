package deob;

@ObfuscatedName("n")
public class class23 extends class29 {

    @ObfuscatedName("n.c(Lfp;Lfp;B)V")
    public void method158(class174 arg0, class174 arg1) {
        int var3 = arg1.method2843();
        if (class37.field492.field501 != var3) {
            throw new IllegalStateException("");
        }
        this.field397 = arg1.method2843();
        this.field406 = arg1.method2843();
        this.field404 = arg1.method2861();
        this.field394 = arg1.method2861();
        this.field395 = arg1.method2861();
        this.field393 = arg1.method2861();
        this.field406 = Math.min(this.field406, 4);
        this.field399 = new short[1][64][64];
        this.field400 = new short[this.field406][64][64];
        this.field401 = new byte[this.field406][64][64];
        this.field402 = new byte[this.field406][64][64];
        this.field398 = new class32[this.field406][64][64][];
        int var4 = arg0.method2843();
        if (class36.field485.field482 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2843();
        int var6 = arg0.method2843();
        if (this.field395 != var5 || this.field393 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method213(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field395 == var2.field395 && this.field393 == var2.field393;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field395 | this.field393 << 8;
    }
}
