package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bs")
public class class73 implements Runnable {

    @ObfuscatedName("bs.f")
    public class136 field1364;

    @ObfuscatedName("bs.s")
    public volatile class57[] field1359 = new class57[2];

    @ObfuscatedName("bs.q")
    public volatile boolean field1355 = false;

    @ObfuscatedName("bs.g")
    public volatile boolean field1356 = false;

    public void run() {
        this.field1356 = true;
        try {
            while (!this.field1355) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1359[var1];
                    if (var2 != null) {
                        var2.method1165();
                    }
                }
                class127.method1962(10L);
                class136 var3 = this.field1364;
                Object var4 = null;
                if (var3.field2091 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2091.peekEvent() != null; var5++) {
                        class127.method1962(1L);
                    }
                    if (var4 != null) {
                        var3.field2091.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method1532((String) null, var10);
        } finally {
            this.field1356 = false;
        }
    }
}
