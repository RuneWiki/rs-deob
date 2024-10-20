package deob;

import java.io.EOFException;

@ObfuscatedName("ab")
public class class47 {

    @ObfuscatedName("ab.i")
    public boolean[] field908 = new boolean[this.field916.length];

    @ObfuscatedName("ab.a")
    public boolean[] field910;

    @ObfuscatedName("ab.f")
    public int[] field916 = new int[Statics.field937.method3122(19)];

    @ObfuscatedName("ab.c")
    public String[] field911 = new String[Statics.field937.method3122(15)];

    @ObfuscatedName("ab.d")
    public boolean field912 = false;

    @ObfuscatedName("ab.l")
    public long field909;

    public class47() {
        for (int var1 = 0; var1 < this.field916.length; var1++) {
            class189 var2 = (class189) class189.field2755.method2186((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2754.method3071(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3223(new class154(var4));
                }
                class189.field2755.method2179(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field908[var1] = var3.field2756;
        }
        this.field910 = new boolean[this.field911.length];
        for (int var7 = 0; var7 < this.field911.length; var7++) {
            class190 var8 = class190.method17(var7);
            this.field910[var7] = var8.field2762;
        }
        for (int var9 = 0; var9 < this.field916.length; var9++) {
            this.field916[var9] = -1;
        }
        this.method815();
    }

    @ObfuscatedName("ab.u(III)V")
    public void method808(int arg0, int arg1) {
        this.field916[arg0] = arg1;
        if (this.field908[arg0]) {
            this.field912 = true;
        }
    }

    @ObfuscatedName("ab.x(IB)I")
    public int method809(int arg0) {
        return this.field916[arg0];
    }

    @ObfuscatedName("ab.i(ILjava/lang/String;B)V")
    public void method810(int arg0, String arg1) {
        this.field911[arg0] = arg1;
        if (this.field910[arg0]) {
            this.field912 = true;
        }
    }

    @ObfuscatedName("ab.a(II)Ljava/lang/String;")
    public String method811(int arg0) {
        return this.field911[arg0];
    }

    @ObfuscatedName("ab.c(I)V")
    public void method817() {
        for (int var1 = 0; var1 < this.field916.length; var1++) {
            if (!this.field908[var1]) {
                this.field916[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field911.length; var2++) {
            if (!this.field910[var2]) {
                this.field911[var2] = null;
            }
        }
    }

    @ObfuscatedName("ab.g(ZS)Lbj;")
    public class74 method828(boolean arg0) {
        return class105.method843("2", Statics.field140.field2670, arg0);
    }

    @ObfuscatedName("ab.z(I)V")
    public void method829() {
        class74 var1 = this.method828(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field916.length; var4++) {
                if (this.field908[var4] && this.field916[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field911.length; var6++) {
                if (this.field910[var6] && this.field911[var6] != null) {
                    var2 += 2 + class154.method2553(this.field911[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2573(1);
            var7.method2731(var3);
            for (int var8 = 0; var8 < this.field916.length; var8++) {
                if (this.field908[var8] && this.field916[var8] != -1) {
                    var7.method2731(var8);
                    var7.method2576(this.field916[var8]);
                }
            }
            var7.method2731(var5);
            for (int var9 = 0; var9 < this.field911.length; var9++) {
                if (this.field910[var9] && this.field911[var9] != null) {
                    var7.method2731(var9);
                    var7.method2624(this.field911[var9]);
                }
            }
            var1.method1305(var7.field2078, 0, var7.field2073);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1295();
            } catch (Exception var20) {
            }
        }
        this.field912 = false;
        this.field909 = class156.method118();
    }

    @ObfuscatedName("ab.t(I)V")
    public void method815() {
        class74 var1 = this.method828(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method1297()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1298(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2078.length - var5.field2073 < 1) {
                    return;
                }
                int var7 = var5.method2708();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2581();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2581();
                        int var12 = var5.method2593();
                        if (this.field908[var11]) {
                            this.field916[var11] = var12;
                        }
                    }
                    int var13 = var5.method2581();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2581();
                        String var16 = var5.method2778();
                        if (this.field910[var15]) {
                            this.field911[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method1295();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field912 = false;
    }

    @ObfuscatedName("ab.m(B)V")
    public void method816() {
        if (this.field912 && this.field909 < class156.method118() - 60000L) {
            this.method829();
        }
    }

    @ObfuscatedName("ab.q(I)Z")
    public boolean method825() {
        return this.field912;
    }
}
