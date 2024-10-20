package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class76 implements Runnable {

    @ObfuscatedName("bh.i")
    public class140 field1411;

    @ObfuscatedName("bh.h")
    public volatile class60[] field1410 = new class60[2];

    @ObfuscatedName("bh.e")
    public volatile boolean field1404 = false;

    @ObfuscatedName("bh.g")
    public volatile boolean field1405 = false;

    public void run() {
        this.field1405 = true;
        try {
            while (!this.field1404) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1410[var1];
                    if (var2 != null) {
                        var2.method1205();
                    }
                }
                class131.method3297(10L);
                class140 var3 = this.field1411;
                Object var4 = null;
                if (var3.field2149 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2149.peekEvent() != null; var5++) {
                        class131.method3297(1L);
                    }
                    if (var4 != null) {
                        var3.field2149.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class152.method2021((String) null, var10);
        } finally {
            this.field1405 = false;
        }
    }
}
