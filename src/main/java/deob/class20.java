package deob;

import java.io.EOFException;

@ObfuscatedName("w")
public class class20 {

    @ObfuscatedName("w.m")
    public boolean[] field261 = new boolean[this.field259.length];

    @ObfuscatedName("w.z")
    public boolean[] field262;

    @ObfuscatedName("w.x")
    public int[] field259 = new int[Statics.field14.method3021(19)];

    @ObfuscatedName("w.e")
    public String[] field265 = new String[Statics.field14.method3021(15)];

    @ObfuscatedName("w.i")
    public boolean field263 = false;

    @ObfuscatedName("w.c")
    public long field266;

    public class20() {
        for (int var1 = 0; var1 < this.field259.length; var1++) {
            class46 var2 = class46.method648(var1);
            this.field261[var1] = var2.field1025;
        }
        this.field262 = new boolean[this.field265.length];
        for (int var3 = 0; var3 < this.field265.length; var3++) {
            class50 var4 = class50.method714(var3);
            this.field262[var3] = var4.field1072;
        }
        for (int var5 = 0; var5 < this.field259.length; var5++) {
            this.field259[var5] = -1;
        }
        this.method241();
    }

    @ObfuscatedName("w.j(III)V")
    public void method199(int arg0, int arg1) {
        this.field259[arg0] = arg1;
        if (this.field261[arg0]) {
            this.field263 = true;
        }
    }

    @ObfuscatedName("w.h(II)I")
    public int method200(int arg0) {
        return this.field259[arg0];
    }

    @ObfuscatedName("w.m(ILjava/lang/String;B)V")
    public void method201(int arg0, String arg1) {
        this.field265[arg0] = arg1;
        if (this.field262[arg0]) {
            this.field263 = true;
        }
    }

    @ObfuscatedName("w.z(IB)Ljava/lang/String;")
    public String method214(int arg0) {
        return this.field265[arg0];
    }

    @ObfuscatedName("w.x(I)V")
    public void method229() {
        for (int var1 = 0; var1 < this.field259.length; var1++) {
            if (!this.field261[var1]) {
                this.field259[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field265.length; var2++) {
            if (!this.field262[var2]) {
                this.field265[var2] = null;
            }
        }
    }

    @ObfuscatedName("w.e(ZI)Lhz;")
    public class228 method204(boolean arg0) {
        return Statics.method2233("2", Statics.field1361.field2274, arg0);
    }

    @ObfuscatedName("w.i(B)V")
    public void method205() {
        class228 var1 = this.method204(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field259.length; var4++) {
                if (this.field261[var4] && this.field259[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field265.length; var6++) {
                if (this.field262[var6] && this.field265[var6] != null) {
                    var2 += 2 + class120.method2308(this.field265[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2364(1);
            var7.method2347(var3);
            for (int var8 = 0; var8 < this.field259.length; var8++) {
                if (this.field261[var8] && this.field259[var8] != -1) {
                    var7.method2347(var8);
                    var7.method2349(this.field259[var8]);
                }
            }
            var7.method2347(var5);
            for (int var9 = 0; var9 < this.field265.length; var9++) {
                if (this.field262[var9] && this.field265[var9] != null) {
                    var7.method2347(var9);
                    var7.method2352(this.field265[var9]);
                }
            }
            var1.method3845(var7.field1974, 0, var7.field1972);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3836();
            } catch (Exception var20) {
            }
        }
        this.field263 = false;
        this.field266 = class116.method1579();
    }

    @ObfuscatedName("w.c(I)V")
    public void method241() {
        class228 var1 = this.method204(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3840()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3841(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field1974.length - var5.field1972 >= 1) {
                    int var7 = var5.method2361();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2363();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2363();
                            int var12 = var5.method2366();
                            if (this.field261[var11]) {
                                this.field259[var11] = var12;
                            }
                        }
                        int var13 = var5.method2363();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2363();
                            String var16 = var5.method2369();
                            if (this.field262[var15]) {
                                this.field265[var15] = var16;
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
                    var1.method3836();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field263 = false;
    }

    @ObfuscatedName("w.n(I)V")
    public void method207() {
        if (this.field263 && this.field266 < class116.method1579() - 60000L) {
            this.method205();
        }
    }

    @ObfuscatedName("w.l(I)Z")
    public boolean method208() {
        return this.field263;
    }
}
