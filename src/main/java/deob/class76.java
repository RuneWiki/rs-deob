package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ba")
public class class76 implements Runnable {

    @ObfuscatedName("ba.s")
    public class140 field1398;

    @ObfuscatedName("ba.z")
    public volatile class60[] field1391 = new class60[2];

    @ObfuscatedName("ba.t")
    public volatile boolean field1392 = false;

    @ObfuscatedName("ba.y")
    public volatile boolean field1393 = false;

    public void run() {
        this.field1393 = true;
        try {
            while (!this.field1392) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1391[var1];
                    if (var2 != null) {
                        var2.method1169();
                    }
                }
                class131.method182(10L);
                class140 var3 = this.field1398;
                Object var4 = null;
                if (var3.field2142 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2142.peekEvent() != null; var5++) {
                        class131.method182(1L);
                    }
                    if (var4 != null) {
                        var3.field2142.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class152.method2846((String) null, var10);
        } finally {
            this.field1393 = false;
        }
    }
}
