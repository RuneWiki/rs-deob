package deob;

@ObfuscatedName("w")
public class class23 extends class29 {

    @ObfuscatedName("w.i(Lfv;Lfv;B)V")
    public void method152(class174 arg0, class174 arg1) {
        int var3 = arg1.method2930();
        if (class37.field498.field500 != var3) {
            throw new IllegalStateException("");
        }
        this.field411 = arg1.method2930();
        this.field409 = arg1.method2930();
        this.field410 = arg1.method2932();
        this.field405 = arg1.method2932();
        this.field408 = arg1.method2932();
        this.field407 = arg1.method2932();
        this.field409 = Math.min(this.field409, 4);
        this.field406 = new short[1][64][64];
        this.field404 = new short[this.field409][64][64];
        this.field412 = new byte[this.field409][64][64];
        this.field413 = new byte[this.field409][64][64];
        this.field414 = new class32[this.field409][64][64][];
        int var4 = arg0.method2930();
        if (class36.field492.field490 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2930();
        int var6 = arg0.method2930();
        if (this.field408 != var5 || this.field407 != var6) {
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
            return this.field408 == var2.field408 && this.field407 == var2.field407;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field408 | this.field407 << 8;
    }
}
