package deob;

@ObfuscatedName("bw")
public class class45 implements Runnable {

    @ObfuscatedName("bw.am")
    public volatile class43[] field314 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field314[var1];
                if (var2 != null) {
                    var2.method804();
                }
            }
        } catch (Exception var4) {
            class557.method6332((String) null, var4);
        }
    }
}
