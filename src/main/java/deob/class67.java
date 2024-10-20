package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bd")
public class class67 implements Runnable {

    @ObfuscatedName("bd.x")
    public class125 field1262;

    @ObfuscatedName("bd.v")
    public volatile class51[] field1267 = new class51[2];

    @ObfuscatedName("bd.m")
    public volatile boolean field1263 = false;

    @ObfuscatedName("bd.e")
    public volatile boolean field1264 = false;

    public void run() {
        this.field1264 = true;
        try {
            while (!this.field1263) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1267[var1];
                    if (var2 != null) {
                        var2.method1028();
                    }
                }
                class116.method1361(10L);
                class125 var3 = this.field1262;
                Object var4 = null;
                if (var3.field1953 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1953.peekEvent() != null; var5++) {
                        class116.method1361(1L);
                    }
                    if (var4 != null) {
                        var3.field1953.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class137.method483((String) null, var10);
        } finally {
            this.field1264 = false;
        }
    }
}
