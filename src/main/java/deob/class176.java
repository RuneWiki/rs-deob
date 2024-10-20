package deob;

@ObfuscatedName("fv")
public class class176 extends class190 {

    @ObfuscatedName("fv.i(Lop;B)V")
    public void method3194(class401 arg0) {
        int var2 = arg0.method6240();
        if (class196.field2187.field2186 != var2) {
            throw new IllegalStateException("");
        }
        this.field2156 = arg0.method6240();
        this.field2149 = arg0.method6240();
        this.field2152 = arg0.method6242();
        this.field2145 = arg0.method6242();
        this.field2147 = arg0.method6242();
        this.field2148 = arg0.method6242();
        this.field2151 = arg0.method6220();
        this.field2158 = arg0.method6220();
    }

    @ObfuscatedName("fv.w(Lop;I)V")
    public void method3197(class401 arg0) {
        this.field2149 = Math.min(this.field2149, 4);
        this.field2153 = new short[1][64][64];
        this.field2154 = new short[this.field2149][64][64];
        this.field2155 = new byte[this.field2149][64][64];
        this.field2146 = new byte[this.field2149][64][64];
        this.field2157 = new class192[this.field2149][64][64][];
        int var2 = arg0.method6240();
        if (class195.field2178.field2181 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6240();
        int var4 = arg0.method6240();
        if (this.field2147 != var3 || this.field2148 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3539(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class176)) {
            class176 var2 = (class176) arg0;
            return this.field2147 == var2.field2147 && this.field2148 == var2.field2148;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2147 | this.field2148 << 8;
    }
}
