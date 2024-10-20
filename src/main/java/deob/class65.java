package deob;

@ObfuscatedName("a")
public class class65 {

    @ObfuscatedName("a.b")
    public boolean field969;

    @ObfuscatedName("a.c")
    public boolean field958;

    @ObfuscatedName("a.v")
    public static int field960 = 2;

    public class65(class28 arg0) {
        if (arg0 == null || arg0.field306 == null) {
            this.method1023(true);
        } else {
            int var2 = arg0.method450();
            if (var2 >= 0 && var2 <= field960) {
                if (arg0.method450() == 1) {
                    this.field958 = true;
                }
                if (var2 > 1) {
                    this.field969 = arg0.method450() == 1;
                }
            } else {
                this.method1023(true);
            }
        }
    }

    @ObfuscatedName("a.v(ZI)V")
    public void method1023(boolean arg0) {
    }

    public class65() {
        this.method1023(true);
    }

    @ObfuscatedName("a.c(B)Ldv;")
    public class28 method1028() {
        class28 var1 = new class28(100);
        var1.method443(field960);
        var1.method443(this.field958 ? 1 : 0);
        var1.method443(this.field969 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("m.b(I)V")
    public static void method1090() {
        class167 var0 = null;
        try {
            var0 = class153.method3260("", Statics.field550.field1348, true);
            class28 var1 = Statics.field1861.method1028();
            var0.method3011(var1.field306, 0, var1.field303);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3014();
            }
        } catch (Exception var4) {
        }
    }
}
