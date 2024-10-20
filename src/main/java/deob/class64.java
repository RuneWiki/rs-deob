package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class64 implements Runnable {

    @ObfuscatedName("bg.b")
    public class104 field1098;

    @ObfuscatedName("bg.e")
    public volatile class58[] field1102 = new class58[2];

    @ObfuscatedName("bg.c")
    public volatile boolean field1099 = false;

    @ObfuscatedName("bg.l")
    public volatile boolean field1103 = false;

    public void run() {
        this.field1103 = true;
        try {
            while (!this.field1099) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1102[var1];
                    if (var2 != null) {
                        var2.method1038();
                    }
                }
                class162.method2120(10L);
                class104 var3 = this.field1098;
                Object var4 = null;
                if (var3.field1663 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1663.peekEvent() != null; var5++) {
                        class162.method2120(1L);
                    }
                    if (var4 != null) {
                        var3.field1663.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method24((String) null, var10);
        } finally {
            this.field1103 = false;
        }
    }
}
