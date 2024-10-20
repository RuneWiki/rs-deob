package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bz")
public class class76 implements Runnable {

    @ObfuscatedName("bz.e")
    public class140 field1424;

    @ObfuscatedName("bz.l")
    public volatile class60[] field1419 = new class60[2];

    @ObfuscatedName("bz.c")
    public volatile boolean field1420 = false;

    @ObfuscatedName("bz.h")
    public volatile boolean field1418 = false;

    public void run() {
        this.field1418 = true;
        try {
            while (!this.field1420) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1419[var1];
                    if (var2 != null) {
                        var2.method1245();
                    }
                }
                class131.method2735(10L);
                class140 var3 = this.field1424;
                Object var4 = null;
                if (var3.field2145 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2145.peekEvent() != null; var5++) {
                        class131.method2735(1L);
                    }
                    if (var4 != null) {
                        var3.field2145.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class152.method976((String) null, var10);
        } finally {
            this.field1418 = false;
        }
    }
}
