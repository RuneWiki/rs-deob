package deob;

@ObfuscatedName("fd")
public class class173 extends class387 {

    @ObfuscatedName("fd.s")
    public static class249 field1901 = new class249(64);

    @ObfuscatedName("fd.e")
    public static class249 field1910 = new class249(30);

    @ObfuscatedName("fd.r")
    public int field1898;

    @ObfuscatedName("fd.o")
    public int field1899;

    @ObfuscatedName("fd.i")
    public int field1900 = -1;

    @ObfuscatedName("fd.w")
    public short[] field1896;

    @ObfuscatedName("fd.v")
    public short[] field1902;

    @ObfuscatedName("fd.a")
    public short[] field1903;

    @ObfuscatedName("fd.y")
    public short[] field1904;

    @ObfuscatedName("fd.u")
    public int field1905 = 128;

    @ObfuscatedName("fd.h")
    public int field1895 = 128;

    @ObfuscatedName("fd.q")
    public int field1894 = 0;

    @ObfuscatedName("fd.x")
    public int field1907 = 0;

    @ObfuscatedName("fd.p")
    public int field1909 = 0;

    @ObfuscatedName("be.c(Lkq;Lkq;I)V")
    public static void method979(class307 arg0, class307 arg1) {
        Statics.field1897 = arg0;
        Statics.field1908 = arg1;
    }

    @ObfuscatedName("jz.l(IS)Lfd;")
    public static class173 method4901(int arg0) {
        class173 var1 = (class173) field1901.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1897.method5066(13, arg0);
        class173 var3 = new class173();
        var3.field1898 = arg0;
        if (var2 != null) {
            var3.method3007(new class421(var2));
        }
        field1901.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fd.s(Lpi;B)V")
    public void method3007(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3008(arg0, var2);
        }
    }

    @ObfuscatedName("fd.e(Lpi;II)V")
    public void method3008(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1899 = arg0.method6666();
        } else if (arg1 == 2) {
            this.field1900 = arg0.method6666();
        } else if (arg1 == 4) {
            this.field1905 = arg0.method6666();
        } else if (arg1 == 5) {
            this.field1895 = arg0.method6666();
        } else if (arg1 == 6) {
            this.field1894 = arg0.method6666();
        } else if (arg1 == 7) {
            this.field1907 = arg0.method6686();
        } else if (arg1 == 8) {
            this.field1909 = arg0.method6686();
        } else if (arg1 == 40) {
            int var3 = arg0.method6686();
            this.field1896 = new short[var3];
            this.field1902 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1896[var4] = (short) arg0.method6666();
                this.field1902[var4] = (short) arg0.method6666();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6686();
            this.field1903 = new short[var5];
            this.field1904 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1903[var6] = (short) arg0.method6666();
                this.field1904[var6] = (short) arg0.method6666();
            }
        }
    }

    @ObfuscatedName("fd.r(IB)Lgf;")
    public final class204 method3009(int arg0) {
        class204 var2 = (class204) field1910.method4472((long) this.field1898);
        if (var2 == null) {
            class189 var3 = class189.method3374(Statics.field1908, this.field1899, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1896 != null) {
                for (int var4 = 0; var4 < this.field1896.length; var4++) {
                    var3.method3380(this.field1896[var4], this.field1902[var4]);
                }
            }
            if (this.field1903 != null) {
                for (int var5 = 0; var5 < this.field1903.length; var5++) {
                    var3.method3404(this.field1903[var5], this.field1904[var5]);
                }
            }
            var2 = var3.method3396(this.field1907 + 64, this.field1909 + 850, -30, -50, -30);
            field1910.method4482(var2, (long) this.field1898);
        }
        class204 var6;
        if (this.field1900 == -1 || arg0 == -1) {
            var6 = var2.method3804(true);
        } else {
            var6 = class183.method1980(this.field1900).method3292(var2, arg0);
        }
        if (this.field1905 != 128 || this.field1895 != 128) {
            var6.method3824(this.field1905, this.field1895, this.field1905);
        }
        if (this.field1894 != 0) {
            if (this.field1894 == 90) {
                var6.method3819();
            }
            if (this.field1894 == 180) {
                var6.method3819();
                var6.method3819();
            }
            if (this.field1894 == 270) {
                var6.method3819();
                var6.method3819();
                var6.method3819();
            }
        }
        return var6;
    }

    @ObfuscatedName("hf.o(I)V")
    public static void method4314() {
        field1901.method4475();
        field1910.method4475();
    }
}
