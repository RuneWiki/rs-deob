package deob;

@ObfuscatedName("bx")
public class class45 implements Runnable {

    @ObfuscatedName("bx.aw")
    public volatile class43[] field334 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field334[var1];
                if (var2 != null) {
                    var2.method775();
                }
            }
        } catch (Exception var4) {
            class541.method5458((String) null, var4);
        }
    }
}
