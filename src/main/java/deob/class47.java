package deob;

@ObfuscatedName("aa")
public class class47 {

    @ObfuscatedName("aa.s")
    public int field356;

    @ObfuscatedName("aa.h")
    public int field353;

    @ObfuscatedName("aa.w")
    public int[] field354;

    @ObfuscatedName("aa.v")
    public int[] field355;

    public class47() {
        class50.method891(16);
        this.field356 = class50.method890() == 0 ? 1 : class50.method891(4) + 1;
        if (class50.method890() != 0) {
            class50.method891(8);
        }
        class50.method891(2);
        if (this.field356 > 1) {
            this.field353 = class50.method891(4);
        }
        this.field354 = new int[this.field356];
        this.field355 = new int[this.field356];
        for (int var1 = 0; var1 < this.field356; var1++) {
            class50.method891(8);
            this.field354[var1] = class50.method891(8);
            this.field355[var1] = class50.method891(8);
        }
    }
}
