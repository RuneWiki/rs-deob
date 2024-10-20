package deob;

@ObfuscatedName("cr")
public class class88 extends class190 {

    @ObfuscatedName("cr.d")
    public class258 field1142;

    @ObfuscatedName("cr.c")
    public class272 field1143 = new class272();

    public class88(class258 arg0) {
        this.field1142 = arg0;
    }

    @ObfuscatedName("cr.n(IIIII)V")
    public void method1992(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1143.method4682(); var7 != null; var7 = (class80) this.field1143.method4642()) {
            var6++;
            if (var7.field1019 == arg0) {
                var7.method1708(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1019 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class272.method4656(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1143.method4682().method3486();
            }
        } else if (var6 < 4) {
            this.field1143.method4630(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cr.v(II)Lcd;")
    public class80 method1993(int arg0) {
        class80 var2 = (class80) this.field1143.method4682();
        if (var2 == null || var2.field1019 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1143.method4642(); var3 != null && var3.field1019 <= arg0; var3 = (class80) this.field1143.method4642()) {
            var2.method3486();
            var2 = var3;
        }
        if (this.field1142.field3318 + var2.field1019 + var2.field1018 > arg0) {
            return var2;
        } else {
            var2.method3486();
            return null;
        }
    }

    @ObfuscatedName("cr.d(B)Z")
    public boolean method1994() {
        return this.field1143.method4664();
    }
}
