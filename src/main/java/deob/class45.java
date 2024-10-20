package deob;

@ObfuscatedName("ad")
public class class45 {

    @ObfuscatedName("ad.v")
    public int field347;

    @ObfuscatedName("ad.c")
    public int field348;

    @ObfuscatedName("ad.i")
    public int[] field350;

    @ObfuscatedName("ad.f")
    public int[] field349;

    public class45() {
        class48.method934(16);
        this.field347 = class48.method933() == 0 ? 1 : class48.method934(4) + 1;
        if (class48.method933() != 0) {
            class48.method934(8);
        }
        class48.method934(2);
        if (this.field347 > 1) {
            this.field348 = class48.method934(4);
        }
        this.field350 = new int[this.field347];
        this.field349 = new int[this.field347];
        for (int var1 = 0; var1 < this.field347; var1++) {
            class48.method934(8);
            this.field350[var1] = class48.method934(8);
            this.field349[var1] = class48.method934(8);
        }
    }
}
