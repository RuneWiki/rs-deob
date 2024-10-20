package deob;

import java.io.EOFException;

@ObfuscatedName("n")
public class class19 {

    @ObfuscatedName("n.z")
    public boolean[] field288 = new boolean[this.field285.length];

    @ObfuscatedName("n.l")
    public boolean[] field293;

    @ObfuscatedName("n.w")
    public int[] field285 = new int[Statics.field161.method3008(19)];

    @ObfuscatedName("n.d")
    public String[] field289 = new String[Statics.field161.method3008(15)];

    @ObfuscatedName("n.f")
    public boolean field290 = false;

    @ObfuscatedName("n.i")
    public long field287;

    public class19() {
        for (int var1 = 0; var1 < this.field285.length; var1++) {
            class44 var2 = class44.method31(var1);
            this.field288[var1] = var2.field1021;
        }
        this.field293 = new boolean[this.field289.length];
        for (int var3 = 0; var3 < this.field289.length; var3++) {
            class48 var4 = class48.method687(var3);
            this.field293[var3] = var4.field1063;
        }
        for (int var5 = 0; var5 < this.field285.length; var5++) {
            this.field285[var5] = -1;
        }
        this.method191();
    }

    @ObfuscatedName("n.j(IIS)V")
    public void method190(int arg0, int arg1) {
        this.field285[arg0] = arg1;
        if (this.field288[arg0]) {
            this.field290 = true;
        }
    }

    @ObfuscatedName("n.y(II)I")
    public int method200(int arg0) {
        return this.field285[arg0];
    }

    @ObfuscatedName("n.z(ILjava/lang/String;I)V")
    public void method203(int arg0, String arg1) {
        this.field289[arg0] = arg1;
        if (this.field293[arg0]) {
            this.field290 = true;
        }
    }

    @ObfuscatedName("n.l(IB)Ljava/lang/String;")
    public String method193(int arg0) {
        return this.field289[arg0];
    }

    @ObfuscatedName("n.w(I)V")
    public void method186() {
        for (int var1 = 0; var1 < this.field285.length; var1++) {
            if (!this.field288[var1]) {
                this.field285[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field289.length; var2++) {
            if (!this.field293[var2]) {
                this.field289[var2] = null;
            }
        }
    }

    @ObfuscatedName("n.d(ZB)Lhd;")
    public class221 method215(boolean arg0) {
        return class144.method99("2", Statics.field305.field2198, arg0);
    }

    @ObfuscatedName("n.f(I)V")
    public void method195() {
        class221 var1 = this.method215(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field285.length; var4++) {
                if (this.field288[var4] && this.field285[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field289.length; var6++) {
                if (this.field293[var6] && this.field289[var6] != null) {
                    var2 += 2 + class114.method2250(this.field289[var6]);
                    var5++;
                }
            }
            class114 var7 = new class114(var2);
            var7.method2307(1);
            var7.method2367(var3);
            for (int var8 = 0; var8 < this.field285.length; var8++) {
                if (this.field288[var8] && this.field285[var8] != -1) {
                    var7.method2367(var8);
                    var7.method2310(this.field285[var8]);
                }
            }
            var7.method2367(var5);
            for (int var9 = 0; var9 < this.field289.length; var9++) {
                if (this.field293[var9] && this.field289[var9] != null) {
                    var7.method2367(var9);
                    var7.method2313(this.field289[var9]);
                }
            }
            var1.method3752(var7.field1891, 0, var7.field1894);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3767();
            } catch (Exception var20) {
            }
        }
        this.field290 = false;
        this.field287 = Statics.method2875();
    }

    @ObfuscatedName("n.i(I)V")
    public void method191() {
        class221 var1 = this.method215(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3762()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3755(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class114 var5 = new class114(var2);
                if (var5.field1891.length - var5.field1894 < 1) {
                    return;
                }
                int var7 = var5.method2322();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2324();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2324();
                        int var12 = var5.method2327();
                        if (this.field288[var11]) {
                            this.field285[var11] = var12;
                        }
                    }
                    int var13 = var5.method2324();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2324();
                        String var16 = var5.method2440();
                        if (this.field293[var15]) {
                            this.field289[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3767();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field290 = false;
    }

    @ObfuscatedName("n.a(S)V")
    public void method192() {
        if (this.field290 && this.field287 < Statics.method2875() - 60000L) {
            this.method195();
        }
    }

    @ObfuscatedName("n.o(I)Z")
    public boolean method213() {
        return this.field290;
    }
}
