package deob;

@ObfuscatedName("br")
public class class73 implements Runnable {

    @ObfuscatedName("br.j")
    public class136 field1343;

    @ObfuscatedName("br.m")
    public volatile class57[] field1341 = new class57[2];

    @ObfuscatedName("br.f")
    public volatile boolean field1342 = false;

    @ObfuscatedName("br.l")
    public volatile boolean field1339 = false;

    public void run() {
        this.field1339 = true;
        try {
            while (!this.field1342) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1341[var1];
                    if (var2 != null) {
                        var2.method1184();
                    }
                }
                class127.method692(10L);
                class142.method683(this.field1343, (Object) null);
            }
        } catch (Exception var7) {
            class148.method769((String) null, var7);
        } finally {
            this.field1339 = false;
        }
    }
}
