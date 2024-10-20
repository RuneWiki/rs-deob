package deob;

@ObfuscatedName("av")
public class class46 extends class204 {

    @ObfuscatedName("av.p")
    public static class193 field1048 = new class193(64);

    @ObfuscatedName("av.v")
    public boolean field1049 = false;

    @ObfuscatedName("m.d(Lfn;I)V")
    public static void method154(class167 arg0) {
        Statics.field1051 = arg0;
    }

    @ObfuscatedName("es.p(II)Lav;")
    public static class46 method2839(int arg0) {
        class46 var1 = (class46) field1048.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1051.method3134(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method925(new class119(var2));
        }
        field1048.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.v(Ldf;B)V")
    public void method925(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method926(arg0, var2);
        }
    }

    @ObfuscatedName("av.l(Ldf;II)V")
    public void method926(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1049 = true;
        }
    }
}
