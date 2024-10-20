package deob;

@ObfuscatedName("ac")
public class class40 extends class22 {

    @ObfuscatedName("ac.r")
    public int field343;

    @ObfuscatedName("ac.c")
    public int field336;

    @ObfuscatedName("ac.a")
    public int field337;

    @ObfuscatedName("ac.d")
    public int field338;

    @ObfuscatedName("ac.u(Lkg;B)V")
    public void method611(class300 arg0) {
        int var2 = arg0.method5138();
        if (class32.field265.field272 != var2) {
            throw new IllegalStateException("");
        }
        this.field172 = arg0.method5138();
        this.field173 = arg0.method5138();
        this.field158 = arg0.method5337();
        this.field171 = arg0.method5337();
        this.field343 = arg0.method5138();
        this.field336 = arg0.method5138();
        this.field159 = arg0.method5337();
        this.field157 = arg0.method5337();
        this.field337 = arg0.method5138();
        this.field338 = arg0.method5138();
        this.field163 = arg0.method5155();
        this.field164 = arg0.method5155();
    }

    @ObfuscatedName("ac.f(Lkg;B)V")
    public void method162(class300 arg0) {
        this.field173 = Math.min(this.field173, 4);
        this.field165 = new short[1][64][64];
        this.field166 = new short[this.field173][64][64];
        this.field167 = new byte[this.field173][64][64];
        this.field161 = new byte[this.field173][64][64];
        this.field169 = new class26[this.field173][64][64][];
        int var2 = arg0.method5138();
        if (class31.field263.field260 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5138();
        int var4 = arg0.method5138();
        int var5 = arg0.method5138();
        int var6 = arg0.method5138();
        if (this.field159 != var3 || this.field157 != var4 || this.field337 != var5 || this.field338 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method250(this.field337 * 8 + var7, this.field338 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field159 == var2.field159 && this.field157 == var2.field157) {
            return this.field337 == var2.field337 && this.field338 == var2.field338;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field159 | this.field157 << 8 | this.field337 << 16 | this.field338 << 24;
    }

    @ObfuscatedName("ac.b(B)I")
    public int method588() {
        return this.field343;
    }

    @ObfuscatedName("ac.aa(I)I")
    public int method607() {
        return this.field336;
    }

    @ObfuscatedName("ac.ab(I)I")
    public int method589() {
        return this.field337;
    }

    @ObfuscatedName("ac.ar(B)I")
    public int method593() {
        return this.field338;
    }
}
