package deob;

@ObfuscatedName("ag")
public class class35 extends class128 {

    @ObfuscatedName("ag.m")
    public class194 field745;

    @ObfuscatedName("ag.h")
    public class127 field746 = new class127();

    public class35(class194 arg0) {
        this.field745 = arg0;
    }

    @ObfuscatedName("ag.n(IIIIB)V")
    public void method709(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field746.method2252(); var7 != null; var7 = (class29) this.field746.method2244()) {
            var6++;
            if (var7.field661 == arg0) {
                var7.method630(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field661 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2247(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field746.method2252().method2273();
            }
        } else if (var6 < 4) {
            this.field746.method2258(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ag.d(II)Lay;")
    public class29 method710(int arg0) {
        class29 var2 = (class29) this.field746.method2252();
        if (var2 == null || var2.field661 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field746.method2244(); var3 != null && var3.field661 <= arg0; var3 = (class29) this.field746.method2244()) {
            var2.method2273();
            var2 = var3;
        }
        if (this.field745.field2842 + var2.field662 + var2.field661 > arg0) {
            return var2;
        } else {
            var2.method2273();
            return null;
        }
    }

    @ObfuscatedName("ag.m(B)Z")
    public boolean method711() {
        return this.field746.method2251();
    }
}
