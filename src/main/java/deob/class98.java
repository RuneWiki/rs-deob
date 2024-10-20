package deob;

import java.io.EOFException;

@ObfuscatedName("cw")
public class class98 {

    @ObfuscatedName("cw.n")
    public boolean[] field1510 = new boolean[this.field1512.length];

    @ObfuscatedName("cw.r")
    public boolean[] field1508;

    @ObfuscatedName("cw.v")
    public int[] field1512 = new int[Statics.field1893.method3793(19)];

    @ObfuscatedName("cw.e")
    public String[] field1513 = new String[Statics.field1893.method3793(15)];

    @ObfuscatedName("cw.l")
    public boolean field1514 = false;

    @ObfuscatedName("cw.s")
    public long field1515;

    public class98() {
        for (int var1 = 0; var1 < this.field1512.length; var1++) {
            class244 var2 = (class244) class244.field3312.method3245((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3311.method3787(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method3934(new class174(var4));
                }
                class244.field3312.method3247(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1510[var1] = var3.field3313;
        }
        this.field1508 = new boolean[this.field1513.length];
        for (int var7 = 0; var7 < this.field1513.length; var7++) {
            class245 var8 = class245.method3108(var7);
            this.field1508[var7] = var8.field3322;
        }
        for (int var9 = 0; var9 < this.field1512.length; var9++) {
            this.field1512[var9] = -1;
        }
        this.method1617();
    }

    @ObfuscatedName("cw.a(III)V")
    public void method1635(int arg0, int arg1) {
        this.field1512[arg0] = arg1;
        if (this.field1510[arg0]) {
            this.field1514 = true;
        }
    }

    @ObfuscatedName("cw.j(II)I")
    public int method1614(int arg0) {
        return this.field1512[arg0];
    }

    @ObfuscatedName("cw.n(ILjava/lang/String;I)V")
    public void method1615(int arg0, String arg1) {
        this.field1513[arg0] = arg1;
        if (this.field1508[arg0]) {
            this.field1514 = true;
        }
    }

    @ObfuscatedName("cw.r(II)Ljava/lang/String;")
    public String method1627(int arg0) {
        return this.field1513[arg0];
    }

    @ObfuscatedName("cw.v(I)V")
    public void method1648() {
        for (int var1 = 0; var1 < this.field1512.length; var1++) {
            if (!this.field1510[var1]) {
                this.field1512[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1513.length; var2++) {
            if (!this.field1508[var2]) {
                this.field1513[var2] = null;
            }
        }
    }

    @ObfuscatedName("cw.e(ZI)Ldk;")
    public class125 method1647(boolean arg0) {
        return class156.method2660("2", Statics.field1516.field3199, arg0);
    }

    @ObfuscatedName("cw.l(I)V")
    public void method1619() {
        class125 var1 = this.method1647(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1512.length; var4++) {
                if (this.field1510[var4] && this.field1512[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1513.length; var6++) {
                if (this.field1508[var6] && this.field1513[var6] != null) {
                    var2 += 2 + class174.method2644(this.field1513[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2908(1);
            var7.method2857(var3);
            for (int var8 = 0; var8 < this.field1512.length; var8++) {
                if (this.field1510[var8] && this.field1512[var8] != -1) {
                    var7.method2857(var8);
                    var7.method2859(this.field1512[var8]);
                }
            }
            var7.method2857(var5);
            for (int var9 = 0; var9 < this.field1513.length; var9++) {
                if (this.field1508[var9] && this.field1513[var9] != null) {
                    var7.method2857(var9);
                    var7.method2862(this.field1513[var9]);
                }
            }
            var1.method2131(var7.field2391, 0, var7.field2394);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2129();
            } catch (Exception var20) {
            }
        }
        this.field1514 = false;
        this.field1515 = class176.method584();
    }

    @ObfuscatedName("cw.s(I)V")
    public void method1617() {
        class125 var1 = this.method1647(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2133()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2134(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2391.length - var5.field2394 < 1) {
                    return;
                }
                int var7 = var5.method2871();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2873();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2873();
                        int var12 = var5.method2876();
                        if (this.field1510[var11]) {
                            this.field1512[var11] = var12;
                        }
                    }
                    int var13 = var5.method2873();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2873();
                        String var16 = var5.method2879();
                        if (this.field1508[var15]) {
                            this.field1513[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2129();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1514 = false;
    }

    @ObfuscatedName("cw.w(I)V")
    public void method1621() {
        if (this.field1514 && this.field1515 < class176.method584() - 60000L) {
            this.method1619();
        }
    }

    @ObfuscatedName("cw.p(I)Z")
    public boolean method1641() {
        return this.field1514;
    }
}
