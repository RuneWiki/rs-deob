package deob;

@ObfuscatedName("p")
public class class23 extends class29 {

    @ObfuscatedName("p.i(Lfx;Lfx;I)V")
    public void method135(class174 arg0, class174 arg1) {
        int var3 = arg1.method2870();
        if (class37.field502.field510 != var3) {
            throw new IllegalStateException("");
        }
        this.field411 = arg1.method2870();
        this.field412 = arg1.method2870();
        this.field410 = arg1.method2872();
        this.field418 = arg1.method2872();
        this.field409 = arg1.method2872();
        this.field416 = arg1.method2872();
        this.field412 = Math.min(this.field412, 4);
        this.field413 = new short[1][64][64];
        this.field414 = new short[this.field412][64][64];
        this.field408 = new byte[this.field412][64][64];
        this.field407 = new byte[this.field412][64][64];
        this.field417 = new class32[this.field412][64][64][];
        int var4 = arg0.method2870();
        if (class36.field496.field498 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2870();
        int var6 = arg0.method2870();
        if (this.field409 != var5 || this.field416 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method218(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field409 == var2.field409 && this.field416 == var2.field416;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field409 | this.field416 << 8;
    }
}
