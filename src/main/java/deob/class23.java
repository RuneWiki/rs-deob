package deob;

@ObfuscatedName("r")
public class class23 extends class29 {

    @ObfuscatedName("r.w(Lfz;Lfz;B)V")
    public void method156(class174 arg0, class174 arg1) {
        int var3 = arg1.method2971();
        if (class37.field522.field516 != var3) {
            throw new IllegalStateException("");
        }
        this.field420 = arg1.method2971();
        this.field416 = arg1.method2971();
        this.field424 = arg1.method3178();
        this.field417 = arg1.method3178();
        this.field421 = arg1.method3178();
        this.field419 = arg1.method3178();
        this.field416 = Math.min(this.field416, 4);
        this.field422 = new short[1][64][64];
        this.field418 = new short[this.field416][64][64];
        this.field423 = new byte[this.field416][64][64];
        this.field425 = new byte[this.field416][64][64];
        this.field426 = new class32[this.field416][64][64][];
        int var4 = arg0.method2971();
        if (class36.field512.field508 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2971();
        int var6 = arg0.method2971();
        if (this.field421 != var5 || this.field419 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method224(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field421 == var2.field421 && this.field419 == var2.field419;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field421 | this.field419 << 8;
    }
}
