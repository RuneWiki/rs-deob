package deob;

@ObfuscatedName("h")
public class class23 extends class29 {

    @ObfuscatedName("h.i(Lfp;Lfp;B)V")
    public void method175(class175 arg0, class175 arg1) {
        int var3 = arg1.method2999();
        if (class37.field522.field514 != var3) {
            throw new IllegalStateException("");
        }
        this.field423 = arg1.method2999();
        this.field420 = arg1.method2999();
        this.field416 = arg1.method2995();
        this.field417 = arg1.method2995();
        this.field415 = arg1.method2995();
        this.field418 = arg1.method2995();
        this.field420 = Math.min(this.field420, 4);
        this.field421 = new short[1][64][64];
        this.field419 = new short[this.field420][64][64];
        this.field422 = new byte[this.field420][64][64];
        this.field424 = new byte[this.field420][64][64];
        this.field425 = new class32[this.field420][64][64][];
        int var4 = arg0.method2999();
        if (class36.field511.field513 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2999();
        int var6 = arg0.method2999();
        if (this.field415 != var5 || this.field418 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method252(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field415 == var2.field415 && this.field418 == var2.field418;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field415 | this.field418 << 8;
    }
}
