package deob;

@ObfuscatedName("aj")
public class class174 {

    @ObfuscatedName("aj.b")
    public int field2590;

    @ObfuscatedName("aj.k")
    public int[] field2591;

    @ObfuscatedName("aj.h")
    public int field2589;

    @ObfuscatedName("aj.w")
    public int[] field2592;

    public class174() {
        class121.method2139(16);
        this.field2590 = class121.method2150() == 0 ? 1 : class121.method2139(4) + 1;
        if (class121.method2150() != 0) {
            class121.method2139(8);
        }
        class121.method2139(2);
        if (this.field2590 > 1) {
            this.field2589 = class121.method2139(4);
        }
        this.field2591 = new int[this.field2590];
        this.field2592 = new int[this.field2590];
        for (int var1 = 0; var1 < this.field2590; var1++) {
            class121.method2139(8);
            this.field2591[var1] = class121.method2139(8);
            this.field2592[var1] = class121.method2139(8);
        }
    }
}
