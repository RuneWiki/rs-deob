package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class63 implements Runnable {

    @ObfuscatedName("bp.m")
    public class120 field1222;

    @ObfuscatedName("bp.k")
    public volatile class47[] field1218 = new class47[2];

    @ObfuscatedName("bp.y")
    public volatile boolean field1220 = false;

    @ObfuscatedName("bp.g")
    public volatile boolean field1219 = false;

    public void run() {
        this.field1219 = true;
        try {
            while (!this.field1220) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class47 var2 = this.field1218[var1];
                    if (var2 != null) {
                        var2.method956();
                    }
                }
                class111.method59(10L);
                class120 var3 = this.field1222;
                Object var4 = null;
                if (var3.field1906 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1906.peekEvent() != null; var5++) {
                        class111.method59(1L);
                    }
                    if (var4 != null) {
                        var3.field1906.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class132.method130((String) null, var10);
        } finally {
            this.field1219 = false;
        }
    }
}
