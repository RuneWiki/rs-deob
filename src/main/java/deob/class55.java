package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bl")
public class class55 implements Runnable {

    @ObfuscatedName("bl.x")
    public class74 field1156;

    @ObfuscatedName("bl.p")
    public volatile class52[] field1151 = new class52[2];

    @ObfuscatedName("bl.k")
    public volatile boolean field1153 = false;

    @ObfuscatedName("bl.a")
    public volatile boolean field1159 = false;

    public void run() {
        this.field1159 = true;
        try {
            while (!this.field1153) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1151[var1];
                    if (var2 != null) {
                        var2.method1124();
                    }
                }
                class126.method731(10L);
                class74 var3 = this.field1156;
                Object var4 = null;
                if (var3.field1308 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1308.peekEvent() != null; var5++) {
                        class126.method731(1L);
                    }
                    if (var4 != null) {
                        var3.field1308.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method2341((String) null, var10);
        } finally {
            this.field1159 = false;
        }
    }
}
