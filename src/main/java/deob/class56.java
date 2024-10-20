package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class56 implements Runnable {

    @ObfuscatedName("bp.e")
    public class75 field1203;

    @ObfuscatedName("bp.i")
    public volatile class53[] field1194 = new class53[2];

    @ObfuscatedName("bp.k")
    public volatile boolean field1195 = false;

    @ObfuscatedName("bp.q")
    public volatile boolean field1196 = false;

    public void run() {
        this.field1196 = true;
        try {
            while (!this.field1195) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class53 var2 = this.field1194[var1];
                    if (var2 != null) {
                        var2.method1197();
                    }
                }
                class127.method2200(10L);
                class75 var3 = this.field1203;
                Object var4 = null;
                if (var3.field1355 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1355.peekEvent() != null; var5++) {
                        class127.method2200(1L);
                    }
                    if (var4 != null) {
                        var3.field1355.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class81.method1452((String) null, var10);
        } finally {
            this.field1196 = false;
        }
    }
}
