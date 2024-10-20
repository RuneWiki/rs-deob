package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class73 implements Runnable {

    @ObfuscatedName("bg.h")
    public class136 field1360;

    @ObfuscatedName("bg.m")
    public volatile class57[] field1361 = new class57[2];

    @ObfuscatedName("bg.i")
    public volatile boolean field1359 = false;

    @ObfuscatedName("bg.q")
    public volatile boolean field1362 = false;

    public void run() {
        this.field1362 = true;
        try {
            while (!this.field1359) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1361[var1];
                    if (var2 != null) {
                        var2.method1139();
                    }
                }
                class127.method952(10L);
                class136 var3 = this.field1360;
                Object var4 = null;
                if (var3.field2097 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2097.peekEvent() != null; var5++) {
                        class127.method952(1L);
                    }
                    if (var4 != null) {
                        var3.field2097.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method2106((String) null, var10);
        } finally {
            this.field1362 = false;
        }
    }
}
