package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bz")
public class class55 implements Runnable {

    @ObfuscatedName("bz.a")
    public class74 field1196;

    @ObfuscatedName("bz.x")
    public volatile class52[] field1191 = new class52[2];

    @ObfuscatedName("bz.e")
    public volatile boolean field1192 = false;

    @ObfuscatedName("bz.r")
    public volatile boolean field1193 = false;

    public void run() {
        this.field1193 = true;
        try {
            while (!this.field1192) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1191[var1];
                    if (var2 != null) {
                        var2.method1158();
                    }
                }
                class126.method164(10L);
                class74 var3 = this.field1196;
                Object var4 = null;
                if (var3.field1342 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1342.peekEvent() != null; var5++) {
                        class126.method164(1L);
                    }
                    if (var4 != null) {
                        var3.field1342.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method1333((String) null, var10);
        } finally {
            this.field1193 = false;
        }
    }
}
