package deob;

import java.io.EOFException;

@ObfuscatedName("y")
public class class20 {

    @ObfuscatedName("y.o")
    public boolean[] field269 = new boolean[this.field277.length];

    @ObfuscatedName("y.z")
    public boolean[] field270;

    @ObfuscatedName("y.c")
    public int[] field277 = new int[Statics.field2586.method3059(19)];

    @ObfuscatedName("y.d")
    public String[] field272 = new String[Statics.field2586.method3059(15)];

    @ObfuscatedName("y.l")
    public boolean field273 = false;

    @ObfuscatedName("y.b")
    public long field274;

    public class20() {
        for (int var1 = 0; var1 < this.field277.length; var1++) {
            class46 var2 = class46.method607(var1);
            this.field269[var1] = var2.field1023;
        }
        this.field270 = new boolean[this.field272.length];
        for (int var3 = 0; var3 < this.field272.length; var3++) {
            class50 var4 = (class50) class50.field1072.method3510((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1076.method3118(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method953(new class119(var6));
                }
                class50.field1072.method3512(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field270[var3] = var5.field1073;
        }
        for (int var9 = 0; var9 < this.field277.length; var9++) {
            this.field277[var9] = -1;
        }
        this.method200();
    }

    @ObfuscatedName("y.k(IIS)V")
    public void method193(int arg0, int arg1) {
        this.field277[arg0] = arg1;
        if (this.field269[arg0]) {
            this.field273 = true;
        }
    }

    @ObfuscatedName("y.h(II)I")
    public int method226(int arg0) {
        return this.field277[arg0];
    }

    @ObfuscatedName("y.o(ILjava/lang/String;I)V")
    public void method195(int arg0, String arg1) {
        this.field272[arg0] = arg1;
        if (this.field270[arg0]) {
            this.field273 = true;
        }
    }

    @ObfuscatedName("y.z(II)Ljava/lang/String;")
    public String method196(int arg0) {
        return this.field272[arg0];
    }

    @ObfuscatedName("y.c(B)V")
    public void method197() {
        for (int var1 = 0; var1 < this.field277.length; var1++) {
            if (!this.field269[var1]) {
                this.field277[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field272.length; var2++) {
            if (!this.field270[var2]) {
                this.field272[var2] = null;
            }
        }
    }

    @ObfuscatedName("y.d(ZI)Lhk;")
    public class227 method198(boolean arg0) {
        return class149.method694("2", Statics.field471.field2263, arg0);
    }

    @ObfuscatedName("y.l(I)V")
    public void method225() {
        class227 var1 = this.method198(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field277.length; var4++) {
                if (this.field269[var4] && this.field277[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field272.length; var6++) {
                if (this.field270[var6] && this.field272[var6] != null) {
                    var2 += 2 + class119.method1950(this.field272[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2315(1);
            var7.method2316(var3);
            for (int var8 = 0; var8 < this.field277.length; var8++) {
                if (this.field269[var8] && this.field277[var8] != -1) {
                    var7.method2316(var8);
                    var7.method2318(this.field277[var8]);
                }
            }
            var7.method2316(var5);
            for (int var9 = 0; var9 < this.field272.length; var9++) {
                if (this.field270[var9] && this.field272[var9] != null) {
                    var7.method2316(var9);
                    var7.method2321(this.field272[var9]);
                }
            }
            var1.method3864(var7.field1960, 0, var7.field1949);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3865();
            } catch (Exception var20) {
            }
        }
        this.field273 = false;
        this.field274 = class115.method124();
    }

    @ObfuscatedName("y.b(I)V")
    public void method200() {
        class227 var1 = this.method198(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3872()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3868(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1960.length - var5.field1949 >= 1) {
                    int var7 = var5.method2330();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2332();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2332();
                            int var12 = var5.method2415();
                            if (this.field269[var11]) {
                                this.field277[var11] = var12;
                            }
                        }
                        int var13 = var5.method2332();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2332();
                            String var16 = var5.method2337();
                            if (this.field270[var15]) {
                                this.field272[var15] = var16;
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
                    var1.method3865();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field273 = false;
    }

    @ObfuscatedName("y.j(B)V")
    public void method201() {
        if (this.field273 && this.field274 < class115.method124() - 60000L) {
            this.method225();
        }
    }

    @ObfuscatedName("y.f(I)Z")
    public boolean method209() {
        return this.field273;
    }
}
