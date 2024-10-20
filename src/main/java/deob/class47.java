package deob;

import java.io.EOFException;

@ObfuscatedName("at")
public class class47 {

    @ObfuscatedName("at.m")
    public boolean[] field915 = new boolean[this.field922.length];

    @ObfuscatedName("at.h")
    public boolean[] field924;

    @ObfuscatedName("at.w")
    public int[] field922 = new int[Statics.field2016.method3103(19)];

    @ObfuscatedName("at.r")
    public String[] field918 = new String[Statics.field2016.method3103(15)];

    @ObfuscatedName("at.c")
    public boolean field917 = false;

    @ObfuscatedName("at.p")
    public long field913;

    public class47() {
        for (int var1 = 0; var1 < this.field922.length; var1++) {
            class189 var2 = class189.method3081(var1);
            this.field915[var1] = var2.field2782;
        }
        this.field924 = new boolean[this.field918.length];
        for (int var3 = 0; var3 < this.field918.length; var3++) {
            class190 var4 = (class190) class190.field2788.method2221((long) var3);
            class190 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field2790.method3093(15, var3);
                class190 var7 = new class190();
                if (var6 != null) {
                    var7.method3261(new class161(var6));
                }
                class190.field2788.method2219(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field924[var3] = var5.field2787;
        }
        for (int var9 = 0; var9 < this.field922.length; var9++) {
            this.field922[var9] = -1;
        }
        this.method841();
    }

    @ObfuscatedName("at.n(III)V")
    public void method819(int arg0, int arg1) {
        this.field922[arg0] = arg1;
        if (this.field915[arg0]) {
            this.field917 = true;
        }
    }

    @ObfuscatedName("at.d(II)I")
    public int method835(int arg0) {
        return this.field922[arg0];
    }

    @ObfuscatedName("at.m(ILjava/lang/String;I)V")
    public void method843(int arg0, String arg1) {
        this.field918[arg0] = arg1;
        if (this.field924[arg0]) {
            this.field917 = true;
        }
    }

    @ObfuscatedName("at.h(IB)Ljava/lang/String;")
    public String method825(int arg0) {
        return this.field918[arg0];
    }

    @ObfuscatedName("at.w(I)V")
    public void method822() {
        for (int var1 = 0; var1 < this.field922.length; var1++) {
            if (!this.field915[var1]) {
                this.field922[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field918.length; var2++) {
            if (!this.field924[var2]) {
                this.field918[var2] = null;
            }
        }
    }

    @ObfuscatedName("at.r(ZB)Lbs;")
    public class74 method823(boolean arg0) {
        return class105.method2171("2", Statics.field759.field2697, arg0);
    }

    @ObfuscatedName("at.c(I)V")
    public void method824() {
        class74 var1 = this.method823(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field922.length; var4++) {
                if (this.field915[var4] && this.field922[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field918.length; var6++) {
                if (this.field924[var6] && this.field918[var6] != null) {
                    var2 += 2 + class161.method1995(this.field918[var6]);
                    var5++;
                }
            }
            class161 var7 = new class161(var2);
            var7.method2765(1);
            var7.method2766(var3);
            for (int var8 = 0; var8 < this.field922.length; var8++) {
                if (this.field915[var8] && this.field922[var8] != -1) {
                    var7.method2766(var8);
                    var7.method2768(this.field922[var8]);
                }
            }
            var7.method2766(var5);
            for (int var9 = 0; var9 < this.field918.length; var9++) {
                if (this.field924[var9] && this.field918[var9] != null) {
                    var7.method2766(var9);
                    var7.method2771(this.field918[var9]);
                }
            }
            var1.method1351(var7.field2291, 0, var7.field2285);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1352();
            } catch (Exception var20) {
            }
        }
        this.field917 = false;
        this.field913 = class163.method3594();
    }

    @ObfuscatedName("at.z(B)V")
    public void method841() {
        class74 var1 = this.method823(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method1349()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1354(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class161 var5 = new class161(var2);
                if (var5.field2291.length - var5.field2285 >= 1) {
                    int var7 = var5.method2823();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2887();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2887();
                        int var12 = var5.method2785();
                        if (this.field915[var11]) {
                            this.field922[var11] = var12;
                        }
                    }
                    int var13 = var5.method2887();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2887();
                        String var16 = var5.method2847();
                        if (this.field924[var15]) {
                            this.field918[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method1352();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field917 = false;
    }

    @ObfuscatedName("at.q(I)V")
    public void method826() {
        if (this.field917 && this.field913 < class163.method3594() - 60000L) {
            this.method824();
        }
    }

    @ObfuscatedName("at.l(I)Z")
    public boolean method850() {
        return this.field917;
    }
}
