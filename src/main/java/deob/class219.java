package deob;

@ObfuscatedName("ic")
public class class219 extends class489 {

    @ObfuscatedName("ic.ah")
    public static class304 field2217 = new class304(64);

    @ObfuscatedName("ic.af")
    public class508 field2218;

    @ObfuscatedName("fi.az(II)Lic;")
    public static class219 method2936(int arg0) {
        class219 var1 = (class219) field2217.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5388.method6328(34, arg0);
        class219 var3 = new class219();
        if (var2 != null) {
            var3.method3694(new class535(var2));
        }
        var3.method3710();
        field2217.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.ah(I)V")
    public void method3710() {
    }

    @ObfuscatedName("ic.af(Lur;I)V")
    public void method3694(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3696(arg0, var2);
        }
    }

    @ObfuscatedName("ic.at(Lur;II)V")
    public void method3696(class535 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2218 = class201.method2084(arg0, this.field2218);
        }
    }

    @ObfuscatedName("ic.an(III)I")
    public int method3695(int arg0, int arg1) {
        return Statics.method3746(this.field2218, arg0, arg1);
    }

    @ObfuscatedName("ic.ao(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3698(int arg0, String arg1) {
        return class201.method396(this.field2218, arg0, arg1);
    }
}
