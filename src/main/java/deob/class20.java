package deob;

import java.io.EOFException;

@ObfuscatedName("v")
public class class20 {

    @ObfuscatedName("v.f")
    public boolean[] field272 = new boolean[this.field262.length];

    @ObfuscatedName("v.l")
    public boolean[] field264;

    @ObfuscatedName("v.u")
    public int[] field262 = new int[Statics.field1088.method3094(19)];

    @ObfuscatedName("v.a")
    public String[] field265 = new String[Statics.field1088.method3094(15)];

    @ObfuscatedName("v.h")
    public boolean field270 = false;

    @ObfuscatedName("v.i")
    public long field267;

    public class20() {
        for (int var1 = 0; var1 < this.field262.length; var1++) {
            class46 var2 = class46.method2167(var1);
            this.field272[var1] = var2.field1026;
        }
        this.field264 = new boolean[this.field265.length];
        for (int var3 = 0; var3 < this.field265.length; var3++) {
            class50 var4 = (class50) class50.field1074.method3543((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1077.method3124(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method1005(new class119(var6));
                }
                class50.field1074.method3540(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field264[var3] = var5.field1073;
        }
        for (int var9 = 0; var9 < this.field262.length; var9++) {
            this.field262[var9] = -1;
        }
        this.method221();
    }

    @ObfuscatedName("v.j(III)V")
    public void method215(int arg0, int arg1) {
        this.field262[arg0] = arg1;
        if (this.field272[arg0]) {
            this.field270 = true;
        }
    }

    @ObfuscatedName("v.m(II)I")
    public int method223(int arg0) {
        return this.field262[arg0];
    }

    @ObfuscatedName("v.f(ILjava/lang/String;B)V")
    public void method238(int arg0, String arg1) {
        this.field265[arg0] = arg1;
        if (this.field264[arg0]) {
            this.field270 = true;
        }
    }

    @ObfuscatedName("v.l(II)Ljava/lang/String;")
    public String method219(int arg0) {
        return this.field265[arg0];
    }

    @ObfuscatedName("v.u(I)V")
    public void method244() {
        for (int var1 = 0; var1 < this.field262.length; var1++) {
            if (!this.field272[var1]) {
                this.field262[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field265.length; var2++) {
            if (!this.field264[var2]) {
                this.field265[var2] = null;
            }
        }
    }

    @ObfuscatedName("v.a(ZI)Lhm;")
    public class227 method253(boolean arg0) {
        return class149.method1554("2", Statics.field2688.field2276, arg0);
    }

    @ObfuscatedName("v.h(I)V")
    public void method218() {
        class227 var1 = this.method253(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field262.length; var4++) {
                if (this.field272[var4] && this.field262[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field265.length; var6++) {
                if (this.field264[var6] && this.field265[var6] != null) {
                    var2 += 2 + class119.method2163(this.field265[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2357(1);
            var7.method2358(var3);
            for (int var8 = 0; var8 < this.field262.length; var8++) {
                if (this.field272[var8] && this.field262[var8] != -1) {
                    var7.method2358(var8);
                    var7.method2360(this.field262[var8]);
                }
            }
            var7.method2358(var5);
            for (int var9 = 0; var9 < this.field265.length; var9++) {
                if (this.field264[var9] && this.field265[var9] != null) {
                    var7.method2358(var9);
                    var7.method2363(this.field265[var9]);
                }
            }
            var1.method3912(var7.field1981, 0, var7.field1982);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3910();
            } catch (Exception var20) {
            }
        }
        this.field270 = false;
        this.field267 = class115.method2038();
    }

    @ObfuscatedName("v.i(B)V")
    public void method221() {
        class227 var1 = this.method253(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method3903()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3904(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1981.length - var5.field1982 < 1) {
                    return;
                }
                int var7 = var5.method2372();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2374();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2374();
                        int var12 = var5.method2377();
                        if (this.field272[var11]) {
                            this.field262[var11] = var12;
                        }
                    }
                    int var13 = var5.method2374();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2374();
                        String var16 = var5.method2380();
                        if (this.field264[var15]) {
                            this.field265[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method3910();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field270 = false;
    }

    @ObfuscatedName("v.t(I)V")
    public void method224() {
        if (this.field270 && this.field267 < class115.method2038() - 60000L) {
            this.method218();
        }
    }

    @ObfuscatedName("v.k(I)Z")
    public boolean method216() {
        return this.field270;
    }
}
