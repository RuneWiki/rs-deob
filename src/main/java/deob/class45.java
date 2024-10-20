package deob;

@ObfuscatedName("bv")
public class class45 implements Runnable {

    @ObfuscatedName("bv.at")
    public volatile class43[] field316 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field316[var1];
                if (var2 != null) {
                    var2.method740();
                }
            }
        } catch (Exception var4) {
            class528.method4947((String) null, var4);
        }
    }
}
