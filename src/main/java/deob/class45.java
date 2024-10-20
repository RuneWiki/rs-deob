package deob;

@ObfuscatedName("bq")
public class class45 implements Runnable {

    @ObfuscatedName("bq.af")
    public volatile class43[] field332 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field332[var1];
                if (var2 != null) {
                    var2.method813();
                }
            }
        } catch (Exception var4) {
            class516.method6950((String) null, var4);
        }
    }
}
