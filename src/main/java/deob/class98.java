package deob;

import java.io.EOFException;

@ObfuscatedName("cq")
public class class98 {

    @ObfuscatedName("cq.i")
    public boolean[] field1514 = new boolean[this.field1516.length];

    @ObfuscatedName("cq.j")
    public boolean[] field1523;

    @ObfuscatedName("cq.f")
    public int[] field1516 = new int[Statics.field1375.method3879(19)];

    @ObfuscatedName("cq.m")
    public String[] field1517 = new String[Statics.field1375.method3879(15)];

    @ObfuscatedName("cq.c")
    public boolean field1513 = false;

    @ObfuscatedName("cq.z")
    public long field1515;

    public class98() {
        for (int var1 = 0; var1 < this.field1516.length; var1++) {
            class244 var2 = class244.method978(var1);
            this.field1514[var1] = var2.field3318;
        }
        this.field1523 = new boolean[this.field1517.length];
        for (int var3 = 0; var3 < this.field1517.length; var3++) {
            class245 var4 = class245.method2772(var3);
            this.field1523[var3] = var4.field3323;
        }
        for (int var5 = 0; var5 < this.field1516.length; var5++) {
            this.field1516[var5] = -1;
        }
        this.method1637();
    }

    @ObfuscatedName("cq.n(III)V")
    public void method1638(int arg0, int arg1) {
        this.field1516[arg0] = arg1;
        if (this.field1514[arg0]) {
            this.field1513 = true;
        }
    }

    @ObfuscatedName("cq.p(IB)I")
    public int method1639(int arg0) {
        return this.field1516[arg0];
    }

    @ObfuscatedName("cq.i(ILjava/lang/String;B)V")
    public void method1640(int arg0, String arg1) {
        this.field1517[arg0] = arg1;
        if (this.field1523[arg0]) {
            this.field1513 = true;
        }
    }

    @ObfuscatedName("cq.j(IB)Ljava/lang/String;")
    public String method1641(int arg0) {
        return this.field1517[arg0];
    }

    @ObfuscatedName("cq.f(I)V")
    public void method1665() {
        for (int var1 = 0; var1 < this.field1516.length; var1++) {
            if (!this.field1514[var1]) {
                this.field1516[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1517.length; var2++) {
            if (!this.field1523[var2]) {
                this.field1517[var2] = null;
            }
        }
    }

    @ObfuscatedName("cq.m(ZS)Ldg;")
    public class125 method1643(boolean arg0) {
        return class156.method2821("2", Statics.field917.field3198, arg0);
    }

    @ObfuscatedName("cq.c(B)V")
    public void method1644() {
        class125 var1 = this.method1643(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1516.length; var4++) {
                if (this.field1514[var4] && this.field1516[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1517.length; var6++) {
                if (this.field1523[var6] && this.field1517[var6] != null) {
                    var2 += 2 + Statics.method1708(this.field1517[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2906(1);
            var7.method2907(var3);
            for (int var8 = 0; var8 < this.field1516.length; var8++) {
                if (this.field1514[var8] && this.field1516[var8] != -1) {
                    var7.method2907(var8);
                    var7.method2909(this.field1516[var8]);
                }
            }
            var7.method2907(var5);
            for (int var9 = 0; var9 < this.field1517.length; var9++) {
                if (this.field1523[var9] && this.field1517[var9] != null) {
                    var7.method2907(var9);
                    var7.method2912(this.field1517[var9]);
                }
            }
            var1.method2175(var7.field2401, 0, var7.field2400);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2177();
            } catch (Exception var20) {
            }
        }
        this.field1513 = false;
        this.field1515 = class176.method2396();
    }

    @ObfuscatedName("cq.z(I)V")
    public void method1637() {
        class125 var1 = this.method1643(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2179()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2178(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2401.length - var5.field2400 < 1) {
                    return;
                }
                int var7 = var5.method2925();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3065();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3065();
                        int var12 = var5.method3058();
                        if (this.field1514[var11]) {
                            this.field1516[var11] = var12;
                        }
                    }
                    int var13 = var5.method3065();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3065();
                        String var16 = var5.method3098();
                        if (this.field1523[var15]) {
                            this.field1517[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2177();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1513 = false;
    }

    @ObfuscatedName("cq.h(I)V")
    public void method1642() {
        if (this.field1513 && this.field1515 < class176.method2396() - 60000L) {
            this.method1644();
        }
    }

    @ObfuscatedName("cq.g(I)Z")
    public boolean method1647() {
        return this.field1513;
    }
}
