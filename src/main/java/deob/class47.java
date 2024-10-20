package deob;

@ObfuscatedName("av")
public class class47 {

    @ObfuscatedName("av.c")
    public int field352;

    @ObfuscatedName("av.v")
    public int field354;

    @ObfuscatedName("av.q")
    public int[] field351;

    @ObfuscatedName("av.f")
    public int[] field353;

    public class47() {
        class50.method918(16);
        this.field352 = class50.method896() == 0 ? 1 : class50.method918(4) + 1;
        if (class50.method896() != 0) {
            class50.method918(8);
        }
        class50.method918(2);
        if (this.field352 > 1) {
            this.field354 = class50.method918(4);
        }
        this.field351 = new int[this.field352];
        this.field353 = new int[this.field352];
        for (int var1 = 0; var1 < this.field352; var1++) {
            class50.method918(8);
            this.field351[var1] = class50.method918(8);
            this.field353[var1] = class50.method918(8);
        }
    }
}
