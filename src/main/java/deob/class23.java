package deob;

@ObfuscatedName("d")
public class class23 extends class29 {

    @ObfuscatedName("d.m(Lfv;Lfv;I)V")
    public void method168(class181 arg0, class181 arg1) {
        int var3 = arg1.method3012();
        if (class37.field480.field482 != var3) {
            throw new IllegalStateException("");
        }
        this.field396 = arg1.method3012();
        this.field392 = arg1.method3012();
        this.field400 = arg1.method3009();
        this.field393 = arg1.method3009();
        this.field394 = arg1.method3009();
        this.field395 = arg1.method3009();
        this.field392 = Math.min(this.field392, 4);
        this.field397 = new short[1][64][64];
        this.field398 = new short[this.field392][64][64];
        this.field399 = new byte[this.field392][64][64];
        this.field401 = new byte[this.field392][64][64];
        this.field402 = new class32[this.field392][64][64][];
        int var4 = arg0.method3012();
        if (class36.field473.field469 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3012();
        int var6 = arg0.method3012();
        if (this.field394 != var5 || this.field395 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method229(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field394 == var2.field394 && this.field395 == var2.field395;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field394 | this.field395 << 8;
    }
}
