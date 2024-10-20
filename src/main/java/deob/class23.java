package deob;

@ObfuscatedName("e")
public class class23 extends class29 {

    @ObfuscatedName("e.b(Lgn;Lgn;I)V")
    public void method164(class194 arg0, class194 arg1) {
        int var3 = arg1.method3247();
        if (class37.field464.field470 != var3) {
            throw new IllegalStateException("");
        }
        this.field385 = arg1.method3247();
        this.field378 = arg1.method3247();
        this.field384 = arg1.method3249();
        this.field374 = arg1.method3249();
        this.field375 = arg1.method3249();
        this.field382 = arg1.method3249();
        this.field378 = Math.min(this.field378, 4);
        this.field379 = new short[1][64][64];
        this.field380 = new short[this.field378][64][64];
        this.field387 = new byte[this.field378][64][64];
        this.field381 = new byte[this.field378][64][64];
        this.field383 = new class32[this.field378][64][64][];
        int var4 = arg0.method3247();
        if (class36.field462.field456 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3247();
        int var6 = arg0.method3247();
        if (this.field375 != var5 || this.field382 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method225(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field375 == var2.field375 && this.field382 == var2.field382;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field375 | this.field382 << 8;
    }
}
