package deob;

@ObfuscatedName("ct")
public class class91 extends class411 {

    @ObfuscatedName("ct.l")
    public class175 field1255;

    @ObfuscatedName("ct.k")
    public class337 field1257 = new class337();

    public class91(class175 arg0) {
        this.field1255 = arg0;
    }

    @ObfuscatedName("ct.o(IIIII)V")
    public void method2213(int arg0, int arg1, int arg2, int arg3) {
        class88 var5 = null;
        int var6 = 0;
        for (class88 var7 = (class88) this.field1257.method5479(); var7 != null; var7 = (class88) this.field1257.method5475()) {
            var6++;
            if (var7.field1215 == arg0) {
                var7.method2063(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1215 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class337.method5472(new class88(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1257.method5479().method6399();
            }
        } else if (var6 < 4) {
            this.field1257.method5471(new class88(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ct.q(IB)Lcn;")
    public class88 method2211(int arg0) {
        class88 var2 = (class88) this.field1257.method5479();
        if (var2 == null || var2.field1215 > arg0) {
            return null;
        }
        for (class88 var3 = (class88) this.field1257.method5475(); var3 != null && var3.field1215 <= arg0; var3 = (class88) this.field1257.method5475()) {
            var2.method6399();
            var2 = var3;
        }
        if (this.field1255.field1917 + var2.field1215 + var2.field1213 > arg0) {
            return var2;
        } else {
            var2.method6399();
            return null;
        }
    }

    @ObfuscatedName("ct.l(B)Z")
    public boolean method2205() {
        return this.field1257.method5495();
    }
}
