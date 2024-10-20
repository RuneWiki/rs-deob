package deob;

@ObfuscatedName("bz")
public class class60 {

    @ObfuscatedName("bz.v")
    public int field499;

    @ObfuscatedName("bz.n")
    public int field498;

    @ObfuscatedName("bz.f")
    public int[] field500;

    @ObfuscatedName("bz.y")
    public int[] field501;

    public class60() {
        class63.method865(16);
        this.field499 = class63.method862() == 0 ? 1 : class63.method865(4) + 1;
        if (class63.method862() != 0) {
            class63.method865(8);
        }
        class63.method865(2);
        if (this.field499 > 1) {
            this.field498 = class63.method865(4);
        }
        this.field500 = new int[this.field499];
        this.field501 = new int[this.field499];
        for (int var1 = 0; var1 < this.field499; var1++) {
            class63.method865(8);
            this.field500[var1] = class63.method865(8);
            this.field501[var1] = class63.method865(8);
        }
    }
}
