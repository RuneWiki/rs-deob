package deob;

@ObfuscatedName("q")
public class class23 extends class29 {

    @ObfuscatedName("q.n(Lfl;Lfl;B)V")
    public void method165(class174 arg0, class174 arg1) {
        int var3 = arg1.method2925();
        if (class37.field509.field512 != var3) {
            throw new IllegalStateException("");
        }
        this.field414 = arg1.method2925();
        this.field415 = arg1.method2925();
        this.field412 = arg1.method3065();
        this.field411 = arg1.method3065();
        this.field419 = arg1.method3065();
        this.field413 = arg1.method3065();
        this.field415 = Math.min(this.field415, 4);
        this.field410 = new short[1][64][64];
        this.field417 = new short[this.field415][64][64];
        this.field418 = new byte[this.field415][64][64];
        this.field421 = new byte[this.field415][64][64];
        this.field420 = new class32[this.field415][64][64][];
        int var4 = arg0.method2925();
        if (class36.field505.field506 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2925();
        int var6 = arg0.method2925();
        if (this.field419 != var5 || this.field413 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method222(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field419 == var2.field419 && this.field413 == var2.field413;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field419 | this.field413 << 8;
    }
}
