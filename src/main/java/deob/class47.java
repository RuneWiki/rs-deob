package deob;

@ObfuscatedName("ae")
public class class47 extends class29 {

    @ObfuscatedName("ae.a")
    public int field581;

    @ObfuscatedName("ae.w")
    public int field576;

    @ObfuscatedName("ae.n")
    public int field577;

    @ObfuscatedName("ae.l")
    public int field578;

    @ObfuscatedName("ae.o(Lgc;Lgc;I)V")
    public void method589(class195 arg0, class195 arg1) {
        int var3 = arg1.method3205();
        if (class38.field499.field501 != var3) {
            throw new IllegalStateException("");
        }
        this.field411 = arg1.method3205();
        this.field412 = arg1.method3205();
        this.field407 = arg1.method3207();
        this.field408 = arg1.method3207();
        this.field581 = arg1.method3205();
        this.field576 = arg1.method3205();
        this.field421 = arg1.method3207();
        this.field410 = arg1.method3207();
        this.field577 = arg1.method3205();
        this.field578 = arg1.method3205();
        this.field412 = Math.min(this.field412, 4);
        this.field415 = new short[1][64][64];
        this.field414 = new short[this.field412][64][64];
        this.field409 = new byte[this.field412][64][64];
        this.field416 = new byte[this.field412][64][64];
        this.field413 = new class32[this.field412][64][64][];
        int var4 = arg0.method3205();
        if (class37.field494.field497 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3205();
        int var6 = arg0.method3205();
        int var7 = arg0.method3205();
        int var8 = arg0.method3205();
        if (this.field421 != var5 || this.field410 != var6 || this.field577 != var7 || this.field578 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method238(this.field577 * 8 + var9, this.field578 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ae.k(IIB)Z")
    public boolean method590(int arg0, int arg1) {
        if (arg0 < this.field577 * 8) {
            return false;
        } else if (arg1 < this.field578 * 8) {
            return false;
        } else if (arg0 >= this.field577 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field578 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class47)) {
            return false;
        }
        class47 var2 = (class47) arg0;
        if (this.field421 == var2.field421 && this.field410 == var2.field410) {
            return this.field577 == var2.field577 && this.field578 == var2.field578;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field421 | this.field410 << 8 | this.field577 << 16 | this.field578 << 24;
    }

    @ObfuscatedName("ae.t(I)I")
    public int method591() {
        return this.field581;
    }

    @ObfuscatedName("ae.d(I)I")
    public int method592() {
        return this.field576;
    }

    @ObfuscatedName("ae.ah(I)I")
    public int method593() {
        return this.field577;
    }

    @ObfuscatedName("ae.af(B)I")
    public int method594() {
        return this.field578;
    }
}
