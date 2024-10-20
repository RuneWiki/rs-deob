package deob;

@ObfuscatedName("bt")
public class class45 implements Runnable {

    @ObfuscatedName("bt.az")
    public volatile class43[] field303 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field303[var1];
                if (var2 != null) {
                    var2.method749();
                }
            }
        } catch (Exception var4) {
            class561.method3291((String) null, var4);
        }
    }
}
