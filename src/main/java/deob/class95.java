package deob;

import java.io.EOFException;

@ObfuscatedName("cf")
public class class95 {

    @ObfuscatedName("cf.o")
    public boolean[] field1429 = new boolean[this.field1428.length];

    @ObfuscatedName("cf.j")
    public boolean[] field1427;

    @ObfuscatedName("cf.k")
    public int[] field1428 = new int[Statics.field503.method4202(19)];

    @ObfuscatedName("cf.x")
    public String[] field1431 = new String[Statics.field503.method4202(15)];

    @ObfuscatedName("cf.z")
    public boolean field1430 = false;

    @ObfuscatedName("cf.p")
    public long field1426;

    public class95() {
        for (int var1 = 0; var1 < this.field1428.length; var1++) {
            class271 var2 = class271.method71(var1);
            this.field1429[var1] = var2.field3476;
        }
        this.field1427 = new boolean[this.field1431.length];
        for (int var3 = 0; var3 < this.field1431.length; var3++) {
            class272 var4 = (class272) class272.field3479.method3625((long) var3);
            class272 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3484.method4190(15, var3);
                class272 var7 = new class272();
                if (var6 != null) {
                    var7.method4409(new class195(var6));
                }
                class272.field3479.method3628(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1427[var3] = var5.field3483;
        }
        for (int var9 = 0; var9 < this.field1428.length; var9++) {
            this.field1428[var9] = -1;
        }
        this.method1836();
    }

    @ObfuscatedName("cf.c(IIB)V")
    public void method1804(int arg0, int arg1) {
        this.field1428[arg0] = arg1;
        if (this.field1429[arg0]) {
            this.field1430 = true;
        }
    }

    @ObfuscatedName("cf.i(II)I")
    public int method1805(int arg0) {
        return this.field1428[arg0];
    }

    @ObfuscatedName("cf.o(ILjava/lang/String;I)V")
    public void method1806(int arg0, String arg1) {
        this.field1431[arg0] = arg1;
        if (this.field1427[arg0]) {
            this.field1430 = true;
        }
    }

    @ObfuscatedName("cf.j(II)Ljava/lang/String;")
    public String method1807(int arg0) {
        return this.field1431[arg0];
    }

    @ObfuscatedName("cf.k(I)V")
    public void method1818() {
        for (int var1 = 0; var1 < this.field1428.length; var1++) {
            if (!this.field1429[var1]) {
                this.field1428[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1431.length; var2++) {
            if (!this.field1427[var2]) {
                this.field1431[var2] = null;
            }
        }
    }

    @ObfuscatedName("cf.x(ZI)Ldp;")
    public class123 method1809(boolean arg0) {
        return class168.method2855("2", Statics.field817.field3354, arg0);
    }

    @ObfuscatedName("cf.z(B)V")
    public void method1810() {
        class123 var1 = this.method1809(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1428.length; var4++) {
                if (this.field1429[var4] && this.field1428[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1431.length; var6++) {
                if (this.field1427[var6] && this.field1431[var6] != null) {
                    var2 += 2 + class195.method1769(this.field1431[var6]);
                    var5++;
                }
            }
            class195 var7 = new class195(var2);
            var7.method3209(1);
            var7.method3210(var3);
            for (int var8 = 0; var8 < this.field1428.length; var8++) {
                if (this.field1429[var8] && this.field1428[var8] != -1) {
                    var7.method3210(var8);
                    var7.method3212(this.field1428[var8]);
                }
            }
            var7.method3210(var5);
            for (int var9 = 0; var9 < this.field1431.length; var9++) {
                if (this.field1427[var9] && this.field1431[var9] != null) {
                    var7.method3210(var9);
                    var7.method3216(this.field1431[var9]);
                }
            }
            var1.method2322(var7.field2567, 0, var7.field2566);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2323();
            } catch (Exception var20) {
            }
        }
        this.field1430 = false;
        this.field1426 = class197.method26();
    }

    @ObfuscatedName("cf.p(I)V")
    public void method1836() {
        class123 var1 = this.method1809(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2325()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2326(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class195 var5 = new class195(var2);
                if (var5.field2567.length - var5.field2566 < 1) {
                    return;
                }
                int var7 = var5.method3429();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3218();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3218();
                        int var12 = var5.method3230();
                        if (this.field1429[var11]) {
                            this.field1428[var11] = var12;
                        }
                    }
                    int var13 = var5.method3218();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method3218();
                        String var16 = var5.method3427();
                        if (this.field1427[var15]) {
                            this.field1431[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2323();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1430 = false;
    }

    @ObfuscatedName("cf.w(I)V")
    public void method1812() {
        if (this.field1430 && this.field1426 < class197.method26() - 60000L) {
            this.method1810();
        }
    }

    @ObfuscatedName("cf.r(I)Z")
    public boolean method1808() {
        return this.field1430;
    }
}
