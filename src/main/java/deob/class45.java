package deob;

@ObfuscatedName("bm")
public class class45 implements Runnable {

    @ObfuscatedName("bm.ak")
    public volatile class43[] field312 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field312[var1];
                if (var2 != null) {
                    var2.method797();
                }
            }
        } catch (Exception var4) {
            class571.method8083((String) null, var4);
        }
    }
}
