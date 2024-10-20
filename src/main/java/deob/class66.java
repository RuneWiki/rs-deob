package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bt")
public class class66 implements Runnable {

    @ObfuscatedName("bt.n")
    public class123 field1246;

    @ObfuscatedName("bt.x")
    public volatile class50[] field1244 = new class50[2];

    @ObfuscatedName("bt.k")
    public volatile boolean field1245 = false;

    @ObfuscatedName("bt.i")
    public volatile boolean field1249 = false;

    public void run() {
        this.field1249 = true;
        try {
            while (!this.field1245) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1244[var1];
                    if (var2 != null) {
                        var2.method1005();
                    }
                }
                class114.method25(10L);
                class123 var3 = this.field1246;
                Object var4 = null;
                if (var3.field1929 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1929.peekEvent() != null; var5++) {
                        class114.method25(1L);
                    }
                    if (var4 != null) {
                        var3.field1929.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            Statics.method3084((String) null, var10);
        } finally {
            this.field1249 = false;
        }
    }
}
