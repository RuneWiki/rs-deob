package deob;

@ObfuscatedName("al")
public class class42 extends class174 {

    @ObfuscatedName("al.f")
    public static class170 field1050 = new class170(64);

    @ObfuscatedName("al.e")
    public int field1042 = 0;

    @ObfuscatedName("q.i(Leg;I)V")
    public static void method225(class152 arg0) {
        Statics.field1039 = arg0;
        Statics.field1040 = Statics.field1039.method2980(16);
    }

    @ObfuscatedName("eb.w(IB)Lal;")
    public static class42 method2661(int arg0) {
        class42 var1 = (class42) field1050.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method2970(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method901(new class127(var2));
        }
        field1050.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.f(Ldz;B)V")
    public void method901(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method897(arg0, var2);
        }
    }

    @ObfuscatedName("al.e(Ldz;II)V")
    public void method897(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1042 = arg0.method2615();
        }
    }

    @ObfuscatedName("av.t(I)V")
    public static void method695() {
        field1050.method3243();
    }
}
