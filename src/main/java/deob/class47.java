package deob;

import java.io.EOFException;

@ObfuscatedName("ab")
public class class47 {

    @ObfuscatedName("ab.o")
    public boolean[] field919 = new boolean[this.field920.length];

    @ObfuscatedName("ab.r")
    public boolean[] field918;

    @ObfuscatedName("ab.w")
    public int[] field920 = new int[Statics.field354.method3075(19)];

    @ObfuscatedName("ab.j")
    public String[] field921 = new String[Statics.field354.method3075(15)];

    @ObfuscatedName("ab.q")
    public boolean field922 = false;

    @ObfuscatedName("ab.d")
    public long field923;

    public class47() {
        for (int var1 = 0; var1 < this.field920.length; var1++) {
            class189 var2 = class189.method2510(var1);
            this.field919[var1] = var2.field2763;
        }
        this.field918 = new boolean[this.field921.length];
        for (int var3 = 0; var3 < this.field921.length; var3++) {
            class190 var4 = class190.method45(var3);
            this.field918[var3] = var4.field2769;
        }
        for (int var5 = 0; var5 < this.field920.length; var5++) {
            this.field920[var5] = -1;
        }
        this.method822();
    }

    @ObfuscatedName("ab.k(IIB)V")
    public void method820(int arg0, int arg1) {
        this.field920[arg0] = arg1;
        if (this.field919[arg0]) {
            this.field922 = true;
        }
    }

    @ObfuscatedName("ab.y(II)I")
    public int method819(int arg0) {
        return this.field920[arg0];
    }

    @ObfuscatedName("ab.o(ILjava/lang/String;B)V")
    public void method845(int arg0, String arg1) {
        this.field921[arg0] = arg1;
        if (this.field918[arg0]) {
            this.field922 = true;
        }
    }

    @ObfuscatedName("ab.r(II)Ljava/lang/String;")
    public String method828(int arg0) {
        return this.field921[arg0];
    }

    @ObfuscatedName("ab.w(B)V")
    public void method841() {
        for (int var1 = 0; var1 < this.field920.length; var1++) {
            if (!this.field919[var1]) {
                this.field920[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field921.length; var2++) {
            if (!this.field918[var2]) {
                this.field921[var2] = null;
            }
        }
    }

    @ObfuscatedName("ab.j(ZB)Lbu;")
    public class74 method825(boolean arg0) {
        return class105.method611("2", Statics.field230.field2676, arg0);
    }

    @ObfuscatedName("ab.c(I)V")
    public void method826() {
        class74 var1 = this.method825(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field920.length; var4++) {
                if (this.field919[var4] && this.field920[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field921.length; var6++) {
                if (this.field918[var6] && this.field921[var6] != null) {
                    var2 += 2 + class161.method1885(this.field921[var6]);
                    var5++;
                }
            }
            class161 var7 = new class161(var2);
            var7.method2718(1);
            var7.method2900(var3);
            for (int var8 = 0; var8 < this.field920.length; var8++) {
                if (this.field919[var8] && this.field920[var8] != -1) {
                    var7.method2900(var8);
                    var7.method2863(this.field920[var8]);
                }
            }
            var7.method2900(var5);
            for (int var9 = 0; var9 < this.field921.length; var9++) {
                if (this.field918[var9] && this.field921[var9] != null) {
                    var7.method2900(var9);
                    var7.method2903(this.field921[var9]);
                }
            }
            var1.method1332(var7.field2258, 0, var7.field2267);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1333();
            } catch (Exception var20) {
            }
        }
        this.field922 = false;
        this.field923 = class163.method225();
    }

    @ObfuscatedName("ab.g(B)V")
    public void method822() {
        class74 var1 = this.method825(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method1334()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1335(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class161 var5 = new class161(var2);
                if (var5.field2258.length - var5.field2267 < 1) {
                    return;
                }
                int var7 = var5.method2733();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2735();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2735();
                        int var12 = var5.method2868();
                        if (this.field919[var11]) {
                            this.field920[var11] = var12;
                        }
                    }
                    int var13 = var5.method2735();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2735();
                        String var16 = var5.method2740();
                        if (this.field918[var15]) {
                            this.field921[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method1333();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field922 = false;
    }

    @ObfuscatedName("ab.i(B)V")
    public void method824() {
        if (this.field922 && this.field923 < class163.method225() - 60000L) {
            this.method826();
        }
    }

    @ObfuscatedName("ab.v(I)Z")
    public boolean method829() {
        return this.field922;
    }
}
