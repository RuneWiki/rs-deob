package deob;

@ObfuscatedName("ae")
public class class37 extends class174 {

    @ObfuscatedName("ae.t")
    public static class167 field917 = new class167(64);

    @ObfuscatedName("ae.e")
    public int field918 = -1;

    @ObfuscatedName("ae.a")
    public int[] field927;

    @ObfuscatedName("ae.l")
    public short[] field920;

    @ObfuscatedName("ae.v")
    public short[] field922;

    @ObfuscatedName("ae.j")
    public short[] field919;

    @ObfuscatedName("ae.k")
    public short[] field915;

    @ObfuscatedName("ae.g")
    public int[] field924 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.d")
    public boolean field925 = false;

    @ObfuscatedName("cu.z(Lel;Lel;I)V")
    public static void method2077(class142 arg0, class142 arg1) {
        Statics.field921 = arg0;
        Statics.field914 = arg1;
        Statics.field916 = Statics.field921.method2755(3);
    }

    @ObfuscatedName("ae.u(Lcj;B)V")
    public void method783(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method787(arg0, var2);
        }
    }

    @ObfuscatedName("ae.t(Lcj;II)V")
    public void method787(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field918 = arg0.method2257();
        } else if (arg1 == 2) {
            int var3 = arg0.method2257();
            this.field927 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field927[var4] = arg0.method2206();
            }
        } else if (arg1 == 3) {
            this.field925 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2257();
            this.field920 = new short[var5];
            this.field922 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field920[var6] = (short) arg0.method2206();
                this.field922[var6] = (short) arg0.method2206();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2257();
            this.field919 = new short[var7];
            this.field915 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field919[var8] = (short) arg0.method2206();
                this.field915[var8] = (short) arg0.method2206();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field924[arg1 - 60] = arg0.method2206();
        }
    }

    @ObfuscatedName("ae.e(I)Z")
    public boolean method777() {
        if (this.field927 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field927.length; var2++) {
            if (!Statics.field914.method2747(this.field927[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.a(I)Lcv;")
    public class90 method774() {
        if (this.field927 == null) {
            return null;
        }
        class90[] var1 = new class90[this.field927.length];
        for (int var2 = 0; var2 < this.field927.length; var2++) {
            var1[var2] = class90.method1964(Statics.field914, this.field927[var2], 0);
        }
        class90 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class90(var1, var1.length);
        }
        if (this.field920 != null) {
            for (int var4 = 0; var4 < this.field920.length; var4++) {
                var3.method1909(this.field920[var4], this.field922[var4]);
            }
        }
        if (this.field919 != null) {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var3.method1898(this.field919[var5], this.field915[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ae.l(I)Z")
    public boolean method775() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field924[var2] != -1 && !Statics.field914.method2747(this.field924[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.v(I)Lcv;")
    public class90 method776() {
        class90[] var1 = new class90[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field924[var3] != -1) {
                var1[var2++] = class90.method1964(Statics.field914, this.field924[var3], 0);
            }
        }
        class90 var4 = new class90(var1, var2);
        if (this.field920 != null) {
            for (int var5 = 0; var5 < this.field920.length; var5++) {
                var4.method1909(this.field920[var5], this.field922[var5]);
            }
        }
        if (this.field919 != null) {
            for (int var6 = 0; var6 < this.field919.length; var6++) {
                var4.method1898(this.field919[var6], this.field915[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("k.j(I)V")
    public static void method136() {
        field917.method3193();
    }
}
