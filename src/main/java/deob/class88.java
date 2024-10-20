package deob;

@ObfuscatedName("cu")
public class class88 extends class190 {

    @ObfuscatedName("cu.s")
    public class257 field1152;

    @ObfuscatedName("cu.t")
    public class271 field1153 = new class271();

    public class88(class257 arg0) {
        this.field1152 = arg0;
    }

    @ObfuscatedName("cu.z(IIIII)V")
    public void method1926(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1153.method4551(); var7 != null; var7 = (class80) this.field1153.method4553()) {
            var6++;
            if (var7.field1038 == arg0) {
                var7.method1643(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1038 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class271.method4560(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1153.method4551().method3401();
            }
        } else if (var6 < 4) {
            this.field1153.method4548(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cu.k(IB)Lca;")
    public class80 method1927(int arg0) {
        class80 var2 = (class80) this.field1153.method4551();
        if (var2 == null || var2.field1038 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1153.method4553(); var3 != null && var3.field1038 <= arg0; var3 = (class80) this.field1153.method4553()) {
            var2.method3401();
            var2 = var3;
        }
        if (this.field1152.field3312 + var2.field1038 + var2.field1037 > arg0) {
            return var2;
        } else {
            var2.method3401();
            return null;
        }
    }

    @ObfuscatedName("cu.s(B)Z")
    public boolean method1934() {
        return this.field1153.method4555();
    }
}
