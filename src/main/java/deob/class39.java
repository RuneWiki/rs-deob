package deob;

@ObfuscatedName("ay")
public class class39 extends class183 {

    @ObfuscatedName("ay.s")
    public static class172 field920 = new class172(64);

    @ObfuscatedName("ay.g")
    public static class172 field918 = new class172(30);

    @ObfuscatedName("ay.h")
    public int field914;

    @ObfuscatedName("ay.l")
    public int field915;

    @ObfuscatedName("ay.e")
    public int field916 = -1;

    @ObfuscatedName("ay.u")
    public short[] field911;

    @ObfuscatedName("ay.j")
    public short[] field912;

    @ObfuscatedName("ay.c")
    public short[] field919;

    @ObfuscatedName("ay.d")
    public short[] field917;

    @ObfuscatedName("ay.v")
    public int field921 = 128;

    @ObfuscatedName("ay.n")
    public int field922 = 128;

    @ObfuscatedName("ay.z")
    public int field923 = 0;

    @ObfuscatedName("ay.a")
    public int field924 = 0;

    @ObfuscatedName("ay.t")
    public int field925 = 0;

    @ObfuscatedName("es.k(II)Lay;")
    public static class39 method2666(int arg0) {
        class39 var1 = (class39) field920.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field913.method2729(13, arg0);
        class39 var3 = new class39();
        var3.field914 = arg0;
        if (var2 != null) {
            var3.method720(new class107(var2));
        }
        field920.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.y(Ldy;I)V")
    public void method720(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method732(arg0, var2);
        }
    }

    @ObfuscatedName("ay.s(Ldy;IB)V")
    public void method732(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field915 = arg0.method2239();
        } else if (arg1 == 2) {
            this.field916 = arg0.method2239();
        } else if (arg1 == 4) {
            this.field921 = arg0.method2239();
        } else if (arg1 == 5) {
            this.field922 = arg0.method2239();
        } else if (arg1 == 6) {
            this.field923 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field924 = arg0.method2138();
        } else if (arg1 == 8) {
            this.field925 = arg0.method2138();
        } else if (arg1 == 40) {
            int var3 = arg0.method2138();
            this.field911 = new short[var3];
            this.field912 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field911[var4] = (short) arg0.method2239();
                this.field912[var4] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2138();
            this.field919 = new short[var5];
            this.field917 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field919[var6] = (short) arg0.method2239();
                this.field917[var6] = (short) arg0.method2239();
            }
        }
    }

    @ObfuscatedName("ay.g(II)Lck;")
    public final class98 method722(int arg0) {
        class98 var2 = (class98) field918.method3202((long) this.field914);
        if (var2 == null) {
            class93 var3 = class93.method1891(Statics.field2678, this.field915, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field911 != null) {
                for (int var4 = 0; var4 < this.field911.length; var4++) {
                    var3.method1905(this.field911[var4], this.field912[var4]);
                }
            }
            if (this.field919 != null) {
                for (int var5 = 0; var5 < this.field919.length; var5++) {
                    var3.method1956(this.field919[var5], this.field917[var5]);
                }
            }
            var2 = var3.method1913(this.field924 + 64, this.field925 + 850, -30, -50, -30);
            field918.method3204(var2, (long) this.field914);
        }
        class98 var6;
        if (this.field916 == -1 || arg0 == -1) {
            var6 = var2.method1989(true);
        } else {
            var6 = class38.method29(this.field916).method684(var2, arg0);
        }
        if (this.field921 != 128 || this.field922 != 128) {
            var6.method1990(this.field921, this.field922, this.field921);
        }
        if (this.field923 != 0) {
            if (this.field923 == 90) {
                var6.method1997();
            }
            if (this.field923 == 180) {
                var6.method1997();
                var6.method1997();
            }
            if (this.field923 == 270) {
                var6.method1997();
                var6.method1997();
                var6.method1997();
            }
        }
        return var6;
    }

    @ObfuscatedName("aj.h(I)V")
    public static void method568() {
        field920.method3210();
        field918.method3210();
    }
}
