package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bu")
public class class67 implements Runnable {

    @ObfuscatedName("bu.g")
    public class125 field1262;

    @ObfuscatedName("bu.j")
    public volatile class51[] field1255 = new class51[2];

    @ObfuscatedName("bu.z")
    public volatile boolean field1256 = false;

    @ObfuscatedName("bu.b")
    public volatile boolean field1257 = false;

    public void run() {
        this.field1257 = true;
        try {
            while (!this.field1256) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class51 var2 = this.field1255[var1];
                    if (var2 != null) {
                        var2.method978();
                    }
                }
                class116.method154(10L);
                class125 var3 = this.field1262;
                Object var4 = null;
                if (var3.field1936 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1936.peekEvent() != null; var5++) {
                        class116.method154(1L);
                    }
                    if (var4 != null) {
                        var3.field1936.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class137.method2362((String) null, var10);
        } finally {
            this.field1257 = false;
        }
    }
}
