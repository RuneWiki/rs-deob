package deob;

@ObfuscatedName("ci")
public class class86 extends class193 {

    @ObfuscatedName("ci.m")
    public class249 field1370;

    @ObfuscatedName("ci.g")
    public class192 field1371 = new class192();

    public class86(class249 arg0) {
        this.field1370 = arg0;
    }

    @ObfuscatedName("ci.e(IIIII)V")
    public void method1530(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1371.method3280(); var7 != null; var7 = (class80) this.field1371.method3278()) {
            var6++;
            if (var7.field1290 == arg0) {
                var7.method1397(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1290 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3302(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1371.method3280().method3304();
            }
        } else if (var6 < 4) {
            this.field1371.method3283(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ci.o(II)Lcy;")
    public class80 method1524(int arg0) {
        class80 var2 = (class80) this.field1371.method3280();
        if (var2 == null || var2.field1290 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1371.method3278(); var3 != null && var3.field1290 <= arg0; var3 = (class80) this.field1371.method3278()) {
            var2.method3304();
            var2 = var3;
        }
        if (this.field1370.field3346 + var2.field1290 + var2.field1288 > arg0) {
            return var2;
        } else {
            var2.method3304();
            return null;
        }
    }

    @ObfuscatedName("ci.m(I)Z")
    public boolean method1525() {
        return this.field1371.method3282();
    }
}
