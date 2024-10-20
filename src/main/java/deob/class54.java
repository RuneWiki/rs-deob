package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bt")
public class class54 implements Runnable {

    @ObfuscatedName("bt.c")
    public class73 field1162;

    @ObfuscatedName("bt.j")
    public volatile class51[] field1159 = new class51[2];

    @ObfuscatedName("bt.f")
    public volatile boolean field1160 = false;

    @ObfuscatedName("bt.y")
    public volatile boolean field1164 = false;

    public void run() {
        this.field1164 = true;
        try {
            while (!this.field1160) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1159[var1];
                    if (var2 != null) {
                        var2.method1105();
                    }
                }
                class126.method2308(10L);
                class73 var3 = this.field1162;
                Object var4 = null;
                if (var3.field1314 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1314.peekEvent() != null; var5++) {
                        class126.method2308(1L);
                    }
                    if (var4 != null) {
                        var3.field1314.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class79.method848((String) null, var10);
        } finally {
            this.field1164 = false;
        }
    }
}
