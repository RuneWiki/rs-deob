package deob;

@ObfuscatedName("aw")
public class class46 extends class205 {

    @ObfuscatedName("aw.h")
    public static class194 field1024 = new class194(64);

    @ObfuscatedName("aw.m")
    public boolean field1025 = false;

    @ObfuscatedName("am.j(II)Law;")
    public static class46 method648(int arg0) {
        class46 var1 = (class46) field1024.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method3011(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method923(new class120(var2));
        }
        field1024.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.h(Ldx;B)V")
    public void method923(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method927(arg0, var2);
        }
    }

    @ObfuscatedName("aw.m(Ldx;IB)V")
    public void method927(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1025 = true;
        }
    }
}
