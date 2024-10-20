package deob;

@ObfuscatedName("aw")
public class class46 extends class29 {

    @ObfuscatedName("aw.r")
    public int field586;

    @ObfuscatedName("aw.b")
    public int field581;

    @ObfuscatedName("aw.x")
    public int field582;

    @ObfuscatedName("aw.o")
    public int field583;

    @ObfuscatedName("aw.i(Lfv;Lfv;B)V")
    public void method581(class174 arg0, class174 arg1) {
        int var3 = arg1.method2930();
        if (class37.field499.field500 != var3) {
            throw new IllegalStateException("");
        }
        this.field411 = arg1.method2930();
        this.field409 = arg1.method2930();
        this.field410 = arg1.method2932();
        this.field405 = arg1.method2932();
        this.field586 = arg1.method2930();
        this.field581 = arg1.method2930();
        this.field408 = arg1.method2932();
        this.field407 = arg1.method2932();
        this.field582 = arg1.method2930();
        this.field583 = arg1.method2930();
        this.field409 = Math.min(this.field409, 4);
        this.field406 = new short[1][64][64];
        this.field404 = new short[this.field409][64][64];
        this.field412 = new byte[this.field409][64][64];
        this.field413 = new byte[this.field409][64][64];
        this.field414 = new class32[this.field409][64][64][];
        int var4 = arg0.method2930();
        if (class36.field491.field490 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2930();
        int var6 = arg0.method2930();
        int var7 = arg0.method2930();
        int var8 = arg0.method2930();
        if (this.field408 != var5 || this.field407 != var6 || this.field582 != var7 || this.field583 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method208(this.field582 * 8 + var9, this.field583 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aw.h(III)Z")
    public boolean method602(int arg0, int arg1) {
        if (arg0 < this.field582 * 8) {
            return false;
        } else if (arg1 < this.field583 * 8) {
            return false;
        } else if (arg0 >= this.field582 * 8 + 8) {
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
        if (this.field408 == var2.field408 && this.field407 == var2.field407) {
            return this.field582 == var2.field582 && this.field583 == var2.field583;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field408 | this.field407 << 8 | this.field582 << 16 | this.field583 << 24;
    }

    @ObfuscatedName("aw.u(B)I")
    public int method583() {
        return this.field586;
    }

    @ObfuscatedName("aw.ah(I)I")
    public int method584() {
        return this.field581;
    }

    @ObfuscatedName("aw.az(I)I")
    public int method585() {
        return this.field582;
    }

    @ObfuscatedName("aw.ac(I)I")
    public int method586() {
        return this.field583;
    }
}
