package deob;

@ObfuscatedName("ab")
public class class35 extends class128 {

    @ObfuscatedName("ab.c")
    public class194 field790;

    @ObfuscatedName("ab.d")
    public class127 field780 = new class127();

    public class35(class194 arg0) {
        this.field790 = arg0;
    }

    @ObfuscatedName("ab.x(IIIIB)V")
    public void method760(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field780.method2253(); var7 != null; var7 = (class29) this.field780.method2265()) {
            var6++;
            if (var7.field690 == arg0) {
                var7.method622(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field690 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2251(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field780.method2253().method2278();
            }
        } else if (var6 < 4) {
            this.field780.method2257(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ab.j(II)Laa;")
    public class29 method761(int arg0) {
        class29 var2 = (class29) this.field780.method2253();
        if (var2 == null || var2.field690 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field780.method2265(); var3 != null && var3.field690 <= arg0; var3 = (class29) this.field780.method2265()) {
            var2.method2278();
            var2 = var3;
        }
        if (this.field790.field2830 + var2.field691 + var2.field690 > arg0) {
            return var2;
        } else {
            var2.method2278();
            return null;
        }
    }

    @ObfuscatedName("ab.c(B)Z")
    public boolean method762() {
        return this.field780.method2256();
    }
}
