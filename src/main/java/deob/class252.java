package deob;

@ObfuscatedName("iv")
public class class252 extends class195 {

    @ObfuscatedName("iv.j")
    public static class190 field3386 = new class190(64);

    @ObfuscatedName("iv.n")
    public char field3392;

    @ObfuscatedName("iv.r")
    public int field3388;

    @ObfuscatedName("iv.v")
    public String field3385;

    @ObfuscatedName("iv.e")
    public boolean field3390 = true;

    @ObfuscatedName("hn.a(II)Liv;")
    public static class252 method3752(int arg0) {
        class252 var1 = (class252) field3386.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3387.method3787(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4051(new class174(var2));
        }
        var3.method4050();
        field3386.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.j(I)V")
    public void method4050() {
    }

    @ObfuscatedName("iv.n(Lfe;I)V")
    public void method4051(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4059(arg0, var2);
        }
    }

    @ObfuscatedName("iv.r(Lfe;IB)V")
    public void method4059(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3392 = class267.method4328(arg0.method2872());
        } else if (arg1 == 2) {
            this.field3388 = arg0.method2876();
        } else if (arg1 == 4) {
            this.field3390 = false;
        } else if (arg1 == 5) {
            this.field3385 = arg0.method2879();
        }
    }

    @ObfuscatedName("iv.v(I)Z")
    public boolean method4053() {
        return this.field3392 == 's';
    }

    @ObfuscatedName("ct.e(I)V")
    public static void method1430() {
        field3386.method3244();
    }
}
