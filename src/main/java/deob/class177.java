package deob;

@ObfuscatedName("fe")
public class class177 extends class407 {

    @ObfuscatedName("fe.p")
    public static class257 field1910 = new class257(64);

    @ObfuscatedName("fe.f")
    public char field1911;

    @ObfuscatedName("fe.n")
    public char field1918;

    @ObfuscatedName("fe.k")
    public String field1913 = class310.field3924;

    @ObfuscatedName("fe.w")
    public int field1914;

    @ObfuscatedName("fe.s")
    public int field1912 = 0;

    @ObfuscatedName("fe.q")
    public int[] field1920;

    @ObfuscatedName("fe.m")
    public int[] field1915;

    @ObfuscatedName("fe.x")
    public String[] field1916;

    @ObfuscatedName("q.c(Llv;B)V")
    public static void method66(class317 arg0) {
        Statics.field1917 = arg0;
    }

    @ObfuscatedName("ke.p(IB)Lfe;")
    public static class177 method5178(int arg0) {
        class177 var1 = (class177) field1910.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1917.method5499(8, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3259(new class445(var2));
        }
        field1910.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.f(Lqq;I)V")
    public void method3259(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3257(arg0, var2);
        }
    }

    @ObfuscatedName("fe.n(Lqq;II)V")
    public void method3257(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1911 = (char) arg0.method7196();
        } else if (arg1 == 2) {
            this.field1918 = (char) arg0.method7196();
        } else if (arg1 == 3) {
            this.field1913 = arg0.method7206();
        } else if (arg1 == 4) {
            this.field1914 = arg0.method7201();
        } else if (arg1 == 5) {
            this.field1912 = arg0.method7198();
            this.field1920 = new int[this.field1912];
            this.field1916 = new String[this.field1912];
            for (int var3 = 0; var3 < this.field1912; var3++) {
                this.field1920[var3] = arg0.method7201();
                this.field1916[var3] = arg0.method7206();
            }
        } else if (arg1 == 6) {
            this.field1912 = arg0.method7198();
            this.field1920 = new int[this.field1912];
            this.field1915 = new int[this.field1912];
            for (int var4 = 0; var4 < this.field1912; var4++) {
                this.field1920[var4] = arg0.method7201();
                this.field1915[var4] = arg0.method7201();
            }
        }
    }

    @ObfuscatedName("fe.k(B)I")
    public int method3258() {
        return this.field1912;
    }
}
