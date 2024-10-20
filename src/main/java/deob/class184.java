package deob;

@ObfuscatedName("gi")
public class class184 extends class190 {

    @ObfuscatedName("gi.i")
    public int field2090;

    @ObfuscatedName("gi.w")
    public int field2089;

    @ObfuscatedName("gi.s")
    public int field2091;

    @ObfuscatedName("gi.a")
    public int field2088;

    @ObfuscatedName("gi.i(Lop;I)V")
    public void method3495(class401 arg0) {
        int var2 = arg0.method6240();
        if (class196.field2185.field2186 != var2) {
            throw new IllegalStateException("");
        }
        this.field2156 = arg0.method6240();
        this.field2149 = arg0.method6240();
        this.field2152 = arg0.method6242();
        this.field2145 = arg0.method6242();
        this.field2090 = arg0.method6240();
        this.field2089 = arg0.method6240();
        this.field2147 = arg0.method6242();
        this.field2148 = arg0.method6242();
        this.field2091 = arg0.method6240();
        this.field2088 = arg0.method6240();
        this.field2151 = arg0.method6220();
        this.field2158 = arg0.method6220();
    }

    @ObfuscatedName("gi.w(Lop;I)V")
    public void method3197(class401 arg0) {
        this.field2149 = Math.min(this.field2149, 4);
        this.field2153 = new short[1][64][64];
        this.field2154 = new short[this.field2149][64][64];
        this.field2155 = new byte[this.field2149][64][64];
        this.field2146 = new byte[this.field2149][64][64];
        this.field2157 = new class192[this.field2149][64][64][];
        int var2 = arg0.method6240();
        if (class195.field2179.field2181 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6240();
        int var4 = arg0.method6240();
        int var5 = arg0.method6240();
        int var6 = arg0.method6240();
        if (this.field2147 != var3 || this.field2148 != var4 || this.field2091 != var5 || this.field2088 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3539(this.field2091 * 8 + var7, this.field2088 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class184)) {
            return false;
        }
        class184 var2 = (class184) arg0;
        if (this.field2147 == var2.field2147 && this.field2148 == var2.field2148) {
            return this.field2091 == var2.field2091 && this.field2088 == var2.field2088;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2147 | this.field2148 << 8 | this.field2091 << 16 | this.field2088 << 24;
    }

    @ObfuscatedName("gi.s(B)I")
    public int method3515() {
        return this.field2090;
    }

    @ObfuscatedName("gi.a(I)I")
    public int method3497() {
        return this.field2089;
    }

    @ObfuscatedName("gi.o(I)I")
    public int method3502() {
        return this.field2091;
    }

    @ObfuscatedName("gi.g(I)I")
    public int method3498() {
        return this.field2088;
    }
}
