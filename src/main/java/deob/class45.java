package deob;

@ObfuscatedName("ae")
public class class45 implements Runnable {

    @ObfuscatedName("ae.f")
    public volatile class43[] field341 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field341[var1];
                if (var2 != null) {
                    var2.method773();
                }
            }
        } catch (Exception var4) {
            class500.method2855((String) null, var4);
        }
    }
}
