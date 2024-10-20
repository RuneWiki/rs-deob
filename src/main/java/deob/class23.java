package deob;

@ObfuscatedName("x")
public class class23 extends class29 {

    @ObfuscatedName("x.e(Lfh;Lfh;B)V")
    public void method155(class175 arg0, class175 arg1) {
        int var3 = arg1.method2928();
        if (class37.field509.field508 != var3) {
            throw new IllegalStateException("");
        }
        this.field403 = arg1.method2928();
        this.field408 = arg1.method2928();
        this.field412 = arg1.method3091();
        this.field410 = arg1.method3091();
        this.field405 = arg1.method3091();
        this.field406 = arg1.method3091();
        this.field408 = Math.min(this.field408, 4);
        this.field409 = new short[1][64][64];
        this.field404 = new short[this.field408][64][64];
        this.field411 = new byte[this.field408][64][64];
        this.field414 = new byte[this.field408][64][64];
        this.field413 = new class32[this.field408][64][64][];
        int var4 = arg0.method2928();
        if (class36.field501.field500 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2928();
        int var6 = arg0.method2928();
        if (this.field405 != var5 || this.field406 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method216(var7, var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class23)) {
            class23 var2 = (class23) arg0;
            return this.field405 == var2.field405 && this.field406 == var2.field406;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field405 | this.field406 << 8;
    }
}
