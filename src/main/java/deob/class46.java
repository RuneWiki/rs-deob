package deob;

@ObfuscatedName("ak")
public class class46 extends class29 {

    @ObfuscatedName("ak.n")
    public int field605;

    @ObfuscatedName("ak.u")
    public int field604;

    @ObfuscatedName("ak.t")
    public int field603;

    @ObfuscatedName("ak.a")
    public int field606;

    @ObfuscatedName("ak.w(Lfz;Lfz;I)V")
    public void method557(class174 arg0, class174 arg1) {
        int var3 = arg1.method2971();
        if (class37.field517.field516 != var3) {
            throw new IllegalStateException("");
        }
        this.field420 = arg1.method2971();
        this.field416 = arg1.method2971();
        this.field424 = arg1.method3178();
        this.field417 = arg1.method3178();
        this.field605 = arg1.method2971();
        this.field604 = arg1.method2971();
        this.field421 = arg1.method3178();
        this.field419 = arg1.method3178();
        this.field603 = arg1.method2971();
        this.field606 = arg1.method2971();
        this.field416 = Math.min(this.field416, 4);
        this.field422 = new short[1][64][64];
        this.field418 = new short[this.field416][64][64];
        this.field423 = new byte[this.field416][64][64];
        this.field425 = new byte[this.field416][64][64];
        this.field426 = new class32[this.field416][64][64][];
        int var4 = arg0.method2971();
        if (class36.field507.field508 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2971();
        int var6 = arg0.method2971();
        int var7 = arg0.method2971();
        int var8 = arg0.method2971();
        if (this.field421 != var5 || this.field419 != var6 || this.field603 != var7 || this.field606 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method224(this.field603 * 8 + var9, this.field606 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ak.af(IIB)Z")
    public boolean method564(int arg0, int arg1) {
        if (arg0 < this.field603 * 8) {
            return false;
        } else if (arg1 < this.field606 * 8) {
            return false;
        } else if (arg0 >= this.field603 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field606 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field421 == var2.field421 && this.field419 == var2.field419) {
            return this.field603 == var2.field603 && this.field606 == var2.field606;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field421 | this.field419 << 8 | this.field603 << 16 | this.field606 << 24;
    }

    @ObfuscatedName("ak.aa(B)I")
    public int method559() {
        return this.field605;
    }

    @ObfuscatedName("ak.ay(I)I")
    public int method555() {
        return this.field604;
    }

    @ObfuscatedName("ak.aw(I)I")
    public int method580() {
        return this.field603;
    }

    @ObfuscatedName("ak.az(I)I")
    public int method562() {
        return this.field606;
    }
}
