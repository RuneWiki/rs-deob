package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ba")
public class class73 implements Runnable {

    @ObfuscatedName("ba.y")
    public class136 field1350;

    @ObfuscatedName("ba.d")
    public volatile class57[] field1349 = new class57[2];

    @ObfuscatedName("ba.g")
    public volatile boolean field1357 = false;

    @ObfuscatedName("ba.w")
    public volatile boolean field1356 = false;

    public void run() {
        this.field1356 = true;
        try {
            while (!this.field1357) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1349[var1];
                    if (var2 != null) {
                        var2.method1185();
                    }
                }
                class127.method1535(10L);
                class136 var3 = this.field1350;
                Object var4 = null;
                if (var3.field2069 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2069.peekEvent() != null; var5++) {
                        class127.method1535(1L);
                    }
                    if (var4 != null) {
                        var3.field2069.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method2701((String) null, var10);
        } finally {
            this.field1356 = false;
        }
    }
}
