package deob;

@ObfuscatedName("ib")
public class class253 extends class195 {

    @ObfuscatedName("ib.w")
    public static class190 field3403 = new class190(64);

    @ObfuscatedName("ib.a")
    public class187 field3405;

    @ObfuscatedName("f.i(IB)Lib;")
    public static class253 method107(int arg0) {
        class253 var1 = (class253) field3403.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3407.method3768(34, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4100(new class174(var2));
        }
        var3.method4099();
        field3403.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.w(I)V")
    public void method4099() {
    }

    @ObfuscatedName("ib.a(Lfp;B)V")
    public void method4100(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4101(arg0, var2);
        }
    }

    @ObfuscatedName("ib.t(Lfp;II)V")
    public void method4101(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3405 = class250.method1072(arg0, this.field3405);
        }
    }

    @ObfuscatedName("ib.s(III)I")
    public int method4098(int arg0, int arg1) {
        return class250.method1727(this.field3405, arg0, arg1);
    }

    @ObfuscatedName("ib.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4103(int arg0, String arg1) {
        return class250.method1585(this.field3405, arg0, arg1);
    }
}
