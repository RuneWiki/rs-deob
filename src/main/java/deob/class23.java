package deob;

@ObfuscatedName("x")
public class class23 extends class29 {

    @ObfuscatedName("x.s(Lfs;Lfs;I)V")
    public void method161(class177 arg0, class177 arg1) {
        int var3 = arg1.method2965();
        if (class37.field504.field503 != var3) {
            throw new IllegalStateException("");
        }
        this.field413 = arg1.method2965();
        this.field416 = arg1.method2965();
        this.field409 = arg1.method2967();
        this.field410 = arg1.method2967();
        this.field411 = arg1.method2967();
        this.field412 = arg1.method2967();
        this.field416 = Math.min(this.field416, 4);
        this.field415 = new short[1][64][64];
        this.field420 = new short[this.field416][64][64];
        this.field417 = new byte[this.field416][64][64];
        this.field414 = new byte[this.field416][64][64];
        this.field419 = new class32[this.field416][64][64][];
        int var4 = arg0.method2965();
        if (class36.field500.field497 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2965();
        int var6 = arg0.method2965();
        if (this.field411 != var5 || this.field412 != var6) {
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
            return this.field411 == var2.field411 && this.field412 == var2.field412;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field412 << 8;
    }
}
