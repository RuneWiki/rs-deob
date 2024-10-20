package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bi")
public class class67 implements Runnable {

    @ObfuscatedName("bi.l")
    public class125 field1244;

    @ObfuscatedName("bi.y")
    public volatile class51[] field1250 = new class51[2];

    @ObfuscatedName("bi.g")
    public volatile boolean field1243 = false;

    @ObfuscatedName("bi.j")
    public volatile boolean field1245 = false;

    public void run() {
        this.field1245 = true;
        try {
            while (!this.field1243) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1250[var1];
                    if (var2 != null) {
                        var2.method981();
                    }
                }
                class116.method71(10L);
                class125 var3 = this.field1244;
                Object var4 = null;
                if (var3.field1938 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1938.peekEvent() != null; var5++) {
                        class116.method71(1L);
                    }
                    if (var4 != null) {
                        var3.field1938.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class137.method2490((String) null, var10);
        } finally {
            this.field1245 = false;
        }
    }
}
