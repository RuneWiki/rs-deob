package deob;

@ObfuscatedName("bn")
public class class67 {

    @ObfuscatedName("bn.j")
    public int field1251;

    @ObfuscatedName("bn.y")
    public int field1249;

    @ObfuscatedName("bn.z")
    public int[] field1250;

    @ObfuscatedName("bn.l")
    public int[] field1248;

    public class67() {
        class69.method1493(16);
        this.field1251 = class69.method1479() == 0 ? 1 : class69.method1493(4) + 1;
        if (class69.method1479() != 0) {
            class69.method1493(8);
        }
        class69.method1493(2);
        if (this.field1251 > 1) {
            this.field1249 = class69.method1493(4);
        }
        this.field1250 = new int[this.field1251];
        this.field1248 = new int[this.field1251];
        for (int var1 = 0; var1 < this.field1251; var1++) {
            class69.method1493(8);
            this.field1250[var1] = class69.method1493(8);
            this.field1248[var1] = class69.method1493(8);
        }
    }
}
