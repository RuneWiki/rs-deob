package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class64 implements Runnable {

    @ObfuscatedName("bp.x")
    public class104 field1101;

    @ObfuscatedName("bp.j")
    public volatile class58[] field1097 = new class58[2];

    @ObfuscatedName("bp.c")
    public volatile boolean field1096 = false;

    @ObfuscatedName("bp.d")
    public volatile boolean field1099 = false;

    public void run() {
        this.field1099 = true;
        try {
            while (!this.field1096) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1097[var1];
                    if (var2 != null) {
                        var2.method1094();
                    }
                }
                class162.method2485(10L);
                class104 var3 = this.field1101;
                Object var4 = null;
                if (var3.field1680 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1680.peekEvent() != null; var5++) {
                        class162.method2485(1L);
                    }
                    if (var4 != null) {
                        var3.field1680.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method702((String) null, var10);
        } finally {
            this.field1099 = false;
        }
    }
}
