package deob;

@ObfuscatedName("ay")
public class class46 extends class29 {

    @ObfuscatedName("ay.o")
    public int field549;

    @ObfuscatedName("ay.a")
    public int field547;

    @ObfuscatedName("ay.q")
    public int field544;

    @ObfuscatedName("ay.j")
    public int field545;

    @ObfuscatedName("ay.b(Lfs;Lfs;B)V")
    public void method537(class181 arg0, class181 arg1) {
        int var3 = arg1.method2945();
        if (class37.field466.field465 != var3) {
            throw new IllegalStateException("");
        }
        this.field389 = arg1.method2945();
        this.field381 = arg1.method2945();
        this.field387 = arg1.method3081();
        this.field377 = arg1.method3081();
        this.field549 = arg1.method2945();
        this.field547 = arg1.method2945();
        this.field386 = arg1.method3081();
        this.field379 = arg1.method3081();
        this.field544 = arg1.method2945();
        this.field545 = arg1.method2945();
        this.field381 = Math.min(this.field381, 4);
        this.field378 = new short[1][64][64];
        this.field383 = new short[this.field381][64][64];
        this.field384 = new byte[this.field381][64][64];
        this.field380 = new byte[this.field381][64][64];
        this.field385 = new class32[this.field381][64][64][];
        int var4 = arg0.method2945();
        if (class36.field460.field459 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2945();
        int var6 = arg0.method2945();
        int var7 = arg0.method2945();
        int var8 = arg0.method2945();
        if (this.field386 != var5 || this.field379 != var6 || this.field544 != var7 || this.field545 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method206(this.field544 * 8 + var9, this.field545 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ay.s(IIB)Z")
    public boolean method538(int arg0, int arg1) {
        if (arg0 < this.field544 * 8) {
            return false;
        } else if (arg1 < this.field545 * 8) {
            return false;
        } else if (arg0 >= this.field544 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field545 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field386 == var2.field386 && this.field379 == var2.field379) {
            return this.field544 == var2.field544 && this.field545 == var2.field545;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field386 | this.field379 << 8 | this.field544 << 16 | this.field545 << 24;
    }

    @ObfuscatedName("ay.r(I)I")
    public int method536() {
        return this.field549;
    }

    @ObfuscatedName("ay.g(I)I")
    public int method541() {
        return this.field547;
    }

    @ObfuscatedName("ay.c(I)I")
    public int method542() {
        return this.field544;
    }

    @ObfuscatedName("ay.i(I)I")
    public int method543() {
        return this.field545;
    }
}
