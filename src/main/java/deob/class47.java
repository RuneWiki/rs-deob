package deob;

import java.io.EOFException;

@ObfuscatedName("ai")
public class class47 {

    @ObfuscatedName("ai.b")
    public boolean[] field921 = new boolean[this.field923.length];

    @ObfuscatedName("ai.g")
    public boolean[] field934;

    @ObfuscatedName("ai.h")
    public int[] field923 = new int[Statics.field2179.method3054(19)];

    @ObfuscatedName("ai.v")
    public String[] field924 = new String[Statics.field2179.method3054(15)];

    @ObfuscatedName("ai.l")
    public boolean field925 = false;

    @ObfuscatedName("ai.c")
    public long field922;

    public class47() {
        for (int var1 = 0; var1 < this.field923.length; var1++) {
            class189 var2 = (class189) class189.field2787.method2130((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2788.method3012(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3159(new class154(var4));
                }
                class189.field2787.method2132(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field921[var1] = var3.field2786;
        }
        this.field934 = new boolean[this.field924.length];
        for (int var7 = 0; var7 < this.field924.length; var7++) {
            class190 var8 = class190.method703(var7);
            this.field934[var7] = var8.field2789;
        }
        for (int var9 = 0; var9 < this.field923.length; var9++) {
            this.field923[var9] = -1;
        }
        this.method807();
    }

    @ObfuscatedName("ai.o(III)V")
    public void method822(int arg0, int arg1) {
        this.field923[arg0] = arg1;
        if (this.field921[arg0]) {
            this.field925 = true;
        }
    }

    @ObfuscatedName("ai.m(II)I")
    public int method808(int arg0) {
        return this.field923[arg0];
    }

    @ObfuscatedName("ai.b(ILjava/lang/String;B)V")
    public void method820(int arg0, String arg1) {
        this.field924[arg0] = arg1;
        if (this.field934[arg0]) {
            this.field925 = true;
        }
    }

    @ObfuscatedName("ai.g(IB)Ljava/lang/String;")
    public String method810(int arg0) {
        return this.field924[arg0];
    }

    @ObfuscatedName("ai.l(B)V")
    public void method811() {
        for (int var1 = 0; var1 < this.field923.length; var1++) {
            if (!this.field921[var1]) {
                this.field923[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field924.length; var2++) {
            if (!this.field934[var2]) {
                this.field924[var2] = null;
            }
        }
    }

    @ObfuscatedName("ai.c(ZI)Lbn;")
    public class74 method806(boolean arg0) {
        return class105.method672("2", Statics.field2025.field2701, arg0);
    }

    @ObfuscatedName("ai.u(I)V")
    public void method812() {
        class74 var1 = this.method806(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field923.length; var4++) {
                if (this.field921[var4] && this.field923[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field924.length; var6++) {
                if (this.field934[var6] && this.field924[var6] != null) {
                    var2 += 2 + class154.method1925(this.field924[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2641(1);
            var7.method2538(var3);
            for (int var8 = 0; var8 < this.field923.length; var8++) {
                if (this.field921[var8] && this.field923[var8] != -1) {
                    var7.method2538(var8);
                    var7.method2540(this.field923[var8]);
                }
            }
            var7.method2538(var5);
            for (int var9 = 0; var9 < this.field924.length; var9++) {
                if (this.field934[var9] && this.field924[var9] != null) {
                    var7.method2538(var9);
                    var7.method2543(this.field924[var9]);
                }
            }
            var1.method1311(var7.field2108, 0, var7.field2105);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1324();
            } catch (Exception var20) {
            }
        }
        this.field925 = false;
        this.field922 = class156.method2009();
    }

    @ObfuscatedName("ai.k(I)V")
    public void method807() {
        class74 var1 = this.method806(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method1313()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1315(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2108.length - var5.field2105 < 1) {
                    return;
                }
                int var7 = var5.method2552();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2554();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2554();
                        int var12 = var5.method2557();
                        if (this.field921[var11]) {
                            this.field923[var11] = var12;
                        }
                    }
                    int var13 = var5.method2554();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2554();
                        String var16 = var5.method2606();
                        if (this.field934[var15]) {
                            this.field924[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method1324();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field925 = false;
    }

    @ObfuscatedName("ai.z(I)V")
    public void method809() {
        if (this.field925 && this.field922 < class156.method2009() - 60000L) {
            this.method812();
        }
    }

    @ObfuscatedName("ai.y(I)Z")
    public boolean method813() {
        return this.field925;
    }
}
