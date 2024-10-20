package deob;

@ObfuscatedName("r")
public class class16 extends class22 {

    @ObfuscatedName("r.u(Lkg;B)V")
    public void method163(class300 arg0) {
        int var2 = arg0.method5138();
        if (class32.field269.field272 != var2) {
            throw new IllegalStateException("");
        }
        this.field172 = arg0.method5138();
        this.field173 = arg0.method5138();
        this.field158 = arg0.method5337();
        this.field171 = arg0.method5337();
        this.field159 = arg0.method5337();
        this.field157 = arg0.method5337();
        this.field163 = arg0.method5155();
        this.field164 = arg0.method5155();
    }

    @ObfuscatedName("r.f(Lkg;B)V")
    public void method162(class300 arg0) {
        this.field173 = Math.min(this.field173, 4);
        this.field165 = new short[1][64][64];
        this.field166 = new short[this.field173][64][64];
        this.field167 = new byte[this.field173][64][64];
        this.field161 = new byte[this.field173][64][64];
        this.field169 = new class26[this.field173][64][64][];
        int var2 = arg0.method5138();
        if (class31.field259.field260 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5138();
        int var4 = arg0.method5138();
        if (this.field159 != var3 || this.field157 != var4) {
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
            return this.field159 == var2.field159 && this.field157 == var2.field157;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field159 | this.field157 << 8;
    }
}
