package deob;

@ObfuscatedName("al")
public class class46 extends class29 {

    @ObfuscatedName("al.u")
    public int field578;

    @ObfuscatedName("al.g")
    public int field574;

    @ObfuscatedName("al.k")
    public int field576;

    @ObfuscatedName("al.t")
    public int field577;

    @ObfuscatedName("al.a(Lfe;Lfe;I)V")
    public void method570(class174 arg0, class174 arg1) {
        int var3 = arg1.method2871();
        if (class37.field489.field491 != var3) {
            throw new IllegalStateException("");
        }
        this.field408 = arg1.method2871();
        this.field405 = arg1.method2871();
        this.field404 = arg1.method2873();
        this.field401 = arg1.method2873();
        this.field578 = arg1.method2871();
        this.field574 = arg1.method2871();
        this.field402 = arg1.method2873();
        this.field400 = arg1.method2873();
        this.field576 = arg1.method2871();
        this.field577 = arg1.method2871();
        this.field405 = Math.min(this.field405, 4);
        this.field406 = new short[1][64][64];
        this.field411 = new short[this.field405][64][64];
        this.field407 = new byte[this.field405][64][64];
        this.field409 = new byte[this.field405][64][64];
        this.field410 = new class32[this.field405][64][64][];
        int var4 = arg0.method2871();
        if (class36.field482.field481 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2871();
        int var6 = arg0.method2871();
        int var7 = arg0.method2871();
        int var8 = arg0.method2871();
        if (this.field402 != var5 || this.field400 != var6 || this.field576 != var7 || this.field577 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method210(this.field576 * 8 + var9, this.field577 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("al.j(III)Z")
    public boolean method554(int arg0, int arg1) {
        if (arg0 < this.field576 * 8) {
            return false;
        } else if (arg1 < this.field577 * 8) {
            return false;
        } else if (arg0 >= this.field576 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field577 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field402 == var2.field402 && this.field400 == var2.field400) {
            return this.field576 == var2.field576 && this.field577 == var2.field577;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field402 | this.field400 << 8 | this.field576 << 16 | this.field577 << 24;
    }

    @ObfuscatedName("al.n(I)I")
    public int method555() {
        return this.field578;
    }

    @ObfuscatedName("al.r(S)I")
    public int method558() {
        return this.field574;
    }

    @ObfuscatedName("al.ak(I)I")
    public int method557() {
        return this.field576;
    }

    @ObfuscatedName("al.ap(I)I")
    public int method574() {
        return this.field577;
    }
}
