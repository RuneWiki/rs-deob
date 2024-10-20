package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class73 implements Runnable {

    @ObfuscatedName("bg.j")
    public class137 field1331;

    @ObfuscatedName("bg.h")
    public volatile class57[] field1332 = new class57[2];

    @ObfuscatedName("bg.m")
    public volatile boolean field1337 = false;

    @ObfuscatedName("bg.z")
    public volatile boolean field1333 = false;

    public void run() {
        this.field1333 = true;
        try {
            while (!this.field1337) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1332[var1];
                    if (var2 != null) {
                        var2.method1182();
                    }
                }
                class128.method167(10L);
                class137 var3 = this.field1331;
                Object var4 = null;
                if (var3.field2078 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2078.peekEvent() != null; var5++) {
                        class128.method167(1L);
                    }
                    if (var4 != null) {
                        var3.field2078.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class149.method101((String) null, var10);
        } finally {
            this.field1333 = false;
        }
    }
}
