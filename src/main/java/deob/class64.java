package deob;

@ObfuscatedName("bh")
public class class64 {

    @ObfuscatedName("bh.o")
    public int field1205;

    @ObfuscatedName("bh.l")
    public int field1203;

    @ObfuscatedName("bh.g")
    public int[] field1206;

    @ObfuscatedName("bh.u")
    public int[] field1204;

    public class64() {
        class66.method1335(16);
        this.field1205 = class66.method1334() == 0 ? 1 : class66.method1335(4) + 1;
        if (class66.method1334() != 0) {
            class66.method1335(8);
        }
        class66.method1335(2);
        if (this.field1205 > 1) {
            this.field1203 = class66.method1335(4);
        }
        this.field1206 = new int[this.field1205];
        this.field1204 = new int[this.field1205];
        for (int var1 = 0; var1 < this.field1205; var1++) {
            class66.method1335(8);
            this.field1206[var1] = class66.method1335(8);
            this.field1204[var1] = class66.method1335(8);
        }
    }
}
