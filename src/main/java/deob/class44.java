package deob;

@ObfuscatedName("av")
public class class44 extends class185 {

    @ObfuscatedName("av.v")
    public static class174 field1001 = new class174(64);

    @ObfuscatedName("av.m")
    public char field999;

    @ObfuscatedName("av.e")
    public char field997;

    @ObfuscatedName("av.h")
    public String field1000 = "null";

    @ObfuscatedName("av.p")
    public int field998;

    @ObfuscatedName("av.j")
    public int field1002 = 0;

    @ObfuscatedName("av.i")
    public int[] field1003;

    @ObfuscatedName("av.u")
    public int[] field1010;

    @ObfuscatedName("av.l")
    public String[] field1005;

    @ObfuscatedName("at.x(Ley;I)V")
    public static void method785(class149 arg0) {
        Statics.field996 = arg0;
    }

    @ObfuscatedName("a.v(IB)Lav;")
    public static class44 method529(int arg0) {
        class44 var1 = (class44) field1001.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field996.method2751(8, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method845(new class108(var2));
        }
        field1001.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.m(Ldm;I)V")
    public void method845(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Ldm;II)V")
    public void method842(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field999 = (char) arg0.method2299();
        } else if (arg1 == 2) {
            this.field997 = (char) arg0.method2299();
        } else if (arg1 == 3) {
            this.field1000 = arg0.method2270();
        } else if (arg1 == 4) {
            this.field998 = arg0.method2132();
        } else if (arg1 == 5) {
            this.field1002 = arg0.method2129();
            this.field1003 = new int[this.field1002];
            this.field1005 = new String[this.field1002];
            for (int var3 = 0; var3 < this.field1002; var3++) {
                this.field1003[var3] = arg0.method2132();
                this.field1005[var3] = arg0.method2270();
            }
        } else if (arg1 == 6) {
            this.field1002 = arg0.method2129();
            this.field1003 = new int[this.field1002];
            this.field1010 = new int[this.field1002];
            for (int var4 = 0; var4 < this.field1002; var4++) {
                this.field1003[var4] = arg0.method2132();
                this.field1010[var4] = arg0.method2132();
            }
        }
    }
}
