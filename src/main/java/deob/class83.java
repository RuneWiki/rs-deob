package deob;

@ObfuscatedName("ch")
public class class83 extends class204 {

    @ObfuscatedName("ch.m")
    public class260 field1266;

    @ObfuscatedName("ch.h")
    public class203 field1268 = new class203();

    public class83(class260 arg0) {
        this.field1266 = arg0;
    }

    @ObfuscatedName("ch.s(IIIII)V")
    public void method1720(int arg0, int arg1, int arg2, int arg3) {
        class76 var5 = null;
        int var6 = 0;
        for (class76 var7 = (class76) this.field1268.method3723(); var7 != null; var7 = (class76) this.field1268.method3705()) {
            var6++;
            if (var7.field1180 == arg0) {
                var7.method1498(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1180 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class203.method3709(new class76(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1268.method3723().method3740();
            }
        } else if (var6 < 4) {
            this.field1268.method3724(new class76(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ch.g(II)Lbb;")
    public class76 method1723(int arg0) {
        class76 var2 = (class76) this.field1268.method3723();
        if (var2 == null || var2.field1180 > arg0) {
            return null;
        }
        for (class76 var3 = (class76) this.field1268.method3705(); var3 != null && var3.field1180 <= arg0; var3 = (class76) this.field1268.method3705()) {
            var2.method3740();
            var2 = var3;
        }
        if (this.field1266.field3453 + var2.field1180 + var2.field1178 > arg0) {
            return var2;
        } else {
            var2.method3740();
            return null;
        }
    }

    @ObfuscatedName("ch.m(I)Z")
    public boolean method1722() {
        return this.field1268.method3708();
    }
}
