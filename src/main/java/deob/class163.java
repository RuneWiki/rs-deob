package deob;

@ObfuscatedName("fj")
public class class163 extends class177 {

    @ObfuscatedName("fj.s(Lnv;I)V")
    public void method2894(class385 arg0) {
        int var2 = arg0.method5958();
        if (class183.field2096.field2094 != var2) {
            throw new IllegalStateException("");
        }
        this.field2061 = arg0.method5958();
        this.field2052 = arg0.method5958();
        this.field2051 = arg0.method6053();
        this.field2048 = arg0.method6053();
        this.field2049 = arg0.method6053();
        this.field2053 = arg0.method6053();
        this.field2047 = arg0.method5975();
        this.field2054 = arg0.method5975();
    }

    @ObfuscatedName("fj.t(Lnv;I)V")
    public void method2904(class385 arg0) {
        this.field2052 = Math.min(this.field2052, 4);
        this.field2055 = new short[1][64][64];
        this.field2062 = new short[this.field2052][64][64];
        this.field2057 = new byte[this.field2052][64][64];
        this.field2058 = new byte[this.field2052][64][64];
        this.field2059 = new class179[this.field2052][64][64][];
        int var2 = arg0.method5958();
        if (class182.field2091.field2089 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5958();
        int var4 = arg0.method5958();
        if (this.field2049 != var3 || this.field2053 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3251(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class163)) {
            class163 var2 = (class163) arg0;
            return this.field2049 == var2.field2049 && this.field2053 == var2.field2053;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2049 | this.field2053 << 8;
    }
}
