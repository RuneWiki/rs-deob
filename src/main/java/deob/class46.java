package deob;

@ObfuscatedName("az")
public class class46 extends class29 {

    @ObfuscatedName("az.q")
    public int field598;

    @ObfuscatedName("az.n")
    public int field593;

    @ObfuscatedName("az.a")
    public int field594;

    @ObfuscatedName("az.g")
    public int field595;

    @ObfuscatedName("az.p(Lfr;Lfr;I)V")
    public void method554(class174 arg0, class174 arg1) {
        int var3 = arg1.method2810();
        if (class37.field515.field519 != var3) {
            throw new IllegalStateException("");
        }
        this.field424 = arg1.method2810();
        this.field431 = arg1.method2810();
        this.field425 = arg1.method2824();
        this.field421 = arg1.method2824();
        this.field598 = arg1.method2810();
        this.field593 = arg1.method2810();
        this.field422 = arg1.method2824();
        this.field423 = arg1.method2824();
        this.field594 = arg1.method2810();
        this.field595 = arg1.method2810();
        this.field431 = Math.min(this.field431, 4);
        this.field426 = new short[1][64][64];
        this.field420 = new short[this.field431][64][64];
        this.field428 = new byte[this.field431][64][64];
        this.field429 = new byte[this.field431][64][64];
        this.field430 = new class32[this.field431][64][64][];
        int var4 = arg0.method2810();
        if (class36.field505.field506 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2810();
        int var6 = arg0.method2810();
        int var7 = arg0.method2810();
        int var8 = arg0.method2810();
        if (this.field422 != var5 || this.field423 != var6 || this.field594 != var7 || this.field595 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method217(this.field594 * 8 + var9, this.field595 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("az.m(IIS)Z")
    public boolean method555(int arg0, int arg1) {
        if (arg0 < this.field594 * 8) {
            return false;
        } else if (arg1 < this.field595 * 8) {
            return false;
        } else if (arg0 >= this.field594 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field595 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field422 == var2.field422 && this.field423 == var2.field423) {
            return this.field594 == var2.field594 && this.field595 == var2.field595;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field422 | this.field423 << 8 | this.field594 << 16 | this.field595 << 24;
    }

    @ObfuscatedName("az.e(B)I")
    public int method556() {
        return this.field598;
    }

    @ObfuscatedName("az.t(B)I")
    public int method557() {
        return this.field593;
    }

    @ObfuscatedName("az.w(B)I")
    public int method560() {
        return this.field594;
    }

    @ObfuscatedName("az.z(I)I")
    public int method558() {
        return this.field595;
    }
}
