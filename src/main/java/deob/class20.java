package deob;

import java.io.EOFException;

@ObfuscatedName("d")
public class class20 {

    @ObfuscatedName("d.c")
    public boolean[] field281 = new boolean[this.field285.length];

    @ObfuscatedName("d.l")
    public boolean[] field284;

    @ObfuscatedName("d.r")
    public int[] field285 = new int[Statics.field2897.method3030(19)];

    @ObfuscatedName("d.u")
    public String[] field282 = new String[Statics.field2897.method3030(15)];

    @ObfuscatedName("d.j")
    public boolean field279 = false;

    @ObfuscatedName("d.w")
    public long field286;

    public class20() {
        for (int var1 = 0; var1 < this.field285.length; var1++) {
            class46 var2 = class46.method665(var1);
            this.field281[var1] = var2.field1046;
        }
        this.field284 = new boolean[this.field282.length];
        for (int var3 = 0; var3 < this.field282.length; var3++) {
            class50 var4 = (class50) class50.field1088.method3475((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field665.method3094(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method1004(new class119(var6));
                }
                class50.field1088.method3488(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field284[var3] = var5.field1089;
        }
        for (int var9 = 0; var9 < this.field285.length; var9++) {
            this.field285[var9] = -1;
        }
        this.method210();
    }

    @ObfuscatedName("d.n(III)V")
    public void method226(int arg0, int arg1) {
        this.field285[arg0] = arg1;
        if (this.field281[arg0]) {
            this.field279 = true;
        }
    }

    @ObfuscatedName("d.q(IB)I")
    public int method204(int arg0) {
        return this.field285[arg0];
    }

    @ObfuscatedName("d.c(ILjava/lang/String;B)V")
    public void method205(int arg0, String arg1) {
        this.field282[arg0] = arg1;
        if (this.field284[arg0]) {
            this.field279 = true;
        }
    }

    @ObfuscatedName("d.l(II)Ljava/lang/String;")
    public String method224(int arg0) {
        return this.field282[arg0];
    }

    @ObfuscatedName("d.r(B)V")
    public void method207() {
        for (int var1 = 0; var1 < this.field285.length; var1++) {
            if (!this.field281[var1]) {
                this.field285[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field282.length; var2++) {
            if (!this.field284[var2]) {
                this.field282[var2] = null;
            }
        }
    }

    @ObfuscatedName("d.u(ZI)Lhw;")
    public class227 method208(boolean arg0) {
        return Statics.method1547("2", Statics.field1092.field2282, arg0);
    }

    @ObfuscatedName("d.j(I)V")
    public void method209() {
        class227 var1 = this.method208(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field285.length; var4++) {
                if (this.field281[var4] && this.field285[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field282.length; var6++) {
                if (this.field284[var6] && this.field282[var6] != null) {
                    var2 += 2 + class119.method763(this.field282[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2345(1);
            var7.method2346(var3);
            for (int var8 = 0; var8 < this.field285.length; var8++) {
                if (this.field281[var8] && this.field285[var8] != -1) {
                    var7.method2346(var8);
                    var7.method2348(this.field285[var8]);
                }
            }
            var7.method2346(var5);
            for (int var9 = 0; var9 < this.field282.length; var9++) {
                if (this.field284[var9] && this.field282[var9] != null) {
                    var7.method2346(var9);
                    var7.method2509(this.field282[var9]);
                }
            }
            var1.method3856(var7.field1987, 0, var7.field1982);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3852();
            } catch (Exception var20) {
            }
        }
        this.field279 = false;
        this.field286 = class115.method179();
    }

    @ObfuscatedName("d.w(I)V")
    public void method210() {
        class227 var1 = this.method208(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3853()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3854(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1987.length - var5.field1982 < 1) {
                    return;
                }
                int var7 = var5.method2360();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2430();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2430();
                        int var12 = var5.method2365();
                        if (this.field281[var11]) {
                            this.field285[var11] = var12;
                        }
                    }
                    int var13 = var5.method2430();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2430();
                        String var16 = var5.method2368();
                        if (this.field284[var15]) {
                            this.field282[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3852();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field279 = false;
    }

    @ObfuscatedName("d.y(B)V")
    public void method211() {
        if (this.field279 && this.field286 < class115.method179() - 60000L) {
            this.method209();
        }
    }

    @ObfuscatedName("d.o(S)Z")
    public boolean method212() {
        return this.field279;
    }
}
