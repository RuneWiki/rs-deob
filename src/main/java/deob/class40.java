package deob;

@ObfuscatedName("ak")
public class class40 extends class22 {

    @ObfuscatedName("ak.e")
    public int field331;

    @ObfuscatedName("ak.i")
    public int field329;

    @ObfuscatedName("ak.q")
    public int field330;

    @ObfuscatedName("ak.y")
    public int field328;

    @ObfuscatedName("ak.c(Lkz;I)V")
    public void method581(class300 arg0) {
        int var2 = arg0.method5103();
        if (class32.field265.field262 != var2) {
            throw new IllegalStateException("");
        }
        this.field158 = arg0.method5103();
        this.field166 = arg0.method5103();
        this.field165 = arg0.method5304();
        this.field159 = arg0.method5304();
        this.field331 = arg0.method5103();
        this.field329 = arg0.method5103();
        this.field156 = arg0.method5304();
        this.field157 = arg0.method5304();
        this.field330 = arg0.method5103();
        this.field328 = arg0.method5103();
        this.field169 = arg0.method5261();
        this.field161 = arg0.method5261();
    }

    @ObfuscatedName("ak.x(Lkz;I)V")
    public void method147(class300 arg0) {
        this.field166 = Math.min(this.field166, 4);
        this.field162 = new short[1][64][64];
        this.field163 = new short[this.field166][64][64];
        this.field164 = new byte[this.field166][64][64];
        this.field160 = new byte[this.field166][64][64];
        this.field155 = new class26[this.field166][64][64][];
        int var2 = arg0.method5103();
        if (class31.field255.field256 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5103();
        int var4 = arg0.method5103();
        int var5 = arg0.method5103();
        int var6 = arg0.method5103();
        if (this.field156 != var3 || this.field157 != var4 || this.field330 != var5 || this.field328 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method212(this.field330 * 8 + var7, this.field328 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field156 == var2.field156 && this.field157 == var2.field157) {
            return this.field330 == var2.field330 && this.field328 == var2.field328;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field156 | this.field157 << 8 | this.field330 << 16 | this.field328 << 24;
    }

    @ObfuscatedName("ak.t(I)I")
    public int method583() {
        return this.field331;
    }

    @ObfuscatedName("ak.g(I)I")
    public int method585() {
        return this.field329;
    }

    @ObfuscatedName("ak.l(B)I")
    public int method577() {
        return this.field330;
    }

    @ObfuscatedName("ak.ax(B)I")
    public int method573() {
        return this.field328;
    }
}
