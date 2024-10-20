package deob;

import java.io.EOFException;

@ObfuscatedName("ck")
public class class98 {

    @ObfuscatedName("ck.x")
    public boolean[] field1485 = new boolean[this.field1483.length];

    @ObfuscatedName("ck.y")
    public boolean[] field1487;

    @ObfuscatedName("ck.e")
    public int[] field1483 = new int[Statics.field2135.method3761(19)];

    @ObfuscatedName("ck.f")
    public String[] field1488 = new String[Statics.field2135.method3761(15)];

    @ObfuscatedName("ck.v")
    public boolean field1489 = false;

    @ObfuscatedName("ck.t")
    public long field1493;

    public class98() {
        for (int var1 = 0; var1 < this.field1483.length; var1++) {
            class244 var2 = (class244) class244.field3298.method3252((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3299.method3750(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method3922(new class174(var4));
                }
                class244.field3298.method3256(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1485[var1] = var3.field3297;
        }
        this.field1487 = new boolean[this.field1488.length];
        for (int var7 = 0; var7 < this.field1488.length; var7++) {
            class245 var8 = class245.method621(var7);
            this.field1487[var7] = var8.field3302;
        }
        for (int var9 = 0; var9 < this.field1483.length; var9++) {
            this.field1483[var9] = -1;
        }
        this.method1648();
    }

    @ObfuscatedName("ck.d(III)V")
    public void method1641(int arg0, int arg1) {
        this.field1483[arg0] = arg1;
        if (this.field1485[arg0]) {
            this.field1489 = true;
        }
    }

    @ObfuscatedName("ck.q(II)I")
    public int method1660(int arg0) {
        return this.field1483[arg0];
    }

    @ObfuscatedName("ck.x(ILjava/lang/String;I)V")
    public void method1643(int arg0, String arg1) {
        this.field1488[arg0] = arg1;
        if (this.field1487[arg0]) {
            this.field1489 = true;
        }
    }

    @ObfuscatedName("ck.y(II)Ljava/lang/String;")
    public String method1671(int arg0) {
        return this.field1488[arg0];
    }

    @ObfuscatedName("ck.e(B)V")
    public void method1645() {
        for (int var1 = 0; var1 < this.field1483.length; var1++) {
            if (!this.field1485[var1]) {
                this.field1483[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1488.length; var2++) {
            if (!this.field1487[var2]) {
                this.field1488[var2] = null;
            }
        }
    }

    @ObfuscatedName("ck.f(ZI)Lcn;")
    public class104 method1646(boolean arg0) {
        return class156.method535("2", Statics.field1111.field3178, arg0);
    }

    @ObfuscatedName("ck.v(S)V")
    public void method1640() {
        class104 var1 = this.method1646(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1483.length; var4++) {
                if (this.field1485[var4] && this.field1483[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1488.length; var6++) {
                if (this.field1487[var6] && this.field1488[var6] != null) {
                    var2 += 2 + Statics.method2363(this.field1488[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2899(1);
            var7.method2900(var3);
            for (int var8 = 0; var8 < this.field1483.length; var8++) {
                if (this.field1485[var8] && this.field1483[var8] != -1) {
                    var7.method2900(var8);
                    var7.method2902(this.field1483[var8]);
                }
            }
            var7.method2900(var5);
            for (int var9 = 0; var9 < this.field1488.length; var9++) {
                if (this.field1487[var9] && this.field1488[var9] != null) {
                    var7.method2900(var9);
                    var7.method2905(this.field1488[var9]);
                }
            }
            var1.method1760(var7.field2367, 0, var7.field2364);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1762();
            } catch (Exception var20) {
            }
        }
        this.field1489 = false;
        this.field1493 = class176.method3746();
    }

    @ObfuscatedName("ck.t(B)V")
    public void method1648() {
        class104 var1 = this.method1646(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method1758()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1759(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2367.length - var5.field2364 < 1) {
                    return;
                }
                int var7 = var5.method2921();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2916();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2916();
                        int var12 = var5.method2935();
                        if (this.field1485[var11]) {
                            this.field1483[var11] = var12;
                        }
                    }
                    int var13 = var5.method2916();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2916();
                        String var16 = var5.method2922();
                        if (this.field1487[var15]) {
                            this.field1488[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method1762();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1489 = false;
    }

    @ObfuscatedName("ck.i(B)V")
    public void method1642() {
        if (this.field1489 && this.field1493 < class176.method3746() - 60000L) {
            this.method1640();
        }
    }

    @ObfuscatedName("ck.r(B)Z")
    public boolean method1644() {
        return this.field1489;
    }
}
