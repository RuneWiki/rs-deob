package deob;

import java.io.EOFException;

@ObfuscatedName("w")
public class class20 {

    @ObfuscatedName("w.p")
    public boolean[] field265 = new boolean[this.field272.length];

    @ObfuscatedName("w.x")
    public boolean[] field266;

    @ObfuscatedName("w.d")
    public int[] field272 = new int[Statics.field3024.method3024(19)];

    @ObfuscatedName("w.u")
    public String[] field267 = new String[Statics.field3024.method3024(15)];

    @ObfuscatedName("w.o")
    public boolean field269 = false;

    @ObfuscatedName("w.b")
    public long field270;

    public class20() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            class46 var2 = (class46) class46.field1043.method3484((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1045.method3014(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method903(new class120(var4));
                }
                class46.field1043.method3486(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field265[var1] = var3.field1042;
        }
        this.field266 = new boolean[this.field267.length];
        for (int var7 = 0; var7 < this.field267.length; var7++) {
            class50 var8 = (class50) class50.field1099.method3484((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1091.method3014(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method955(new class120(var10));
                }
                class50.field1099.method3486(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field266[var7] = var9.field1100;
        }
        for (int var13 = 0; var13 < this.field272.length; var13++) {
            this.field272[var13] = -1;
        }
        this.method214();
    }

    @ObfuscatedName("w.s(III)V")
    public void method221(int arg0, int arg1) {
        this.field272[arg0] = arg1;
        if (this.field265[arg0]) {
            this.field269 = true;
        }
    }

    @ObfuscatedName("w.j(II)I")
    public int method208(int arg0) {
        return this.field272[arg0];
    }

    @ObfuscatedName("w.p(ILjava/lang/String;I)V")
    public void method209(int arg0, String arg1) {
        this.field267[arg0] = arg1;
        if (this.field266[arg0]) {
            this.field269 = true;
        }
    }

    @ObfuscatedName("w.x(IB)Ljava/lang/String;")
    public String method228(int arg0) {
        return this.field267[arg0];
    }

    @ObfuscatedName("w.d(I)V")
    public void method211() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            if (!this.field265[var1]) {
                this.field272[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field267.length; var2++) {
            if (!this.field266[var2]) {
                this.field267[var2] = null;
            }
        }
    }

    @ObfuscatedName("w.u(ZI)Lha;")
    public class228 method212(boolean arg0) {
        return class150.method609("2", Statics.field460.field2293, arg0);
    }

    @ObfuscatedName("w.o(I)V")
    public void method222() {
        class228 var1 = this.method212(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field272.length; var4++) {
                if (this.field265[var4] && this.field272[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field267.length; var6++) {
                if (this.field266[var6] && this.field267[var6] != null) {
                    var2 += 2 + class120.method636(this.field267[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2323(1);
            var7.method2507(var3);
            for (int var8 = 0; var8 < this.field272.length; var8++) {
                if (this.field265[var8] && this.field272[var8] != -1) {
                    var7.method2507(var8);
                    var7.method2326(this.field272[var8]);
                }
            }
            var7.method2507(var5);
            for (int var9 = 0; var9 < this.field267.length; var9++) {
                if (this.field266[var9] && this.field267[var9] != null) {
                    var7.method2507(var9);
                    var7.method2329(this.field267[var9]);
                }
            }
            var1.method3838(var7.field2008, 0, var7.field2006);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3853();
            } catch (Exception var20) {
            }
        }
        this.field269 = false;
        this.field270 = class116.method157();
    }

    @ObfuscatedName("w.b(I)V")
    public void method214() {
        class228 var1 = this.method212(false);
        try {
            byte[] var2 = new byte[(int) var1.method3840()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3851(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class120 var5 = new class120(var2);
            if (var5.field2008.length - var5.field2006 < 1) {
                return;
            }
            int var7 = var5.method2338();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2430();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2430();
                int var12 = var5.method2343();
                if (this.field265[var11]) {
                    this.field272[var11] = var12;
                }
            }
            int var13 = var5.method2430();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2430();
                String var16 = var5.method2346();
                if (this.field266[var15]) {
                    this.field267[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3853();
            } catch (Exception var29) {
            }
        }
        this.field269 = false;
    }

    @ObfuscatedName("w.k(I)V")
    public void method215() {
        if (this.field269 && this.field270 < class116.method157() - 60000L) {
            this.method222();
        }
    }

    @ObfuscatedName("w.c(B)Z")
    public boolean method225() {
        return this.field269;
    }
}
