package deob;

@ObfuscatedName("bb")
public class class63 {

    @ObfuscatedName("bb.p")
    public int field1175;

    @ObfuscatedName("bb.y")
    public int field1174;

    @ObfuscatedName("bb.d")
    public int[] field1176;

    @ObfuscatedName("bb.c")
    public int[] field1177;

    public class63() {
        class65.method1302(16);
        this.field1175 = class65.method1299() == 0 ? 1 : class65.method1302(4) + 1;
        if (class65.method1299() != 0) {
            class65.method1302(8);
        }
        class65.method1302(2);
        if (this.field1175 > 1) {
            this.field1174 = class65.method1302(4);
        }
        this.field1176 = new int[this.field1175];
        this.field1177 = new int[this.field1175];
        for (int var1 = 0; var1 < this.field1175; var1++) {
            class65.method1302(8);
            this.field1176[var1] = class65.method1302(8);
            this.field1177[var1] = class65.method1302(8);
        }
    }
}
