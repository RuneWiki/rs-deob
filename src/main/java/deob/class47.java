package deob;

@ObfuscatedName("ag")
public class class47 {

    @ObfuscatedName("ag.c")
    public int field365;

    @ObfuscatedName("ag.p")
    public int field367;

    @ObfuscatedName("ag.f")
    public int[] field366;

    @ObfuscatedName("ag.n")
    public int[] field364;

    public class47() {
        class50.method991(16);
        this.field365 = class50.method988() == 0 ? 1 : class50.method991(4) + 1;
        if (class50.method988() != 0) {
            class50.method991(8);
        }
        class50.method991(2);
        if (this.field365 > 1) {
            this.field367 = class50.method991(4);
        }
        this.field366 = new int[this.field365];
        this.field364 = new int[this.field365];
        for (int var1 = 0; var1 < this.field365; var1++) {
            class50.method991(8);
            this.field366[var1] = class50.method991(8);
            this.field364[var1] = class50.method991(8);
        }
    }
}
