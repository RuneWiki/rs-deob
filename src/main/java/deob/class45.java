package deob;

@ObfuscatedName("bh")
public class class45 implements Runnable {

    @ObfuscatedName("bh.ac")
    public volatile class43[] field322 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field322[var1];
                if (var2 != null) {
                    var2.method769();
                }
            }
        } catch (Exception var4) {
            class556.method3321((String) null, var4);
        }
    }
}
