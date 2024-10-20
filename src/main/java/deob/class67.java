package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class67 implements Runnable {

    @ObfuscatedName("bg.e")
    public class125 field1276;

    @ObfuscatedName("bg.v")
    public volatile class51[] field1271 = new class51[2];

    @ObfuscatedName("bg.k")
    public volatile boolean field1275 = false;

    @ObfuscatedName("bg.g")
    public volatile boolean field1273 = false;

    public void run() {
        this.field1273 = true;
        try {
            while (!this.field1275) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1271[var1];
                    if (var2 != null) {
                        var2.method987();
                    }
                }
                class116.method7(10L);
                class125 var3 = this.field1276;
                Object var4 = null;
                if (var3.field1942 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1942.peekEvent() != null; var5++) {
                        class116.method7(1L);
                    }
                    if (var4 != null) {
                        var3.field1942.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class137.method101((String) null, var10);
        } finally {
            this.field1273 = false;
        }
    }
}
