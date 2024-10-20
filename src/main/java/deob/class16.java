package deob;

@ObfuscatedName("b")
public class class16 extends class22 {

    @ObfuscatedName("b.s(Lky;I)V")
    public void method150(class300 arg0) {
        int var2 = arg0.method5179();
        if (class32.field261.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field150 = arg0.method5179();
        this.field153 = arg0.method5179();
        this.field155 = arg0.method5054();
        this.field147 = arg0.method5054();
        this.field148 = arg0.method5054();
        this.field156 = arg0.method5054();
        this.field152 = arg0.method5246();
        this.field149 = arg0.method5246();
    }

    @ObfuscatedName("b.j(Lky;B)V")
    public void method145(class300 arg0) {
        this.field153 = Math.min(this.field153, 4);
        this.field154 = new short[1][64][64];
        this.field151 = new short[this.field153][64][64];
        this.field146 = new byte[this.field153][64][64];
        this.field157 = new byte[this.field153][64][64];
        this.field158 = new class26[this.field153][64][64][];
        int var2 = arg0.method5179();
        if (class31.field252.field255 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5179();
        int var4 = arg0.method5179();
        if (this.field148 != var3 || this.field156 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method219(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field148 == var2.field148 && this.field156 == var2.field156;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field148 | this.field156 << 8;
    }
}
