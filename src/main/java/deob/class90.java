package deob;

@ObfuscatedName("cs")
public class class90 extends class370 {

    @ObfuscatedName("cs.f")
    public class157 field1216;

    @ObfuscatedName("cs.j")
    public class311 field1217 = new class311();

    public class90(class157 arg0) {
        this.field1216 = arg0;
    }

    @ObfuscatedName("cs.l(IIIII)V")
    public void method2116(int arg0, int arg1, int arg2, int arg3) {
        class86 var5 = null;
        int var6 = 0;
        for (class86 var7 = (class86) this.field1217.method5074(); var7 != null; var7 = (class86) this.field1217.method5094()) {
            var6++;
            if (var7.field1167 == arg0) {
                var7.method2064(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1167 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class311.method5073(new class86(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1217.method5074().method5775();
            }
        } else if (var6 < 4) {
            this.field1217.method5072(new class86(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cs.q(IB)Lcp;")
    public class86 method2117(int arg0) {
        class86 var2 = (class86) this.field1217.method5074();
        if (var2 == null || var2.field1167 > arg0) {
            return null;
        }
        for (class86 var3 = (class86) this.field1217.method5094(); var3 != null && var3.field1167 <= arg0; var3 = (class86) this.field1217.method5094()) {
            var2.method5775();
            var2 = var3;
        }
        if (this.field1216.field1681 + var2.field1169 + var2.field1167 > arg0) {
            return var2;
        } else {
            var2.method5775();
            return null;
        }
    }

    @ObfuscatedName("cs.f(B)Z")
    public boolean method2119() {
        return this.field1217.method5077();
    }
}
