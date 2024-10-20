package deob;

import java.io.EOFException;

@ObfuscatedName("ao")
public class class47 {

    @ObfuscatedName("ao.f")
    public boolean[] field933 = new boolean[this.field929.length];

    @ObfuscatedName("ao.k")
    public boolean[] field928;

    @ObfuscatedName("ao.g")
    public int[] field929 = new int[Statics.field153.method3023(19)];

    @ObfuscatedName("ao.n")
    public String[] field930 = new String[Statics.field153.method3023(15)];

    @ObfuscatedName("ao.a")
    public boolean field932 = false;

    @ObfuscatedName("ao.q")
    public long field936;

    public class47() {
        for (int var1 = 0; var1 < this.field929.length; var1++) {
            class189 var2 = (class189) class189.field2783.method2150((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2782.method3014(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3178(new class154(var4));
                }
                class189.field2783.method2152(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field933[var1] = var3.field2785;
        }
        this.field928 = new boolean[this.field930.length];
        for (int var7 = 0; var7 < this.field930.length; var7++) {
            class190 var8 = (class190) class190.field2787.method2150((long) var7);
            class190 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field2788.method3014(15, var7);
                class190 var11 = new class190();
                if (var10 != null) {
                    var11.method3187(new class154(var10));
                }
                class190.field2787.method2152(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field928[var7] = var9.field2789;
        }
        for (int var13 = 0; var13 < this.field929.length; var13++) {
            this.field929[var13] = -1;
        }
        this.method795();
    }

    @ObfuscatedName("ao.i(IIB)V")
    public void method796(int arg0, int arg1) {
        this.field929[arg0] = arg1;
        if (this.field933[arg0]) {
            this.field932 = true;
        }
    }

    @ObfuscatedName("ao.e(II)I")
    public int method790(int arg0) {
        return this.field929[arg0];
    }

    @ObfuscatedName("ao.f(ILjava/lang/String;I)V")
    public void method817(int arg0, String arg1) {
        this.field930[arg0] = arg1;
        if (this.field928[arg0]) {
            this.field932 = true;
        }
    }

    @ObfuscatedName("ao.k(II)Ljava/lang/String;")
    public String method791(int arg0) {
        return this.field930[arg0];
    }

    @ObfuscatedName("ao.a(I)V")
    public void method807() {
        for (int var1 = 0; var1 < this.field929.length; var1++) {
            if (!this.field933[var1]) {
                this.field929[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            if (!this.field928[var2]) {
                this.field930[var2] = null;
            }
        }
    }

    @ObfuscatedName("ao.q(ZI)Lbz;")
    public class74 method793(boolean arg0) {
        return class105.method677("2", Statics.field227.field2688, arg0);
    }

    @ObfuscatedName("ao.w(I)V")
    public void method794() {
        class74 var1 = this.method793(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field929.length; var4++) {
                if (this.field933[var4] && this.field929[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field930.length; var6++) {
                if (this.field928[var6] && this.field930[var6] != null) {
                    var2 += 2 + Statics.method1050(this.field930[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2746(1);
            var7.method2560(var3);
            for (int var8 = 0; var8 < this.field929.length; var8++) {
                if (this.field933[var8] && this.field929[var8] != -1) {
                    var7.method2560(var8);
                    var7.method2562(this.field929[var8]);
                }
            }
            var7.method2560(var5);
            for (int var9 = 0; var9 < this.field930.length; var9++) {
                if (this.field928[var9] && this.field930[var9] != null) {
                    var7.method2560(var9);
                    var7.method2571(this.field930[var9]);
                }
            }
            var1.method1310(var7.field2094, 0, var7.field2091);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1311();
            } catch (Exception var20) {
            }
        }
        this.field932 = false;
        this.field936 = class156.method1307();
    }

    @ObfuscatedName("ao.v(I)V")
    public void method795() {
        class74 var1 = this.method793(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method1312()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1314(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2094.length - var5.field2091 < 1) {
                    return;
                }
                int var7 = var5.method2573();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2575();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2575();
                        int var12 = var5.method2658();
                        if (this.field933[var11]) {
                            this.field929[var11] = var12;
                        }
                    }
                    int var13 = var5.method2575();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2575();
                        String var16 = var5.method2581();
                        if (this.field928[var15]) {
                            this.field930[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method1311();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field932 = false;
    }

    @ObfuscatedName("ao.h(B)V")
    public void method810() {
        if (this.field932 && this.field936 < class156.method1307() - 60000L) {
            this.method794();
        }
    }

    @ObfuscatedName("ao.p(I)Z")
    public boolean method797() {
        return this.field932;
    }
}
