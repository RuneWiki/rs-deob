package deob;

import java.io.EOFException;

@ObfuscatedName("j")
public class class20 {

    @ObfuscatedName("j.i")
    public boolean[] field283 = new boolean[this.field279.length];

    @ObfuscatedName("j.h")
    public boolean[] field284;

    @ObfuscatedName("j.q")
    public int[] field279 = new int[Statics.field187.method2973(19)];

    @ObfuscatedName("j.u")
    public String[] field280 = new String[Statics.field187.method2973(15)];

    @ObfuscatedName("j.m")
    public boolean field281 = false;

    @ObfuscatedName("j.y")
    public long field275;

    public class20() {
        for (int var1 = 0; var1 < this.field279.length; var1++) {
            class46 var2 = (class46) class46.field1032.method3456((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1033.method3030(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method897(new class119(var4));
                }
                class46.field1032.method3451(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field283[var1] = var3.field1034;
        }
        this.field284 = new boolean[this.field280.length];
        for (int var7 = 0; var7 < this.field280.length; var7++) {
            class50 var8 = class50.method3147(var7);
            this.field284[var7] = var8.field1090;
        }
        for (int var9 = 0; var9 < this.field279.length; var9++) {
            this.field279[var9] = -1;
        }
        this.method201();
    }

    @ObfuscatedName("j.o(III)V")
    public void method187(int arg0, int arg1) {
        this.field279[arg0] = arg1;
        if (this.field283[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("j.f(IB)I")
    public int method196(int arg0) {
        return this.field279[arg0];
    }

    @ObfuscatedName("j.i(ILjava/lang/String;B)V")
    public void method215(int arg0, String arg1) {
        this.field280[arg0] = arg1;
        if (this.field284[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("j.h(II)Ljava/lang/String;")
    public String method207(int arg0) {
        return this.field280[arg0];
    }

    @ObfuscatedName("j.q(I)V")
    public void method191() {
        for (int var1 = 0; var1 < this.field279.length; var1++) {
            if (!this.field283[var1]) {
                this.field279[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field280.length; var2++) {
            if (!this.field284[var2]) {
                this.field280[var2] = null;
            }
        }
    }

    @ObfuscatedName("j.u(ZI)Lhc;")
    public class227 method192(boolean arg0) {
        return class149.method903("2", Statics.field1957.field2273, arg0);
    }

    @ObfuscatedName("j.m(B)V")
    public void method193() {
        class227 var1 = this.method192(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field279.length; var4++) {
                if (this.field283[var4] && this.field279[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field280.length; var6++) {
                if (this.field284[var6] && this.field280[var6] != null) {
                    var2 += 2 + class119.method2219(this.field280[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2347(1);
            var7.method2318(var3);
            for (int var8 = 0; var8 < this.field279.length; var8++) {
                if (this.field283[var8] && this.field279[var8] != -1) {
                    var7.method2318(var8);
                    var7.method2278(this.field279[var8]);
                }
            }
            var7.method2318(var5);
            for (int var9 = 0; var9 < this.field280.length; var9++) {
                if (this.field284[var9] && this.field280[var9] != null) {
                    var7.method2318(var9);
                    var7.method2281(this.field280[var9]);
                }
            }
            var1.method3808(var7.field1989, 0, var7.field1984);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3809();
            } catch (Exception var20) {
            }
        }
        this.field281 = false;
        this.field275 = class115.method568();
    }

    @ObfuscatedName("j.y(I)V")
    public void method201() {
        class227 var1 = this.method192(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3810()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3811(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1989.length - var5.field1984 >= 1) {
                    int var7 = var5.method2290();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2292();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2292();
                        int var12 = var5.method2295();
                        if (this.field283[var11]) {
                            this.field279[var11] = var12;
                        }
                    }
                    int var13 = var5.method2292();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2292();
                        String var16 = var5.method2344();
                        if (this.field284[var15]) {
                            this.field280[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3809();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field281 = false;
    }

    @ObfuscatedName("j.p(B)V")
    public void method189() {
        if (this.field281 && this.field275 < class115.method568() - 60000L) {
            this.method193();
        }
    }

    @ObfuscatedName("j.t(I)Z")
    public boolean method208() {
        return this.field281;
    }
}
