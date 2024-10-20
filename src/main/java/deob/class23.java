package deob;

@ObfuscatedName("x")
public class class23 extends class29 {

    @ObfuscatedName("x.p(Lfr;Lfr;B)V")
    public void method168(class174 arg0, class174 arg1) {
        int var3 = arg1.method2810();
        if (class37.field514.field519 != var3) {
            throw new IllegalStateException("");
        }
        this.field424 = arg1.method2810();
        this.field431 = arg1.method2810();
        this.field425 = arg1.method2824();
        this.field421 = arg1.method2824();
        this.field422 = arg1.method2824();
        this.field423 = arg1.method2824();
        this.field431 = Math.min(this.field431, 4);
        this.field426 = new short[1][64][64];
        this.field420 = new short[this.field431][64][64];
        this.field428 = new byte[this.field431][64][64];
        this.field429 = new byte[this.field431][64][64];
        this.field430 = new class32[this.field431][64][64][];
        int var4 = arg0.method2810();
        if (class36.field513.field506 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2810();
        int var6 = arg0.method2810();
        if (this.field422 != var5 || this.field423 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method217(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field422 == var2.field422 && this.field423 == var2.field423;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field422 | this.field423 << 8;
    }
}
