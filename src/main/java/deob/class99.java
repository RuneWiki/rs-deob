package deob;

import java.io.EOFException;

@ObfuscatedName("cy")
public class class99 {

    @ObfuscatedName("cy.g")
    public boolean[] field1514 = new boolean[this.field1511.length];

    @ObfuscatedName("cy.y")
    public boolean[] field1507;

    @ObfuscatedName("cy.w")
    public int[] field1511 = new int[Statics.field442.method3828(19)];

    @ObfuscatedName("cy.k")
    public String[] field1512 = new String[Statics.field442.method3828(15)];

    @ObfuscatedName("cy.v")
    public boolean field1510 = false;

    @ObfuscatedName("cy.z")
    public long field1513;

    public class99() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            class245 var2 = class245.method1425(var1);
            this.field1514[var1] = var2.field3303;
        }
        this.field1507 = new boolean[this.field1512.length];
        for (int var3 = 0; var3 < this.field1512.length; var3++) {
            class246 var4 = class246.method2713(var3);
            this.field1507[var3] = var4.field3309;
        }
        for (int var5 = 0; var5 < this.field1511.length; var5++) {
            this.field1511[var5] = -1;
        }
        this.method1701();
    }

    @ObfuscatedName("cy.e(III)V")
    public void method1694(int arg0, int arg1) {
        this.field1511[arg0] = arg1;
        if (this.field1514[arg0]) {
            this.field1510 = true;
        }
    }

    @ObfuscatedName("cy.n(II)I")
    public int method1727(int arg0) {
        return this.field1511[arg0];
    }

    @ObfuscatedName("cy.g(ILjava/lang/String;I)V")
    public void method1696(int arg0, String arg1) {
        this.field1512[arg0] = arg1;
        if (this.field1507[arg0]) {
            this.field1510 = true;
        }
    }

    @ObfuscatedName("cy.y(IS)Ljava/lang/String;")
    public String method1697(int arg0) {
        return this.field1512[arg0];
    }

    @ObfuscatedName("cy.w(I)V")
    public void method1693() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            if (!this.field1514[var1]) {
                this.field1511[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1512.length; var2++) {
            if (!this.field1507[var2]) {
                this.field1512[var2] = null;
            }
        }
    }

    @ObfuscatedName("cy.k(ZB)Ldk;")
    public class126 method1699(boolean arg0) {
        return Statics.method2219("2", Statics.field425.field3176, arg0);
    }

    @ObfuscatedName("cy.v(I)V")
    public void method1700() {
        class126 var1 = this.method1699(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1511.length; var4++) {
                if (this.field1514[var4] && this.field1511[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1512.length; var6++) {
                if (this.field1507[var6] && this.field1512[var6] != null) {
                    var2 += 2 + class175.method563(this.field1512[var6]);
                    var5++;
                }
            }
            class175 var7 = new class175(var2);
            var7.method2913(1);
            var7.method2914(var3);
            for (int var8 = 0; var8 < this.field1511.length; var8++) {
                if (this.field1514[var8] && this.field1511[var8] != -1) {
                    var7.method2914(var8);
                    var7.method2916(this.field1511[var8]);
                }
            }
            var7.method2914(var5);
            for (int var9 = 0; var9 < this.field1512.length; var9++) {
                if (this.field1507[var9] && this.field1512[var9] != null) {
                    var7.method2914(var9);
                    var7.method2927(this.field1512[var9]);
                }
            }
            var1.method2175(var7.field2376, 0, var7.field2381);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2187();
            } catch (Exception var20) {
            }
        }
        this.field1510 = false;
        this.field1513 = class177.method2903();
    }

    @ObfuscatedName("cy.z(I)V")
    public void method1701() {
        class126 var1 = this.method1699(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method2178()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2177(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class175 var5 = new class175(var2);
                if (var5.field2376.length - var5.field2381 >= 1) {
                    int var7 = var5.method2928();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method3091();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3091();
                        int var12 = var5.method2933();
                        if (this.field1514[var11]) {
                            this.field1511[var11] = var12;
                        }
                    }
                    int var13 = var5.method3091();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method3091();
                        String var16 = var5.method3113();
                        if (this.field1507[var15]) {
                            this.field1512[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method2187();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1510 = false;
    }

    @ObfuscatedName("cy.r(I)V")
    public void method1726() {
        if (this.field1510 && this.field1513 < class177.method2903() - 60000L) {
            this.method1700();
        }
    }

    @ObfuscatedName("cy.u(I)Z")
    public boolean method1709() {
        return this.field1510;
    }
}
