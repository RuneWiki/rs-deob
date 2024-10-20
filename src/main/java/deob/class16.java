package deob;

@ObfuscatedName("e")
public class class16 extends class22 {

    @ObfuscatedName("e.c(Lkz;I)V")
    public void method133(class300 arg0) {
        int var2 = arg0.method5103();
        if (class32.field264.field262 != var2) {
            throw new IllegalStateException("");
        }
        this.field158 = arg0.method5103();
        this.field166 = arg0.method5103();
        this.field165 = arg0.method5304();
        this.field159 = arg0.method5304();
        this.field156 = arg0.method5304();
        this.field157 = arg0.method5304();
        this.field169 = arg0.method5261();
        this.field161 = arg0.method5261();
    }

    @ObfuscatedName("e.x(Lkz;I)V")
    public void method147(class300 arg0) {
        this.field166 = Math.min(this.field166, 4);
        this.field162 = new short[1][64][64];
        this.field163 = new short[this.field166][64][64];
        this.field164 = new byte[this.field166][64][64];
        this.field160 = new byte[this.field166][64][64];
        this.field155 = new class26[this.field166][64][64][];
        int var2 = arg0.method5103();
        if (class31.field254.field256 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5103();
        int var4 = arg0.method5103();
        if (this.field156 != var3 || this.field157 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method212(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field156 == var2.field156 && this.field157 == var2.field157;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field156 | this.field157 << 8;
    }
}
