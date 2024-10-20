package deob;

import java.io.EOFException;

@ObfuscatedName("f")
public class class20 {

    @ObfuscatedName("f.y")
    public boolean[] field244 = new boolean[this.field246.length];

    @ObfuscatedName("f.u")
    public boolean[] field245;

    @ObfuscatedName("f.k")
    public int[] field246 = new int[Statics.field1551.method3090(19)];

    @ObfuscatedName("f.j")
    public String[] field247 = new String[Statics.field1551.method3090(15)];

    @ObfuscatedName("f.i")
    public boolean field248 = false;

    @ObfuscatedName("f.x")
    public long field255;

    public class20() {
        for (int var1 = 0; var1 < this.field246.length; var1++) {
            class46 var2 = class46.method2311(var1);
            this.field244[var1] = var2.field1006;
        }
        this.field245 = new boolean[this.field247.length];
        for (int var3 = 0; var3 < this.field247.length; var3++) {
            class50 var4 = (class50) class50.field1058.method3537((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1060.method3080(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method1015(new class119(var6));
                }
                class50.field1058.method3539(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field245[var3] = var5.field1059;
        }
        for (int var9 = 0; var9 < this.field246.length; var9++) {
            this.field246[var9] = -1;
        }
        this.method210();
    }

    @ObfuscatedName("f.m(IIB)V")
    public void method203(int arg0, int arg1) {
        this.field246[arg0] = arg1;
        if (this.field244[arg0]) {
            this.field248 = true;
        }
    }

    @ObfuscatedName("f.l(II)I")
    public int method233(int arg0) {
        return this.field246[arg0];
    }

    @ObfuscatedName("f.y(ILjava/lang/String;I)V")
    public void method205(int arg0, String arg1) {
        this.field247[arg0] = arg1;
        if (this.field245[arg0]) {
            this.field248 = true;
        }
    }

    @ObfuscatedName("f.u(II)Ljava/lang/String;")
    public String method219(int arg0) {
        return this.field247[arg0];
    }

    @ObfuscatedName("f.k(I)V")
    public void method207() {
        for (int var1 = 0; var1 < this.field246.length; var1++) {
            if (!this.field244[var1]) {
                this.field246[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field247.length; var2++) {
            if (!this.field245[var2]) {
                this.field247[var2] = null;
            }
        }
    }

    @ObfuscatedName("f.j(ZB)Lhj;")
    public class227 method208(boolean arg0) {
        return class149.method4("2", Statics.field2560.field2256, arg0);
    }

    @ObfuscatedName("f.i(B)V")
    public void method241() {
        class227 var1 = this.method208(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field246.length; var4++) {
                if (this.field244[var4] && this.field246[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field247.length; var6++) {
                if (this.field245[var6] && this.field247[var6] != null) {
                    var2 += 2 + class119.method2753(this.field247[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2366(1);
            var7.method2466(var3);
            for (int var8 = 0; var8 < this.field246.length; var8++) {
                if (this.field244[var8] && this.field246[var8] != -1) {
                    var7.method2466(var8);
                    var7.method2514(this.field246[var8]);
                }
            }
            var7.method2466(var5);
            for (int var9 = 0; var9 < this.field247.length; var9++) {
                if (this.field245[var9] && this.field247[var9] != null) {
                    var7.method2466(var9);
                    var7.method2372(this.field247[var9]);
                }
            }
            var1.method3920(var7.field1959, 0, var7.field1955);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3921();
            } catch (Exception var20) {
            }
        }
        this.field248 = false;
        this.field255 = class115.method2177();
    }

    @ObfuscatedName("f.x(B)V")
    public void method210() {
        class227 var1 = this.method208(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3932()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3922(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1959.length - var5.field1955 >= 1) {
                    int var7 = var5.method2562();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2541();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2541();
                            int var12 = var5.method2386();
                            if (this.field244[var11]) {
                                this.field246[var11] = var12;
                            }
                        }
                        int var13 = var5.method2541();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2541();
                            String var16 = var5.method2389();
                            if (this.field245[var15]) {
                                this.field247[var15] = var16;
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
                    var1.method3921();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field248 = false;
    }

    @ObfuscatedName("f.g(I)V")
    public void method236() {
        if (this.field248 && this.field255 < class115.method2177() - 60000L) {
            this.method241();
        }
    }

    @ObfuscatedName("f.e(I)Z")
    public boolean method212() {
        return this.field248;
    }
}
