package deob;

@ObfuscatedName("bh")
public class class73 extends class207 {

    @ObfuscatedName("bh.m")
    public class264 field1080;

    @ObfuscatedName("bh.j")
    public class206 field1079 = new class206();

    public class73(class264 arg0) {
        this.field1080 = arg0;
    }

    @ObfuscatedName("bh.c(IIIII)V")
    public void method1648(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1079.method3706(); var7 != null; var7 = (class66) this.field1079.method3714()) {
            var6++;
            if (var7.field997 == arg0) {
                var7.method1471(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field997 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3705(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1079.method3706().method3733();
            }
        } else if (var6 < 4) {
            this.field1079.method3704(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bh.q(IS)Lbn;")
    public class66 method1650(int arg0) {
        class66 var2 = (class66) this.field1079.method3706();
        if (var2 == null || var2.field997 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1079.method3714(); var3 != null && var3.field997 <= arg0; var3 = (class66) this.field1079.method3714()) {
            var2.method3733();
            var2 = var3;
        }
        if (this.field1080.field3355 + var2.field997 + var2.field993 > arg0) {
            return var2;
        } else {
            var2.method3733();
            return null;
        }
    }

    @ObfuscatedName("bh.m(I)Z")
    public boolean method1647() {
        return this.field1079.method3708();
    }
}
