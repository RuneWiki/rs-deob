package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bn")
public class class55 implements Runnable {

    @ObfuscatedName("bn.i")
    public class74 field1182;

    @ObfuscatedName("bn.w")
    public volatile class52[] field1185 = new class52[2];

    @ObfuscatedName("bn.f")
    public volatile boolean field1184 = false;

    @ObfuscatedName("bn.e")
    public volatile boolean field1183 = false;

    public void run() {
        this.field1183 = true;
        try {
            while (!this.field1184) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1185[var1];
                    if (var2 != null) {
                        var2.method1146();
                    }
                }
                class126.method738(10L);
                class74 var3 = this.field1182;
                Object var4 = null;
                if (var3.field1333 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1333.peekEvent() != null; var5++) {
                        class126.method738(1L);
                    }
                    if (var4 != null) {
                        var3.field1333.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method4((String) null, var10);
        } finally {
            this.field1183 = false;
        }
    }
}
