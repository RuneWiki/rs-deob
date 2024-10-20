package deob;

import java.io.EOFException;

@ObfuscatedName("an")
public class class47 {

    @ObfuscatedName("an.n")
    public boolean[] field910 = new boolean[this.field912.length];

    @ObfuscatedName("an.q")
    public boolean[] field911;

    @ObfuscatedName("an.t")
    public int[] field912 = new int[Statics.field3151.method3097(19)];

    @ObfuscatedName("an.p")
    public String[] field922 = new String[Statics.field3151.method3097(15)];

    @ObfuscatedName("an.u")
    public boolean field914 = false;

    @ObfuscatedName("an.z")
    public long field915;

    public class47() {
        for (int var1 = 0; var1 < this.field912.length; var1++) {
            class191 var2 = class191.method2129(var1);
            this.field910[var1] = var2.field2791;
        }
        this.field911 = new boolean[this.field922.length];
        for (int var3 = 0; var3 < this.field922.length; var3++) {
            class192 var4 = (class192) class192.field2796.method2598((long) var3);
            class192 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field2798.method3129(15, var3);
                class192 var7 = new class192();
                if (var6 != null) {
                    var7.method3252(new class130(var6));
                }
                class192.field2796.method2607(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field911[var3] = var5.field2797;
        }
        for (int var9 = 0; var9 < this.field912.length; var9++) {
            this.field912[var9] = -1;
        }
        this.method841();
    }

    @ObfuscatedName("an.d(IIB)V")
    public void method835(int arg0, int arg1) {
        this.field912[arg0] = arg1;
        if (this.field910[arg0]) {
            this.field914 = true;
        }
    }

    @ObfuscatedName("an.c(II)I")
    public int method836(int arg0) {
        return this.field912[arg0];
    }

    @ObfuscatedName("an.n(ILjava/lang/String;B)V")
    public void method852(int arg0, String arg1) {
        this.field922[arg0] = arg1;
        if (this.field911[arg0]) {
            this.field914 = true;
        }
    }

    @ObfuscatedName("an.q(II)Ljava/lang/String;")
    public String method863(int arg0) {
        return this.field922[arg0];
    }

    @ObfuscatedName("an.t(I)V")
    public void method838() {
        for (int var1 = 0; var1 < this.field912.length; var1++) {
            if (!this.field910[var1]) {
                this.field912[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            if (!this.field911[var2]) {
                this.field922[var2] = null;
            }
        }
    }

    @ObfuscatedName("an.p(ZI)Lba;")
    public class74 method839(boolean arg0) {
        return class105.method1111("2", Statics.field2779.field2688, arg0);
    }

    @ObfuscatedName("an.u(I)V")
    public void method840() {
        class74 var1 = this.method839(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field912.length; var4++) {
                if (this.field910[var4] && this.field912[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field922.length; var6++) {
                if (this.field911[var6] && this.field922[var6] != null) {
                    var2 += 2 + class130.method740(this.field922[var6]);
                    var5++;
                }
            }
            class130 var7 = new class130(var2);
            var7.method2215(1);
            var7.method2216(var3);
            for (int var8 = 0; var8 < this.field912.length; var8++) {
                if (this.field910[var8] && this.field912[var8] != -1) {
                    var7.method2216(var8);
                    var7.method2218(this.field912[var8]);
                }
            }
            var7.method2216(var5);
            for (int var9 = 0; var9 < this.field922.length; var9++) {
                if (this.field911[var9] && this.field922[var9] != null) {
                    var7.method2216(var9);
                    var7.method2351(this.field922[var9]);
                }
            }
            var1.method1339(var7.field1955, 0, var7.field1956);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1340();
            } catch (Exception var20) {
            }
        }
        this.field914 = false;
        this.field915 = class132.method1336();
    }

    @ObfuscatedName("an.w(I)V")
    public void method841() {
        class74 var1 = this.method839(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method1353()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1342(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class130 var5 = new class130(var2);
                if (var5.field1955.length - var5.field1956 >= 1) {
                    int var7 = var5.method2379();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2232();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2232();
                            int var12 = var5.method2246();
                            if (this.field910[var11]) {
                                this.field912[var11] = var12;
                            }
                        }
                        int var13 = var5.method2232();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2232();
                            String var16 = var5.method2314();
                            if (this.field911[var15]) {
                                this.field922[var15] = var16;
                            }
                            var14++;
                        }
                    }
                    return;
                }
            } catch (Exception var30) {
                break label197;
            } finally {
                try {
                    var1.method1340();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field914 = false;
    }

    @ObfuscatedName("an.r(I)V")
    public void method842() {
        if (this.field914 && this.field915 < class132.method1336() - 60000L) {
            this.method840();
        }
    }

    @ObfuscatedName("an.s(I)Z")
    public boolean method843() {
        return this.field914;
    }
}
