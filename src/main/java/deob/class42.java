package deob;

@ObfuscatedName("av")
public class class42 extends class182 {

    @ObfuscatedName("av.c")
    public static class171 field977 = new class171(64);

    @ObfuscatedName("av.h")
    public int field978;

    @ObfuscatedName("av.v")
    public int field985;

    @ObfuscatedName("av.q")
    public int field980;

    @ObfuscatedName("ef.i(Ler;I)V")
    public static void method2844(class146 arg0) {
        Statics.field983 = arg0;
    }

    @ObfuscatedName("z.c(II)Lav;")
    public static class42 method154(int arg0) {
        class42 var1 = (class42) field977.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field983.method2811(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method831(new class107(var2));
        }
        field977.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.h(Ldm;B)V")
    public void method831(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("av.v(Ldm;IB)V")
    public void method821(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field978 = arg0.method2313();
            this.field985 = arg0.method2151();
            this.field980 = arg0.method2151();
        }
    }
}
