package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bd")
public class class67 implements Runnable {

    @ObfuscatedName("bd.p")
    public class127 field1251;

    @ObfuscatedName("bd.y")
    public volatile class51[] field1243 = new class51[2];

    @ObfuscatedName("bd.d")
    public volatile boolean field1246 = false;

    @ObfuscatedName("bd.c")
    public volatile boolean field1245 = false;

    public void run() {
        this.field1245 = true;
        try {
            while (!this.field1246) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1243[var1];
                    if (var2 != null) {
                        var2.method1015();
                    }
                }
                class118.method1901(10L);
                class127 var3 = this.field1251;
                Object var4 = null;
                if (var3.field1950 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1950.peekEvent() != null; var5++) {
                        class118.method1901(1L);
                    }
                    if (var4 != null) {
                        var3.field1950.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class139.method2074((String) null, var10);
        } finally {
            this.field1245 = false;
        }
    }
}
