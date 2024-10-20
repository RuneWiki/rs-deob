package deob;

@ObfuscatedName("fo")
public class class162 extends class176 {

    @ObfuscatedName("fo.f(Lnt;B)V")
    public void method2941(class384 arg0) {
        int var2 = arg0.method5902();
        if (class182.field2112.field2110 != var2) {
            throw new IllegalStateException("");
        }
        this.field2064 = arg0.method5902();
        this.field2065 = arg0.method5902();
        this.field2070 = arg0.method5899();
        this.field2060 = arg0.method5899();
        this.field2062 = arg0.method5899();
        this.field2063 = arg0.method5899();
        this.field2066 = arg0.method5914();
        this.field2072 = arg0.method5914();
    }

    @ObfuscatedName("fo.e(Lnt;I)V")
    public void method2942(class384 arg0) {
        this.field2065 = Math.min(this.field2065, 4);
        this.field2068 = new short[1][64][64];
        this.field2071 = new short[this.field2065][64][64];
        this.field2069 = new byte[this.field2065][64][64];
        this.field2075 = new byte[this.field2065][64][64];
        this.field2073 = new class178[this.field2065][64][64][];
        int var2 = arg0.method5902();
        if (class181.field2103.field2105 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5902();
        int var4 = arg0.method5902();
        if (this.field2062 != var3 || this.field2063 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3292(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class162)) {
            class162 var2 = (class162) arg0;
            return this.field2062 == var2.field2062 && this.field2063 == var2.field2063;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2062 | this.field2063 << 8;
    }
}
