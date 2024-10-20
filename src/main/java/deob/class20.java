package deob;

import java.io.EOFException;

@ObfuscatedName("a")
public class class20 {

    @ObfuscatedName("a.j")
    public boolean[] field273 = new boolean[this.field277.length];

    @ObfuscatedName("a.d")
    public boolean[] field283;

    @ObfuscatedName("a.x")
    public int[] field277 = new int[Statics.field2186.method3047(19)];

    @ObfuscatedName("a.y")
    public String[] field278 = new String[Statics.field2186.method3047(15)];

    @ObfuscatedName("a.r")
    public boolean field279 = false;

    @ObfuscatedName("a.c")
    public long field280;

    public class20() {
        for (int var1 = 0; var1 < this.field277.length; var1++) {
            class46 var2 = (class46) class46.field1026.method3495((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field585.method3037(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method930(new class120(var4));
                }
                class46.field1026.method3490(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field273[var1] = var3.field1025;
        }
        this.field283 = new boolean[this.field278.length];
        for (int var7 = 0; var7 < this.field278.length; var7++) {
            class50 var8 = (class50) class50.field1062.method3495((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1067.method3037(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method978(new class120(var10));
                }
                class50.field1062.method3490(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field283[var7] = var9.field1063;
        }
        for (int var13 = 0; var13 < this.field277.length; var13++) {
            this.field277[var13] = -1;
        }
        this.method209();
    }

    @ObfuscatedName("a.b(III)V")
    public void method216(int arg0, int arg1) {
        this.field277[arg0] = arg1;
        if (this.field273[arg0]) {
            this.field279 = true;
        }
    }

    @ObfuscatedName("a.g(IS)I")
    public int method192(int arg0) {
        return this.field277[arg0];
    }

    @ObfuscatedName("a.j(ILjava/lang/String;I)V")
    public void method189(int arg0, String arg1) {
        this.field278[arg0] = arg1;
        if (this.field283[arg0]) {
            this.field279 = true;
        }
    }

    @ObfuscatedName("a.d(II)Ljava/lang/String;")
    public String method190(int arg0) {
        return this.field278[arg0];
    }

    @ObfuscatedName("a.x(I)V")
    public void method197() {
        for (int var1 = 0; var1 < this.field277.length; var1++) {
            if (!this.field273[var1]) {
                this.field277[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field278.length; var2++) {
            if (!this.field283[var2]) {
                this.field278[var2] = null;
            }
        }
    }

    @ObfuscatedName("a.y(ZI)Lhy;")
    public class228 method188(boolean arg0) {
        return class150.method2798("2", Statics.field571.field2275, arg0);
    }

    @ObfuscatedName("a.r(B)V")
    public void method193() {
        class228 var1 = this.method188(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field277.length; var4++) {
                if (this.field273[var4] && this.field277[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field278.length; var6++) {
                if (this.field283[var6] && this.field278[var6] != null) {
                    var2 += 2 + class120.method42(this.field278[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2480(1);
            var7.method2525(var3);
            for (int var8 = 0; var8 < this.field277.length; var8++) {
                if (this.field273[var8] && this.field277[var8] != -1) {
                    var7.method2525(var8);
                    var7.method2332(this.field277[var8]);
                }
            }
            var7.method2525(var5);
            for (int var9 = 0; var9 < this.field278.length; var9++) {
                if (this.field283[var9] && this.field278[var9] != null) {
                    var7.method2525(var9);
                    var7.method2335(this.field278[var9]);
                }
            }
            var1.method3851(var7.field1983, 0, var7.field1977);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3840();
            } catch (Exception var20) {
            }
        }
        this.field279 = false;
        this.field280 = class116.method1946();
    }

    @ObfuscatedName("a.c(B)V")
    public void method209() {
        class228 var1 = this.method188(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3837()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3842(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field1983.length - var5.field1977 >= 1) {
                    int var7 = var5.method2344();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2346();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2346();
                            int var12 = var5.method2349();
                            if (this.field273[var11]) {
                                this.field277[var11] = var12;
                            }
                        }
                        int var13 = var5.method2346();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2346();
                            String var16 = var5.method2352();
                            if (this.field283[var15]) {
                                this.field278[var15] = var16;
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
                    var1.method3840();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field279 = false;
    }

    @ObfuscatedName("a.l(B)V")
    public void method195() {
        if (this.field279 && this.field280 < class116.method1946() - 60000L) {
            this.method193();
        }
    }

    @ObfuscatedName("a.u(I)Z")
    public boolean method196() {
        return this.field279;
    }
}
