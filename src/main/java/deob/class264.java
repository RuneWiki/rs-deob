package deob;

@ObfuscatedName("jt")
public class class264 extends class410 {

    @ObfuscatedName("jt.c")
    public class262 field3033;

    @ObfuscatedName("jt.v")
    public int field3034;

    @ObfuscatedName("jt.q")
    public class442 field3031;

    @ObfuscatedName("jt.f")
    public int field3032;

    @ObfuscatedName("jt.j")
    public static class264[] field3029 = new class264[300];

    @ObfuscatedName("jt.e")
    public static int field3036 = 0;

    @ObfuscatedName("fs.c(Lju;Lqv;I)Ljt;")
    public static class264 method3158(class262 arg0, class459 arg1) {
        class264 var2;
        if (field3036 == 0) {
            var2 = new class264();
        } else {
            var2 = field3029[--field3036];
        }
        var2.field3033 = arg0;
        var2.field3034 = arg0.field3015;
        if (var2.field3034 == -1) {
            var2.field3031 = new class442(260);
        } else if (var2.field3034 == -2) {
            var2.field3031 = new class442(10000);
        } else if (var2.field3034 <= 18) {
            var2.field3031 = new class442(20);
        } else if (var2.field3034 <= 98) {
            var2.field3031 = new class442(100);
        } else {
            var2.field3031 = new class442(260);
        }
        var2.field3031.method7018(arg1);
        var2.field3031.method6986(var2.field3033.field2930);
        var2.field3032 = 0;
        return var2;
    }

    @ObfuscatedName("jm.v(I)Ljt;")
    public static class264 method4952() {
        class264 var0;
        if (field3036 == 0) {
            var0 = new class264();
        } else {
            var0 = field3029[--field3036];
        }
        var0.field3033 = null;
        var0.field3034 = 0;
        var0.field3031 = new class442(5000);
        return var0;
    }

    @ObfuscatedName("jt.q(B)V")
    public void method4714() {
        if (field3036 < field3029.length) {
            field3029[++field3036 - 1] = this;
        }
    }
}
