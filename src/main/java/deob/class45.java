package deob;

@ObfuscatedName("bp")
public class class45 implements Runnable {

    @ObfuscatedName("bp.aj")
    public volatile class43[] field319 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field319[var1];
                if (var2 != null) {
                    var2.method764();
                }
            }
        } catch (Exception var4) {
            class504.method6263((String) null, var4);
        }
    }
}
