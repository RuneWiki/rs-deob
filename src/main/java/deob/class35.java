package deob;

@ObfuscatedName("aw")
public class class35 extends class128 {

    @ObfuscatedName("aw.x")
    public class194 field745;

    @ObfuscatedName("aw.q")
    public class127 field747 = new class127();

    public class35(class194 arg0) {
        this.field745 = arg0;
    }

    @ObfuscatedName("aw.p(IIIII)V")
    public void method680(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field747.method2206(); var7 != null; var7 = (class29) this.field747.method2214()) {
            var6++;
            if (var7.field662 == arg0) {
                var7.method603(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field662 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2205(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field747.method2206().method2225();
            }
        } else if (var6 < 4) {
            this.field747.method2209(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aw.g(IB)Lad;")
    public class29 method682(int arg0) {
        class29 var2 = (class29) this.field747.method2206();
        if (var2 == null || var2.field662 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field747.method2214(); var3 != null && var3.field662 <= arg0; var3 = (class29) this.field747.method2214()) {
            var2.method2225();
            var2 = var3;
        }
        if (this.field745.field2836 + var2.field662 + var2.field657 > arg0) {
            return var2;
        } else {
            var2.method2225();
            return null;
        }
    }

    @ObfuscatedName("aw.x(I)Z")
    public boolean method681() {
        return this.field747.method2208();
    }
}
