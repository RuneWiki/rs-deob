package deob;

@ObfuscatedName("bz")
public class class70 {

    @ObfuscatedName("bz.s")
    public int field1147;

    @ObfuscatedName("bz.c")
    public int field1145;

    @ObfuscatedName("bz.f")
    public int[] field1146;

    @ObfuscatedName("bz.h")
    public int[] field1144;

    public class70() {
        class55.method907(16);
        this.field1147 = class55.method906() == 0 ? 1 : class55.method907(4) + 1;
        if (class55.method906() != 0) {
            class55.method907(8);
        }
        class55.method907(2);
        if (this.field1147 > 1) {
            this.field1145 = class55.method907(4);
        }
        this.field1146 = new int[this.field1147];
        this.field1144 = new int[this.field1147];
        for (int var1 = 0; var1 < this.field1147; var1++) {
            class55.method907(8);
            this.field1146[var1] = class55.method907(8);
            this.field1144[var1] = class55.method907(8);
        }
    }
}
