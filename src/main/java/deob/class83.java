package deob;

import java.io.EOFException;

@ObfuscatedName("cq")
public class class83 {

    @ObfuscatedName("cq.s")
    public boolean[] field1176 = new boolean[this.field1175.length];

    @ObfuscatedName("cq.l")
    public boolean[] field1174;

    @ObfuscatedName("cq.u")
    public int[] field1175 = new int[Statics.field1330.method4258(19)];

    @ObfuscatedName("cq.q")
    public String[] field1171 = new String[Statics.field1330.method4258(15)];

    @ObfuscatedName("cq.k")
    public boolean field1177 = false;

    @ObfuscatedName("cq.i")
    public long field1178;

    public class83() {
        for (int var1 = 0; var1 < this.field1175.length; var1++) {
            class257 var2 = class257.method256(var1);
            this.field1176[var1] = var2.field3257;
        }
        this.field1174 = new boolean[this.field1171.length];
        for (int var3 = 0; var3 < this.field1171.length; var3++) {
            class258 var4 = class258.method3188(var3);
            this.field1174[var3] = var4.field3262;
        }
        for (int var5 = 0; var5 < this.field1175.length; var5++) {
            this.field1175[var5] = -1;
        }
        this.method1758();
    }

    @ObfuscatedName("cq.z(III)V")
    public void method1774(int arg0, int arg1) {
        this.field1175[arg0] = arg1;
        if (this.field1176[arg0]) {
            this.field1177 = true;
        }
    }

    @ObfuscatedName("cq.w(IB)I")
    public int method1768(int arg0) {
        return this.field1175[arg0];
    }

    @ObfuscatedName("cq.s(ILjava/lang/String;I)V")
    public void method1760(int arg0, String arg1) {
        this.field1171[arg0] = arg1;
        if (this.field1174[arg0]) {
            this.field1177 = true;
        }
    }

    @ObfuscatedName("cq.l(II)Ljava/lang/String;")
    public String method1761(int arg0) {
        return this.field1171[arg0];
    }

    @ObfuscatedName("cq.u(I)V")
    public void method1762() {
        for (int var1 = 0; var1 < this.field1175.length; var1++) {
            if (!this.field1176[var1]) {
                this.field1175[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1171.length; var2++) {
            if (!this.field1174[var2]) {
                this.field1171[var2] = null;
            }
        }
    }

    @ObfuscatedName("cq.q(ZI)Ldv;")
    public class111 method1763(boolean arg0) {
        return class156.method264("2", Statics.field1456.field3145, arg0);
    }

    @ObfuscatedName("cq.i(B)V")
    public void method1764() {
        class111 var1 = this.method1763(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1175.length; var4++) {
                if (this.field1176[var4] && this.field1175[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1171.length; var6++) {
                if (this.field1174[var6] && this.field1171[var6] != null) {
                    var2 += 2 + class183.method5380(this.field1171[var6]);
                    var5++;
                }
            }
            class183 var7 = new class183(var2);
            var7.method3235(1);
            var7.method3458(var3);
            for (int var8 = 0; var8 < this.field1175.length; var8++) {
                if (this.field1176[var8] && this.field1175[var8] != -1) {
                    var7.method3458(var8);
                    var7.method3410(this.field1175[var8]);
                }
            }
            var7.method3458(var5);
            for (int var9 = 0; var9 < this.field1171.length; var9++) {
                if (this.field1174[var9] && this.field1171[var9] != null) {
                    var7.method3458(var9);
                    var7.method3402(this.field1171[var9]);
                }
            }
            var1.method2302(var7.field2339, 0, var7.field2340);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2303();
            } catch (Exception var20) {
            }
        }
        this.field1177 = false;
        this.field1178 = class185.method3250();
    }

    @ObfuscatedName("cq.x(I)V")
    public void method1758() {
        class111 var1 = this.method1763(false);
        try {
            byte[] var2 = new byte[(int) var1.method2305()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method2306(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class183 var5 = new class183(var2);
            if (var5.field2339.length - var5.field2340 < 1) {
                return;
            }
            int var7 = var5.method3247();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method3253();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method3253();
                int var12 = var5.method3374();
                if (this.field1176[var11]) {
                    this.field1175[var11] = var12;
                }
            }
            int var13 = var5.method3253();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method3253();
                String var16 = var5.method3441();
                if (this.field1174[var15]) {
                    this.field1171[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method2303();
            } catch (Exception var29) {
            }
        }
        this.field1177 = false;
    }

    @ObfuscatedName("cq.e(I)V")
    public void method1773() {
        if (this.field1177 && this.field1178 < class185.method3250() - 60000L) {
            this.method1764();
        }
    }

    @ObfuscatedName("cq.p(S)Z")
    public boolean method1767() {
        return this.field1177;
    }
}
