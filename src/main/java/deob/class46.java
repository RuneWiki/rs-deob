package deob;

@ObfuscatedName("aj")
public class class46 extends class29 {

    @ObfuscatedName("aj.o")
    public int field560;

    @ObfuscatedName("aj.l")
    public int field568;

    @ObfuscatedName("aj.f")
    public int field564;

    @ObfuscatedName("aj.q")
    public int field558;

    @ObfuscatedName("aj.s(Lgy;Lgy;B)V")
    public void method550(class185 arg0, class185 arg1) {
        int var3 = arg1.method3239();
        if (class37.field480.field479 != var3) {
            throw new IllegalStateException("");
        }
        this.field392 = arg1.method3239();
        this.field394 = arg1.method3239();
        this.field399 = arg1.method3241();
        this.field390 = arg1.method3241();
        this.field560 = arg1.method3239();
        this.field568 = arg1.method3239();
        this.field391 = arg1.method3241();
        this.field395 = arg1.method3241();
        this.field564 = arg1.method3239();
        this.field558 = arg1.method3239();
        this.field394 = Math.min(this.field394, 4);
        this.field389 = new short[1][64][64];
        this.field396 = new short[this.field394][64][64];
        this.field397 = new byte[this.field394][64][64];
        this.field398 = new byte[this.field394][64][64];
        this.field393 = new class32[this.field394][64][64][];
        int var4 = arg0.method3239();
        if (class36.field477.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3239();
        int var6 = arg0.method3239();
        int var7 = arg0.method3239();
        int var8 = arg0.method3239();
        if (this.field391 != var5 || this.field395 != var6 || this.field564 != var7 || this.field558 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method207(this.field564 * 8 + var9, this.field558 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aj.g(III)Z")
    public boolean method541(int arg0, int arg1) {
        if (arg0 < this.field564 * 8) {
            return false;
        } else if (arg1 < this.field558 * 8) {
            return false;
        } else if (arg0 >= this.field564 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field558 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field391 == var2.field391 && this.field395 == var2.field395) {
            return this.field564 == var2.field564 && this.field558 == var2.field558;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field391 | this.field395 << 8 | this.field564 << 16 | this.field558 << 24;
    }

    @ObfuscatedName("aj.ax(B)I")
    public int method560() {
        return this.field560;
    }

    @ObfuscatedName("aj.ak(B)I")
    public int method563() {
        return this.field568;
    }

    @ObfuscatedName("aj.aw(B)I")
    public int method540() {
        return this.field564;
    }

    @ObfuscatedName("aj.ai(B)I")
    public int method545() {
        return this.field558;
    }
}
