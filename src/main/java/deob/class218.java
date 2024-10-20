package deob;

@ObfuscatedName("ii")
public class class218 extends class484 {

    @ObfuscatedName("ii.al")
    public static class302 field2163 = new class302(64);

    @ObfuscatedName("ii.ak")
    public class503 field2164;

    @ObfuscatedName("gm.al(II)Lii;")
    public static class218 method3112(int arg0) {
        class218 var1 = (class218) field2163.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2165.method6342(34, arg0);
        class218 var3 = new class218();
        if (var2 != null) {
            var3.method3626(new class530(var2));
        }
        var3.method3625();
        field2163.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.ak(I)V")
    public void method3625() {
    }

    @ObfuscatedName("ii.ax(Lul;I)V")
    public void method3626(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3627(arg0, var2);
        }
    }

    @ObfuscatedName("ii.ao(Lul;II)V")
    public void method3627(class530 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2164 = class199.method3135(arg0, this.field2164);
        }
    }

    @ObfuscatedName("ii.ah(IIS)I")
    public int method3634(int arg0, int arg1) {
        return class199.method2595(this.field2164, arg0, arg1);
    }

    @ObfuscatedName("ii.ar(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3643(int arg0, String arg1) {
        return class199.method439(this.field2164, arg0, arg1);
    }

    @ObfuscatedName("di.ab(I)V")
    public static void method2340() {
        field2163.method5288();
    }
}
