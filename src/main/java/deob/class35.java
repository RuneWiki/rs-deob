package deob;

@ObfuscatedName("ag")
public class class35 extends class17 {

    @ObfuscatedName("ag.d")
    public int field296;

    @ObfuscatedName("ag.s")
    public int field297;

    @ObfuscatedName("ag.p")
    public int field298;

    @ObfuscatedName("ag.g")
    public int field299;

    @ObfuscatedName("ag.w(Lgy;Lgy;I)V")
    public void method543(class183 arg0, class183 arg1) {
        int var3 = arg1.method3436();
        if (class26.field234.field229 != var3) {
            throw new IllegalStateException("");
        }
        this.field134 = arg1.method3436();
        this.field135 = arg1.method3436();
        this.field132 = arg1.method3268();
        this.field136 = arg1.method3268();
        this.field296 = arg1.method3436();
        this.field297 = arg1.method3436();
        this.field142 = arg1.method3268();
        this.field133 = arg1.method3268();
        this.field298 = arg1.method3436();
        this.field299 = arg1.method3436();
        this.field135 = Math.min(this.field135, 4);
        this.field130 = new short[1][64][64];
        this.field131 = new short[this.field135][64][64];
        this.field138 = new byte[this.field135][64][64];
        this.field139 = new byte[this.field135][64][64];
        this.field140 = new class20[this.field135][64][64][];
        int var4 = arg0.method3436();
        if (class25.field218.field220 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3436();
        int var6 = arg0.method3436();
        int var7 = arg0.method3436();
        int var8 = arg0.method3436();
        if (this.field142 != var5 || this.field133 != var6 || this.field298 != var7 || this.field299 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method166(this.field298 * 8 + var9, this.field299 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ag.m(III)Z")
    public boolean method542(int arg0, int arg1) {
        if (arg0 < this.field298 * 8) {
            return false;
        } else if (arg1 < this.field299 * 8) {
            return false;
        } else if (arg0 >= this.field298 * 8 + 8) {
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
        if (this.field142 == var2.field142 && this.field133 == var2.field133) {
            return this.field298 == var2.field298 && this.field299 == var2.field299;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field142 | this.field133 << 8 | this.field298 << 16 | this.field299 << 24;
    }

    @ObfuscatedName("ag.ac(I)I")
    public int method541() {
        return this.field296;
    }

    @ObfuscatedName("ag.ay(I)I")
    public int method549() {
        return this.field297;
    }

    @ObfuscatedName("ag.an(B)I")
    public int method546() {
        return this.field298;
    }

    @ObfuscatedName("ag.as(I)I")
    public int method547() {
        return this.field299;
    }
}
