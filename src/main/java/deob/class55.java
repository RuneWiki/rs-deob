package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bw")
public class class55 implements Runnable {

    @ObfuscatedName("bw.f")
    public class74 field1170;

    @ObfuscatedName("bw.t")
    public volatile class52[] field1162 = new class52[2];

    @ObfuscatedName("bw.n")
    public volatile boolean field1163 = false;

    @ObfuscatedName("bw.e")
    public volatile boolean field1164 = false;

    public void run() {
        this.field1164 = true;
        try {
            while (!this.field1163) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1162[var1];
                    if (var2 != null) {
                        var2.method1143();
                    }
                }
                class126.method815(10L);
                class74 var3 = this.field1170;
                Object var4 = null;
                if (var3.field1324 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1324.peekEvent() != null; var5++) {
                        class126.method815(1L);
                    }
                    if (var4 != null) {
                        var3.field1324.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method802((String) null, var10);
        } finally {
            this.field1164 = false;
        }
    }
}
