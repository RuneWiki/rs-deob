package deob;

@ObfuscatedName("ci")
public class class91 extends class409 {

    @ObfuscatedName("ci.i")
    public class175 field1231;

    @ObfuscatedName("ci.f")
    public class337 field1229 = new class337();

    public class91(class175 arg0) {
        this.field1231 = arg0;
    }

    @ObfuscatedName("ci.v(IIIIB)V")
    public void method2225(int arg0, int arg1, int arg2, int arg3) {
        class88 var5 = null;
        int var6 = 0;
        for (class88 var7 = (class88) this.field1229.method5574(); var7 != null; var7 = (class88) this.field1229.method5619()) {
            var6++;
            if (var7.field1191 == arg0) {
                var7.method2085(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1191 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class337.method5573(new class88(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1229.method5574().method6503();
            }
        } else if (var6 < 4) {
            this.field1229.method5642(new class88(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ci.c(II)Lcp;")
    public class88 method2241(int arg0) {
        class88 var2 = (class88) this.field1229.method5574();
        if (var2 == null || var2.field1191 > arg0) {
            return null;
        }
        for (class88 var3 = (class88) this.field1229.method5619(); var3 != null && var3.field1191 <= arg0; var3 = (class88) this.field1229.method5619()) {
            var2.method6503();
            var2 = var3;
        }
        if (this.field1231.field1868 + var2.field1191 + var2.field1189 > arg0) {
            return var2;
        } else {
            var2.method6503();
            return null;
        }
    }

    @ObfuscatedName("ci.i(B)Z")
    public boolean method2236() {
        return this.field1229.method5578();
    }
}
