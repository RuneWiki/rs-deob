package deob;

import java.io.EOFException;

@ObfuscatedName("b")
public class class20 {

    @ObfuscatedName("b.f")
    public boolean[] field267 = new boolean[this.field269.length];

    @ObfuscatedName("b.s")
    public boolean[] field268;

    @ObfuscatedName("b.p")
    public int[] field269 = new int[Statics.field1773.method3075(19)];

    @ObfuscatedName("b.h")
    public String[] field270 = new String[Statics.field1773.method3075(15)];

    @ObfuscatedName("b.g")
    public boolean field265 = false;

    @ObfuscatedName("b.a")
    public long field272;

    public class20() {
        for (int var1 = 0; var1 < this.field269.length; var1++) {
            class46 var2 = class46.method2053(var1);
            this.field267[var1] = var2.field1020;
        }
        this.field268 = new boolean[this.field270.length];
        for (int var3 = 0; var3 < this.field270.length; var3++) {
            class50 var4 = (class50) class50.field1071.method3473((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3164.method3048(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method971(new class120(var6));
                }
                class50.field1071.method3475(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field268[var3] = var5.field1068;
        }
        for (int var9 = 0; var9 < this.field269.length; var9++) {
            this.field269[var9] = -1;
        }
        this.method194();
    }

    @ObfuscatedName("b.e(IIS)V")
    public void method187(int arg0, int arg1) {
        this.field269[arg0] = arg1;
        if (this.field267[arg0]) {
            this.field265 = true;
        }
    }

    @ObfuscatedName("b.w(IB)I")
    public int method195(int arg0) {
        return this.field269[arg0];
    }

    @ObfuscatedName("b.f(ILjava/lang/String;I)V")
    public void method192(int arg0, String arg1) {
        this.field270[arg0] = arg1;
        if (this.field268[arg0]) {
            this.field265 = true;
        }
    }

    @ObfuscatedName("b.s(II)Ljava/lang/String;")
    public String method190(int arg0) {
        return this.field270[arg0];
    }

    @ObfuscatedName("b.p(B)V")
    public void method191() {
        for (int var1 = 0; var1 < this.field269.length; var1++) {
            if (!this.field267[var1]) {
                this.field269[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field270.length; var2++) {
            if (!this.field268[var2]) {
                this.field270[var2] = null;
            }
        }
    }

    @ObfuscatedName("b.h(ZI)Lhy;")
    public class228 method200(boolean arg0) {
        return class150.method2822("2", Statics.field2658.field2279, arg0);
    }

    @ObfuscatedName("b.g(I)V")
    public void method189() {
        class228 var1 = this.method200(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field269.length; var4++) {
                if (this.field267[var4] && this.field269[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field270.length; var6++) {
                if (this.field268[var6] && this.field270[var6] != null) {
                    var2 += 2 + class120.method957(this.field270[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2397(1);
            var7.method2545(var3);
            for (int var8 = 0; var8 < this.field269.length; var8++) {
                if (this.field267[var8] && this.field269[var8] != -1) {
                    var7.method2545(var8);
                    var7.method2449(this.field269[var8]);
                }
            }
            var7.method2545(var5);
            for (int var9 = 0; var9 < this.field270.length; var9++) {
                if (this.field268[var9] && this.field270[var9] != null) {
                    var7.method2545(var9);
                    var7.method2346(this.field270[var9]);
                }
            }
            var1.method3826(var7.field1981, 0, var7.field1977);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3827();
            } catch (Exception var20) {
            }
        }
        this.field265 = false;
        this.field272 = class116.method2794();
    }

    @ObfuscatedName("b.a(I)V")
    public void method194() {
        class228 var1 = this.method200(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3828()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3834(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field1981.length - var5.field1977 >= 1) {
                    int var7 = var5.method2355();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2532();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2532();
                        int var12 = var5.method2360();
                        if (this.field267[var11]) {
                            this.field269[var11] = var12;
                        }
                    }
                    int var13 = var5.method2532();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2532();
                        String var16 = var5.method2363();
                        if (this.field268[var15]) {
                            this.field270[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3827();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field265 = false;
    }

    @ObfuscatedName("b.r(I)V")
    public void method208() {
        if (this.field265 && this.field272 < class116.method2794() - 60000L) {
            this.method189();
        }
    }

    @ObfuscatedName("b.k(B)Z")
    public boolean method196() {
        return this.field265;
    }
}
