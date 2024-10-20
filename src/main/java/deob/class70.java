package deob;

@ObfuscatedName("bh")
public class class70 {

    @ObfuscatedName("bh.d")
    public int field1127;

    @ObfuscatedName("bh.c")
    public int field1128;

    @ObfuscatedName("bh.n")
    public int[] field1129;

    @ObfuscatedName("bh.q")
    public int[] field1130;

    public class70() {
        class55.method976(16);
        this.field1127 = class55.method977() == 0 ? 1 : class55.method976(4) + 1;
        if (class55.method977() != 0) {
            class55.method976(8);
        }
        class55.method976(2);
        if (this.field1127 > 1) {
            this.field1128 = class55.method976(4);
        }
        this.field1129 = new int[this.field1127];
        this.field1130 = new int[this.field1127];
        for (int var1 = 0; var1 < this.field1127; var1++) {
            class55.method976(8);
            this.field1129[var1] = class55.method976(8);
            this.field1130[var1] = class55.method976(8);
        }
    }
}
