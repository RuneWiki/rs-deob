package deob;

@ObfuscatedName("ac")
public class class40 extends class22 {

    @ObfuscatedName("ac.y")
    public int field341;

    @ObfuscatedName("ac.g")
    public int field336;

    @ObfuscatedName("ac.a")
    public int field338;

    @ObfuscatedName("ac.j")
    public int field339;

    @ObfuscatedName("ac.q(Lkf;I)V")
    public void method561(class301 arg0) {
        int var2 = arg0.method5077();
        if (class32.field270.field271 != var2) {
            throw new IllegalStateException("");
        }
        this.field160 = arg0.method5077();
        this.field161 = arg0.method5077();
        this.field168 = arg0.method5069();
        this.field157 = arg0.method5069();
        this.field341 = arg0.method5077();
        this.field336 = arg0.method5077();
        this.field158 = arg0.method5069();
        this.field159 = arg0.method5069();
        this.field338 = arg0.method5077();
        this.field339 = arg0.method5077();
        this.field162 = arg0.method5084();
        this.field163 = arg0.method5084();
    }

    @ObfuscatedName("ac.w(Lkf;I)V")
    public void method149(class301 arg0) {
        this.field161 = Math.min(this.field161, 4);
        this.field164 = new short[1][64][64];
        this.field171 = new short[this.field161][64][64];
        this.field166 = new byte[this.field161][64][64];
        this.field167 = new byte[this.field161][64][64];
        this.field165 = new class26[this.field161][64][64][];
        int var2 = arg0.method5077();
        if (class31.field259.field261 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5077();
        int var4 = arg0.method5077();
        int var5 = arg0.method5077();
        int var6 = arg0.method5077();
        if (this.field158 != var3 || this.field159 != var4 || this.field338 != var5 || this.field339 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method231(this.field338 * 8 + var7, this.field339 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field158 == var2.field158 && this.field159 == var2.field159) {
            return this.field338 == var2.field338 && this.field339 == var2.field339;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field158 | this.field159 << 8 | this.field338 << 16 | this.field339 << 24;
    }

    @ObfuscatedName("ac.e(I)I")
    public int method563() {
        return this.field341;
    }

    @ObfuscatedName("ac.p(I)I")
    public int method564() {
        return this.field336;
    }

    @ObfuscatedName("ac.k(I)I")
    public int method569() {
        return this.field338;
    }

    @ObfuscatedName("ac.at(I)I")
    public int method565() {
        return this.field339;
    }
}
