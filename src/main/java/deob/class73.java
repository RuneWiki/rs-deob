package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bt")
public class class73 implements Runnable {

    @ObfuscatedName("bt.h")
    public class136 field1358;

    @ObfuscatedName("bt.q")
    public volatile class57[] field1360 = new class57[2];

    @ObfuscatedName("bt.v")
    public volatile boolean field1355 = false;

    @ObfuscatedName("bt.n")
    public volatile boolean field1356 = false;

    public void run() {
        this.field1356 = true;
        try {
            while (!this.field1355) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1360[var1];
                    if (var2 != null) {
                        var2.method1165();
                    }
                }
                class127.method2075(10L);
                class136 var3 = this.field1358;
                Object var4 = null;
                if (var3.field2083 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2083.peekEvent() != null; var5++) {
                        class127.method2075(1L);
                    }
                    if (var4 != null) {
                        var3.field2083.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method190((String) null, var10);
        } finally {
            this.field1356 = false;
        }
    }
}
