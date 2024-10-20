package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class54 implements Runnable {

    @ObfuscatedName("bh.z")
    public class73 field1172;

    @ObfuscatedName("bh.h")
    public volatile class51[] field1173 = new class51[2];

    @ObfuscatedName("bh.c")
    public volatile boolean field1174 = false;

    @ObfuscatedName("bh.p")
    public volatile boolean field1178 = false;

    public void run() {
        this.field1178 = true;
        try {
            while (!this.field1174) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1173[var1];
                    if (var2 != null) {
                        var2.method1151();
                    }
                }
                class125.method2379(10L);
                class73 var3 = this.field1172;
                Object var4 = null;
                if (var3.field1329 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1329.peekEvent() != null; var5++) {
                        class125.method2379(1L);
                    }
                    if (var4 != null) {
                        var3.field1329.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class79.method218((String) null, var10);
        } finally {
            this.field1178 = false;
        }
    }
}
