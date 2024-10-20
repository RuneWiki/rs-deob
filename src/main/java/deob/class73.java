package deob;

@ObfuscatedName("bp")
public class class73 extends class207 {

    @ObfuscatedName("bp.e")
    public class264 field1064;

    @ObfuscatedName("bp.b")
    public class206 field1065 = new class206();

    public class73(class264 arg0) {
        this.field1064 = arg0;
    }

    @ObfuscatedName("bp.f(IIIII)V")
    public void method1690(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1065.method3779(); var7 != null; var7 = (class66) this.field1065.method3780()) {
            var6++;
            if (var7.field966 == arg0) {
                var7.method1483(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field966 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3790(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1065.method3779().method3812();
            }
        } else if (var6 < 4) {
            this.field1065.method3777(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bp.h(IB)Lbe;")
    public class66 method1692(int arg0) {
        class66 var2 = (class66) this.field1065.method3779();
        if (var2 == null || var2.field966 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1065.method3780(); var3 != null && var3.field966 <= arg0; var3 = (class66) this.field1065.method3780()) {
            var2.method3812();
            var2 = var3;
        }
        if (this.field1064.field3366 + var2.field968 + var2.field966 > arg0) {
            return var2;
        } else {
            var2.method3812();
            return null;
        }
    }

    @ObfuscatedName("bp.e(B)Z")
    public boolean method1702() {
        return this.field1065.method3781();
    }
}
