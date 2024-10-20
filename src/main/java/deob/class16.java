package deob;

@ObfuscatedName("l")
public class class16 extends class22 {

    @ObfuscatedName("l.f(Lkq;I)V")
    public void method158(class300 arg0) {
        int var2 = arg0.method5110();
        if (class32.field253.field255 != var2) {
            throw new IllegalStateException("");
        }
        this.field145 = arg0.method5110();
        this.field146 = arg0.method5110();
        this.field143 = arg0.method5112();
        this.field142 = arg0.method5112();
        this.field156 = arg0.method5112();
        this.field144 = arg0.method5112();
        this.field157 = arg0.method5127();
        this.field152 = arg0.method5127();
    }

    @ObfuscatedName("l.i(Lkq;I)V")
    public void method142(class300 arg0) {
        this.field146 = Math.min(this.field146, 4);
        this.field149 = new short[1][64][64];
        this.field159 = new short[this.field146][64][64];
        this.field151 = new byte[this.field146][64][64];
        this.field150 = new byte[this.field146][64][64];
        this.field153 = new class26[this.field146][64][64][];
        int var2 = arg0.method5110();
        if (class31.field247.field248 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5110();
        int var4 = arg0.method5110();
        if (this.field156 != var3 || this.field144 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method221(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field156 == var2.field156 && this.field144 == var2.field144;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field156 | this.field144 << 8;
    }
}
