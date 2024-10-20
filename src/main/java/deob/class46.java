package deob;

@ObfuscatedName("ab")
public class class46 extends class29 {

    @ObfuscatedName("ab.o")
    public int field586;

    @ObfuscatedName("ab.l")
    public int field584;

    @ObfuscatedName("ab.h")
    public int field585;

    @ObfuscatedName("ab.s")
    public int field583;

    @ObfuscatedName("ab.e(Lfh;Lfh;B)V")
    public void method553(class175 arg0, class175 arg1) {
        int var3 = arg1.method2928();
        if (class37.field507.field508 != var3) {
            throw new IllegalStateException("");
        }
        this.field403 = arg1.method2928();
        this.field408 = arg1.method2928();
        this.field412 = arg1.method3091();
        this.field410 = arg1.method3091();
        this.field586 = arg1.method2928();
        this.field584 = arg1.method2928();
        this.field405 = arg1.method3091();
        this.field406 = arg1.method3091();
        this.field585 = arg1.method2928();
        this.field583 = arg1.method2928();
        this.field408 = Math.min(this.field408, 4);
        this.field409 = new short[1][64][64];
        this.field404 = new short[this.field408][64][64];
        this.field411 = new byte[this.field408][64][64];
        this.field414 = new byte[this.field408][64][64];
        this.field413 = new class32[this.field408][64][64][];
        int var4 = arg0.method2928();
        if (class36.field498.field500 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2928();
        int var6 = arg0.method2928();
        int var7 = arg0.method2928();
        int var8 = arg0.method2928();
        if (this.field405 != var5 || this.field406 != var6 || this.field585 != var7 || this.field583 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method216(this.field585 * 8 + var9, this.field583 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ab.n(III)Z")
    public boolean method554(int arg0, int arg1) {
        if (arg0 < this.field585 * 8) {
            return false;
        } else if (arg1 < this.field583 * 8) {
            return false;
        } else if (arg0 >= this.field585 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field583 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field405 == var2.field405 && this.field406 == var2.field406) {
            return this.field585 == var2.field585 && this.field583 == var2.field583;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field405 | this.field406 << 8 | this.field585 << 16 | this.field583 << 24;
    }

    @ObfuscatedName("ab.ah(I)I")
    public int method581() {
        return this.field586;
    }

    @ObfuscatedName("ab.ao(B)I")
    public int method556() {
        return this.field584;
    }

    @ObfuscatedName("ab.al(B)I")
    public int method572() {
        return this.field585;
    }

    @ObfuscatedName("ab.ae(I)I")
    public int method558() {
        return this.field583;
    }
}
