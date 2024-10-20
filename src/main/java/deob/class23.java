package deob;

@ObfuscatedName("d")
public class class23 extends class29 {

    @ObfuscatedName("d.i(Lfp;Lfp;B)V")
    public void method148(class174 arg0, class174 arg1) {
        int var3 = arg1.method3061();
        if (class37.field527.field526 != var3) {
            throw new IllegalStateException("");
        }
        this.field413 = arg1.method3061();
        this.field414 = arg1.method3061();
        this.field421 = arg1.method2882();
        this.field410 = arg1.method2882();
        this.field411 = arg1.method2882();
        this.field412 = arg1.method2882();
        this.field414 = Math.min(this.field414, 4);
        this.field415 = new short[1][64][64];
        this.field422 = new short[this.field414][64][64];
        this.field409 = new byte[this.field414][64][64];
        this.field420 = new byte[this.field414][64][64];
        this.field419 = new class32[this.field414][64][64][];
        int var4 = arg0.method3061();
        if (class36.field512.field507 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3061();
        int var6 = arg0.method3061();
        if (this.field411 != var5 || this.field412 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method215(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field411 == var2.field411 && this.field412 == var2.field412;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field412 << 8;
    }
}
