package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bt")
public class class71 implements Runnable {

    @ObfuscatedName("bt.j")
    public class131 field1316;

    @ObfuscatedName("bt.y")
    public volatile class55[] field1317 = new class55[2];

    @ObfuscatedName("bt.z")
    public volatile boolean field1318 = false;

    @ObfuscatedName("bt.l")
    public volatile boolean field1319 = false;

    public void run() {
        this.field1319 = true;
        try {
            while (!this.field1318) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class55 var2 = this.field1317[var1];
                    if (var2 != null) {
                        var2.method1201();
                    }
                }
                class122.method558(10L);
                class131 var3 = this.field1316;
                Object var4 = null;
                if (var3.field1984 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1984.peekEvent() != null; var5++) {
                        class122.method558(1L);
                    }
                    if (var4 != null) {
                        var3.field1984.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class143.method1973((String) null, var10);
        } finally {
            this.field1319 = false;
        }
    }
}
