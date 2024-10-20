package deob;

@ObfuscatedName("g")
public class class56 {

    @ObfuscatedName("g.b")
    public static int field585 = 2;

    @ObfuscatedName("g.k")
    public boolean field582;

    @ObfuscatedName("g.h")
    public boolean field581;

    public class56(class50 arg0) {
        if (arg0 == null || arg0.field541 == null) {
            this.method949(true);
        } else {
            int var2 = arg0.method726();
            if (var2 >= 0 && var2 <= field585) {
                if (arg0.method726() == 1) {
                    this.field581 = true;
                }
                if (var2 > 1) {
                    this.field582 = arg0.method726() == 1;
                }
            } else {
                this.method949(true);
            }
        }
    }

    @ObfuscatedName("g.b(ZI)V")
    public void method949(boolean arg0) {
    }

    @ObfuscatedName("g.h(B)Ldp;")
    public class50 method950() {
        class50 var1 = new class50(100);
        var1.method666(field585);
        var1.method666(this.field581 ? 1 : 0);
        var1.method666(this.field582 ? 1 : 0);
        return var1;
    }

    public class56() {
        this.method949(true);
    }

    @ObfuscatedName("ah.k(I)V")
    public static void method3354() {
        class168 var0 = null;
        try {
            var0 = class137.method3333("", Statics.field2107.field632, true);
            class50 var1 = Statics.field1898.method950();
            var0.method2912(var1.field541, 0, var1.field540);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2913();
            }
        } catch (Exception var4) {
        }
    }
}
