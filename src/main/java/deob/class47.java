package deob;

@ObfuscatedName("av")
public class class47 extends class185 {

    @ObfuscatedName("av.y")
    public static class174 field1065 = new class174(64);

    @ObfuscatedName("av.r")
    public int field1066 = 0;

    @ObfuscatedName("dt.c(Ler;I)V")
    public static void method2486(class149 arg0) {
        Statics.field1070 = arg0;
        Statics.field2889 = Statics.field1070.method2756(16);
    }

    @ObfuscatedName("ej.j(II)Lav;")
    public static class47 method2717(int arg0) {
        class47 var1 = (class47) field1065.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1070.method2746(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method888(new class108(var2));
        }
        field1065.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.y(Ldx;I)V")
    public void method888(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("av.r(Ldx;II)V")
    public void method889(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1066 = arg0.method2136();
        }
    }
}
