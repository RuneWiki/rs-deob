package deob;

@ObfuscatedName("as")
public class class49 {

    @ObfuscatedName("as.j")
    public int field1060;

    @ObfuscatedName("as.y")
    public int field1061;

    @ObfuscatedName("as.x")
    public int[] field1062;

    @ObfuscatedName("as.z")
    public int[] field1063;

    public class49() {
        class52.method1181(16);
        this.field1060 = class52.method1188() == 0 ? 1 : class52.method1181(4) + 1;
        if (class52.method1188() != 0) {
            class52.method1181(8);
        }
        class52.method1181(2);
        if (this.field1060 > 1) {
            this.field1061 = class52.method1181(4);
        }
        this.field1062 = new int[this.field1060];
        this.field1063 = new int[this.field1060];
        for (int var1 = 0; var1 < this.field1060; var1++) {
            class52.method1181(8);
            this.field1062[var1] = class52.method1181(8);
            this.field1063[var1] = class52.method1181(8);
        }
    }
}
