package deob;

@ObfuscatedName("gg")
public class class184 extends class190 {

    @ObfuscatedName("gg.n")
    public int field2080;

    @ObfuscatedName("gg.c")
    public int field2081;

    @ObfuscatedName("gg.m")
    public int field2082;

    @ObfuscatedName("gg.k")
    public int field2083;

    @ObfuscatedName("gg.n(Lot;I)V")
    public void method3434(class400 arg0) {
        int var2 = arg0.method6217();
        if (class196.field2175.field2180 != var2) {
            throw new IllegalStateException("");
        }
        this.field2138 = arg0.method6217();
        this.field2146 = arg0.method6217();
        this.field2139 = arg0.method6219();
        this.field2135 = arg0.method6219();
        this.field2080 = arg0.method6217();
        this.field2081 = arg0.method6217();
        this.field2136 = arg0.method6219();
        this.field2137 = arg0.method6219();
        this.field2082 = arg0.method6217();
        this.field2083 = arg0.method6217();
        this.field2141 = arg0.method6387();
        this.field2143 = arg0.method6387();
    }

    @ObfuscatedName("gg.c(Lot;B)V")
    public void method3122(class400 arg0) {
        this.field2146 = Math.min(this.field2146, 4);
        this.field2142 = new short[1][64][64];
        this.field2134 = new short[this.field2146][64][64];
        this.field2144 = new byte[this.field2146][64][64];
        this.field2145 = new byte[this.field2146][64][64];
        this.field2140 = new class192[this.field2146][64][64][];
        int var2 = arg0.method6217();
        if (class195.field2170.field2169 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6217();
        int var4 = arg0.method6217();
        int var5 = arg0.method6217();
        int var6 = arg0.method6217();
        if (this.field2136 != var3 || this.field2137 != var4 || this.field2082 != var5 || this.field2083 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3499(this.field2082 * 8 + var7, this.field2083 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class184)) {
            return false;
        }
        class184 var2 = (class184) arg0;
        if (this.field2136 == var2.field2136 && this.field2137 == var2.field2137) {
            return this.field2082 == var2.field2082 && this.field2083 == var2.field2083;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2136 | this.field2137 << 8 | this.field2082 << 16 | this.field2083 << 24;
    }

    @ObfuscatedName("gg.m(I)I")
    public int method3441() {
        return this.field2080;
    }

    @ObfuscatedName("gg.k(I)I")
    public int method3437() {
        return this.field2081;
    }

    @ObfuscatedName("gg.o(B)I")
    public int method3438() {
        return this.field2082;
    }

    @ObfuscatedName("gg.z(I)I")
    public int method3439() {
        return this.field2083;
    }
}
