package deob;

@ObfuscatedName("av")
public class class40 extends class185 {

    @ObfuscatedName("av.g")
    public static class174 field925 = new class174(64);

    @ObfuscatedName("av.j")
    public static class174 field921 = new class174(30);

    @ObfuscatedName("av.w")
    public int field922;

    @ObfuscatedName("av.c")
    public int field923;

    @ObfuscatedName("av.x")
    public int field920 = -1;

    @ObfuscatedName("av.f")
    public short[] field931;

    @ObfuscatedName("av.t")
    public short[] field936;

    @ObfuscatedName("av.n")
    public short[] field927;

    @ObfuscatedName("av.p")
    public short[] field928;

    @ObfuscatedName("av.a")
    public int field929 = 128;

    @ObfuscatedName("av.o")
    public int field930 = 128;

    @ObfuscatedName("av.b")
    public int field924 = 0;

    @ObfuscatedName("av.r")
    public int field932 = 0;

    @ObfuscatedName("av.z")
    public int field933 = 0;

    @ObfuscatedName("n.l(Leo;Leo;I)V")
    public static void method126(class149 arg0, class149 arg1) {
        Statics.field919 = arg0;
        Statics.field1873 = arg1;
    }

    @ObfuscatedName("av.g(Ldk;I)V")
    public void method761(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method751(arg0, var2);
        }
    }

    @ObfuscatedName("av.j(Ldk;II)V")
    public void method751(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field923 = arg0.method2163();
        } else if (arg1 == 2) {
            this.field920 = arg0.method2163();
        } else if (arg1 == 4) {
            this.field929 = arg0.method2163();
        } else if (arg1 == 5) {
            this.field930 = arg0.method2163();
        } else if (arg1 == 6) {
            this.field924 = arg0.method2163();
        } else if (arg1 == 7) {
            this.field932 = arg0.method2291();
        } else if (arg1 == 8) {
            this.field933 = arg0.method2291();
        } else if (arg1 == 40) {
            int var3 = arg0.method2291();
            this.field931 = new short[var3];
            this.field936 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field931[var4] = (short) arg0.method2163();
                this.field936[var4] = (short) arg0.method2163();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2291();
            this.field927 = new short[var5];
            this.field928 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field927[var6] = (short) arg0.method2163();
                this.field928[var6] = (short) arg0.method2163();
            }
        }
    }

    @ObfuscatedName("av.w(II)Lck;")
    public final class99 method752(int arg0) {
        class99 var2 = (class99) field921.method3225((long) this.field922);
        if (var2 == null) {
            class94 var3 = class94.method1902(Statics.field1873, this.field923, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field931 != null) {
                for (int var4 = 0; var4 < this.field931.length; var4++) {
                    var3.method1908(this.field931[var4], this.field936[var4]);
                }
            }
            if (this.field927 != null) {
                for (int var5 = 0; var5 < this.field927.length; var5++) {
                    var3.method1899(this.field927[var5], this.field928[var5]);
                }
            }
            var2 = var3.method1915(this.field932 + 64, this.field933 + 850, -30, -50, -30);
            field921.method3211(var2, (long) this.field922);
        }
        class99 var6;
        if (this.field920 == -1 || arg0 == -1) {
            var6 = var2.method2002(true);
        } else {
            var6 = class39.method821(this.field920).method741(var2, arg0);
        }
        if (this.field929 != 128 || this.field930 != 128) {
            var6.method2015(this.field929, this.field930, this.field929);
        }
        if (this.field924 != 0) {
            if (this.field924 == 90) {
                var6.method2010();
            }
            if (this.field924 == 180) {
                var6.method2010();
                var6.method2010();
            }
            if (this.field924 == 270) {
                var6.method2010();
                var6.method2010();
                var6.method2010();
            }
        }
        return var6;
    }
}
