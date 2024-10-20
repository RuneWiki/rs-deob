package deob;

@ObfuscatedName("y")
public class class16 extends class22 {

    @ObfuscatedName("y.q(Lkf;I)V")
    public void method146(class301 arg0) {
        int var2 = arg0.method5077();
        if (class32.field273.field271 != var2) {
            throw new IllegalStateException("");
        }
        this.field160 = arg0.method5077();
        this.field161 = arg0.method5077();
        this.field168 = arg0.method5069();
        this.field157 = arg0.method5069();
        this.field158 = arg0.method5069();
        this.field159 = arg0.method5069();
        this.field162 = arg0.method5084();
        this.field163 = arg0.method5084();
    }

    @ObfuscatedName("y.w(Lkf;I)V")
    public void method149(class301 arg0) {
        this.field161 = Math.min(this.field161, 4);
        this.field164 = new short[1][64][64];
        this.field171 = new short[this.field161][64][64];
        this.field166 = new byte[this.field161][64][64];
        this.field167 = new byte[this.field161][64][64];
        this.field165 = new class26[this.field161][64][64][];
        int var2 = arg0.method5077();
        if (class31.field263.field261 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5077();
        int var4 = arg0.method5077();
        if (this.field158 != var3 || this.field159 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method231(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field158 == var2.field158 && this.field159 == var2.field159;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field158 | this.field159 << 8;
    }
}
