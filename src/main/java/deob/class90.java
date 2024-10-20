package deob;

@ObfuscatedName("cs")
public class class90 extends class387 {

    @ObfuscatedName("cs.p")
    public class167 field1208;

    @ObfuscatedName("cs.m")
    public class323 field1209 = new class323();

    public class90(class167 arg0) {
        this.field1208 = arg0;
    }

    @ObfuscatedName("cs.c(IIIII)V")
    public void method2195(int arg0, int arg1, int arg2, int arg3) {
        class86 var5 = null;
        int var6 = 0;
        for (class86 var7 = (class86) this.field1209.method5348(); var7 != null; var7 = (class86) this.field1209.method5350()) {
            var6++;
            if (var7.field1161 == arg0) {
                var7.method2141(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1161 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class323.method5347(new class86(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1209.method5348().method6163();
            }
        } else if (var6 < 4) {
            this.field1209.method5346(new class86(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cs.b(II)Lcn;")
    public class86 method2196(int arg0) {
        class86 var2 = (class86) this.field1209.method5348();
        if (var2 == null || var2.field1161 > arg0) {
            return null;
        }
        for (class86 var3 = (class86) this.field1209.method5350(); var3 != null && var3.field1161 <= arg0; var3 = (class86) this.field1209.method5350()) {
            var2.method6163();
            var2 = var3;
        }
        if (this.field1208.field1805 + var2.field1162 + var2.field1161 > arg0) {
            return var2;
        } else {
            var2.method6163();
            return null;
        }
    }

    @ObfuscatedName("cs.p(B)Z")
    public boolean method2197() {
        return this.field1209.method5352();
    }
}
