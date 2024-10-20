package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ba")
public class class55 implements Runnable {

    @ObfuscatedName("ba.g")
    public class74 field1175;

    @ObfuscatedName("ba.h")
    public volatile class52[] field1176 = new class52[2];

    @ObfuscatedName("ba.s")
    public volatile boolean field1177 = false;

    @ObfuscatedName("ba.o")
    public volatile boolean field1185 = false;

    public void run() {
        this.field1185 = true;
        try {
            while (!this.field1177) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1176[var1];
                    if (var2 != null) {
                        var2.method1180();
                    }
                }
                class126.method2355(10L);
                class74 var3 = this.field1175;
                Object var4 = null;
                if (var3.field1326 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1326.peekEvent() != null; var5++) {
                        class126.method2355(1L);
                    }
                    if (var4 != null) {
                        var3.field1326.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method1330((String) null, var10);
        } finally {
            this.field1185 = false;
        }
    }
}
