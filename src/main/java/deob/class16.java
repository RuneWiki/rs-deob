package deob;

@ObfuscatedName("z")
public class class16 extends class22 {

    @ObfuscatedName("z.m(Lgr;I)V")
    public void method156(class202 arg0) {
        int var2 = arg0.method3551();
        if (class32.field260.field256 != var2) {
            throw new IllegalStateException("");
        }
        this.field149 = arg0.method3551();
        this.field157 = arg0.method3551();
        this.field150 = arg0.method3530();
        this.field147 = arg0.method3530();
        this.field160 = arg0.method3530();
        this.field148 = arg0.method3530();
        this.field151 = arg0.method3434();
        this.field153 = arg0.method3434();
    }

    @ObfuscatedName("z.f(Lgr;I)V")
    public void method157(class202 arg0) {
        this.field157 = Math.min(this.field157, 4);
        this.field152 = new short[1][64][64];
        this.field146 = new short[this.field157][64][64];
        this.field155 = new byte[this.field157][64][64];
        this.field156 = new byte[this.field157][64][64];
        this.field145 = new class26[this.field157][64][64][];
        int var2 = arg0.method3551();
        if (class31.field247.field249 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3551();
        int var4 = arg0.method3551();
        if (this.field160 != var3 || this.field148 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method239(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field160 == var2.field160 && this.field148 == var2.field148;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field160 | this.field148 << 8;
    }
}
