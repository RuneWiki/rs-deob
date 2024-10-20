package deob;

@ObfuscatedName("jy")
public class class267 extends class207 {

    @ObfuscatedName("jy.w")
    public static class201 field3343 = new class201(64);

    @ObfuscatedName("jy.s")
    public char field3337;

    @ObfuscatedName("jy.l")
    public char field3338;

    @ObfuscatedName("jy.u")
    public String field3341 = class238.field2798;

    @ObfuscatedName("jy.q")
    public int field3342;

    @ObfuscatedName("jy.k")
    public int field3346 = 0;

    @ObfuscatedName("jy.i")
    public int[] field3344;

    @ObfuscatedName("jy.x")
    public int[] field3345;

    @ObfuscatedName("jy.e")
    public String[] field3340;

    @ObfuscatedName("gk.z(II)Ljy;")
    public static class267 method3306(int arg0) {
        class267 var1 = (class267) field3343.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3339.method4247(8, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4587(new class183(var2));
        }
        field3343.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.w(Lgk;B)V")
    public void method4587(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4588(arg0, var2);
        }
    }

    @ObfuscatedName("jy.s(Lgk;IB)V")
    public void method4588(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3337 = (char) arg0.method3247();
        } else if (arg1 == 2) {
            this.field3338 = (char) arg0.method3247();
        } else if (arg1 == 3) {
            this.field3341 = arg0.method3441();
        } else if (arg1 == 4) {
            this.field3342 = arg0.method3374();
        } else if (arg1 == 5) {
            this.field3346 = arg0.method3253();
            this.field3344 = new int[this.field3346];
            this.field3340 = new String[this.field3346];
            for (int var3 = 0; var3 < this.field3346; var3++) {
                this.field3344[var3] = arg0.method3374();
                this.field3340[var3] = arg0.method3441();
            }
        } else if (arg1 == 6) {
            this.field3346 = arg0.method3253();
            this.field3344 = new int[this.field3346];
            this.field3345 = new int[this.field3346];
            for (int var4 = 0; var4 < this.field3346; var4++) {
                this.field3344[var4] = arg0.method3374();
                this.field3345[var4] = arg0.method3374();
            }
        }
    }

    @ObfuscatedName("jy.l(I)I")
    public int method4589() {
        return this.field3346;
    }
}
