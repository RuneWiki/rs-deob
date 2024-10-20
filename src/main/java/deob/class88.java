package deob;

@ObfuscatedName("cb")
public class class88 extends class190 {

    @ObfuscatedName("cb.x")
    public class258 field1127;

    @ObfuscatedName("cb.w")
    public class272 field1128 = new class272();

    public class88(class258 arg0) {
        this.field1127 = arg0;
    }

    @ObfuscatedName("cb.h(IIIII)V")
    public void method1948(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1128.method4467(); var7 != null; var7 = (class80) this.field1128.method4466()) {
            var6++;
            if (var7.field1000 == arg0) {
                var7.method1674(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1000 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class272.method4463(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1128.method4467().method3359();
            }
        } else if (var6 < 4) {
            this.field1128.method4462(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.v(II)Lci;")
    public class80 method1942(int arg0) {
        class80 var2 = (class80) this.field1128.method4467();
        if (var2 == null || var2.field1000 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1128.method4466(); var3 != null && var3.field1000 <= arg0; var3 = (class80) this.field1128.method4466()) {
            var2.method3359();
            var2 = var3;
        }
        if (this.field1127.field3317 + var2.field1008 + var2.field1000 > arg0) {
            return var2;
        } else {
            var2.method3359();
            return null;
        }
    }

    @ObfuscatedName("cb.x(B)Z")
    public boolean method1943() {
        return this.field1128.method4468();
    }
}
