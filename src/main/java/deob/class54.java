package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bc")
public class class54 implements Runnable {

    @ObfuscatedName("bc.g")
    public class73 field1166;

    @ObfuscatedName("bc.e")
    public volatile class51[] field1165 = new class51[2];

    @ObfuscatedName("bc.n")
    public volatile boolean field1169 = false;

    @ObfuscatedName("bc.j")
    public volatile boolean field1167 = false;

    public void run() {
        this.field1167 = true;
        try {
            while (!this.field1169) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1165[var1];
                    if (var2 != null) {
                        var2.method1145();
                    }
                }
                class125.method2058(10L);
                class73 var3 = this.field1166;
                Object var4 = null;
                if (var3.field1330 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1330.peekEvent() != null; var5++) {
                        class125.method2058(1L);
                    }
                    if (var4 != null) {
                        var3.field1330.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class79.method126((String) null, var10);
        } finally {
            this.field1167 = false;
        }
    }
}
