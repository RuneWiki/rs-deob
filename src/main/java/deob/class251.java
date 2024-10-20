package deob;

@ObfuscatedName("id")
public class class251 extends class176 {

    @ObfuscatedName("id.f")
    public static class146 field3311 = new class146(64);

    @ObfuscatedName("id.b")
    public class316 field3314;

    @ObfuscatedName("hi.u(Lhf;I)V")
    public static void method3839(class234 arg0) {
        Statics.field3312 = arg0;
    }

    @ObfuscatedName("cp.f(II)Lid;")
    public static class251 method2106(int arg0) {
        class251 var1 = (class251) field3311.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3312.method3928(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4222(new class300(var2));
        }
        var3.method4209();
        field3311.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.b(I)V")
    public void method4209() {
    }

    @ObfuscatedName("id.g(Lkg;I)V")
    public void method4222(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4212(arg0, var2);
        }
    }

    @ObfuscatedName("id.z(Lkg;II)V")
    public void method4212(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3314 = class248.method3036(arg0, this.field3314);
        }
    }

    @ObfuscatedName("id.p(IIB)I")
    public int method4231(int arg0, int arg1) {
        class316 var3 = this.field3314;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5521((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2125;
            }
        }
        return var4;
    }

    @ObfuscatedName("id.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4208(int arg0, String arg1) {
        return class248.method3828(this.field3314, arg0, arg1);
    }

    @ObfuscatedName("dd.y(I)V")
    public static void method2747() {
        field3311.method3075();
    }
}
