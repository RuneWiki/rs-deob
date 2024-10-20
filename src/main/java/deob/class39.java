package deob;

@ObfuscatedName("ax")
public class class39 implements class43 {

    @ObfuscatedName("ax.i")
    public int field545;

    @ObfuscatedName("ax.w")
    public int field540;

    @ObfuscatedName("ax.a")
    public int field541;

    @ObfuscatedName("ax.t")
    public int field542;

    @ObfuscatedName("ax.s")
    public int field543;

    @ObfuscatedName("ax.r")
    public int field539;

    @ObfuscatedName("ax.i(Lar;I)V")
    public void method162(class33 arg0) {
        if (arg0.field468 > this.field543) {
            arg0.field468 = this.field543;
        }
        if (arg0.field469 < this.field543) {
            arg0.field469 = this.field543;
        }
        if (arg0.field473 > this.field539) {
            arg0.field473 = this.field539;
        }
        if (arg0.field467 < this.field539) {
            arg0.field467 = this.field539;
        }
    }

    @ObfuscatedName("ax.w(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field545 && arg0 < this.field545 + this.field540) {
            return arg1 >> 6 == this.field541 && arg2 >> 6 == this.field542;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.a(III)Z")
    public boolean method189(int arg0, int arg1) {
        return arg0 >> 6 == this.field543 && arg1 >> 6 == this.field539;
    }

    @ObfuscatedName("ax.t(IIII)[I")
    public int[] method164(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field543 * 64 - this.field541 * 64 + arg1, this.field539 * 64 - this.field542 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.s(III)Lhb;")
    public class213 method165(int arg0, int arg1) {
        if (this.method189(arg0, arg1)) {
            int var3 = this.field541 * 64 - this.field543 * 64 + arg0;
            int var4 = this.field542 * 64 - this.field539 * 64 + arg1;
            return new class213(this.field545, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.r(Lfp;I)V")
    public void method166(class174 arg0) {
        this.field545 = arg0.method3061();
        this.field540 = arg0.method3061();
        this.field541 = arg0.method2882();
        this.field542 = arg0.method2882();
        this.field543 = arg0.method2882();
        this.field539 = arg0.method2882();
        this.method481();
    }

    @ObfuscatedName("ax.v(B)V")
    public void method481() {
    }
}
