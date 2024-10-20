package deob;

import java.io.EOFException;

@ObfuscatedName("z")
public class class20 {

    @ObfuscatedName("z.i")
    public boolean[] field277 = new boolean[this.field272.length];

    @ObfuscatedName("z.q")
    public boolean[] field270;

    @ObfuscatedName("z.p")
    public int[] field272 = new int[Statics.field309.method3017(19)];

    @ObfuscatedName("z.c")
    public String[] field274 = new String[Statics.field309.method3017(15)];

    @ObfuscatedName("z.f")
    public boolean field275 = false;

    @ObfuscatedName("z.y")
    public long field276;

    public class20() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            class46 var2 = (class46) class46.field1046.method3472((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1052.method3051(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method903(new class119(var4));
                }
                class46.field1046.method3474(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field277[var1] = var3.field1045;
        }
        this.field270 = new boolean[this.field274.length];
        for (int var7 = 0; var7 < this.field274.length; var7++) {
            class50 var8 = (class50) class50.field1103.method3472((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1102.method3051(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method953(new class119(var10));
                }
                class50.field1103.method3474(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field270[var7] = var9.field1100;
        }
        for (int var13 = 0; var13 < this.field272.length; var13++) {
            this.field272[var13] = -1;
        }
        this.method197();
    }

    @ObfuscatedName("z.h(IIS)V")
    public void method190(int arg0, int arg1) {
        this.field272[arg0] = arg1;
        if (this.field277[arg0]) {
            this.field275 = true;
        }
    }

    @ObfuscatedName("z.m(II)I")
    public int method191(int arg0) {
        return this.field272[arg0];
    }

    @ObfuscatedName("z.i(ILjava/lang/String;I)V")
    public void method193(int arg0, String arg1) {
        this.field274[arg0] = arg1;
        if (this.field270[arg0]) {
            this.field275 = true;
        }
    }

    @ObfuscatedName("z.q(II)Ljava/lang/String;")
    public String method203(int arg0) {
        return this.field274[arg0];
    }

    @ObfuscatedName("z.p(B)V")
    public void method194() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            if (!this.field277[var1]) {
                this.field272[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field274.length; var2++) {
            if (!this.field270[var2]) {
                this.field274[var2] = null;
            }
        }
    }

    @ObfuscatedName("z.c(ZI)Lhb;")
    public class227 method216(boolean arg0) {
        return class149.method1169("2", Statics.field628.field2272, arg0);
    }

    @ObfuscatedName("z.f(B)V")
    public void method196() {
        class227 var1 = this.method216(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field272.length; var4++) {
                if (this.field277[var4] && this.field272[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field274.length; var6++) {
                if (this.field270[var6] && this.field274[var6] != null) {
                    var2 += 2 + class119.method537(this.field274[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2305(1);
            var7.method2501(var3);
            for (int var8 = 0; var8 < this.field272.length; var8++) {
                if (this.field277[var8] && this.field272[var8] != -1) {
                    var7.method2501(var8);
                    var7.method2308(this.field272[var8]);
                }
            }
            var7.method2501(var5);
            for (int var9 = 0; var9 < this.field274.length; var9++) {
                if (this.field270[var9] && this.field274[var9] != null) {
                    var7.method2501(var9);
                    var7.method2311(this.field274[var9]);
                }
            }
            var1.method3817(var7.field1989, 0, var7.field1988);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3822();
            } catch (Exception var20) {
            }
        }
        this.field275 = false;
        this.field276 = class115.method2007();
    }

    @ObfuscatedName("z.y(I)V")
    public void method197() {
        class227 var1 = this.method216(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3819()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3820(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1989.length - var5.field1988 >= 1) {
                    int var7 = var5.method2320();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2322();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2322();
                            int var12 = var5.method2324();
                            if (this.field277[var11]) {
                                this.field272[var11] = var12;
                            }
                        }
                        int var13 = var5.method2322();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2322();
                            String var16 = var5.method2350();
                            if (this.field270[var15]) {
                                this.field274[var15] = var16;
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
                    var1.method3822();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field275 = false;
    }

    @ObfuscatedName("z.w(I)V")
    public void method220() {
        if (this.field275 && this.field276 < class115.method2007() - 60000L) {
            this.method196();
        }
    }

    @ObfuscatedName("z.l(I)Z")
    public boolean method199() {
        return this.field275;
    }
}
