package deob;

import java.io.EOFException;

@ObfuscatedName("cy")
public class class95 {

    @ObfuscatedName("cy.i")
    public boolean[] field1408 = new boolean[this.field1412.length];

    @ObfuscatedName("cy.a")
    public boolean[] field1411;

    @ObfuscatedName("cy.l")
    public int[] field1412 = new int[Statics.field881.method4204(19)];

    @ObfuscatedName("cy.b")
    public String[] field1417 = new String[Statics.field881.method4204(15)];

    @ObfuscatedName("cy.e")
    public boolean field1413 = false;

    @ObfuscatedName("cy.x")
    public long field1415;

    public class95() {
        for (int var1 = 0; var1 < this.field1412.length; var1++) {
            class271 var2 = (class271) class271.field3479.method3625((long) var1);
            class271 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3481.method4265(19, var1);
                class271 var5 = new class271();
                if (var4 != null) {
                    var5.method4403(new class195(var4));
                }
                class271.field3479.method3627(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1408[var1] = var3.field3478;
        }
        this.field1411 = new boolean[this.field1417.length];
        for (int var7 = 0; var7 < this.field1417.length; var7++) {
            class272 var8 = (class272) class272.field3483.method3625((long) var7);
            class272 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3486.method4265(15, var7);
                class272 var11 = new class272();
                if (var10 != null) {
                    var11.method4410(new class195(var10));
                }
                class272.field3483.method3627(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1411[var7] = var9.field3485;
        }
        for (int var13 = 0; var13 < this.field1412.length; var13++) {
            this.field1412[var13] = -1;
        }
        this.method1832();
    }

    @ObfuscatedName("cy.t(IIB)V")
    public void method1831(int arg0, int arg1) {
        this.field1412[arg0] = arg1;
        if (this.field1408[arg0]) {
            this.field1413 = true;
        }
    }

    @ObfuscatedName("cy.q(II)I")
    public int method1864(int arg0) {
        return this.field1412[arg0];
    }

    @ObfuscatedName("cy.i(ILjava/lang/String;I)V")
    public void method1833(int arg0, String arg1) {
        this.field1417[arg0] = arg1;
        if (this.field1411[arg0]) {
            this.field1413 = true;
        }
    }

    @ObfuscatedName("cy.a(II)Ljava/lang/String;")
    public String method1834(int arg0) {
        return this.field1417[arg0];
    }

    @ObfuscatedName("cy.l(I)V")
    public void method1836() {
        for (int var1 = 0; var1 < this.field1412.length; var1++) {
            if (!this.field1408[var1]) {
                this.field1412[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1417.length; var2++) {
            if (!this.field1411[var2]) {
                this.field1417[var2] = null;
            }
        }
    }

    @ObfuscatedName("cy.b(ZI)Lde;")
    public class123 method1835(boolean arg0) {
        return class168.method4893("2", Statics.field853.field3359, arg0);
    }

    @ObfuscatedName("cy.e(I)V")
    public void method1841() {
        class123 var1 = this.method1835(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1412.length; var4++) {
                if (this.field1408[var4] && this.field1412[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1417.length; var6++) {
                if (this.field1411[var6] && this.field1417[var6] != null) {
                    var2 += 2 + class195.method126(this.field1417[var6]);
                    var5++;
                }
            }
            class195 var7 = new class195(var2);
            var7.method3220(1);
            var7.method3323(var3);
            for (int var8 = 0; var8 < this.field1412.length; var8++) {
                if (this.field1408[var8] && this.field1412[var8] != -1) {
                    var7.method3323(var8);
                    var7.method3223(this.field1412[var8]);
                }
            }
            var7.method3323(var5);
            for (int var9 = 0; var9 < this.field1417.length; var9++) {
                if (this.field1411[var9] && this.field1417[var9] != null) {
                    var7.method3323(var9);
                    var7.method3232(this.field1417[var9]);
                }
            }
            var1.method2314(var7.field2544, 0, var7.field2545);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2315();
            } catch (Exception var20) {
            }
        }
        this.field1413 = false;
        this.field1415 = Statics.method426();
    }

    @ObfuscatedName("cy.x(I)V")
    public void method1832() {
        class123 var1 = this.method1835(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method2332()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2318(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class195 var5 = new class195(var2);
                if (var5.field2544.length - var5.field2545 >= 1) {
                    int var7 = var5.method3236();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method3238();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3238();
                        int var12 = var5.method3241();
                        if (this.field1408[var11]) {
                            this.field1412[var11] = var12;
                        }
                    }
                    int var13 = var5.method3238();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method3238();
                        String var16 = var5.method3257();
                        if (this.field1411[var15]) {
                            this.field1417[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method2315();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1413 = false;
    }

    @ObfuscatedName("cy.p(B)V")
    public void method1839() {
        if (this.field1413 && this.field1415 < Statics.method426() - 60000L) {
            this.method1841();
        }
    }

    @ObfuscatedName("cy.o(I)Z")
    public boolean method1840() {
        return this.field1413;
    }
}
