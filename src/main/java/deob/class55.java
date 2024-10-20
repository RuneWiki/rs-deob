package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ba")
public class class55 implements Runnable {

    @ObfuscatedName("ba.g")
    public class74 field1169;

    @ObfuscatedName("ba.m")
    public volatile class52[] field1175 = new class52[2];

    @ObfuscatedName("ba.v")
    public volatile boolean field1168 = false;

    @ObfuscatedName("ba.r")
    public volatile boolean field1166 = false;

    public void run() {
        this.field1166 = true;
        try {
            while (!this.field1168) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1175[var1];
                    if (var2 != null) {
                        var2.method1160();
                    }
                }
                class126.method209(10L);
                class74 var3 = this.field1169;
                Object var4 = null;
                if (var3.field1324 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1324.peekEvent() != null; var5++) {
                        class126.method209(1L);
                    }
                    if (var4 != null) {
                        var3.field1324.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method815((String) null, var10);
        } finally {
            this.field1166 = false;
        }
    }
}
