package deob;

@ObfuscatedName("an")
public class class50 extends class204 {

    @ObfuscatedName("an.p")
    public static class193 field1093 = new class193(64);

    @ObfuscatedName("an.v")
    public boolean field1099 = false;

    @ObfuscatedName("f.d(IB)Lan;")
    public static class50 method579(int arg0) {
        class50 var1 = (class50) field1093.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1095.method3134(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method989(new class119(var2));
        }
        field1093.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.p(Ldf;I)V")
    public void method989(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method990(arg0, var2);
        }
    }

    @ObfuscatedName("an.v(Ldf;II)V")
    public void method990(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1099 = true;
        }
    }
}
