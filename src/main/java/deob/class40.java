package deob;

@ObfuscatedName("ap")
public class class40 extends class173 {

    @ObfuscatedName("ap.k")
    public static class169 field1011 = new class169(64);

    @ObfuscatedName("ap.x")
    public int field1012 = 0;

    @ObfuscatedName("q.u(II)Lap;")
    public static class40 method42(int arg0) {
        class40 var1 = (class40) field1011.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1015.method2965(5, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method872(new class126(var2));
        }
        field1011.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.k(Ldl;I)V")
    public void method872(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("ap.x(Ldl;II)V")
    public void method873(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1012 = arg0.method2450();
        }
    }
}
