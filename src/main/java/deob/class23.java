package deob;

@ObfuscatedName("m")
public class class23 extends class29 {

    @ObfuscatedName("m.g(Lgg;Lgg;I)V")
    public void method159(class195 arg0, class195 arg1) {
        int var3 = arg1.method3332();
        if (class38.field499.field500 != var3) {
            throw new IllegalStateException("");
        }
        this.field403 = arg1.method3332();
        this.field404 = arg1.method3332();
        this.field406 = arg1.method3310();
        this.field400 = arg1.method3310();
        this.field411 = arg1.method3310();
        this.field399 = arg1.method3310();
        this.field404 = Math.min(this.field404, 4);
        this.field405 = new short[1][64][64];
        this.field401 = new short[this.field404][64][64];
        this.field407 = new byte[this.field404][64][64];
        this.field408 = new byte[this.field404][64][64];
        this.field409 = new class32[this.field404][64][64][];
        int var4 = arg0.method3332();
        if (class37.field491.field492 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3332();
        int var6 = arg0.method3332();
        if (this.field411 != var5 || this.field399 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method208(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field411 == var2.field411 && this.field399 == var2.field399;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field399 << 8;
    }
}
