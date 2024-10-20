package deob;

@ObfuscatedName("fp")
public class class178 extends class382 {

    @ObfuscatedName("fp.b")
    public static class249 field1921 = new class249(64);

    @ObfuscatedName("fp.p")
    public class396 field1922;

    @ObfuscatedName("hy.c(Lku;B)V")
    public static void method4337(class302 arg0) {
        Statics.field92 = arg0;
    }

    @ObfuscatedName("k.b(IB)Lfp;")
    public static class178 method293(int arg0) {
        class178 var1 = (class178) field1921.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field92.method5053(34, arg0);
        class178 var3 = new class178();
        if (var2 != null) {
            var3.method3124(new class419(var2));
        }
        var3.method3107();
        field1921.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fp.p(I)V")
    public void method3107() {
    }

    @ObfuscatedName("fp.m(Lpi;I)V")
    public void method3124(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3108(arg0, var2);
        }
    }

    @ObfuscatedName("fp.t(Lpi;IB)V")
    public void method3108(class419 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1922 = class168.method399(arg0, this.field1922);
        }
    }

    @ObfuscatedName("fp.s(III)I")
    public int method3110(int arg0, int arg1) {
        return class168.method150(this.field1922, arg0, arg1);
    }

    @ObfuscatedName("fp.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3111(int arg0, String arg1) {
        return class168.method3632(this.field1922, arg0, arg1);
    }

    @ObfuscatedName("fm.w(I)V")
    public static void method3233() {
        field1921.method4518();
    }
}
