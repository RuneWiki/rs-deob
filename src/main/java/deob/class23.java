package deob;

@ObfuscatedName("z")
public class class23 extends class29 {

    @ObfuscatedName("z.b(Lfs;Lfs;B)V")
    public void method146(class181 arg0, class181 arg1) {
        int var3 = arg1.method2945();
        if (class37.field473.field465 != var3) {
            throw new IllegalStateException("");
        }
        this.field389 = arg1.method2945();
        this.field381 = arg1.method2945();
        this.field387 = arg1.method3081();
        this.field377 = arg1.method3081();
        this.field386 = arg1.method3081();
        this.field379 = arg1.method3081();
        this.field381 = Math.min(this.field381, 4);
        this.field378 = new short[1][64][64];
        this.field383 = new short[this.field381][64][64];
        this.field384 = new byte[this.field381][64][64];
        this.field380 = new byte[this.field381][64][64];
        this.field385 = new class32[this.field381][64][64][];
        int var4 = arg0.method2945();
        if (class36.field463.field459 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2945();
        int var6 = arg0.method2945();
        if (this.field386 != var5 || this.field379 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method206(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field386 == var2.field386 && this.field379 == var2.field379;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field386 | this.field379 << 8;
    }
}
