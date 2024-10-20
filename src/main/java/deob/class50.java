package deob;

@ObfuscatedName("al")
public class class50 extends class205 {

    @ObfuscatedName("al.h")
    public static class194 field1070 = new class194(64);

    @ObfuscatedName("al.m")
    public boolean field1072 = false;

    @ObfuscatedName("as.j(IB)Lal;")
    public static class50 method714(int arg0) {
        class50 var1 = (class50) field1070.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1073.method3011(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method985(new class120(var2));
        }
        field1070.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.h(Ldx;I)V")
    public void method985(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method986(arg0, var2);
        }
    }

    @ObfuscatedName("al.m(Ldx;IB)V")
    public void method986(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1072 = true;
        }
    }
}
