package deob;

@ObfuscatedName("af")
public class class35 extends class128 {

    @ObfuscatedName("af.g")
    public class194 field762;

    @ObfuscatedName("af.v")
    public class127 field757 = new class127();

    public class35(class194 arg0) {
        this.field762 = arg0;
    }

    @ObfuscatedName("af.x(IIIIS)V")
    public void method782(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field757.method2302(); var7 != null; var7 = (class29) this.field757.method2317()) {
            var6++;
            if (var7.field670 == arg0) {
                var7.method640(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field670 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2305(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field757.method2302().method2327();
            }
        } else if (var6 < 4) {
            this.field757.method2304(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("af.n(IB)Lau;")
    public class29 method779(int arg0) {
        class29 var2 = (class29) this.field757.method2302();
        if (var2 == null || var2.field670 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field757.method2317(); var3 != null && var3.field670 <= arg0; var3 = (class29) this.field757.method2317()) {
            var2.method2327();
            var2 = var3;
        }
        if (this.field762.field2849 + var2.field670 + var2.field669 > arg0) {
            return var2;
        } else {
            var2.method2327();
            return null;
        }
    }

    @ObfuscatedName("af.g(B)Z")
    public boolean method773() {
        return this.field757.method2309();
    }
}
