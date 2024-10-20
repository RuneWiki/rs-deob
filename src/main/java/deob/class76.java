package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bk")
public class class76 implements Runnable {

    @ObfuscatedName("bk.l")
    public class140 field1428;

    @ObfuscatedName("bk.g")
    public volatile class60[] field1425 = new class60[2];

    @ObfuscatedName("bk.r")
    public volatile boolean field1421 = false;

    @ObfuscatedName("bk.e")
    public volatile boolean field1422 = false;

    public void run() {
        this.field1422 = true;
        try {
            while (!this.field1421) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1425[var1];
                    if (var2 != null) {
                        var2.method1269();
                    }
                }
                class131.method587(10L);
                class140 var3 = this.field1428;
                Object var4 = null;
                if (var3.field2152 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2152.peekEvent() != null; var5++) {
                        class131.method587(1L);
                    }
                    if (var4 != null) {
                        var3.field2152.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class152.method169((String) null, var10);
        } finally {
            this.field1422 = false;
        }
    }
}
