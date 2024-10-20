package deob;

@ObfuscatedName("o")
public class class16 extends class22 {

    @ObfuscatedName("o.a(Lgx;I)V")
    public void method167(class190 arg0) {
        int var2 = arg0.method3443();
        if (class32.field274.field275 != var2) {
            throw new IllegalStateException("");
        }
        this.field173 = arg0.method3443();
        this.field169 = arg0.method3443();
        this.field174 = arg0.method3610();
        this.field170 = arg0.method3610();
        this.field171 = arg0.method3610();
        this.field172 = arg0.method3610();
        this.field175 = arg0.method3656();
        this.field178 = arg0.method3656();
    }

    @ObfuscatedName("o.s(Lgx;I)V")
    public void method168(class190 arg0) {
        this.field169 = Math.min(this.field169, 4);
        this.field189 = new short[1][64][64];
        this.field186 = new short[this.field169][64][64];
        this.field179 = new byte[this.field169][64][64];
        this.field180 = new byte[this.field169][64][64];
        this.field181 = new class26[this.field169][64][64][];
        int var2 = arg0.method3443();
        if (class31.field269.field271 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3443();
        int var4 = arg0.method3443();
        if (this.field171 != var3 || this.field172 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method250(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field171 == var2.field171 && this.field172 == var2.field172;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field171 | this.field172 << 8;
    }
}
