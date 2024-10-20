package deob;

@ObfuscatedName("bf")
public class class63 {

    @ObfuscatedName("bf.l")
    public int field1177;

    @ObfuscatedName("bf.y")
    public int field1176;

    @ObfuscatedName("bf.g")
    public int[] field1175;

    @ObfuscatedName("bf.j")
    public int[] field1178;

    public class63() {
        class65.method1271(16);
        this.field1177 = class65.method1284() == 0 ? 1 : class65.method1271(4) + 1;
        if (class65.method1284() != 0) {
            class65.method1271(8);
        }
        class65.method1271(2);
        if (this.field1177 > 1) {
            this.field1176 = class65.method1271(4);
        }
        this.field1175 = new int[this.field1177];
        this.field1178 = new int[this.field1177];
        for (int var1 = 0; var1 < this.field1177; var1++) {
            class65.method1271(8);
            this.field1175[var1] = class65.method1271(8);
            this.field1178[var1] = class65.method1271(8);
        }
    }
}
