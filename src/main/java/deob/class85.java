package deob;

@ObfuscatedName("cq")
public class class85 extends class204 {

    @ObfuscatedName("cq.e")
    public class260 field1265;

    @ObfuscatedName("cq.k")
    public class203 field1267 = new class203();

    public class85(class260 arg0) {
        this.field1265 = arg0;
    }

    @ObfuscatedName("cq.a(IIIIB)V")
    public void method1489(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1267.method3399(); var7 != null; var7 = (class79) this.field1267.method3418()) {
            var6++;
            if (var7.field1185 == arg0) {
                var7.method1359(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1185 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class203.method3408(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1267.method3399().method3427();
            }
        } else if (var6 < 4) {
            this.field1267.method3396(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cq.w(IB)Lch;")
    public class79 method1490(int arg0) {
        class79 var2 = (class79) this.field1267.method3399();
        if (var2 == null || var2.field1185 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1267.method3418(); var3 != null && var3.field1185 <= arg0; var3 = (class79) this.field1267.method3418()) {
            var2.method3427();
            var2 = var3;
        }
        if (this.field1265.field3452 + var2.field1185 + var2.field1184 > arg0) {
            return var2;
        } else {
            var2.method3427();
            return null;
        }
    }

    @ObfuscatedName("cq.e(I)Z")
    public boolean method1491() {
        return this.field1267.method3425();
    }
}
