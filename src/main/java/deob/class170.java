package deob;

@ObfuscatedName("fu")
public class class170 extends class176 {

    @ObfuscatedName("fu.f")
    public int field2010;

    @ObfuscatedName("fu.e")
    public int field2011;

    @ObfuscatedName("fu.v")
    public int field2009;

    @ObfuscatedName("fu.y")
    public int field2012;

    @ObfuscatedName("fu.f(Lnt;I)V")
    public void method3242(class384 arg0) {
        int var2 = arg0.method5902();
        if (class182.field2109.field2110 != var2) {
            throw new IllegalStateException("");
        }
        this.field2064 = arg0.method5902();
        this.field2065 = arg0.method5902();
        this.field2070 = arg0.method5899();
        this.field2060 = arg0.method5899();
        this.field2010 = arg0.method5902();
        this.field2011 = arg0.method5902();
        this.field2062 = arg0.method5899();
        this.field2063 = arg0.method5899();
        this.field2009 = arg0.method5902();
        this.field2012 = arg0.method5902();
        this.field2066 = arg0.method5914();
        this.field2072 = arg0.method5914();
    }

    @ObfuscatedName("fu.e(Lnt;I)V")
    public void method2942(class384 arg0) {
        this.field2065 = Math.min(this.field2065, 4);
        this.field2068 = new short[1][64][64];
        this.field2071 = new short[this.field2065][64][64];
        this.field2069 = new byte[this.field2065][64][64];
        this.field2075 = new byte[this.field2065][64][64];
        this.field2073 = new class178[this.field2065][64][64][];
        int var2 = arg0.method5902();
        if (class181.field2104.field2105 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5902();
        int var4 = arg0.method5902();
        int var5 = arg0.method5902();
        int var6 = arg0.method5902();
        if (this.field2062 != var3 || this.field2063 != var4 || this.field2009 != var5 || this.field2012 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3292(this.field2009 * 8 + var7, this.field2012 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class170)) {
            return false;
        }
        class170 var2 = (class170) arg0;
        if (this.field2062 == var2.field2062 && this.field2063 == var2.field2063) {
            return this.field2009 == var2.field2009 && this.field2012 == var2.field2012;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2062 | this.field2063 << 8 | this.field2009 << 16 | this.field2012 << 24;
    }

    @ObfuscatedName("fu.v(S)I")
    public int method3244() {
        return this.field2010;
    }

    @ObfuscatedName("fu.y(I)I")
    public int method3260() {
        return this.field2011;
    }

    @ObfuscatedName("fu.j(B)I")
    public int method3251() {
        return this.field2009;
    }

    @ObfuscatedName("fu.r(B)I")
    public int method3247() {
        return this.field2012;
    }
}
