package deob;

@ObfuscatedName("jy")
public class class267 extends class207 {

    @ObfuscatedName("jy.m")
    public static class201 field3357 = new class201(64);

    @ObfuscatedName("jy.q")
    public char field3358;

    @ObfuscatedName("jy.b")
    public char field3356;

    @ObfuscatedName("jy.f")
    public String field3359 = class238.field2821;

    @ObfuscatedName("jy.n")
    public int field3362;

    @ObfuscatedName("jy.h")
    public int field3361 = 0;

    @ObfuscatedName("jy.x")
    public int[] field3360;

    @ObfuscatedName("jy.j")
    public int[] field3363;

    @ObfuscatedName("jy.a")
    public String[] field3364;

    @ObfuscatedName("s.w(Liv;B)V")
    public static void method125(class248 arg0) {
        Statics.field3754 = arg0;
    }

    @ObfuscatedName("ak.m(IB)Ljy;")
    public static class267 method972(int arg0) {
        class267 var1 = (class267) field3357.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3754.method4250(8, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4609(new class183(var2));
        }
        field3357.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.q(Lgy;I)V")
    public void method4609(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4608(arg0, var2);
        }
    }

    @ObfuscatedName("jy.x(Lgy;II)V")
    public void method4608(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3358 = (char) arg0.method3436();
        } else if (arg1 == 2) {
            this.field3356 = (char) arg0.method3436();
        } else if (arg1 == 3) {
            this.field3359 = arg0.method3271();
        } else if (arg1 == 4) {
            this.field3362 = arg0.method3267();
        } else if (arg1 == 5) {
            this.field3361 = arg0.method3268();
            this.field3360 = new int[this.field3361];
            this.field3364 = new String[this.field3361];
            for (int var3 = 0; var3 < this.field3361; var3++) {
                this.field3360[var3] = arg0.method3267();
                this.field3364[var3] = arg0.method3271();
            }
        } else if (arg1 == 6) {
            this.field3361 = arg0.method3268();
            this.field3360 = new int[this.field3361];
            this.field3363 = new int[this.field3361];
            for (int var4 = 0; var4 < this.field3361; var4++) {
                this.field3360[var4] = arg0.method3267();
                this.field3363[var4] = arg0.method3267();
            }
        }
    }

    @ObfuscatedName("jy.j(B)I")
    public int method4611() {
        return this.field3361;
    }
}
