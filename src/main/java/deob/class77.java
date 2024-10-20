package deob;

@ObfuscatedName("bh")
public class class77 extends class354 {

    @ObfuscatedName("bh.v")
    public class144 field1129;

    @ObfuscatedName("bh.j")
    public class298 field1128 = new class298();

    public class77(class144 arg0) {
        this.field1129 = arg0;
    }

    @ObfuscatedName("bh.s(IIIII)V")
    public void method1851(int arg0, int arg1, int arg2, int arg3) {
        class73 var5 = null;
        int var6 = 0;
        for (class73 var7 = (class73) this.field1128.method4758(); var7 != null; var7 = (class73) this.field1128.method4760()) {
            var6++;
            if (var7.field1081 == arg0) {
                var7.method1790(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1081 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class298.method4811(new class73(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1128.method4758().method5447();
            }
        } else if (var6 < 4) {
            this.field1128.method4756(new class73(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bh.t(IB)Lbz;")
    public class73 method1854(int arg0) {
        class73 var2 = (class73) this.field1128.method4758();
        if (var2 == null || var2.field1081 > arg0) {
            return null;
        }
        for (class73 var3 = (class73) this.field1128.method4760(); var3 != null && var3.field1081 <= arg0; var3 = (class73) this.field1128.method4760()) {
            var2.method5447();
            var2 = var3;
        }
        if (this.field1129.field1587 + var2.field1084 + var2.field1081 > arg0) {
            return var2;
        } else {
            var2.method5447();
            return null;
        }
    }

    @ObfuscatedName("bh.v(B)Z")
    public boolean method1847() {
        return this.field1128.method4821();
    }
}
