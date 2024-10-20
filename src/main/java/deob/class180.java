package deob;

@ObfuscatedName("go")
public class class180 extends class481 {

    @ObfuscatedName("go.ao")
    public static class299 field1856 = new class299(64);

    @ObfuscatedName("go.ab")
    public int field1857 = -1;

    @ObfuscatedName("go.au")
    public int[] field1858;

    @ObfuscatedName("go.aa")
    public short[] field1859;

    @ObfuscatedName("go.ac")
    public short[] field1860;

    @ObfuscatedName("go.al")
    public short[] field1854;

    @ObfuscatedName("go.az")
    public short[] field1862;

    @ObfuscatedName("go.ap")
    public int[] field1863 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("go.av")
    public boolean field1861 = false;

    @ObfuscatedName("gz.at(Lol;Lol;S)V")
    public static void method3220(class371 arg0, class371 arg1) {
        Statics.field1866 = arg0;
        Statics.field1855 = arg1;
        Statics.field3826 = Statics.field1866.method6294(3);
    }

    @ObfuscatedName("ah.ah(IB)Lgo;")
    public static class180 method13(int arg0) {
        class180 var1 = (class180) field1856.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1866.method6284(3, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3300(new class527(var2));
        }
        field1856.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.ar(Luj;I)V")
    public void method3300(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3292(arg0, var2);
        }
    }

    @ObfuscatedName("go.ao(Luj;II)V")
    public void method3292(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1857 = arg0.method8410();
        } else if (arg1 == 2) {
            int var3 = arg0.method8410();
            this.field1858 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1858[var4] = arg0.method8412();
            }
        } else if (arg1 == 3) {
            this.field1861 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8410();
            this.field1859 = new short[var5];
            this.field1860 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1859[var6] = (short) arg0.method8412();
                this.field1860[var6] = (short) arg0.method8412();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8410();
            this.field1854 = new short[var7];
            this.field1862 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1854[var8] = (short) arg0.method8412();
                this.field1862[var8] = (short) arg0.method8412();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1863[arg1 - 60] = arg0.method8412();
        }
    }

    @ObfuscatedName("go.ab(I)Z")
    public boolean method3294() {
        if (this.field1858 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1858.length; var2++) {
            if (!Statics.field1855.method6308(this.field1858[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.au(B)Lkq;")
    public class262 method3295() {
        if (this.field1858 == null) {
            return null;
        }
        class262[] var1 = new class262[this.field1858.length];
        for (int var2 = 0; var2 < this.field1858.length; var2++) {
            var1[var2] = class262.method4571(Statics.field1855, this.field1858[var2], 0);
        }
        class262 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class262(var1, var1.length);
        }
        if (this.field1859 != null) {
            for (int var4 = 0; var4 < this.field1859.length; var4++) {
                var3.method4585(this.field1859[var4], this.field1860[var4]);
            }
        }
        if (this.field1854 != null) {
            for (int var5 = 0; var5 < this.field1854.length; var5++) {
                var3.method4641(this.field1854[var5], this.field1862[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("go.aa(B)Z")
    public boolean method3296() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1863[var2] != -1 && !Statics.field1855.method6308(this.field1863[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.ac(I)Lkq;")
    public class262 method3297() {
        class262[] var1 = new class262[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1863[var3] != -1) {
                var1[var2++] = class262.method4571(Statics.field1855, this.field1863[var3], 0);
            }
        }
        class262 var4 = new class262(var1, var2);
        if (this.field1859 != null) {
            for (int var5 = 0; var5 < this.field1859.length; var5++) {
                var4.method4585(this.field1859[var5], this.field1860[var5]);
            }
        }
        if (this.field1854 != null) {
            for (int var6 = 0; var6 < this.field1854.length; var6++) {
                var4.method4641(this.field1854[var6], this.field1862[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.al(I)V")
    public static void method3543() {
        field1856.method5292();
    }
}
