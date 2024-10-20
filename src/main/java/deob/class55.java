package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bm")
public class class55 implements Runnable {

    @ObfuscatedName("bm.b")
    public class74 field1186;

    @ObfuscatedName("bm.c")
    public volatile class52[] field1190 = new class52[2];

    @ObfuscatedName("bm.j")
    public volatile boolean field1187 = false;

    @ObfuscatedName("bm.i")
    public volatile boolean field1191 = false;

    public void run() {
        this.field1191 = true;
        try {
            while (!this.field1187) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1190[var1];
                    if (var2 != null) {
                        var2.method1152();
                    }
                }
                class126.method874(10L);
                class74 var3 = this.field1186;
                Object var4 = null;
                if (var3.field1363 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1363.peekEvent() != null; var5++) {
                        class126.method874(1L);
                    }
                    if (var4 != null) {
                        var3.field1363.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method173((String) null, var10);
        } finally {
            this.field1191 = false;
        }
    }
}
