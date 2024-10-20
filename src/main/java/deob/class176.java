package deob;

@ObfuscatedName("fj")
public class class176 extends class190 {

    @ObfuscatedName("fj.l(Lot;B)V")
    public void method3171(class401 arg0) {
        int var2 = arg0.method6272();
        if (class196.field2196.field2193 != var2) {
            throw new IllegalStateException("");
        }
        this.field2146 = arg0.method6272();
        this.field2151 = arg0.method6272();
        this.field2157 = arg0.method6284();
        this.field2149 = arg0.method6284();
        this.field2153 = arg0.method6284();
        this.field2148 = arg0.method6284();
        this.field2152 = arg0.method6353();
        this.field2147 = arg0.method6353();
    }

    @ObfuscatedName("fj.q(Lot;I)V")
    public void method3172(class401 arg0) {
        this.field2151 = Math.min(this.field2151, 4);
        this.field2154 = new short[1][64][64];
        this.field2155 = new short[this.field2151][64][64];
        this.field2156 = new byte[this.field2151][64][64];
        this.field2150 = new byte[this.field2151][64][64];
        this.field2158 = new class192[this.field2151][64][64][];
        int var2 = arg0.method6272();
        if (class195.field2190.field2186 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6272();
        int var4 = arg0.method6272();
        if (this.field2153 != var3 || this.field2148 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3524(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class176)) {
            class176 var2 = (class176) arg0;
            return this.field2153 == var2.field2153 && this.field2148 == var2.field2148;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2153 | this.field2148 << 8;
    }
}
