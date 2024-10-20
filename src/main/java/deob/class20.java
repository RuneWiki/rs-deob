package deob;

import java.io.EOFException;

@ObfuscatedName("j")
public class class20 {

    @ObfuscatedName("j.f")
    public boolean[] field274 = new boolean[this.field284.length];

    @ObfuscatedName("j.h")
    public boolean[] field275;

    @ObfuscatedName("j.a")
    public int[] field284 = new int[Statics.field8.method3078(19)];

    @ObfuscatedName("j.s")
    public String[] field277 = new String[Statics.field8.method3078(15)];

    @ObfuscatedName("j.p")
    public boolean field278 = false;

    @ObfuscatedName("j.r")
    public long field281;

    public class20() {
        for (int var1 = 0; var1 < this.field284.length; var1++) {
            class46 var2 = (class46) class46.field1056.method3467((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1060.method3080(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method878(new class119(var4));
                }
                class46.field1056.method3466(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field274[var1] = var3.field1055;
        }
        this.field275 = new boolean[this.field277.length];
        for (int var7 = 0; var7 < this.field277.length; var7++) {
            class50 var8 = (class50) class50.field1098.method3467((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1100.method3080(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method949(new class119(var10));
                }
                class50.field1098.method3466(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field275[var7] = var9.field1099;
        }
        for (int var13 = 0; var13 < this.field284.length; var13++) {
            this.field284[var13] = -1;
        }
        this.method188();
    }

    @ObfuscatedName("j.i(III)V")
    public void method221(int arg0, int arg1) {
        this.field284[arg0] = arg1;
        if (this.field274[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("j.v(II)I")
    public int method182(int arg0) {
        return this.field284[arg0];
    }

    @ObfuscatedName("j.f(ILjava/lang/String;B)V")
    public void method183(int arg0, String arg1) {
        this.field277[arg0] = arg1;
        if (this.field275[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("j.h(II)Ljava/lang/String;")
    public String method184(int arg0) {
        return this.field277[arg0];
    }

    @ObfuscatedName("j.a(B)V")
    public void method204() {
        for (int var1 = 0; var1 < this.field284.length; var1++) {
            if (!this.field274[var1]) {
                this.field284[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field277.length; var2++) {
            if (!this.field275[var2]) {
                this.field277[var2] = null;
            }
        }
    }

    @ObfuscatedName("j.s(ZI)Lho;")
    public class227 method186(boolean arg0) {
        return class149.method2241("2", Statics.field294.field2282, arg0);
    }

    @ObfuscatedName("j.p(B)V")
    public void method180() {
        class227 var1 = this.method186(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field284.length; var4++) {
                if (this.field274[var4] && this.field284[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field277.length; var6++) {
                if (this.field275[var6] && this.field277[var6] != null) {
                    var2 += 2 + class119.method3638(this.field277[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2296(1);
            var7.method2381(var3);
            for (int var8 = 0; var8 < this.field284.length; var8++) {
                if (this.field274[var8] && this.field284[var8] != -1) {
                    var7.method2381(var8);
                    var7.method2299(this.field284[var8]);
                }
            }
            var7.method2381(var5);
            for (int var9 = 0; var9 < this.field277.length; var9++) {
                if (this.field275[var9] && this.field277[var9] != null) {
                    var7.method2381(var9);
                    var7.method2302(this.field277[var9]);
                }
            }
            var1.method3824(var7.field1988, 0, var7.field1984);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3813();
            } catch (Exception var20) {
            }
        }
        this.field278 = false;
        this.field281 = class115.method2906();
    }

    @ObfuscatedName("j.r(I)V")
    public void method188() {
        class227 var1 = this.method186(false);
        try {
            byte[] var2 = new byte[(int) var1.method3815()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3816(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class119 var5 = new class119(var2);
            if (var5.field1988.length - var5.field1984 < 1) {
                return;
            }
            int var7 = var5.method2310();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2312();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2312();
                int var12 = var5.method2315();
                if (this.field274[var11]) {
                    this.field284[var11] = var12;
                }
            }
            int var13 = var5.method2312();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2312();
                String var16 = var5.method2318();
                if (this.field275[var15]) {
                    this.field277[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3813();
            } catch (Exception var29) {
            }
        }
        this.field278 = false;
    }

    @ObfuscatedName("j.k(I)V")
    public void method189() {
        if (this.field278 && this.field281 < class115.method2906() - 60000L) {
            this.method180();
        }
    }

    @ObfuscatedName("j.d(B)Z")
    public boolean method181() {
        return this.field278;
    }
}
