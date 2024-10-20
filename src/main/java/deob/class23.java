package deob;

@ObfuscatedName("d")
public class class23 extends class29 {

    @ObfuscatedName("d.a(Lfe;Lfe;I)V")
    public void method152(class174 arg0, class174 arg1) {
        int var3 = arg1.method2871();
        if (class37.field490.field491 != var3) {
            throw new IllegalStateException("");
        }
        this.field408 = arg1.method2871();
        this.field405 = arg1.method2871();
        this.field404 = arg1.method2873();
        this.field401 = arg1.method2873();
        this.field402 = arg1.method2873();
        this.field400 = arg1.method2873();
        this.field405 = Math.min(this.field405, 4);
        this.field406 = new short[1][64][64];
        this.field411 = new short[this.field405][64][64];
        this.field407 = new byte[this.field405][64][64];
        this.field409 = new byte[this.field405][64][64];
        this.field410 = new class32[this.field405][64][64][];
        int var4 = arg0.method2871();
        if (class36.field488.field481 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2871();
        int var6 = arg0.method2871();
        if (this.field402 != var5 || this.field400 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method210(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field402 == var2.field402 && this.field400 == var2.field400;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field402 | this.field400 << 8;
    }
}
