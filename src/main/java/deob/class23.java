package deob;

@ObfuscatedName("a")
public class class23 extends class29 {

    @ObfuscatedName("a.d(Lfw;Lfw;I)V")
    public void method144(class174 arg0, class174 arg1) {
        int var3 = arg1.method2921();
        if (class37.field477.field479 != var3) {
            throw new IllegalStateException("");
        }
        this.field384 = arg1.method2921();
        this.field383 = arg1.method2921();
        this.field385 = arg1.method2916();
        this.field381 = arg1.method2916();
        this.field382 = arg1.method2916();
        this.field391 = arg1.method2916();
        this.field383 = Math.min(this.field383, 4);
        this.field386 = new short[1][64][64];
        this.field387 = new short[this.field383][64][64];
        this.field389 = new byte[this.field383][64][64];
        this.field388 = new byte[this.field383][64][64];
        this.field390 = new class32[this.field383][64][64][];
        int var4 = arg0.method2921();
        if (class36.field473.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2921();
        int var6 = arg0.method2921();
        if (this.field382 != var5 || this.field391 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method201(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field382 == var2.field382 && this.field391 == var2.field391;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field382 | this.field391 << 8;
    }
}
