package deob;

@ObfuscatedName("h")
public class class25 extends class31 {

    @ObfuscatedName("h.f(Lkb;B)V")
    public void method236(class311 arg0) {
        int var2 = arg0.method5276();
        if (class41.field296.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field191 = arg0.method5276();
        this.field192 = arg0.method5276();
        this.field200 = arg0.method5163();
        this.field189 = arg0.method5163();
        this.field194 = arg0.method5163();
        this.field190 = arg0.method5163();
        this.field193 = arg0.method5394();
        this.field187 = arg0.method5394();
    }

    @ObfuscatedName("h.b(Lkb;I)V")
    public void method223(class311 arg0) {
        this.field192 = Math.min(this.field192, 4);
        this.field195 = new short[1][64][64];
        this.field196 = new short[this.field192][64][64];
        this.field197 = new byte[this.field192][64][64];
        this.field188 = new byte[this.field192][64][64];
        this.field198 = new class35[this.field192][64][64][];
        int var2 = arg0.method5276();
        if (class40.field288.field287 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5276();
        int var4 = arg0.method5276();
        if (this.field194 != var3 || this.field190 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method305(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class25)) {
            class25 var2 = (class25) arg0;
            return this.field194 == var2.field194 && this.field190 == var2.field190;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field194 | this.field190 << 8;
    }
}
