package deob;

@ObfuscatedName("jp")
public class class262 extends class185 {

    @ObfuscatedName("jp.v")
    public static class155 field3340 = new class155(64);

    @ObfuscatedName("jp.d")
    public class327 field3341;

    @ObfuscatedName("hf.n(Lig;I)V")
    public static void method3787(class245 arg0) {
        Statics.field3343 = arg0;
    }

    @ObfuscatedName("iw.v(IB)Ljp;")
    public static class262 method4243(int arg0) {
        class262 var1 = (class262) field3340.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3343.method4032(34, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4325(new class311(var2));
        }
        var3.method4324();
        field3340.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.d(B)V")
    public void method4324() {
    }

    @ObfuscatedName("jp.c(Lkx;I)V")
    public void method4325(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4326(arg0, var2);
        }
    }

    @ObfuscatedName("jp.y(Lkx;II)V")
    public void method4326(class311 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3341 = class259.method2675(arg0, this.field3341);
        }
    }

    @ObfuscatedName("jp.h(III)I")
    public int method4341(int arg0, int arg1) {
        class327 var3 = this.field3341;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5648((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jp.z(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4328(int arg0, String arg1) {
        return class259.method1120(this.field3341, arg0, arg1);
    }
}
