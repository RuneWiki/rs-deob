package deob;

@ObfuscatedName("x")
public class class23 extends class29 {

    @ObfuscatedName("x.e(Lfw;Lfw;B)V")
    public void method127(class174 arg0, class174 arg1) {
        int var3 = arg1.method2891();
        if (class37.field511.field507 != var3) {
            throw new IllegalStateException("");
        }
        this.field406 = arg1.method2891();
        this.field407 = arg1.method2891();
        this.field417 = arg1.method2930();
        this.field403 = arg1.method2930();
        this.field402 = arg1.method2930();
        this.field404 = arg1.method2930();
        this.field407 = Math.min(this.field407, 4);
        this.field408 = new short[1][64][64];
        this.field405 = new short[this.field407][64][64];
        this.field410 = new byte[this.field407][64][64];
        this.field411 = new byte[this.field407][64][64];
        this.field412 = new class32[this.field407][64][64][];
        int var4 = arg0.method2891();
        if (class36.field504.field499 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2891();
        int var6 = arg0.method2891();
        if (this.field402 != var5 || this.field404 != var6) {
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
            return this.field402 == var2.field402 && this.field404 == var2.field404;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field402 | this.field404 << 8;
    }
}
