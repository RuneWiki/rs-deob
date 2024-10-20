package deob;

@ObfuscatedName("fr")
public class class171 extends class177 {

    @ObfuscatedName("fr.s")
    public int field1996;

    @ObfuscatedName("fr.t")
    public int field1994;

    @ObfuscatedName("fr.v")
    public int field1995;

    @ObfuscatedName("fr.j")
    public int field1993;

    @ObfuscatedName("fr.s(Lnv;S)V")
    public void method3192(class385 arg0) {
        int var2 = arg0.method5958();
        if (class183.field2095.field2094 != var2) {
            throw new IllegalStateException("");
        }
        this.field2061 = arg0.method5958();
        this.field2052 = arg0.method5958();
        this.field2051 = arg0.method6053();
        this.field2048 = arg0.method6053();
        this.field1996 = arg0.method5958();
        this.field1994 = arg0.method5958();
        this.field2049 = arg0.method6053();
        this.field2053 = arg0.method6053();
        this.field1995 = arg0.method5958();
        this.field1993 = arg0.method5958();
        this.field2047 = arg0.method5975();
        this.field2054 = arg0.method5975();
    }

    @ObfuscatedName("fr.t(Lnv;I)V")
    public void method2904(class385 arg0) {
        this.field2052 = Math.min(this.field2052, 4);
        this.field2055 = new short[1][64][64];
        this.field2062 = new short[this.field2052][64][64];
        this.field2057 = new byte[this.field2052][64][64];
        this.field2058 = new byte[this.field2052][64][64];
        this.field2059 = new class179[this.field2052][64][64][];
        int var2 = arg0.method5958();
        if (class182.field2090.field2089 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5958();
        int var4 = arg0.method5958();
        int var5 = arg0.method5958();
        int var6 = arg0.method5958();
        if (this.field2049 != var3 || this.field2053 != var4 || this.field1995 != var5 || this.field1993 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3251(this.field1995 * 8 + var7, this.field1993 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class171)) {
            return false;
        }
        class171 var2 = (class171) arg0;
        if (this.field2049 == var2.field2049 && this.field2053 == var2.field2053) {
            return this.field1995 == var2.field1995 && this.field1993 == var2.field1993;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2049 | this.field2053 << 8 | this.field1995 << 16 | this.field1993 << 24;
    }

    @ObfuscatedName("fr.v(B)I")
    public int method3200() {
        return this.field1996;
    }

    @ObfuscatedName("fr.j(I)I")
    public int method3196() {
        return this.field1994;
    }

    @ObfuscatedName("fr.l(I)I")
    public int method3207() {
        return this.field1995;
    }

    @ObfuscatedName("fr.n(B)I")
    public int method3197() {
        return this.field1993;
    }
}
