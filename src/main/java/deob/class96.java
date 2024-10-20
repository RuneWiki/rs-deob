package deob;

import java.io.EOFException;

@ObfuscatedName("cu")
public class class96 {

    @ObfuscatedName("cu.i")
    public boolean[] field1418 = new boolean[this.field1425.length];

    @ObfuscatedName("cu.j")
    public boolean[] field1419;

    @ObfuscatedName("cu.v")
    public int[] field1425 = new int[Statics.field307.method3941(19)];

    @ObfuscatedName("cu.x")
    public String[] field1421 = new String[Statics.field307.method3941(15)];

    @ObfuscatedName("cu.e")
    public boolean field1422 = false;

    @ObfuscatedName("cu.l")
    public long field1417;

    public class96() {
        for (int var1 = 0; var1 < this.field1425.length; var1++) {
            class251 var2 = class251.method497(var1);
            this.field1418[var1] = var2.field3371;
        }
        this.field1419 = new boolean[this.field1421.length];
        for (int var3 = 0; var3 < this.field1421.length; var3++) {
            class252 var4 = class252.method2978(var3);
            this.field1419[var3] = var4.field3378;
        }
        for (int var5 = 0; var5 < this.field1425.length; var5++) {
            this.field1425[var5] = -1;
        }
        this.method1715();
    }

    @ObfuscatedName("cu.m(III)V")
    public void method1708(int arg0, int arg1) {
        this.field1425[arg0] = arg1;
        if (this.field1418[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cu.p(II)I")
    public int method1707(int arg0) {
        return this.field1425[arg0];
    }

    @ObfuscatedName("cu.i(ILjava/lang/String;I)V")
    public void method1710(int arg0, String arg1) {
        this.field1421[arg0] = arg1;
        if (this.field1419[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cu.j(II)Ljava/lang/String;")
    public String method1711(int arg0) {
        return this.field1421[arg0];
    }

    @ObfuscatedName("cu.v(B)V")
    public void method1737() {
        for (int var1 = 0; var1 < this.field1425.length; var1++) {
            if (!this.field1418[var1]) {
                this.field1425[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1421.length; var2++) {
            if (!this.field1419[var2]) {
                this.field1421[var2] = null;
            }
        }
    }

    @ObfuscatedName("cu.x(ZI)Ldj;")
    public class124 method1713(boolean arg0) {
        return class157.method2895("2", Statics.field529.field3262, arg0);
    }

    @ObfuscatedName("cu.e(I)V")
    public void method1714() {
        class124 var1 = this.method1713(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1425.length; var4++) {
                if (this.field1418[var4] && this.field1425[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1421.length; var6++) {
                if (this.field1419[var6] && this.field1421[var6] != null) {
                    var2 += 2 + class181.method1683(this.field1421[var6]);
                    var5++;
                }
            }
            class181 var7 = new class181(var2);
            var7.method2996(1);
            var7.method2997(var3);
            for (int var8 = 0; var8 < this.field1425.length; var8++) {
                if (this.field1418[var8] && this.field1425[var8] != -1) {
                    var7.method2997(var8);
                    var7.method2999(this.field1425[var8]);
                }
            }
            var7.method2997(var5);
            for (int var9 = 0; var9 < this.field1421.length; var9++) {
                if (this.field1419[var9] && this.field1421[var9] != null) {
                    var7.method2997(var9);
                    var7.method3003(this.field1421[var9]);
                }
            }
            var1.method2254(var7.field2499, 0, var7.field2498);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2243();
            } catch (Exception var20) {
            }
        }
        this.field1422 = false;
        this.field1417 = class183.method4541();
    }

    @ObfuscatedName("cu.l(B)V")
    public void method1715() {
        class124 var1 = this.method1713(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2260()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2246(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class181 var5 = new class181(var2);
                if (var5.field2499.length - var5.field2498 >= 1) {
                    int var7 = var5.method3012();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3009();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3009();
                            int var12 = var5.method3017();
                            if (this.field1418[var11]) {
                                this.field1425[var11] = var12;
                            }
                        }
                        int var13 = var5.method3009();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3009();
                            String var16 = var5.method3021();
                            if (this.field1419[var15]) {
                                this.field1421[var15] = var16;
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
                    var1.method2243();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1422 = false;
    }

    @ObfuscatedName("cu.b(I)V")
    public void method1716() {
        if (this.field1422 && this.field1417 < class183.method4541() - 60000L) {
            this.method1714();
        }
    }

    @ObfuscatedName("cu.n(B)Z")
    public boolean method1717() {
        return this.field1422;
    }
}
