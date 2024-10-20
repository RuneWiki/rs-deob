package deob;

@ObfuscatedName("ai")
public class class45 {

    @ObfuscatedName("ai.n")
    public int field341;

    @ObfuscatedName("ai.c")
    public int field338;

    @ObfuscatedName("ai.m")
    public int[] field340;

    @ObfuscatedName("ai.k")
    public int[] field339;

    public class45() {
        class48.method929(16);
        this.field341 = class48.method928() == 0 ? 1 : class48.method929(4) + 1;
        if (class48.method928() != 0) {
            class48.method929(8);
        }
        class48.method929(2);
        if (this.field341 > 1) {
            this.field338 = class48.method929(4);
        }
        this.field340 = new int[this.field341];
        this.field339 = new int[this.field341];
        for (int var1 = 0; var1 < this.field341; var1++) {
            class48.method929(8);
            this.field340[var1] = class48.method929(8);
            this.field339[var1] = class48.method929(8);
        }
    }
}
