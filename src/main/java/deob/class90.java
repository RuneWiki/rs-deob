package deob;

@ObfuscatedName("ck")
public class class90 extends class392 {

    @ObfuscatedName("ck.s")
    public class167 field1239;

    @ObfuscatedName("ck.e")
    public class328 field1242 = new class328();

    public class90(class167 arg0) {
        this.field1239 = arg0;
    }

    @ObfuscatedName("ck.c(IIIII)V")
    public void method2131(int arg0, int arg1, int arg2, int arg3) {
        class86 var5 = null;
        int var6 = 0;
        for (class86 var7 = (class86) this.field1242.method5311(); var7 != null; var7 = (class86) this.field1242.method5313()) {
            var6++;
            if (var7.field1188 == arg0) {
                var7.method2071(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1188 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class328.method5310(new class86(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1242.method5311().method6167();
            }
        } else if (var6 < 4) {
            this.field1242.method5309(new class86(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ck.l(IB)Lcd;")
    public class86 method2132(int arg0) {
        class86 var2 = (class86) this.field1242.method5311();
        if (var2 == null || var2.field1188 > arg0) {
            return null;
        }
        for (class86 var3 = (class86) this.field1242.method5313(); var3 != null && var3.field1188 <= arg0; var3 = (class86) this.field1242.method5313()) {
            var2.method6167();
            var2 = var3;
        }
        if (this.field1239.field1816 + var2.field1188 + var2.field1185 > arg0) {
            return var2;
        } else {
            var2.method6167();
            return null;
        }
    }

    @ObfuscatedName("ck.s(I)Z")
    public boolean method2130() {
        return this.field1242.method5315();
    }
}
