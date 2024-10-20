package deob;

@ObfuscatedName("ap")
public class class45 {

    @ObfuscatedName("ap.i")
    public int field325;

    @ObfuscatedName("ap.w")
    public int field326;

    @ObfuscatedName("ap.s")
    public int[] field328;

    @ObfuscatedName("ap.a")
    public int[] field327;

    public class45() {
        class48.method948(16);
        this.field325 = class48.method973() == 0 ? 1 : class48.method948(4) + 1;
        if (class48.method973() != 0) {
            class48.method948(8);
        }
        class48.method948(2);
        if (this.field325 > 1) {
            this.field326 = class48.method948(4);
        }
        this.field328 = new int[this.field325];
        this.field327 = new int[this.field325];
        for (int var1 = 0; var1 < this.field325; var1++) {
            class48.method948(8);
            this.field328[var1] = class48.method948(8);
            this.field327[var1] = class48.method948(8);
        }
    }
}
