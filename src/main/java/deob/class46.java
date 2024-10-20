package deob;

@ObfuscatedName("al")
public class class46 extends class29 {

    @ObfuscatedName("al.o")
    public int field623;

    @ObfuscatedName("al.z")
    public int field614;

    @ObfuscatedName("al.l")
    public int field615;

    @ObfuscatedName("al.c")
    public int field616;

    @ObfuscatedName("al.i(Lfp;Lfp;B)V")
    public void method570(class174 arg0, class174 arg1) {
        int var3 = arg1.method3061();
        if (class37.field517.field526 != var3) {
            throw new IllegalStateException("");
        }
        this.field413 = arg1.method3061();
        this.field414 = arg1.method3061();
        this.field421 = arg1.method2882();
        this.field410 = arg1.method2882();
        this.field623 = arg1.method3061();
        this.field614 = arg1.method3061();
        this.field411 = arg1.method2882();
        this.field412 = arg1.method2882();
        this.field615 = arg1.method3061();
        this.field616 = arg1.method3061();
        this.field414 = Math.min(this.field414, 4);
        this.field415 = new short[1][64][64];
        this.field422 = new short[this.field414][64][64];
        this.field409 = new byte[this.field414][64][64];
        this.field420 = new byte[this.field414][64][64];
        this.field419 = new class32[this.field414][64][64][];
        int var4 = arg0.method3061();
        if (class36.field508.field507 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3061();
        int var6 = arg0.method3061();
        int var7 = arg0.method3061();
        int var8 = arg0.method3061();
        if (this.field411 != var5 || this.field412 != var6 || this.field615 != var7 || this.field616 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method215(this.field615 * 8 + var9, this.field616 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("al.w(III)Z")
    public boolean method582(int arg0, int arg1) {
        if (arg0 < this.field615 * 8) {
            return false;
        } else if (arg1 < this.field616 * 8) {
            return false;
        } else if (arg0 >= this.field615 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field616 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field411 == var2.field411 && this.field412 == var2.field412) {
            return this.field615 == var2.field615 && this.field616 == var2.field616;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field412 << 8 | this.field615 << 16 | this.field616 << 24;
    }

    @ObfuscatedName("al.a(I)I")
    public int method571() {
        return this.field623;
    }

    @ObfuscatedName("al.t(I)I")
    public int method572() {
        return this.field614;
    }

    @ObfuscatedName("al.s(I)I")
    public int method573() {
        return this.field615;
    }

    @ObfuscatedName("al.r(B)I")
    public int method574() {
        return this.field616;
    }
}
