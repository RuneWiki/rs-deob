package deob;

@ObfuscatedName("at")
public class class46 extends class29 {

    @ObfuscatedName("at.q")
    public int field583;

    @ObfuscatedName("at.u")
    public int field577;

    @ObfuscatedName("at.k")
    public int field578;

    @ObfuscatedName("at.e")
    public int field580;

    @ObfuscatedName("at.s(Lfs;Lfs;I)V")
    public void method553(class177 arg0, class177 arg1) {
        int var3 = arg1.method2965();
        if (class37.field501.field503 != var3) {
            throw new IllegalStateException("");
        }
        this.field413 = arg1.method2965();
        this.field416 = arg1.method2965();
        this.field409 = arg1.method2967();
        this.field410 = arg1.method2967();
        this.field583 = arg1.method2965();
        this.field577 = arg1.method2965();
        this.field411 = arg1.method2967();
        this.field412 = arg1.method2967();
        this.field578 = arg1.method2965();
        this.field580 = arg1.method2965();
        this.field416 = Math.min(this.field416, 4);
        this.field415 = new short[1][64][64];
        this.field420 = new short[this.field416][64][64];
        this.field417 = new byte[this.field416][64][64];
        this.field414 = new byte[this.field416][64][64];
        this.field419 = new class32[this.field416][64][64][];
        int var4 = arg0.method2965();
        if (class36.field496.field497 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2965();
        int var6 = arg0.method2965();
        int var7 = arg0.method2965();
        int var8 = arg0.method2965();
        if (this.field411 != var5 || this.field412 != var6 || this.field578 != var7 || this.field580 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method222(this.field578 * 8 + var9, this.field580 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("at.c(IIB)Z")
    public boolean method554(int arg0, int arg1) {
        if (arg0 < this.field578 * 8) {
            return false;
        } else if (arg1 < this.field580 * 8) {
            return false;
        } else if (arg0 >= this.field578 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field580 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field411 == var2.field411 && this.field412 == var2.field412) {
            return this.field578 == var2.field578 && this.field580 == var2.field580;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field412 << 8 | this.field578 << 16 | this.field580 << 24;
    }

    @ObfuscatedName("at.f(I)I")
    public int method574() {
        return this.field583;
    }

    @ObfuscatedName("at.m(I)I")
    public int method557() {
        return this.field577;
    }

    @ObfuscatedName("at.am(I)I")
    public int method584() {
        return this.field578;
    }

    @ObfuscatedName("at.ab(I)I")
    public int method559() {
        return this.field580;
    }
}
