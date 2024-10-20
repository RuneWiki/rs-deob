package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bm")
public class class55 implements Runnable {

    @ObfuscatedName("bm.i")
    public class74 field1181;

    @ObfuscatedName("bm.p")
    public volatile class52[] field1180 = new class52[2];

    @ObfuscatedName("bm.a")
    public volatile boolean field1188 = false;

    @ObfuscatedName("bm.l")
    public volatile boolean field1182 = false;

    public void run() {
        this.field1182 = true;
        try {
            while (!this.field1188) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1180[var1];
                    if (var2 != null) {
                        var2.method1117();
                    }
                }
                class126.method1489(10L);
                class74 var3 = this.field1181;
                Object var4 = null;
                if (var3.field1354 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1354.peekEvent() != null; var5++) {
                        class126.method1489(1L);
                    }
                    if (var4 != null) {
                        var3.field1354.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method252((String) null, var10);
        } finally {
            this.field1182 = false;
        }
    }
}
