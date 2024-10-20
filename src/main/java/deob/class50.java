package deob;

@ObfuscatedName("am")
public class class50 {

    @ObfuscatedName("am.f")
    public int field373;

    @ObfuscatedName("am.w")
    public int field374;

    @ObfuscatedName("am.v")
    public int[] field375;

    @ObfuscatedName("am.s")
    public int[] field376;

    public class50() {
        class53.method1005(16);
        this.field373 = class53.method1021() == 0 ? 1 : class53.method1005(4) + 1;
        if (class53.method1021() != 0) {
            class53.method1005(8);
        }
        class53.method1005(2);
        if (this.field373 > 1) {
            this.field374 = class53.method1005(4);
        }
        this.field375 = new int[this.field373];
        this.field376 = new int[this.field373];
        for (int var1 = 0; var1 < this.field373; var1++) {
            class53.method1005(8);
            this.field375[var1] = class53.method1005(8);
            this.field376[var1] = class53.method1005(8);
        }
    }
}
