package deob;

@ObfuscatedName("gf")
public class class184 extends class190 {

    @ObfuscatedName("gf.l")
    public int field2090;

    @ObfuscatedName("gf.q")
    public int field2087;

    @ObfuscatedName("gf.f")
    public int field2088;

    @ObfuscatedName("gf.j")
    public int field2089;

    @ObfuscatedName("gf.l(Lot;B)V")
    public void method3472(class401 arg0) {
        int var2 = arg0.method6272();
        if (class196.field2191.field2193 != var2) {
            throw new IllegalStateException("");
        }
        this.field2146 = arg0.method6272();
        this.field2151 = arg0.method6272();
        this.field2157 = arg0.method6284();
        this.field2149 = arg0.method6284();
        this.field2090 = arg0.method6272();
        this.field2087 = arg0.method6272();
        this.field2153 = arg0.method6284();
        this.field2148 = arg0.method6284();
        this.field2088 = arg0.method6272();
        this.field2089 = arg0.method6272();
        this.field2152 = arg0.method6353();
        this.field2147 = arg0.method6353();
    }

    @ObfuscatedName("gf.q(Lot;I)V")
    public void method3172(class401 arg0) {
        this.field2151 = Math.min(this.field2151, 4);
        this.field2154 = new short[1][64][64];
        this.field2155 = new short[this.field2151][64][64];
        this.field2156 = new byte[this.field2151][64][64];
        this.field2150 = new byte[this.field2151][64][64];
        this.field2158 = new class192[this.field2151][64][64][];
        int var2 = arg0.method6272();
        if (class195.field2185.field2186 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6272();
        int var4 = arg0.method6272();
        int var5 = arg0.method6272();
        int var6 = arg0.method6272();
        if (this.field2153 != var3 || this.field2148 != var4 || this.field2088 != var5 || this.field2089 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3524(this.field2088 * 8 + var7, this.field2089 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class184)) {
            return false;
        }
        class184 var2 = (class184) arg0;
        if (this.field2153 == var2.field2153 && this.field2148 == var2.field2148) {
            return this.field2088 == var2.field2088 && this.field2089 == var2.field2089;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2153 | this.field2148 << 8 | this.field2088 << 16 | this.field2089 << 24;
    }

    @ObfuscatedName("gf.f(I)I")
    public int method3481() {
        return this.field2090;
    }

    @ObfuscatedName("gf.a(B)I")
    public int method3474() {
        return this.field2087;
    }

    @ObfuscatedName("gf.e(B)I")
    public int method3475() {
        return this.field2088;
    }

    @ObfuscatedName("gf.i(I)I")
    public int method3476() {
        return this.field2089;
    }
}
