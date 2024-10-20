package deob;

@ObfuscatedName("aw")
public class class47 {

    @ObfuscatedName("aw.c")
    public int field365;

    @ObfuscatedName("aw.l")
    public int field364;

    @ObfuscatedName("aw.s")
    public int[] field363;

    @ObfuscatedName("aw.e")
    public int[] field366;

    public class47() {
        class50.method951(16);
        this.field365 = class50.method930() == 0 ? 1 : class50.method951(4) + 1;
        if (class50.method930() != 0) {
            class50.method951(8);
        }
        class50.method951(2);
        if (this.field365 > 1) {
            this.field364 = class50.method951(4);
        }
        this.field363 = new int[this.field365];
        this.field366 = new int[this.field365];
        for (int var1 = 0; var1 < this.field365; var1++) {
            class50.method951(8);
            this.field363[var1] = class50.method951(8);
            this.field366[var1] = class50.method951(8);
        }
    }
}
