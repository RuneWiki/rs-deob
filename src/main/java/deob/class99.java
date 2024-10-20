package deob;

import java.io.EOFException;

@ObfuscatedName("cd")
public class class99 {

    @ObfuscatedName("cd.f")
    public boolean[] field1523 = new boolean[this.field1525.length];

    @ObfuscatedName("cd.p")
    public boolean[] field1524;

    @ObfuscatedName("cd.x")
    public int[] field1525 = new int[Statics.field422.method3784(19)];

    @ObfuscatedName("cd.g")
    public String[] field1526 = new String[Statics.field422.method3784(15)];

    @ObfuscatedName("cd.c")
    public boolean field1521 = false;

    @ObfuscatedName("cd.l")
    public long field1528;

    public class99() {
        for (int var1 = 0; var1 < this.field1525.length; var1++) {
            class245 var2 = class245.method133(var1);
            this.field1523[var1] = var2.field3306;
        }
        this.field1524 = new boolean[this.field1526.length];
        for (int var3 = 0; var3 < this.field1526.length; var3++) {
            class246 var4 = (class246) class246.field3307.method3271((long) var3);
            class246 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3308.method3773(15, var3);
                class246 var7 = new class246();
                if (var6 != null) {
                    var7.method4002(new class175(var6));
                }
                class246.field3307.method3270(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1524[var3] = var5.field3309;
        }
        for (int var9 = 0; var9 < this.field1525.length; var9++) {
            this.field1525[var9] = -1;
        }
        this.method1667();
    }

    @ObfuscatedName("cd.j(III)V")
    public void method1662(int arg0, int arg1) {
        this.field1525[arg0] = arg1;
        if (this.field1523[arg0]) {
            this.field1521 = true;
        }
    }

    @ObfuscatedName("cd.h(II)I")
    public int method1663(int arg0) {
        return this.field1525[arg0];
    }

    @ObfuscatedName("cd.f(ILjava/lang/String;I)V")
    public void method1664(int arg0, String arg1) {
        this.field1526[arg0] = arg1;
        if (this.field1524[arg0]) {
            this.field1521 = true;
        }
    }

    @ObfuscatedName("cd.p(II)Ljava/lang/String;")
    public String method1697(int arg0) {
        return this.field1526[arg0];
    }

    @ObfuscatedName("cd.x(I)V")
    public void method1666() {
        for (int var1 = 0; var1 < this.field1525.length; var1++) {
            if (!this.field1523[var1]) {
                this.field1525[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1526.length; var2++) {
            if (!this.field1524[var2]) {
                this.field1526[var2] = null;
            }
        }
    }

    @ObfuscatedName("cd.g(ZB)Ldr;")
    public class126 method1685(boolean arg0) {
        return class157.method53("2", Statics.field506.field3184, arg0);
    }

    @ObfuscatedName("cd.c(B)V")
    public void method1668() {
        class126 var1 = this.method1685(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1525.length; var4++) {
                if (this.field1523[var4] && this.field1525[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1526.length; var6++) {
                if (this.field1524[var6] && this.field1526[var6] != null) {
                    var2 += 2 + class175.method2869(this.field1526[var6]);
                    var5++;
                }
            }
            class175 var7 = new class175(var2);
            var7.method2888(1);
            var7.method3030(var3);
            for (int var8 = 0; var8 < this.field1525.length; var8++) {
                if (this.field1523[var8] && this.field1525[var8] != -1) {
                    var7.method3030(var8);
                    var7.method2891(this.field1525[var8]);
                }
            }
            var7.method3030(var5);
            for (int var9 = 0; var9 < this.field1526.length; var9++) {
                if (this.field1524[var9] && this.field1526[var9] != null) {
                    var7.method3030(var9);
                    var7.method2894(this.field1526[var9]);
                }
            }
            var1.method2159(var7.field2390, 0, var7.field2394);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2161();
            } catch (Exception var20) {
            }
        }
        this.field1521 = false;
        this.field1528 = class177.method1067();
    }

    @ObfuscatedName("cd.l(I)V")
    public void method1667() {
        class126 var1 = this.method1685(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2177()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2162(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class175 var5 = new class175(var2);
                if (var5.field2390.length - var5.field2394 >= 1) {
                    int var7 = var5.method2903();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3023();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3023();
                            int var12 = var5.method2908();
                            if (this.field1523[var11]) {
                                this.field1525[var11] = var12;
                            }
                        }
                        int var13 = var5.method3023();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3023();
                            String var16 = var5.method2911();
                            if (this.field1524[var15]) {
                                this.field1526[var15] = var16;
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
                    var1.method2161();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1521 = false;
    }

    @ObfuscatedName("cd.w(I)V")
    public void method1683() {
        if (this.field1521 && this.field1528 < class177.method1067() - 60000L) {
            this.method1668();
        }
    }

    @ObfuscatedName("cd.b(I)Z")
    public boolean method1671() {
        return this.field1521;
    }
}
