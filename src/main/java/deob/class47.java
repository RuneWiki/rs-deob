package deob;

@ObfuscatedName("ab")
public class class47 extends class29 {

    @ObfuscatedName("ab.h")
    public int field586;

    @ObfuscatedName("ab.t")
    public int field584;

    @ObfuscatedName("ab.i")
    public int field585;

    @ObfuscatedName("ab.u")
    public int field583;

    @ObfuscatedName("ab.d(Lgy;Lgy;B)V")
    public void method561(class195 arg0, class195 arg1) {
        int var3 = arg1.method3330();
        if (class38.field506.field508 != var3) {
            throw new IllegalStateException("");
        }
        this.field415 = arg1.method3330();
        this.field411 = arg1.method3330();
        this.field412 = arg1.method3269();
        this.field421 = arg1.method3269();
        this.field586 = arg1.method3330();
        this.field584 = arg1.method3330();
        this.field423 = arg1.method3269();
        this.field414 = arg1.method3269();
        this.field585 = arg1.method3330();
        this.field583 = arg1.method3330();
        this.field411 = Math.min(this.field411, 4);
        this.field424 = new short[1][64][64];
        this.field417 = new short[this.field411][64][64];
        this.field419 = new byte[this.field411][64][64];
        this.field420 = new byte[this.field411][64][64];
        this.field418 = new class32[this.field411][64][64][];
        int var4 = arg0.method3330();
        if (class37.field501.field502 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3330();
        int var6 = arg0.method3330();
        int var7 = arg0.method3330();
        int var8 = arg0.method3330();
        if (this.field423 != var5 || this.field414 != var6 || this.field585 != var7 || this.field583 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method214(this.field585 * 8 + var9, this.field583 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ab.z(III)Z")
    public boolean method562(int arg0, int arg1) {
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
        if (!(arg0 instanceof class47)) {
            return false;
        }
        class47 var2 = (class47) arg0;
        if (this.field423 == var2.field423 && this.field414 == var2.field414) {
            return this.field585 == var2.field585 && this.field583 == var2.field583;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field423 | this.field414 << 8 | this.field585 << 16 | this.field583 << 24;
    }

    @ObfuscatedName("ab.n(I)I")
    public int method564() {
        return this.field586;
    }

    @ObfuscatedName("ab.r(I)I")
    public int method565() {
        return this.field584;
    }

    @ObfuscatedName("ab.e(I)I")
    public int method570() {
        return this.field585;
    }

    @ObfuscatedName("ab.au(I)I")
    public int method567() {
        return this.field583;
    }
}
