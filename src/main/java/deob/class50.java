package deob;

@ObfuscatedName("as")
public class class50 extends class204 {

    @ObfuscatedName("as.f")
    public static class193 field1084 = new class193(64);

    @ObfuscatedName("as.i")
    public boolean field1087 = false;

    @ObfuscatedName("w.v(IB)Las;")
    public static class50 method158(int arg0) {
        class50 var1 = (class50) field1084.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1090.method3082(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method975(new class119(var2));
        }
        field1084.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.f(Ldx;I)V")
    public void method975(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method976(arg0, var2);
        }
    }

    @ObfuscatedName("as.i(Ldx;II)V")
    public void method976(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1087 = true;
        }
    }
}
