package deob;

@ObfuscatedName("bv")
public class class73 implements Runnable {

    @ObfuscatedName("bv.k")
    public class136 field1326;

    @ObfuscatedName("bv.h")
    public volatile class57[] field1325 = new class57[2];

    @ObfuscatedName("bv.o")
    public volatile boolean field1327 = false;

    @ObfuscatedName("bv.z")
    public volatile boolean field1330 = false;

    public void run() {
        this.field1330 = true;
        try {
            while (!this.field1327) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1325[var1];
                    if (var2 != null) {
                        var2.method1131();
                    }
                }
                class127.method890(10L);
                class142.method2214(this.field1326, (Object) null);
            }
        } catch (Exception var7) {
            class148.method725((String) null, var7);
        } finally {
            this.field1330 = false;
        }
    }
}
