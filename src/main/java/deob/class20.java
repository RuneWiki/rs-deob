package deob;

import java.io.EOFException;

@ObfuscatedName("y")
public class class20 {

    @ObfuscatedName("y.c")
    public boolean[] field280 = new boolean[this.field288.length];

    @ObfuscatedName("y.h")
    public boolean[] field285;

    @ObfuscatedName("y.r")
    public int[] field288 = new int[Statics.field2749.method3142(19)];

    @ObfuscatedName("y.a")
    public String[] field283 = new String[Statics.field2749.method3142(15)];

    @ObfuscatedName("y.b")
    public boolean field281 = false;

    @ObfuscatedName("y.u")
    public long field282;

    public class20() {
        for (int var1 = 0; var1 < this.field288.length; var1++) {
            class48 var2 = (class48) class48.field1074.method3589((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1076.method3130(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method985(new class123(var4));
                }
                class48.field1074.method3591(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field280[var1] = var3.field1073;
        }
        this.field285 = new boolean[this.field283.length];
        for (int var7 = 0; var7 < this.field283.length; var7++) {
            class54 var8 = class54.method53(var7);
            this.field285[var7] = var8.field1159;
        }
        for (int var9 = 0; var9 < this.field288.length; var9++) {
            this.field288[var9] = -1;
        }
        this.method176();
    }

    @ObfuscatedName("y.e(III)V")
    public void method187(int arg0, int arg1) {
        this.field288[arg0] = arg1;
        if (this.field280[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("y.l(II)I")
    public int method183(int arg0) {
        return this.field288[arg0];
    }

    @ObfuscatedName("y.c(ILjava/lang/String;I)V")
    public void method171(int arg0, String arg1) {
        this.field283[arg0] = arg1;
        if (this.field285[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("y.h(IB)Ljava/lang/String;")
    public String method196(int arg0) {
        return this.field283[arg0];
    }

    @ObfuscatedName("y.r(B)V")
    public void method177() {
        for (int var1 = 0; var1 < this.field288.length; var1++) {
            if (!this.field280[var1]) {
                this.field288[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field283.length; var2++) {
            if (!this.field285[var2]) {
                this.field283[var2] = null;
            }
        }
    }

    @ObfuscatedName("y.a(ZI)Lhq;")
    public class231 method174(boolean arg0) {
        return class153.method2327("2", Statics.field373.field2336, arg0);
    }

    @ObfuscatedName("y.b(B)V")
    public void method175() {
        class231 var1 = this.method174(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field288.length; var4++) {
                if (this.field280[var4] && this.field288[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field283.length; var6++) {
                if (this.field285[var6] && this.field283[var6] != null) {
                    var2 += 2 + class123.method641(this.field283[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2649(1);
            var7.method2635(var3);
            for (int var8 = 0; var8 < this.field288.length; var8++) {
                if (this.field280[var8] && this.field288[var8] != -1) {
                    var7.method2635(var8);
                    var7.method2452(this.field288[var8]);
                }
            }
            var7.method2635(var5);
            for (int var9 = 0; var9 < this.field283.length; var9++) {
                if (this.field285[var9] && this.field283[var9] != null) {
                    var7.method2635(var9);
                    var7.method2455(this.field283[var9]);
                }
            }
            var1.method3961(var7.field2055, 0, var7.field2062);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3962();
            } catch (Exception var20) {
            }
        }
        this.field281 = false;
        this.field282 = class119.method415();
    }

    @ObfuscatedName("y.u(I)V")
    public void method176() {
        class231 var1 = this.method174(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3963()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3964(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2055.length - var5.field2062 < 1) {
                    return;
                }
                int var7 = var5.method2464();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2466();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2466();
                        int var12 = var5.method2468();
                        if (this.field280[var11]) {
                            this.field288[var11] = var12;
                        }
                    }
                    int var13 = var5.method2466();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2466();
                        String var16 = var5.method2471();
                        if (this.field285[var15]) {
                            this.field283[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3962();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field281 = false;
    }

    @ObfuscatedName("y.o(I)V")
    public void method173() {
        if (this.field281 && this.field282 < class119.method415() - 60000L) {
            this.method175();
        }
    }

    @ObfuscatedName("y.p(I)Z")
    public boolean method178() {
        return this.field281;
    }
}
