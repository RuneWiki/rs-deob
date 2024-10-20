package deob;

@ObfuscatedName("ai")
public class class40 extends class22 {

    @ObfuscatedName("ai.w")
    public int field317;

    @ObfuscatedName("ai.t")
    public int field315;

    @ObfuscatedName("ai.g")
    public int field316;

    @ObfuscatedName("ai.x")
    public int field318;

    @ObfuscatedName("ai.z(Lkl;I)V")
    public void method593(class300 arg0) {
        int var2 = arg0.method4990();
        if (class32.field258.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field157 = arg0.method4990();
        this.field158 = arg0.method4990();
        this.field159 = arg0.method4992();
        this.field154 = arg0.method4992();
        this.field317 = arg0.method4990();
        this.field315 = arg0.method4990();
        this.field155 = arg0.method4992();
        this.field156 = arg0.method4992();
        this.field316 = arg0.method4990();
        this.field318 = arg0.method4990();
        this.field160 = arg0.method5001();
        this.field168 = arg0.method5001();
    }

    @ObfuscatedName("ai.n(Lkl;I)V")
    public void method165(class300 arg0) {
        this.field158 = Math.min(this.field158, 4);
        this.field161 = new short[1][64][64];
        this.field162 = new short[this.field158][64][64];
        this.field165 = new byte[this.field158][64][64];
        this.field153 = new byte[this.field158][64][64];
        this.field163 = new class26[this.field158][64][64][];
        int var2 = arg0.method4990();
        if (class31.field251.field250 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method4990();
        int var4 = arg0.method4990();
        int var5 = arg0.method4990();
        int var6 = arg0.method4990();
        if (this.field155 != var3 || this.field156 != var4 || this.field316 != var5 || this.field318 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method249(this.field316 * 8 + var7, this.field318 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field155 == var2.field155 && this.field156 == var2.field156) {
            return this.field316 == var2.field316 && this.field318 == var2.field318;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field155 | this.field156 << 8 | this.field316 << 16 | this.field318 << 24;
    }

    @ObfuscatedName("ai.v(B)I")
    public int method595() {
        return this.field317;
    }

    @ObfuscatedName("ai.u(I)I")
    public int method607() {
        return this.field315;
    }

    @ObfuscatedName("ai.an(I)I")
    public int method596() {
        return this.field316;
    }

    @ObfuscatedName("ai.ai(I)I")
    public int method601() {
        return this.field318;
    }
}
