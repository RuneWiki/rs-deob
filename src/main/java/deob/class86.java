package deob;

@ObfuscatedName("cn")
public class class86 extends class193 {

    @ObfuscatedName("cn.a")
    public class249 field1389;

    @ObfuscatedName("cn.t")
    public class192 field1388 = new class192();

    public class86(class249 arg0) {
        this.field1389 = arg0;
    }

    @ObfuscatedName("cn.i(IIIIB)V")
    public void method1549(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1388.method3266(); var7 != null; var7 = (class80) this.field1388.method3277()) {
            var6++;
            if (var7.field1299 == arg0) {
                var7.method1427(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1299 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3264(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1388.method3266().method3290();
            }
        } else if (var6 < 4) {
            this.field1388.method3263(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cn.w(II)Lcg;")
    public class80 method1550(int arg0) {
        class80 var2 = (class80) this.field1388.method3266();
        if (var2 == null || var2.field1299 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1388.method3277(); var3 != null && var3.field1299 <= arg0; var3 = (class80) this.field1388.method3277()) {
            var2.method3290();
            var2 = var3;
        }
        if (this.field1389.field3383 + var2.field1302 + var2.field1299 > arg0) {
            return var2;
        } else {
            var2.method3290();
            return null;
        }
    }

    @ObfuscatedName("cn.a(I)Z")
    public boolean method1552() {
        return this.field1388.method3269();
    }
}
