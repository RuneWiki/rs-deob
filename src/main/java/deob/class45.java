package deob;

@ObfuscatedName("bn")
public class class45 implements Runnable {

    @ObfuscatedName("bn.aq")
    public volatile class43[] field295 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field295[var1];
                if (var2 != null) {
                    var2.method791();
                }
            }
        } catch (Exception var4) {
            class572.method7807((String) null, var4);
        }
    }
}
