package deob;

@ObfuscatedName("fw")
public class class169 extends class175 {

    @ObfuscatedName("fw.v")
    public int field2006;

    @ObfuscatedName("fw.n")
    public int field2010;

    @ObfuscatedName("fw.f")
    public int field2007;

    @ObfuscatedName("fw.y")
    public int field2008;

    @ObfuscatedName("fw.v(Lnd;I)V")
    public void method3277(class383 arg0) {
        int var2 = arg0.method5965();
        if (class181.field2108.field2112 != var2) {
            throw new IllegalStateException("");
        }
        this.field2060 = arg0.method5965();
        this.field2061 = arg0.method5965();
        this.field2056 = arg0.method5967();
        this.field2063 = arg0.method5967();
        this.field2006 = arg0.method5965();
        this.field2010 = arg0.method5965();
        this.field2058 = arg0.method5967();
        this.field2059 = arg0.method5967();
        this.field2007 = arg0.method5965();
        this.field2008 = arg0.method5965();
        this.field2071 = arg0.method5982();
        this.field2067 = arg0.method5982();
    }

    @ObfuscatedName("fw.n(Lnd;I)V")
    public void method2950(class383 arg0) {
        this.field2061 = Math.min(this.field2061, 4);
        this.field2064 = new short[1][64][64];
        this.field2065 = new short[this.field2061][64][64];
        this.field2068 = new byte[this.field2061][64][64];
        this.field2066 = new byte[this.field2061][64][64];
        this.field2057 = new class177[this.field2061][64][64][];
        int var2 = arg0.method5965();
        if (class180.field2100.field2099 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5965();
        int var4 = arg0.method5965();
        int var5 = arg0.method5965();
        int var6 = arg0.method5965();
        if (this.field2058 != var3 || this.field2059 != var4 || this.field2007 != var5 || this.field2008 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3300(this.field2007 * 8 + var7, this.field2008 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class169)) {
            return false;
        }
        class169 var2 = (class169) arg0;
        if (this.field2058 == var2.field2058 && this.field2059 == var2.field2059) {
            return this.field2007 == var2.field2007 && this.field2008 == var2.field2008;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2058 | this.field2059 << 8 | this.field2007 << 16 | this.field2008 << 24;
    }

    @ObfuscatedName("fw.f(I)I")
    public int method3252() {
        return this.field2006;
    }

    @ObfuscatedName("fw.y(I)I")
    public int method3253() {
        return this.field2010;
    }

    @ObfuscatedName("fw.p(I)I")
    public int method3254() {
        return this.field2007;
    }

    @ObfuscatedName("fw.r(I)I")
    public int method3248() {
        return this.field2008;
    }
}
