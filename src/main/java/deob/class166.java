package deob;

@ObfuscatedName("aq")
public class class166 {

    @ObfuscatedName("aq.b")
    public int[] field2541;

    @ObfuscatedName("aq.c")
    public int field2540;

    @ObfuscatedName("aq.i")
    public int[] field2542;

    @ObfuscatedName("aq.v")
    public int field2539;

    public class166() {
        class162.method2885(16);
        this.field2539 = class162.method2884() == 0 ? 1 : class162.method2885(4) + 1;
        if (class162.method2884() != 0) {
            class162.method2885(8);
        }
        class162.method2885(2);
        if (this.field2539 > 1) {
            this.field2540 = class162.method2885(4);
        }
        this.field2541 = new int[this.field2539];
        this.field2542 = new int[this.field2539];
        for (int var1 = 0; var1 < this.field2539; var1++) {
            class162.method2885(8);
            this.field2541[var1] = class162.method2885(8);
            this.field2542[var1] = class162.method2885(8);
        }
    }
}
