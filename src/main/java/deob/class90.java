package deob;

@ObfuscatedName("ce")
public class class90 extends class370 {

    @ObfuscatedName("ce.s")
    public class157 field1198;

    @ObfuscatedName("ce.a")
    public class311 field1199 = new class311();

    public class90(class157 arg0) {
        this.field1198 = arg0;
    }

    @ObfuscatedName("ce.i(IIIIB)V")
    public void method2118(int arg0, int arg1, int arg2, int arg3) {
        class86 var5 = null;
        int var6 = 0;
        for (class86 var7 = (class86) this.field1199.method5026(); var7 != null; var7 = (class86) this.field1199.method5028()) {
            var6++;
            if (var7.field1148 == arg0) {
                var7.method2066(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1148 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class311.method5025(new class86(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1199.method5026().method5752();
            }
        } else if (var6 < 4) {
            this.field1199.method5024(new class86(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ce.w(II)Lcd;")
    public class86 method2117(int arg0) {
        class86 var2 = (class86) this.field1199.method5026();
        if (var2 == null || var2.field1148 > arg0) {
            return null;
        }
        for (class86 var3 = (class86) this.field1199.method5028(); var3 != null && var3.field1148 <= arg0; var3 = (class86) this.field1199.method5028()) {
            var2.method5752();
            var2 = var3;
        }
        if (this.field1198.field1675 + var2.field1151 + var2.field1148 > arg0) {
            return var2;
        } else {
            var2.method5752();
            return null;
        }
    }

    @ObfuscatedName("ce.s(I)Z")
    public boolean method2127() {
        return this.field1199.method5052();
    }
}
