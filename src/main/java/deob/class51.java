package deob;

@ObfuscatedName("ae")
public class class51 {

    @ObfuscatedName("ae.h")
    public int field387;

    @ObfuscatedName("ae.e")
    public int field386;

    @ObfuscatedName("ae.v")
    public int[] field388;

    @ObfuscatedName("ae.x")
    public int[] field385;

    public class51() {
        class54.method1017(16);
        this.field387 = class54.method1037() == 0 ? 1 : class54.method1017(4) + 1;
        if (class54.method1037() != 0) {
            class54.method1017(8);
        }
        class54.method1017(2);
        if (this.field387 > 1) {
            this.field386 = class54.method1017(4);
        }
        this.field388 = new int[this.field387];
        this.field385 = new int[this.field387];
        for (int var1 = 0; var1 < this.field387; var1++) {
            class54.method1017(8);
            this.field388[var1] = class54.method1017(8);
            this.field385[var1] = class54.method1017(8);
        }
    }
}
