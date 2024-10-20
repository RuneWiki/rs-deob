package deob;

import java.io.EOFException;

@ObfuscatedName("ay")
public class class47 {

    @ObfuscatedName("ay.g")
    public boolean[] field931 = new boolean[this.field933.length];

    @ObfuscatedName("ay.v")
    public boolean[] field932;

    @ObfuscatedName("ay.y")
    public int[] field933 = new int[Statics.field500.method3150(19)];

    @ObfuscatedName("ay.p")
    public String[] field936 = new String[Statics.field500.method3150(15)];

    @ObfuscatedName("ay.j")
    public boolean field930 = false;

    @ObfuscatedName("ay.m")
    public long field938;

    public class47() {
        for (int var1 = 0; var1 < this.field933.length; var1++) {
            class189 var2 = (class189) class189.field2784.method2275((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2787.method3153(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3301(new class154(var4));
                }
                class189.field2784.method2282(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field931[var1] = var3.field2785;
        }
        this.field932 = new boolean[this.field936.length];
        for (int var7 = 0; var7 < this.field936.length; var7++) {
            class190 var8 = (class190) class190.field2789.method2275((long) var7);
            class190 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field2794.method3153(15, var7);
                class190 var11 = new class190();
                if (var10 != null) {
                    var11.method3314(new class154(var10));
                }
                class190.field2789.method2282(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field932[var7] = var9.field2788;
        }
        for (int var13 = 0; var13 < this.field933.length; var13++) {
            this.field933[var13] = -1;
        }
        this.method929();
    }

    @ObfuscatedName("ay.x(III)V")
    public void method930(int arg0, int arg1) {
        this.field933[arg0] = arg1;
        if (this.field931[arg0]) {
            this.field930 = true;
        }
    }

    @ObfuscatedName("ay.n(IB)I")
    public int method901(int arg0) {
        return this.field933[arg0];
    }

    @ObfuscatedName("ay.g(ILjava/lang/String;B)V")
    public void method902(int arg0, String arg1) {
        this.field936[arg0] = arg1;
        if (this.field932[arg0]) {
            this.field930 = true;
        }
    }

    @ObfuscatedName("ay.v(II)Ljava/lang/String;")
    public String method903(int arg0) {
        return this.field936[arg0];
    }

    @ObfuscatedName("ay.y(B)V")
    public void method911() {
        for (int var1 = 0; var1 < this.field933.length; var1++) {
            if (!this.field931[var1]) {
                this.field933[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field936.length; var2++) {
            if (!this.field932[var2]) {
                this.field936[var2] = null;
            }
        }
    }

    @ObfuscatedName("ay.p(ZI)Lbp;")
    public class74 method925(boolean arg0) {
        return class105.method3399("2", Statics.field313.field2688, arg0);
    }

    @ObfuscatedName("ay.j(B)V")
    public void method906() {
        class74 var1 = this.method925(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field933.length; var4++) {
                if (this.field931[var4] && this.field933[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field936.length; var6++) {
                if (this.field932[var6] && this.field936[var6] != null) {
                    var2 += 2 + class154.method3037(this.field936[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2688(1);
            var7.method2687(var3);
            for (int var8 = 0; var8 < this.field933.length; var8++) {
                if (this.field931[var8] && this.field933[var8] != -1) {
                    var7.method2687(var8);
                    var7.method2689(this.field933[var8]);
                }
            }
            var7.method2687(var5);
            for (int var9 = 0; var9 < this.field936.length; var9++) {
                if (this.field932[var9] && this.field936[var9] != null) {
                    var7.method2687(var9);
                    var7.method2730(this.field936[var9]);
                }
            }
            var1.method1417(var7.field2086, 0, var7.field2087);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1410();
            } catch (Exception var20) {
            }
        }
        this.field930 = false;
        this.field938 = class156.method1898();
    }

    @ObfuscatedName("ay.s(I)V")
    public void method929() {
        class74 var1 = this.method925(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method1411()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1412(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2086.length - var5.field2087 >= 1) {
                    int var7 = var5.method2878();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2833();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2833();
                            int var12 = var5.method2803();
                            if (this.field931[var11]) {
                                this.field933[var11] = var12;
                            }
                        }
                        int var13 = var5.method2833();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2833();
                            String var16 = var5.method2709();
                            if (this.field932[var15]) {
                                this.field936[var15] = var16;
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
                    var1.method1410();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field930 = false;
    }

    @ObfuscatedName("ay.k(I)V")
    public void method899() {
        if (this.field930 && this.field938 < class156.method1898() - 60000L) {
            this.method906();
        }
    }

    @ObfuscatedName("ay.f(S)Z")
    public boolean method908() {
        return this.field930;
    }
}
