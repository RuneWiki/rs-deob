package deob;

@ObfuscatedName("br")
public class class55 implements Runnable {

    @ObfuscatedName("br.i")
    public class74 field1188;

    @ObfuscatedName("br.v")
    public volatile class52[] field1182 = new class52[2];

    @ObfuscatedName("br.m")
    public volatile boolean field1183 = false;

    @ObfuscatedName("br.j")
    public volatile boolean field1186 = false;

    public void run() {
        this.field1186 = true;
        try {
            while (!this.field1183) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1182[var1];
                    if (var2 != null) {
                        var2.method1193();
                    }
                }
                class126.method1440(10L);
                class69.method589(this.field1188, (Object) null);
            }
        } catch (Exception var7) {
            class80.method562((String) null, var7);
        } finally {
            this.field1186 = false;
        }
    }
}
