package deob;

@ObfuscatedName("h")
public class class23 extends class29 {

    @ObfuscatedName("h.a(Lgh;Lgh;I)V")
    public void method150(class185 arg0, class185 arg1) {
        int var3 = arg1.method2962();
        if (class37.field477.field473 != var3) {
            throw new IllegalStateException("");
        }
        this.field378 = arg1.method2962();
        this.field379 = arg1.method2962();
        this.field384 = arg1.method3194();
        this.field375 = arg1.method3194();
        this.field381 = arg1.method3194();
        this.field377 = arg1.method3194();
        this.field379 = Math.min(this.field379, 4);
        this.field380 = new short[1][64][64];
        this.field376 = new short[this.field379][64][64];
        this.field382 = new byte[this.field379][64][64];
        this.field383 = new byte[this.field379][64][64];
        this.field385 = new class32[this.field379][64][64][];
        int var4 = arg0.method2962();
        if (class36.field463.field464 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2962();
        int var6 = arg0.method2962();
        if (this.field381 != var5 || this.field377 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method226(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field381 == var2.field381 && this.field377 == var2.field377;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field381 | this.field377 << 8;
    }
}
