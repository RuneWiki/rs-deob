package deob;

@ObfuscatedName("aj")
public class class35 extends class128 {

    @ObfuscatedName("aj.o")
    public class194 field752;

    @ObfuscatedName("aj.r")
    public class127 field753 = new class127();

    public class35(class194 arg0) {
        this.field752 = arg0;
    }

    @ObfuscatedName("aj.k(IIIIB)V")
    public void method722(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field753.method2191(); var7 != null; var7 = (class29) this.field753.method2193()) {
            var6++;
            if (var7.field655 == arg0) {
                var7.method641(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field655 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2190(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field753.method2191().method2214();
            }
        } else if (var6 < 4) {
            this.field753.method2188(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aj.y(II)Law;")
    public class29 method720(int arg0) {
        class29 var2 = (class29) this.field753.method2191();
        if (var2 == null || var2.field655 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field753.method2193(); var3 != null && var3.field655 <= arg0; var3 = (class29) this.field753.method2193()) {
            var2.method2214();
            var2 = var3;
        }
        if (this.field752.field2817 + var2.field658 + var2.field655 > arg0) {
            return var2;
        } else {
            var2.method2214();
            return null;
        }
    }

    @ObfuscatedName("aj.o(I)Z")
    public boolean method719() {
        return this.field753.method2208();
    }
}
