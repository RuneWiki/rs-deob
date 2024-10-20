package deob;

@ObfuscatedName("ax")
public class class51 {

    @ObfuscatedName("ax.a")
    public int field369;

    @ObfuscatedName("ax.f")
    public int field371;

    @ObfuscatedName("ax.c")
    public int[] field368;

    @ObfuscatedName("ax.x")
    public int[] field370;

    public class51() {
        class54.method1022(16);
        this.field369 = class54.method998() == 0 ? 1 : class54.method1022(4) + 1;
        if (class54.method998() != 0) {
            class54.method1022(8);
        }
        class54.method1022(2);
        if (this.field369 > 1) {
            this.field371 = class54.method1022(4);
        }
        this.field368 = new int[this.field369];
        this.field370 = new int[this.field369];
        for (int var1 = 0; var1 < this.field369; var1++) {
            class54.method1022(8);
            this.field368[var1] = class54.method1022(8);
            this.field370[var1] = class54.method1022(8);
        }
    }
}
