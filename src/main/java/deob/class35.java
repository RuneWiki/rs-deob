package deob;

@ObfuscatedName("am")
public class class35 extends class17 {

    @ObfuscatedName("am.d")
    public int field311;

    @ObfuscatedName("am.w")
    public int field314;

    @ObfuscatedName("am.a")
    public int field313;

    @ObfuscatedName("am.z")
    public int field312;

    @ObfuscatedName("am.v(Lgx;Lgx;I)V")
    public void method546(class185 arg0, class185 arg1) {
        int var3 = arg1.method3274();
        if (class26.field229.field227 != var3) {
            throw new IllegalStateException("");
        }
        this.field137 = arg1.method3274();
        this.field134 = arg1.method3274();
        this.field133 = arg1.method3276();
        this.field142 = arg1.method3276();
        this.field311 = arg1.method3274();
        this.field314 = arg1.method3274();
        this.field131 = arg1.method3276();
        this.field132 = arg1.method3276();
        this.field313 = arg1.method3274();
        this.field312 = arg1.method3274();
        this.field134 = Math.min(this.field134, 4);
        this.field135 = new short[1][64][64];
        this.field136 = new short[this.field134][64][64];
        this.field130 = new byte[this.field134][64][64];
        this.field138 = new byte[this.field134][64][64];
        this.field139 = new class20[this.field134][64][64][];
        int var4 = arg0.method3274();
        if (class25.field222.field224 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3274();
        int var6 = arg0.method3274();
        int var7 = arg0.method3274();
        int var8 = arg0.method3274();
        if (this.field131 != var5 || this.field132 != var6 || this.field313 != var7 || this.field312 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method186(this.field313 * 8 + var9, this.field312 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("am.s(III)Z")
    public boolean method550(int arg0, int arg1) {
        if (arg0 < this.field313 * 8) {
            return false;
        } else if (arg1 < this.field312 * 8) {
            return false;
        } else if (arg0 >= this.field313 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field312 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field131 == var2.field131 && this.field132 == var2.field132) {
            return this.field313 == var2.field313 && this.field312 == var2.field312;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field131 | this.field132 << 8 | this.field313 << 16 | this.field312 << 24;
    }

    @ObfuscatedName("am.o(I)I")
    public int method569() {
        return this.field311;
    }

    @ObfuscatedName("am.k(I)I")
    public int method545() {
        return this.field314;
    }

    @ObfuscatedName("am.u(B)I")
    public int method548() {
        return this.field313;
    }

    @ObfuscatedName("am.ay(I)I")
    public int method551() {
        return this.field312;
    }
}
