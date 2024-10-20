package deob;

@ObfuscatedName("cu")
public class class84 extends class217 {

    @ObfuscatedName("cu.o")
    public class276 field1298;

    @ObfuscatedName("cu.j")
    public class216 field1300 = new class216();

    public class84(class276 arg0) {
        this.field1298 = arg0;
    }

    @ObfuscatedName("cu.c(IIIII)V")
    public void method1680(int arg0, int arg1, int arg2, int arg3) {
        class77 var5 = null;
        int var6 = 0;
        for (class77 var7 = (class77) this.field1300.method3684(); var7 != null; var7 = (class77) this.field1300.method3699()) {
            var6++;
            if (var7.field1218 == arg0) {
                var7.method1467(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1218 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class216.method3682(new class77(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1300.method3684().method3710();
            }
        } else if (var6 < 4) {
            this.field1300.method3705(new class77(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cu.i(II)Lbd;")
    public class77 method1673(int arg0) {
        class77 var2 = (class77) this.field1300.method3684();
        if (var2 == null || var2.field1218 > arg0) {
            return null;
        }
        for (class77 var3 = (class77) this.field1300.method3699(); var3 != null && var3.field1218 <= arg0; var3 = (class77) this.field1300.method3699()) {
            var2.method3710();
            var2 = var3;
        }
        if (this.field1298.field3525 + var2.field1218 + var2.field1212 > arg0) {
            return var2;
        } else {
            var2.method3710();
            return null;
        }
    }

    @ObfuscatedName("cu.o(S)Z")
    public boolean method1672() {
        return this.field1300.method3698();
    }
}
