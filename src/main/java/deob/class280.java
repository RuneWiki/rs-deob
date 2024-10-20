package deob;

@ObfuscatedName("jl")
public class class280 extends class219 {

    @ObfuscatedName("jl.q")
    public static class213 field3556 = new class213(64);

    @ObfuscatedName("jl.i")
    public class210 field3557;

    @ObfuscatedName("lw.t(Ljc;B)V")
    public static void method5147(class262 arg0) {
        Statics.field3558 = arg0;
    }

    @ObfuscatedName("bp.q(II)Ljl;")
    public static class280 method1530(int arg0) {
        class280 var1 = (class280) field3556.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3558.method4265(34, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4527(new class195(var2));
        }
        var3.method4526();
        field3556.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.i(I)V")
    public void method4526() {
    }

    @ObfuscatedName("jl.a(Lgb;I)V")
    public void method4527(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4519(arg0, var2);
        }
    }

    @ObfuscatedName("jl.l(Lgb;II)V")
    public void method4519(class195 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3557 = class277.method6(arg0, this.field3557);
        }
    }

    @ObfuscatedName("jl.b(III)I")
    public int method4521(int arg0, int arg1) {
        return class277.method4894(this.field3557, arg0, arg1);
    }

    @ObfuscatedName("jl.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4523(int arg0, String arg1) {
        class210 var3 = this.field3557;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class208 var5 = (class208) var3.method3594((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2609;
            }
        }
        return var4;
    }

    @ObfuscatedName("bv.x(I)V")
    public static void method1084() {
        field3556.method3632();
    }
}
