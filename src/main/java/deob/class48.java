package deob;

@ObfuscatedName("ay")
public class class48 extends class204 {

    @ObfuscatedName("ay.p")
    public static class193 field1070 = new class193(64);

    @ObfuscatedName("ay.v")
    public int field1071;

    @ObfuscatedName("ay.l")
    public int field1069;

    @ObfuscatedName("ay.y")
    public int field1078;

    @ObfuscatedName("fe.d(IB)Lay;")
    public static class48 method3172(int arg0) {
        class48 var1 = (class48) field1070.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1073.method3134(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method959(new class119(var2));
        }
        field1070.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.p(Ldf;I)V")
    public void method959(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method963(arg0, var2);
        }
    }

    @ObfuscatedName("ay.v(Ldf;II)V")
    public void method963(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1071 = arg0.method2359();
            this.field1069 = arg0.method2357();
            this.field1078 = arg0.method2357();
        }
    }

    @ObfuscatedName("hj.l(S)V")
    public static void method3807() {
        field1070.method3556();
    }
}
