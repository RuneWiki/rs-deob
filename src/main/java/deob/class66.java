package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bk")
public class class66 implements Runnable {

    @ObfuscatedName("bk.k")
    public class123 field1245;

    @ObfuscatedName("bk.b")
    public volatile class50[] field1246 = new class50[2];

    @ObfuscatedName("bk.e")
    public volatile boolean field1247 = false;

    @ObfuscatedName("bk.i")
    public volatile boolean field1248 = false;

    public void run() {
        this.field1248 = true;
        try {
            while (!this.field1247) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1246[var1];
                    if (var2 != null) {
                        var2.method985();
                    }
                }
                class114.method500(10L);
                class123 var3 = this.field1245;
                Object var4 = null;
                if (var3.field1951 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1951.peekEvent() != null; var5++) {
                        class114.method500(1L);
                    }
                    if (var4 != null) {
                        var3.field1951.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method2560((String) null, var10);
        } finally {
            this.field1248 = false;
        }
    }
}
