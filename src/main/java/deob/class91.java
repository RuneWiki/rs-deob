package deob;

@ObfuscatedName("cj")
public class class91 extends class411 {

    @ObfuscatedName("cj.w")
    public class174 field1256;

    @ObfuscatedName("cj.v")
    public class337 field1252 = new class337();

    public class91(class174 arg0) {
        this.field1256 = arg0;
    }

    @ObfuscatedName("cj.s(IIIIB)V")
    public void method2181(int arg0, int arg1, int arg2, int arg3) {
        class88 var5 = null;
        int var6 = 0;
        for (class88 var7 = (class88) this.field1252.method5482(); var7 != null; var7 = (class88) this.field1252.method5484()) {
            var6++;
            if (var7.field1206 == arg0) {
                var7.method2049(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1206 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class337.method5481(new class88(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1252.method5482().method6409();
            }
        } else if (var6 < 4) {
            this.field1252.method5479(new class88(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cj.h(II)Lcc;")
    public class88 method2180(int arg0) {
        class88 var2 = (class88) this.field1252.method5482();
        if (var2 == null || var2.field1206 > arg0) {
            return null;
        }
        for (class88 var3 = (class88) this.field1252.method5484(); var3 != null && var3.field1206 <= arg0; var3 = (class88) this.field1252.method5484()) {
            var2.method6409();
            var2 = var3;
        }
        if (this.field1256.field1876 + var2.field1207 + var2.field1206 > arg0) {
            return var2;
        } else {
            var2.method6409();
            return null;
        }
    }

    @ObfuscatedName("cj.w(I)Z")
    public boolean method2183() {
        return this.field1252.method5480();
    }
}
