package deob;

@ObfuscatedName("ag")
public class class46 extends class29 {

    @ObfuscatedName("ag.o")
    public int field580;

    @ObfuscatedName("ag.x")
    public int field582;

    @ObfuscatedName("ag.a")
    public int field581;

    @ObfuscatedName("ag.y")
    public int field586;

    @ObfuscatedName("ag.n(Lfl;Lfl;I)V")
    public void method553(class174 arg0, class174 arg1) {
        int var3 = arg1.method2925();
        if (class37.field508.field512 != var3) {
            throw new IllegalStateException("");
        }
        this.field414 = arg1.method2925();
        this.field415 = arg1.method2925();
        this.field412 = arg1.method3065();
        this.field411 = arg1.method3065();
        this.field580 = arg1.method2925();
        this.field582 = arg1.method2925();
        this.field419 = arg1.method3065();
        this.field413 = arg1.method3065();
        this.field581 = arg1.method2925();
        this.field586 = arg1.method2925();
        this.field415 = Math.min(this.field415, 4);
        this.field410 = new short[1][64][64];
        this.field417 = new short[this.field415][64][64];
        this.field418 = new byte[this.field415][64][64];
        this.field421 = new byte[this.field415][64][64];
        this.field420 = new class32[this.field415][64][64][];
        int var4 = arg0.method2925();
        if (class36.field501.field506 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2925();
        int var6 = arg0.method2925();
        int var7 = arg0.method2925();
        int var8 = arg0.method2925();
        if (this.field419 != var5 || this.field413 != var6 || this.field581 != var7 || this.field586 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method222(this.field581 * 8 + var9, this.field586 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ag.p(IIB)Z")
    public boolean method557(int arg0, int arg1) {
        if (arg0 < this.field581 * 8) {
            return false;
        } else if (arg1 < this.field586 * 8) {
            return false;
        } else if (arg0 >= this.field581 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field586 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field419 == var2.field419 && this.field413 == var2.field413) {
            return this.field581 == var2.field581 && this.field586 == var2.field586;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field419 | this.field413 << 8 | this.field581 << 16 | this.field586 << 24;
    }

    @ObfuscatedName("ag.i(I)I")
    public int method550() {
        return this.field580;
    }

    @ObfuscatedName("ag.v(I)I")
    public int method554() {
        return this.field582;
    }

    @ObfuscatedName("ag.t(B)I")
    public int method555() {
        return this.field581;
    }

    @ObfuscatedName("ag.w(I)I")
    public int method556() {
        return this.field586;
    }
}
