package deob;

@ObfuscatedName("ge")
public class class196 extends class210 {

    @ObfuscatedName("ge.v(Lpi;S)V")
    public void method3547(class438 arg0) {
        int var2 = arg0.method6971();
        if (class216.field2384.field2385 != var2) {
            throw new IllegalStateException("");
        }
        this.field2345 = arg0.method6971();
        this.field2334 = arg0.method6971();
        this.field2344 = arg0.method7148();
        this.field2339 = arg0.method7148();
        this.field2336 = arg0.method7148();
        this.field2337 = arg0.method7148();
        this.field2340 = arg0.method6989();
        this.field2341 = arg0.method6989();
    }

    @ObfuscatedName("ge.c(Lpi;I)V")
    public void method3548(class438 arg0) {
        this.field2334 = Math.min(this.field2334, 4);
        this.field2342 = new short[1][64][64];
        this.field2338 = new short[this.field2334][64][64];
        this.field2335 = new byte[this.field2334][64][64];
        this.field2343 = new byte[this.field2334][64][64];
        this.field2346 = new class212[this.field2334][64][64][];
        int var2 = arg0.method6971();
        if (class215.field2381.field2383 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6971();
        int var4 = arg0.method6971();
        if (this.field2336 != var3 || this.field2337 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method3905(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class196)) {
            class196 var2 = (class196) arg0;
            return this.field2336 == var2.field2336 && this.field2337 == var2.field2337;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2336 | this.field2337 << 8;
    }
}
