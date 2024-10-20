package deob;

@ObfuscatedName("bf")
public class class73 implements Runnable {

    @ObfuscatedName("bf.a")
    public class137 field1358;

    @ObfuscatedName("bf.w")
    public volatile class57[] field1361 = new class57[2];

    @ObfuscatedName("bf.d")
    public volatile boolean field1363 = false;

    @ObfuscatedName("bf.c")
    public volatile boolean field1359 = false;

    public void run() {
        this.field1359 = true;
        try {
            while (!this.field1363) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1361[var1];
                    if (var2 != null) {
                        var2.method1255();
                    }
                }
                class128.method56(10L);
                class143.method2709(this.field1358, (Object) null);
            }
        } catch (Exception var7) {
            class149.method650((String) null, var7);
        } finally {
            this.field1359 = false;
        }
    }
}
