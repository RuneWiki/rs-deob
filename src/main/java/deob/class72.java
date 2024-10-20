package deob;

@ObfuscatedName("bv")
public class class72 extends class205 {

    @ObfuscatedName("bv.s")
    public class262 field1026;

    @ObfuscatedName("bv.l")
    public class204 field1027 = new class204();

    public class72(class262 arg0) {
        this.field1026 = arg0;
    }

    @ObfuscatedName("bv.z(IIIII)V")
    public void method1661(int arg0, int arg1, int arg2, int arg3) {
        class65 var5 = null;
        int var6 = 0;
        for (class65 var7 = (class65) this.field1027.method3740(); var7 != null; var7 = (class65) this.field1027.method3725()) {
            var6++;
            if (var7.field935 == arg0) {
                var7.method1452(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field935 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class204.method3728(new class65(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1027.method3740().method3756();
            }
        } else if (var6 < 4) {
            this.field1027.method3730(new class65(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bv.w(II)Lbn;")
    public class65 method1662(int arg0) {
        class65 var2 = (class65) this.field1027.method3740();
        if (var2 == null || var2.field935 > arg0) {
            return null;
        }
        for (class65 var3 = (class65) this.field1027.method3725(); var3 != null && var3.field935 <= arg0; var3 = (class65) this.field1027.method3725()) {
            var2.method3756();
            var2 = var3;
        }
        if (this.field1026.field3314 + var2.field938 + var2.field935 > arg0) {
            return var2;
        } else {
            var2.method3756();
            return null;
        }
    }

    @ObfuscatedName("bv.s(B)Z")
    public boolean method1663() {
        return this.field1027.method3735();
    }
}
