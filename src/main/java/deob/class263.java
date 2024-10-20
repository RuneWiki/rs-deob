package deob;

@ObfuscatedName("jd")
public class class263 extends class185 {

    @ObfuscatedName("jd.b")
    public static class155 field3341 = new class155(64);

    @ObfuscatedName("jd.l")
    public char field3340;

    @ObfuscatedName("jd.m")
    public char field3343;

    @ObfuscatedName("jd.z")
    public String field3342 = class234.field2793;

    @ObfuscatedName("jd.q")
    public int field3348;

    @ObfuscatedName("jd.k")
    public int field3344 = 0;

    @ObfuscatedName("jd.c")
    public int[] field3345;

    @ObfuscatedName("jd.u")
    public int[] field3338;

    @ObfuscatedName("jd.t")
    public String[] field3346;

    @ObfuscatedName("ch.f(Liw;I)V")
    public static void method2124(class245 arg0) {
        Statics.field3339 = arg0;
    }

    @ObfuscatedName("dw.b(II)Ljd;")
    public static class263 method2433(int arg0) {
        class263 var1 = (class263) field3341.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3339.method3905(8, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4304(new class311(var2));
        }
        field3341.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.l(Lkb;I)V")
    public void method4304(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4307(arg0, var2);
        }
    }

    @ObfuscatedName("jd.m(Lkb;II)V")
    public void method4307(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3340 = (char) arg0.method5276();
        } else if (arg1 == 2) {
            this.field3343 = (char) arg0.method5276();
        } else if (arg1 == 3) {
            this.field3342 = arg0.method5189();
        } else if (arg1 == 4) {
            this.field3348 = arg0.method5330();
        } else if (arg1 == 5) {
            this.field3344 = arg0.method5163();
            this.field3345 = new int[this.field3344];
            this.field3346 = new String[this.field3344];
            for (int var3 = 0; var3 < this.field3344; var3++) {
                this.field3345[var3] = arg0.method5330();
                this.field3346[var3] = arg0.method5189();
            }
        } else if (arg1 == 6) {
            this.field3344 = arg0.method5163();
            this.field3345 = new int[this.field3344];
            this.field3338 = new int[this.field3344];
            for (int var4 = 0; var4 < this.field3344; var4++) {
                this.field3345[var4] = arg0.method5330();
                this.field3338[var4] = arg0.method5330();
            }
        }
    }

    @ObfuscatedName("jd.z(I)I")
    public int method4303() {
        return this.field3344;
    }
}
