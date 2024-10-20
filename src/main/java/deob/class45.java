package deob;

@ObfuscatedName("be")
public class class45 implements Runnable {

    @ObfuscatedName("be.au")
    public volatile class43[] field331 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field331[var1];
                if (var2 != null) {
                    var2.method806();
                }
            }
        } catch (Exception var4) {
            Statics.method2661((String) null, var4);
        }
    }
}
