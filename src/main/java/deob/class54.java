package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bu")
public class class54 implements Runnable {

    @ObfuscatedName("bu.u")
    public class73 field1170;

    @ObfuscatedName("bu.k")
    public volatile class51[] field1167 = new class51[2];

    @ObfuscatedName("bu.x")
    public volatile boolean field1166 = false;

    @ObfuscatedName("bu.m")
    public volatile boolean field1164 = false;

    public void run() {
        this.field1164 = true;
        try {
            while (!this.field1166) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1167[var1];
                    if (var2 != null) {
                        var2.method1137();
                    }
                }
                class125.method1228(10L);
                class73 var3 = this.field1170;
                Object var4 = null;
                if (var3.field1326 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1326.peekEvent() != null; var5++) {
                        class125.method1228(1L);
                    }
                    if (var4 != null) {
                        var3.field1326.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class79.method1474((String) null, var10);
        } finally {
            this.field1164 = false;
        }
    }
}
