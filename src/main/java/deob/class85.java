package deob;

import java.io.EOFException;

@ObfuscatedName("cx")
public class class85 {

    @ObfuscatedName("cx.o")
    public boolean[] field1220 = new boolean[this.field1224.length];

    @ObfuscatedName("cx.k")
    public boolean[] field1225;

    @ObfuscatedName("cx.u")
    public int[] field1224 = new int[Statics.field110.method4331(19)];

    @ObfuscatedName("cx.i")
    public String[] field1223 = new String[Statics.field110.method4331(15)];

    @ObfuscatedName("cx.t")
    public boolean field1221 = false;

    @ObfuscatedName("cx.p")
    public long field1218;

    public class85() {
        for (int var1 = 0; var1 < this.field1224.length; var1++) {
            class259 var2 = (class259) class259.field3286.method3687((long) var1);
            class259 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3288.method4270(19, var1);
                class259 var5 = new class259();
                if (var4 != null) {
                    var5.method4498(new class185(var4));
                }
                class259.field3286.method3689(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1220[var1] = var3.field3285;
        }
        this.field1225 = new boolean[this.field1223.length];
        for (int var7 = 0; var7 < this.field1223.length; var7++) {
            class260 var8 = (class260) class260.field3291.method3687((long) var7);
            class260 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3292.method4270(15, var7);
                class260 var11 = new class260();
                if (var10 != null) {
                    var11.method4506(new class185(var10));
                }
                class260.field3291.method3689(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1225[var7] = var9.field3290;
        }
        for (int var13 = 0; var13 < this.field1224.length; var13++) {
            this.field1224[var13] = -1;
        }
        this.method1819();
    }

    @ObfuscatedName("cx.v(IIB)V")
    public void method1801(int arg0, int arg1) {
        this.field1224[arg0] = arg1;
        if (this.field1220[arg0]) {
            this.field1221 = true;
        }
    }

    @ObfuscatedName("cx.s(II)I")
    public int method1802(int arg0) {
        return this.field1224[arg0];
    }

    @ObfuscatedName("cx.o(ILjava/lang/String;I)V")
    public void method1800(int arg0, String arg1) {
        this.field1223[arg0] = arg1;
        if (this.field1225[arg0]) {
            this.field1221 = true;
        }
    }

    @ObfuscatedName("cx.k(IB)Ljava/lang/String;")
    public String method1831(int arg0) {
        return this.field1223[arg0];
    }

    @ObfuscatedName("cx.u(I)V")
    public void method1805() {
        for (int var1 = 0; var1 < this.field1224.length; var1++) {
            if (!this.field1220[var1]) {
                this.field1224[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1223.length; var2++) {
            if (!this.field1225[var2]) {
                this.field1223[var2] = null;
            }
        }
    }

    @ObfuscatedName("cx.i(ZI)Ldv;")
    public class113 method1806(boolean arg0) {
        return class158.method372("2", Statics.field3584.field3175, arg0);
    }

    @ObfuscatedName("cx.t(S)V")
    public void method1803() {
        class113 var1 = this.method1806(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1224.length; var4++) {
                if (this.field1220[var4] && this.field1224[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1223.length; var6++) {
                if (this.field1225[var6] && this.field1223[var6] != null) {
                    var2 += 2 + class185.method3230(this.field1223[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3258(1);
            var7.method3259(var3);
            for (int var8 = 0; var8 < this.field1224.length; var8++) {
                if (this.field1220[var8] && this.field1224[var8] != -1) {
                    var7.method3259(var8);
                    var7.method3261(this.field1224[var8]);
                }
            }
            var7.method3259(var5);
            for (int var9 = 0; var9 < this.field1223.length; var9++) {
                if (this.field1225[var9] && this.field1223[var9] != null) {
                    var7.method3259(var9);
                    var7.method3265(this.field1223[var9]);
                }
            }
            var1.method2333(var7.field2387, 0, var7.field2386);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2326();
            } catch (Exception var20) {
            }
        }
        this.field1221 = false;
        this.field1218 = class187.method3154();
    }

    @ObfuscatedName("cx.c(B)V")
    public void method1819() {
        class113 var1 = this.method1806(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2324()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2329(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2387.length - var5.field2386 < 1) {
                    return;
                }
                int var7 = var5.method3274();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3276();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3276();
                        int var12 = var5.method3279();
                        if (this.field1220[var11]) {
                            this.field1224[var11] = var12;
                        }
                    }
                    int var13 = var5.method3276();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3276();
                        String var16 = var5.method3490();
                        if (this.field1225[var15]) {
                            this.field1223[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2326();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1221 = false;
    }

    @ObfuscatedName("cx.w(I)V")
    public void method1813() {
        if (this.field1221 && this.field1218 < class187.method3154() - 60000L) {
            this.method1803();
        }
    }

    @ObfuscatedName("cx.a(B)Z")
    public boolean method1810() {
        return this.field1221;
    }
}
