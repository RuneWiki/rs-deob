package deob;

@ObfuscatedName("bd")
public class class73 extends class207 {

    @ObfuscatedName("bd.o")
    public class264 field1069;

    @ObfuscatedName("bd.k")
    public class206 field1070 = new class206();

    public class73(class264 arg0) {
        this.field1069 = arg0;
    }

    @ObfuscatedName("bd.v(IIIIB)V")
    public void method1683(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1070.method3757(); var7 != null; var7 = (class66) this.field1070.method3779()) {
            var6++;
            if (var7.field971 == arg0) {
                var7.method1467(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field971 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3756(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1070.method3757().method3787();
            }
        } else if (var6 < 4) {
            this.field1070.method3776(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bd.s(II)Lby;")
    public class66 method1684(int arg0) {
        class66 var2 = (class66) this.field1070.method3757();
        if (var2 == null || var2.field971 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1070.method3779(); var3 != null && var3.field971 <= arg0; var3 = (class66) this.field1070.method3779()) {
            var2.method3787();
            var2 = var3;
        }
        if (this.field1069.field3339 + var2.field973 + var2.field971 > arg0) {
            return var2;
        } else {
            var2.method3787();
            return null;
        }
    }

    @ObfuscatedName("bd.o(I)Z")
    public boolean method1687() {
        return this.field1070.method3760();
    }
}
