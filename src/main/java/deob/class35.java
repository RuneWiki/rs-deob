package deob;

@ObfuscatedName("ak")
public class class35 extends class128 {

    @ObfuscatedName("ak.b")
    public class194 field764;

    @ObfuscatedName("ak.g")
    public class127 field765 = new class127();

    public class35(class194 arg0) {
        this.field764 = arg0;
    }

    @ObfuscatedName("ak.o(IIIII)V")
    public void method680(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field765.method2163(); var7 != null; var7 = (class29) this.field765.method2161()) {
            var6++;
            if (var7.field668 == arg0) {
                var7.method590(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field668 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2162(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field765.method2163().method2189();
            }
        } else if (var6 < 4) {
            this.field765.method2165(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ak.m(II)Lau;")
    public class29 method675(int arg0) {
        class29 var2 = (class29) this.field765.method2163();
        if (var2 == null || var2.field668 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field765.method2161(); var3 != null && var3.field668 <= arg0; var3 = (class29) this.field765.method2161()) {
            var2.method2189();
            var2 = var3;
        }
        if (this.field764.field2834 + var2.field669 + var2.field668 > arg0) {
            return var2;
        } else {
            var2.method2189();
            return null;
        }
    }

    @ObfuscatedName("ak.b(B)Z")
    public boolean method676() {
        return this.field765.method2166();
    }
}
