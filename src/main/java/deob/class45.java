package deob;

@ObfuscatedName("bd")
public class class45 implements Runnable {

    @ObfuscatedName("bd.ap")
    public volatile class43[] field289 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field289[var1];
                if (var2 != null) {
                    var2.method780();
                }
            }
        } catch (Exception var4) {
            class584.method8201((String) null, var4);
        }
    }
}
