package deob;

@ObfuscatedName("bw")
public class class72 {

    @ObfuscatedName("bw.i")
    public int field1335;

    @ObfuscatedName("bw.h")
    public int field1334;

    @ObfuscatedName("bw.e")
    public int[] field1336;

    @ObfuscatedName("bw.g")
    public int[] field1337;

    public class72() {
        class74.method1480(16);
        this.field1335 = class74.method1479() == 0 ? 1 : class74.method1480(4) + 1;
        if (class74.method1479() != 0) {
            class74.method1480(8);
        }
        class74.method1480(2);
        if (this.field1335 > 1) {
            this.field1334 = class74.method1480(4);
        }
        this.field1336 = new int[this.field1335];
        this.field1337 = new int[this.field1335];
        for (int var1 = 0; var1 < this.field1335; var1++) {
            class74.method1480(8);
            this.field1336[var1] = class74.method1480(8);
            this.field1337[var1] = class74.method1480(8);
        }
    }
}
