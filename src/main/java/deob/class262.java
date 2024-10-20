package deob;

@ObfuscatedName("jb")
public class class262 extends class185 {

    @ObfuscatedName("jb.v")
    public static class155 field3337 = new class155(64);

    @ObfuscatedName("jb.x")
    public class327 field3338;

    @ObfuscatedName("jl.h(Lib;I)V")
    public static void method4157(class245 arg0) {
        Statics.field3336 = arg0;
    }

    @ObfuscatedName("ap.v(IB)Ljb;")
    public static class262 method572(int arg0) {
        class262 var1 = (class262) field3337.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3336.method3834(34, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4178(new class311(var2));
        }
        var3.method4177();
        field3337.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.x(I)V")
    public void method4177() {
    }

    @ObfuscatedName("jb.w(Lkj;I)V")
    public void method4178(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4179(arg0, var2);
        }
    }

    @ObfuscatedName("jb.t(Lkj;II)V")
    public void method4179(class311 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3338 = class259.method3311(arg0, this.field3338);
        }
    }

    @ObfuscatedName("jb.j(III)I")
    public int method4180(int arg0, int arg1) {
        class327 var3 = this.field3338;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2136;
            }
        }
        return var4;
    }

    @ObfuscatedName("jb.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4181(int arg0, String arg1) {
        class327 var3 = this.field3338;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2132;
            }
        }
        return var4;
    }
}
