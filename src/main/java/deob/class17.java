package deob;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.r")
    public int field231;

    @ObfuscatedName("b.d")
    public int field232;

    @ObfuscatedName("b.l")
    public int[] field234;

    @ObfuscatedName("b.m")
    public int[] field233;

    public class17() {
        class130.method1561(16);
        this.field231 = class130.method1553() == 0 ? 1 : class130.method1561(4) + 1;
        if (class130.method1553() != 0) {
            class130.method1561(8);
        }
        class130.method1561(2);
        if (this.field231 > 1) {
            this.field232 = class130.method1561(4);
        }
        this.field234 = new int[this.field231];
        this.field233 = new int[this.field231];
        for (int var1 = 0; var1 < this.field231; var1++) {
            class130.method1561(8);
            this.field234[var1] = class130.method1561(8);
            this.field233[var1] = class130.method1561(8);
        }
    }
}
