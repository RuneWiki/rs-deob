package deob;

@ObfuscatedName("bw")
public class class70 {

    @ObfuscatedName("bw.b")
    public int field1158;

    @ObfuscatedName("bw.e")
    public int field1157;

    @ObfuscatedName("bw.c")
    public int[] field1156;

    @ObfuscatedName("bw.l")
    public int[] field1159;

    public class70() {
        class55.method996(16);
        this.field1158 = class55.method982() == 0 ? 1 : class55.method996(4) + 1;
        if (class55.method982() != 0) {
            class55.method996(8);
        }
        class55.method996(2);
        if (this.field1158 > 1) {
            this.field1157 = class55.method996(4);
        }
        this.field1156 = new int[this.field1158];
        this.field1159 = new int[this.field1158];
        for (int var1 = 0; var1 < this.field1158; var1++) {
            class55.method996(8);
            this.field1156[var1] = class55.method996(8);
            this.field1159[var1] = class55.method996(8);
        }
    }
}
