package deob;

@ObfuscatedName("ag")
public class class46 extends class29 {

    @ObfuscatedName("ag.i")
    public int field590;

    @ObfuscatedName("ag.s")
    public int field591;

    @ObfuscatedName("ag.n")
    public int field588;

    @ObfuscatedName("ag.c")
    public int field589;

    @ObfuscatedName("ag.e(Lfw;Lfw;B)V")
    public void method560(class174 arg0, class174 arg1) {
        int var3 = arg1.method2891();
        if (class37.field506.field507 != var3) {
            throw new IllegalStateException("");
        }
        this.field406 = arg1.method2891();
        this.field407 = arg1.method2891();
        this.field417 = arg1.method2930();
        this.field403 = arg1.method2930();
        this.field590 = arg1.method2891();
        this.field591 = arg1.method2891();
        this.field402 = arg1.method2930();
        this.field404 = arg1.method2930();
        this.field588 = arg1.method2891();
        this.field589 = arg1.method2891();
        this.field407 = Math.min(this.field407, 4);
        this.field408 = new short[1][64][64];
        this.field405 = new short[this.field407][64][64];
        this.field410 = new byte[this.field407][64][64];
        this.field411 = new byte[this.field407][64][64];
        this.field412 = new class32[this.field407][64][64][];
        int var4 = arg0.method2891();
        if (class36.field498.field499 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2891();
        int var6 = arg0.method2891();
        int var7 = arg0.method2891();
        int var8 = arg0.method2891();
        if (this.field402 != var5 || this.field404 != var6 || this.field588 != var7 || this.field589 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method213(this.field588 * 8 + var9, this.field589 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ag.o(III)Z")
    public boolean method559(int arg0, int arg1) {
        if (arg0 < this.field588 * 8) {
            return false;
        } else if (arg1 < this.field589 * 8) {
            return false;
        } else if (arg0 >= this.field588 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field589 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field402 == var2.field402 && this.field404 == var2.field404) {
            return this.field588 == var2.field588 && this.field589 == var2.field589;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field402 | this.field404 << 8 | this.field588 << 16 | this.field589 << 24;
    }

    @ObfuscatedName("ag.m(I)I")
    public int method563() {
        return this.field590;
    }

    @ObfuscatedName("ag.g(B)I")
    public int method565() {
        return this.field591;
    }

    @ObfuscatedName("ag.ae(I)I")
    public int method564() {
        return this.field588;
    }

    @ObfuscatedName("ag.az(I)I")
    public int method572() {
        return this.field589;
    }
}
