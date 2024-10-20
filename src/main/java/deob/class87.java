package deob;

@ObfuscatedName("ci")
public class class87 extends class194 {

    @ObfuscatedName("ci.f")
    public class250 field1377;

    @ObfuscatedName("ci.p")
    public class193 field1376 = new class193();

    public class87(class250 arg0) {
        this.field1377 = arg0;
    }

    @ObfuscatedName("ci.j(IIIII)V")
    public void method1538(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1376.method3290(); var7 != null; var7 = (class80) this.field1376.method3307()) {
            var6++;
            if (var7.field1284 == arg0) {
                var7.method1407(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1284 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class193.method3297(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1376.method3290().method3314();
            }
        } else if (var6 < 4) {
            this.field1376.method3287(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ci.h(IB)Lcf;")
    public class80 method1540(int arg0) {
        class80 var2 = (class80) this.field1376.method3290();
        if (var2 == null || var2.field1284 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1376.method3307(); var3 != null && var3.field1284 <= arg0; var3 = (class80) this.field1376.method3307()) {
            var2.method3314();
            var2 = var3;
        }
        if (this.field1377.field3358 + var2.field1284 + var2.field1280 > arg0) {
            return var2;
        } else {
            var2.method3314();
            return null;
        }
    }

    @ObfuscatedName("ci.f(I)Z")
    public boolean method1537() {
        return this.field1376.method3285();
    }
}
