package deob;

@ObfuscatedName("at")
public class class35 extends class17 {

    @ObfuscatedName("at.b")
    public int field300;

    @ObfuscatedName("at.n")
    public int field298;

    @ObfuscatedName("at.f")
    public int field299;

    @ObfuscatedName("at.g")
    public int field297;

    @ObfuscatedName("at.z(Lgk;Lgk;I)V")
    public void method502(class183 arg0, class183 arg1) {
        int var3 = arg1.method3247();
        if (class26.field210.field212 != var3) {
            throw new IllegalStateException("");
        }
        this.field121 = arg1.method3247();
        this.field122 = arg1.method3247();
        this.field128 = arg1.method3253();
        this.field118 = arg1.method3253();
        this.field300 = arg1.method3247();
        this.field298 = arg1.method3247();
        this.field119 = arg1.method3253();
        this.field120 = arg1.method3253();
        this.field299 = arg1.method3247();
        this.field297 = arg1.method3247();
        this.field122 = Math.min(this.field122, 4);
        this.field126 = new short[1][64][64];
        this.field124 = new short[this.field122][64][64];
        this.field125 = new byte[this.field122][64][64];
        this.field117 = new byte[this.field122][64][64];
        this.field127 = new class20[this.field122][64][64][];
        int var4 = arg0.method3247();
        if (class25.field205.field206 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3247();
        int var6 = arg0.method3247();
        int var7 = arg0.method3247();
        int var8 = arg0.method3247();
        if (this.field119 != var5 || this.field120 != var6 || this.field299 != var7 || this.field297 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method151(this.field299 * 8 + var9, this.field297 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("at.w(III)Z")
    public boolean method503(int arg0, int arg1) {
        if (arg0 < this.field299 * 8) {
            return false;
        } else if (arg1 < this.field297 * 8) {
            return false;
        } else if (arg0 >= this.field299 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field297 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field119 == var2.field119 && this.field120 == var2.field120) {
            return this.field299 == var2.field299 && this.field297 == var2.field297;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field119 | this.field120 << 8 | this.field299 << 16 | this.field297 << 24;
    }

    @ObfuscatedName("at.v(B)I")
    public int method525() {
        return this.field300;
    }

    @ObfuscatedName("at.af(S)I")
    public int method505() {
        return this.field298;
    }

    @ObfuscatedName("at.ah(I)I")
    public int method506() {
        return this.field299;
    }

    @ObfuscatedName("at.ab(I)I")
    public int method504() {
        return this.field297;
    }
}
