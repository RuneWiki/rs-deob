package deob;

@ObfuscatedName("ft")
public class class161 extends class175 {

    @ObfuscatedName("ft.v(Lnd;I)V")
    public void method2949(class383 arg0) {
        int var2 = arg0.method5965();
        if (class181.field2111.field2112 != var2) {
            throw new IllegalStateException("");
        }
        this.field2060 = arg0.method5965();
        this.field2061 = arg0.method5965();
        this.field2056 = arg0.method5967();
        this.field2063 = arg0.method5967();
        this.field2058 = arg0.method5967();
        this.field2059 = arg0.method5967();
        this.field2071 = arg0.method5982();
        this.field2067 = arg0.method5982();
    }

    @ObfuscatedName("ft.n(Lnd;I)V")
    public void method2950(class383 arg0) {
        this.field2061 = Math.min(this.field2061, 4);
        this.field2064 = new short[1][64][64];
        this.field2065 = new short[this.field2061][64][64];
        this.field2068 = new byte[this.field2061][64][64];
        this.field2066 = new byte[this.field2061][64][64];
        this.field2057 = new class177[this.field2061][64][64][];
        int var2 = arg0.method5965();
        if (class180.field2101.field2099 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5965();
        int var4 = arg0.method5965();
        if (this.field2058 != var3 || this.field2059 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3300(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class161)) {
            class161 var2 = (class161) arg0;
            return this.field2058 == var2.field2058 && this.field2059 == var2.field2059;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2058 | this.field2059 << 8;
    }
}
