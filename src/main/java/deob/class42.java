package deob;

@ObfuscatedName("al")
public class class42 implements Runnable {

    @ObfuscatedName("al.c")
    public volatile class40[] field313 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field313[var1];
                if (var2 != null) {
                    var2.method762();
                }
            }
        } catch (Exception var4) {
            class443.method6513((String) null, var4);
        }
    }
}
