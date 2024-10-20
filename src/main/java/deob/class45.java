package deob;

@ObfuscatedName("bz")
public class class45 implements Runnable {

    @ObfuscatedName("bz.at")
    public volatile class43[] field301 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field301[var1];
                if (var2 != null) {
                    var2.method806();
                }
            }
        } catch (Exception var4) {
            class553.method6436((String) null, var4);
        }
    }
}
