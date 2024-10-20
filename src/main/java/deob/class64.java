package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bi")
public class class64 implements Runnable {

    @ObfuscatedName("bi.u")
    public class104 field1087;

    @ObfuscatedName("bi.x")
    public volatile class58[] field1088 = new class58[2];

    @ObfuscatedName("bi.i")
    public volatile boolean field1089 = false;

    @ObfuscatedName("bi.a")
    public volatile boolean field1090 = false;

    public void run() {
        this.field1090 = true;
        try {
            while (!this.field1089) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1088[var1];
                    if (var2 != null) {
                        var2.method1004();
                    }
                }
                class162.method1528(10L);
                class104 var3 = this.field1087;
                Object var4 = null;
                if (var3.field1660 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1660.peekEvent() != null; var5++) {
                        class162.method1528(1L);
                    }
                    if (var4 != null) {
                        var3.field1660.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method3043((String) null, var10);
        } finally {
            this.field1090 = false;
        }
    }
}
