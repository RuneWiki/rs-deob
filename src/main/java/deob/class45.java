package deob;

@ObfuscatedName("ap")
public class class45 {

    @ObfuscatedName("ap.l")
    public int field342;

    @ObfuscatedName("ap.q")
    public int field340;

    @ObfuscatedName("ap.f")
    public int[] field341;

    @ObfuscatedName("ap.j")
    public int[] field339;

    public class45() {
        class48.method928(16);
        this.field342 = class48.method909() == 0 ? 1 : class48.method928(4) + 1;
        if (class48.method909() != 0) {
            class48.method928(8);
        }
        class48.method928(2);
        if (this.field342 > 1) {
            this.field340 = class48.method928(4);
        }
        this.field341 = new int[this.field342];
        this.field339 = new int[this.field342];
        for (int var1 = 0; var1 < this.field342; var1++) {
            class48.method928(8);
            this.field341[var1] = class48.method928(8);
            this.field339[var1] = class48.method928(8);
        }
    }
}
