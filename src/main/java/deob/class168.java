package deob;

@ObfuscatedName("aw")
public class class168 {

    @ObfuscatedName("aw.o")
    public int[] field2569;

    @ObfuscatedName("aw.j")
    public int field2570;

    @ObfuscatedName("aw.t")
    public int[] field2572;

    @ObfuscatedName("aw.p")
    public int field2571;

    public class168() {
        class127.method2141(16);
        this.field2570 = class127.method2173() == 0 ? 1 : class127.method2141(4) + 1;
        if (class127.method2173() != 0) {
            class127.method2141(8);
        }
        class127.method2141(2);
        if (this.field2570 > 1) {
            this.field2571 = class127.method2141(4);
        }
        this.field2569 = new int[this.field2570];
        this.field2572 = new int[this.field2570];
        for (int var1 = 0; var1 < this.field2570; var1++) {
            class127.method2141(8);
            this.field2569[var1] = class127.method2141(8);
            this.field2572[var1] = class127.method2141(8);
        }
    }
}
