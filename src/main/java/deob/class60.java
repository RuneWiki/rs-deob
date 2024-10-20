package deob;

@ObfuscatedName("ba")
public class class60 {

    @ObfuscatedName("ba.f")
    public int field458;

    @ObfuscatedName("ba.o")
    public int field459;

    @ObfuscatedName("ba.u")
    public int[] field461;

    @ObfuscatedName("ba.p")
    public int[] field460;

    public class60() {
        class63.method860(16);
        this.field458 = class63.method839() == 0 ? 1 : class63.method860(4) + 1;
        if (class63.method839() != 0) {
            class63.method860(8);
        }
        class63.method860(2);
        if (this.field458 > 1) {
            this.field459 = class63.method860(4);
        }
        this.field461 = new int[this.field458];
        this.field460 = new int[this.field458];
        for (int var1 = 0; var1 < this.field458; var1++) {
            class63.method860(8);
            this.field461[var1] = class63.method860(8);
            this.field460[var1] = class63.method860(8);
        }
    }
}
