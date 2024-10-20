package deob;

@ObfuscatedName("bx")
public class class63 {

    @ObfuscatedName("bx.x")
    public int field1196;

    @ObfuscatedName("bx.v")
    public int field1193;

    @ObfuscatedName("bx.m")
    public int[] field1195;

    @ObfuscatedName("bx.e")
    public int[] field1194;

    public class63() {
        class65.method1302(16);
        this.field1196 = class65.method1284() == 0 ? 1 : class65.method1302(4) + 1;
        if (class65.method1284() != 0) {
            class65.method1302(8);
        }
        class65.method1302(2);
        if (this.field1196 > 1) {
            this.field1193 = class65.method1302(4);
        }
        this.field1195 = new int[this.field1196];
        this.field1194 = new int[this.field1196];
        for (int var1 = 0; var1 < this.field1196; var1++) {
            class65.method1302(8);
            this.field1195[var1] = class65.method1302(8);
            this.field1194[var1] = class65.method1302(8);
        }
    }
}
