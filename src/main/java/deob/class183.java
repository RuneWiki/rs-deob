package deob;

@ObfuscatedName("gx")
public class class183 extends class405 {

    @ObfuscatedName("gx.v")
    public static class256 field1997 = new class256(64);

    @ObfuscatedName("gx.q")
    public int field1995;

    @ObfuscatedName("gx.f")
    public int field2003;

    @ObfuscatedName("gx.j")
    public int field1998;

    @ObfuscatedName("gx.e")
    public static final int[] field1999 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1999[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("io.c(II)Lgx;")
    public static class183 method4608(int arg0) {
        class183 var1 = (class183) field1997.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2002.method5305(14, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3243(new class443(var2));
        }
        field1997.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.v(Lqt;I)V")
    public void method3243(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3244(arg0, var2);
        }
    }

    @ObfuscatedName("gx.q(Lqt;IB)V")
    public void method3244(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1995 = arg0.method7049();
            this.field2003 = arg0.method7047();
            this.field1998 = arg0.method7047();
        }
    }
}
