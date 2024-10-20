package deob;

import java.io.EOFException;

@ObfuscatedName("i")
public class class20 {

    @ObfuscatedName("i.u")
    public boolean[] field262 = new boolean[this.field264.length];

    @ObfuscatedName("i.b")
    public boolean[] field263;

    @ObfuscatedName("i.p")
    public int[] field264 = new int[Statics.field267.method3067(19)];

    @ObfuscatedName("i.s")
    public String[] field265 = new String[Statics.field267.method3067(15)];

    @ObfuscatedName("i.y")
    public boolean field260 = false;

    @ObfuscatedName("i.t")
    public long field266;

    public class20() {
        for (int var1 = 0; var1 < this.field264.length; var1++) {
            class46 var2 = (class46) class46.field1039.method3510((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1038.method3057(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method922(new class119(var4));
                }
                class46.field1039.method3512(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field262[var1] = var3.field1040;
        }
        this.field263 = new boolean[this.field265.length];
        for (int var7 = 0; var7 < this.field265.length; var7++) {
            class50 var8 = (class50) class50.field1086.method3510((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1082.method3057(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method969(new class119(var10));
                }
                class50.field1086.method3512(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field263[var7] = var9.field1083;
        }
        for (int var13 = 0; var13 < this.field264.length; var13++) {
            this.field264[var13] = -1;
        }
        this.method213();
    }

    @ObfuscatedName("i.o(III)V")
    public void method236(int arg0, int arg1) {
        this.field264[arg0] = arg1;
        if (this.field262[arg0]) {
            this.field260 = true;
        }
    }

    @ObfuscatedName("i.e(IB)I")
    public int method207(int arg0) {
        return this.field264[arg0];
    }

    @ObfuscatedName("i.u(ILjava/lang/String;I)V")
    public void method208(int arg0, String arg1) {
        this.field265[arg0] = arg1;
        if (this.field263[arg0]) {
            this.field260 = true;
        }
    }

    @ObfuscatedName("i.b(II)Ljava/lang/String;")
    public String method209(int arg0) {
        return this.field265[arg0];
    }

    @ObfuscatedName("i.p(I)V")
    public void method206() {
        for (int var1 = 0; var1 < this.field264.length; var1++) {
            if (!this.field262[var1]) {
                this.field264[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field265.length; var2++) {
            if (!this.field263[var2]) {
                this.field265[var2] = null;
            }
        }
    }

    @ObfuscatedName("i.s(ZI)Lhb;")
    public class227 method220(boolean arg0) {
        return class149.method2120("2", Statics.field1946.field2285, arg0);
    }

    @ObfuscatedName("i.y(S)V")
    public void method211() {
        class227 var1 = this.method220(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field264.length; var4++) {
                if (this.field262[var4] && this.field264[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field265.length; var6++) {
                if (this.field263[var6] && this.field265[var6] != null) {
                    var2 += 2 + Statics.method2215(this.field265[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2322(1);
            var7.method2481(var3);
            for (int var8 = 0; var8 < this.field264.length; var8++) {
                if (this.field262[var8] && this.field264[var8] != -1) {
                    var7.method2481(var8);
                    var7.method2327(this.field264[var8]);
                }
            }
            var7.method2481(var5);
            for (int var9 = 0; var9 < this.field265.length; var9++) {
                if (this.field263[var9] && this.field265[var9] != null) {
                    var7.method2481(var9);
                    var7.method2328(this.field265[var9]);
                }
            }
            var1.method3865(var7.field1977, 0, var7.field1974);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3866();
            } catch (Exception var20) {
            }
        }
        this.field260 = false;
        this.field266 = class115.method102();
    }

    @ObfuscatedName("i.t(I)V")
    public void method213() {
        class227 var1 = this.method220(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3867()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3864(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1977.length - var5.field1974 < 1) {
                    return;
                }
                int var7 = var5.method2427();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2339();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2339();
                        int var12 = var5.method2342();
                        if (this.field262[var11]) {
                            this.field264[var11] = var12;
                        }
                    }
                    int var13 = var5.method2339();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2339();
                        String var16 = var5.method2528();
                        if (this.field263[var15]) {
                            this.field265[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3866();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field260 = false;
    }

    @ObfuscatedName("i.w(I)V")
    public void method214() {
        if (this.field260 && this.field266 < class115.method102() - 60000L) {
            this.method211();
        }
    }

    @ObfuscatedName("i.h(I)Z")
    public boolean method225() {
        return this.field260;
    }
}
