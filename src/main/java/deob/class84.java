package deob;

@ObfuscatedName("cb")
public class class84 extends class217 {

    @ObfuscatedName("cb.t")
    public class276 field1307;

    @ObfuscatedName("cb.d")
    public class216 field1310 = new class216();

    public class84(class276 arg0) {
        this.field1307 = arg0;
    }

    @ObfuscatedName("cb.o(IIIIB)V")
    public void method1710(int arg0, int arg1, int arg2, int arg3) {
        class77 var5 = null;
        int var6 = 0;
        for (class77 var7 = (class77) this.field1310.method3655(); var7 != null; var7 = (class77) this.field1310.method3657()) {
            var6++;
            if (var7.field1221 == arg0) {
                var7.method1526(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1221 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class216.method3668(new class77(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1310.method3655().method3681();
            }
        } else if (var6 < 4) {
            this.field1310.method3656(new class77(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.k(II)Lbd;")
    public class77 method1711(int arg0) {
        class77 var2 = (class77) this.field1310.method3655();
        if (var2 == null || var2.field1221 > arg0) {
            return null;
        }
        for (class77 var3 = (class77) this.field1310.method3657(); var3 != null && var3.field1221 <= arg0; var3 = (class77) this.field1310.method3657()) {
            var2.method3681();
            var2 = var3;
        }
        if (this.field1307.field3523 + var2.field1223 + var2.field1221 > arg0) {
            return var2;
        } else {
            var2.method3681();
            return null;
        }
    }

    @ObfuscatedName("cb.t(B)Z")
    public boolean method1709() {
        return this.field1310.method3658();
    }
}
