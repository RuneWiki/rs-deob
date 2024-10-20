package deob;

@ObfuscatedName("an")
public class class35 extends class17 {

    @ObfuscatedName("an.r")
    public int field296;

    @ObfuscatedName("an.k")
    public int field301;

    @ObfuscatedName("an.m")
    public int field297;

    @ObfuscatedName("an.q")
    public int field299;

    @ObfuscatedName("an.f(Lgx;Lgx;B)V")
    public void method539(class185 arg0, class185 arg1) {
        int var3 = arg1.method3323();
        if (class26.field218.field220 != var3) {
            throw new IllegalStateException("");
        }
        this.field128 = arg1.method3323();
        this.field138 = arg1.method3323();
        this.field134 = arg1.method3325();
        this.field136 = arg1.method3325();
        this.field296 = arg1.method3323();
        this.field301 = arg1.method3323();
        this.field129 = arg1.method3325();
        this.field127 = arg1.method3325();
        this.field297 = arg1.method3323();
        this.field299 = arg1.method3323();
        this.field138 = Math.min(this.field138, 4);
        this.field124 = new short[1][64][64];
        this.field131 = new short[this.field138][64][64];
        this.field130 = new byte[this.field138][64][64];
        this.field133 = new byte[this.field138][64][64];
        this.field125 = new class20[this.field138][64][64][];
        int var4 = arg0.method3323();
        if (class25.field210.field213 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3323();
        int var6 = arg0.method3323();
        int var7 = arg0.method3323();
        int var8 = arg0.method3323();
        if (this.field129 != var5 || this.field127 != var6 || this.field297 != var7 || this.field299 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method185(this.field297 * 8 + var9, this.field299 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("an.h(III)Z")
    public boolean method538(int arg0, int arg1) {
        if (arg0 < this.field297 * 8) {
            return false;
        } else if (arg1 < this.field299 * 8) {
            return false;
        } else if (arg0 >= this.field297 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field299 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field129 == var2.field129 && this.field127 == var2.field127) {
            return this.field297 == var2.field297 && this.field299 == var2.field299;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field129 | this.field127 << 8 | this.field297 << 16 | this.field299 << 24;
    }

    @ObfuscatedName("an.e(B)I")
    public int method540() {
        return this.field296;
    }

    @ObfuscatedName("an.b(B)I")
    public int method547() {
        return this.field301;
    }

    @ObfuscatedName("an.aj(I)I")
    public int method537() {
        return this.field297;
    }

    @ObfuscatedName("an.an(B)I")
    public int method541() {
        return this.field299;
    }
}
