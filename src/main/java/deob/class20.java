package deob;

import java.io.EOFException;

@ObfuscatedName("h")
public class class20 {

    @ObfuscatedName("h.d")
    public boolean[] field283 = new boolean[this.field284.length];

    @ObfuscatedName("h.c")
    public boolean[] field288;

    @ObfuscatedName("h.y")
    public int[] field284 = new int[Statics.field710.method3157(19)];

    @ObfuscatedName("h.k")
    public String[] field285 = new String[Statics.field710.method3157(15)];

    @ObfuscatedName("h.r")
    public boolean field289 = false;

    @ObfuscatedName("h.p")
    public long field287;

    public class20() {
        for (int var1 = 0; var1 < this.field284.length; var1++) {
            class46 var2 = class46.method3569(var1);
            this.field283[var1] = var2.field1056;
        }
        this.field288 = new boolean[this.field285.length];
        for (int var3 = 0; var3 < this.field285.length; var3++) {
            class50 var4 = (class50) class50.field1099.method3579((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1102.method3188(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method1088(new class120(var6));
                }
                class50.field1099.method3581(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field288[var3] = var5.field1100;
        }
        for (int var9 = 0; var9 < this.field284.length; var9++) {
            this.field284[var9] = -1;
        }
        this.method232();
    }

    @ObfuscatedName("h.a(III)V")
    public void method225(int arg0, int arg1) {
        this.field284[arg0] = arg1;
        if (this.field283[arg0]) {
            this.field289 = true;
        }
    }

    @ObfuscatedName("h.w(IB)I")
    public int method243(int arg0) {
        return this.field284[arg0];
    }

    @ObfuscatedName("h.d(ILjava/lang/String;I)V")
    public void method227(int arg0, String arg1) {
        this.field285[arg0] = arg1;
        if (this.field288[arg0]) {
            this.field289 = true;
        }
    }

    @ObfuscatedName("h.c(IB)Ljava/lang/String;")
    public String method228(int arg0) {
        return this.field285[arg0];
    }

    @ObfuscatedName("h.y(I)V")
    public void method247() {
        for (int var1 = 0; var1 < this.field284.length; var1++) {
            if (!this.field283[var1]) {
                this.field284[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field285.length; var2++) {
            if (!this.field288[var2]) {
                this.field285[var2] = null;
            }
        }
    }

    @ObfuscatedName("h.k(ZB)Lhs;")
    public class228 method230(boolean arg0) {
        return class150.method186("2", Statics.field22.field2281, arg0);
    }

    @ObfuscatedName("h.r(I)V")
    public void method237() {
        class228 var1 = this.method230(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field284.length; var4++) {
                if (this.field283[var4] && this.field284[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field285.length; var6++) {
                if (this.field288[var6] && this.field285[var6] != null) {
                    var2 += 2 + class120.method2241(this.field285[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2452(1);
            var7.method2448(var3);
            for (int var8 = 0; var8 < this.field284.length; var8++) {
                if (this.field283[var8] && this.field284[var8] != -1) {
                    var7.method2448(var8);
                    var7.method2635(this.field284[var8]);
                }
            }
            var7.method2448(var5);
            for (int var9 = 0; var9 < this.field285.length; var9++) {
                if (this.field288[var9] && this.field285[var9] != null) {
                    var7.method2448(var9);
                    var7.method2543(this.field285[var9]);
                }
            }
            var1.method3933(var7.field1994, 0, var7.field1993);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3934();
            } catch (Exception var20) {
            }
        }
        this.field289 = false;
        this.field287 = class116.method2781();
    }

    @ObfuscatedName("h.p(I)V")
    public void method232() {
        class228 var1 = this.method230(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3935()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3937(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field1994.length - var5.field1993 >= 1) {
                    int var7 = var5.method2462();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2464();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2464();
                        int var12 = var5.method2467();
                        if (this.field283[var11]) {
                            this.field284[var11] = var12;
                        }
                    }
                    int var13 = var5.method2464();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2464();
                        String var16 = var5.method2470();
                        if (this.field288[var15]) {
                            this.field285[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3934();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field289 = false;
    }

    @ObfuscatedName("h.q(I)V")
    public void method233() {
        if (this.field289 && this.field287 < class116.method2781() - 60000L) {
            this.method237();
        }
    }

    @ObfuscatedName("h.m(B)Z")
    public boolean method234() {
        return this.field289;
    }
}
