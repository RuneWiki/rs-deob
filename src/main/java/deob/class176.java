package deob;

@ObfuscatedName("fd")
public class class176 extends class190 {

    @ObfuscatedName("fd.n(Lot;B)V")
    public void method3120(class400 arg0) {
        int var2 = arg0.method6217();
        if (class196.field2176.field2180 != var2) {
            throw new IllegalStateException("");
        }
        this.field2138 = arg0.method6217();
        this.field2146 = arg0.method6217();
        this.field2139 = arg0.method6219();
        this.field2135 = arg0.method6219();
        this.field2136 = arg0.method6219();
        this.field2137 = arg0.method6219();
        this.field2141 = arg0.method6387();
        this.field2143 = arg0.method6387();
    }

    @ObfuscatedName("fd.c(Lot;B)V")
    public void method3122(class400 arg0) {
        this.field2146 = Math.min(this.field2146, 4);
        this.field2142 = new short[1][64][64];
        this.field2134 = new short[this.field2146][64][64];
        this.field2144 = new byte[this.field2146][64][64];
        this.field2145 = new byte[this.field2146][64][64];
        this.field2140 = new class192[this.field2146][64][64][];
        int var2 = arg0.method6217();
        if (class195.field2174.field2169 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6217();
        int var4 = arg0.method6217();
        if (this.field2136 != var3 || this.field2137 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3499(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class176)) {
            class176 var2 = (class176) arg0;
            return this.field2136 == var2.field2136 && this.field2137 == var2.field2137;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2136 | this.field2137 << 8;
    }
}
