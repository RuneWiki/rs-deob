package deob;

@ObfuscatedName("au")
public class class46 extends class29 {

    @ObfuscatedName("au.o")
    public int field588;

    @ObfuscatedName("au.z")
    public int field589;

    @ObfuscatedName("au.q")
    public int field587;

    @ObfuscatedName("au.j")
    public int field590;

    @ObfuscatedName("au.i(Lfx;Lfx;I)V")
    public void method528(class174 arg0, class174 arg1) {
        int var3 = arg1.method2870();
        if (class37.field506.field510 != var3) {
            throw new IllegalStateException("");
        }
        this.field411 = arg1.method2870();
        this.field412 = arg1.method2870();
        this.field410 = arg1.method2872();
        this.field418 = arg1.method2872();
        this.field588 = arg1.method2870();
        this.field589 = arg1.method2870();
        this.field409 = arg1.method2872();
        this.field416 = arg1.method2872();
        this.field587 = arg1.method2870();
        this.field590 = arg1.method2870();
        this.field412 = Math.min(this.field412, 4);
        this.field413 = new short[1][64][64];
        this.field414 = new short[this.field412][64][64];
        this.field408 = new byte[this.field412][64][64];
        this.field407 = new byte[this.field412][64][64];
        this.field417 = new class32[this.field412][64][64][];
        int var4 = arg0.method2870();
        if (class36.field497.field498 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2870();
        int var6 = arg0.method2870();
        int var7 = arg0.method2870();
        int var8 = arg0.method2870();
        if (this.field409 != var5 || this.field416 != var6 || this.field587 != var7 || this.field590 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method218(this.field587 * 8 + var9, this.field590 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("au.c(III)Z")
    public boolean method544(int arg0, int arg1) {
        if (arg0 < this.field587 * 8) {
            return false;
        } else if (arg1 < this.field590 * 8) {
            return false;
        } else if (arg0 >= this.field587 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field590 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field409 == var2.field409 && this.field416 == var2.field416) {
            return this.field587 == var2.field587 && this.field590 == var2.field590;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field409 | this.field416 << 8 | this.field587 << 16 | this.field590 << 24;
    }

    @ObfuscatedName("au.e(I)I")
    public int method555() {
        return this.field588;
    }

    @ObfuscatedName("au.v(S)I")
    public int method533() {
        return this.field589;
    }

    @ObfuscatedName("au.b(S)I")
    public int method534() {
        return this.field587;
    }

    @ObfuscatedName("au.al(I)I")
    public int method535() {
        return this.field590;
    }
}
