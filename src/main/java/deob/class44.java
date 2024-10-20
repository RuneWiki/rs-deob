package deob;

@ObfuscatedName("au")
public class class44 extends class185 {

    @ObfuscatedName("au.j")
    public static class174 field993 = new class174(64);

    @ObfuscatedName("au.y")
    public char field997;

    @ObfuscatedName("au.r")
    public char field995;

    @ObfuscatedName("au.f")
    public String field996 = "null";

    @ObfuscatedName("au.l")
    public int field992;

    @ObfuscatedName("au.b")
    public int field998 = 0;

    @ObfuscatedName("au.k")
    public int[] field1001;

    @ObfuscatedName("au.g")
    public int[] field1000;

    @ObfuscatedName("au.v")
    public String[] field994;

    @ObfuscatedName("cb.c(Ler;I)V")
    public static void method2066(class149 arg0) {
        Statics.field999 = arg0;
    }

    @ObfuscatedName("gv.j(IB)Lau;")
    public static class44 method3355(int arg0) {
        class44 var1 = (class44) field993.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field999.method2746(8, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method808(new class108(var2));
        }
        field993.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.y(Ldx;I)V")
    public void method808(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method809(arg0, var2);
        }
    }

    @ObfuscatedName("au.r(Ldx;IS)V")
    public void method809(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field997 = (char) arg0.method2134();
        } else if (arg1 == 2) {
            this.field995 = (char) arg0.method2134();
        } else if (arg1 == 3) {
            this.field996 = arg0.method2216();
        } else if (arg1 == 4) {
            this.field992 = arg0.method2144();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2136();
            this.field1001 = new int[this.field998];
            this.field994 = new String[this.field998];
            for (int var3 = 0; var3 < this.field998; var3++) {
                this.field1001[var3] = arg0.method2144();
                this.field994[var3] = arg0.method2216();
            }
        } else if (arg1 == 6) {
            this.field998 = arg0.method2136();
            this.field1001 = new int[this.field998];
            this.field1000 = new int[this.field998];
            for (int var4 = 0; var4 < this.field998; var4++) {
                this.field1001[var4] = arg0.method2144();
                this.field1000[var4] = arg0.method2144();
            }
        }
    }
}
