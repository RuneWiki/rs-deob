package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bf")
public class class73 implements Runnable {

    @ObfuscatedName("bf.n")
    public class136 field1342;

    @ObfuscatedName("bf.q")
    public volatile class57[] field1341 = new class57[2];

    @ObfuscatedName("bf.c")
    public volatile boolean field1346 = false;

    @ObfuscatedName("bf.l")
    public volatile boolean field1343 = false;

    public void run() {
        this.field1343 = true;
        try {
            while (!this.field1346) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1341[var1];
                    if (var2 != null) {
                        var2.method1175();
                    }
                }
                class127.method1567(10L);
                class136 var3 = this.field1342;
                Object var4 = null;
                if (var3.field2079 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2079.peekEvent() != null; var5++) {
                        class127.method1567(1L);
                    }
                    if (var4 != null) {
                        var3.field2079.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method2765((String) null, var10);
        } finally {
            this.field1343 = false;
        }
    }
}
