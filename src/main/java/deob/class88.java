package deob;

@ObfuscatedName("ck")
public class class88 extends class190 {

    @ObfuscatedName("ck.q")
    public class257 field1149;

    @ObfuscatedName("ck.j")
    public class271 field1153 = new class271();

    public class88(class257 arg0) {
        this.field1149 = arg0;
    }

    @ObfuscatedName("ck.m(IIIIB)V")
    public void method1924(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1153.method4569(); var7 != null; var7 = (class80) this.field1153.method4588()) {
            var6++;
            if (var7.field1031 == arg0) {
                var7.method1633(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1031 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class271.method4568(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1153.method4569().method3388();
            }
        } else if (var6 < 4) {
            this.field1153.method4567(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ck.o(II)Lcb;")
    public class80 method1925(int arg0) {
        class80 var2 = (class80) this.field1153.method4569();
        if (var2 == null || var2.field1031 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1153.method4588(); var3 != null && var3.field1031 <= arg0; var3 = (class80) this.field1153.method4588()) {
            var2.method3388();
            var2 = var3;
        }
        if (this.field1149.field3319 + var2.field1031 + var2.field1030 > arg0) {
            return var2;
        } else {
            var2.method3388();
            return null;
        }
    }

    @ObfuscatedName("ck.q(I)Z")
    public boolean method1940() {
        return this.field1153.method4578();
    }
}
