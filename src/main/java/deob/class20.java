package deob;

import java.io.EOFException;

@ObfuscatedName("t")
public class class20 {

    @ObfuscatedName("t.e")
    public boolean[] field258 = new boolean[this.field260.length];

    @ObfuscatedName("t.o")
    public boolean[] field259;

    @ObfuscatedName("t.g")
    public int[] field260 = new int[Statics.field1232.method3099(19)];

    @ObfuscatedName("t.l")
    public String[] field257 = new String[Statics.field1232.method3099(15)];

    @ObfuscatedName("t.j")
    public boolean field267 = false;

    @ObfuscatedName("t.r")
    public long field263;

    public class20() {
        for (int var1 = 0; var1 < this.field260.length; var1++) {
            class48 var2 = (class48) class48.field1066.method3556((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1069.method3086(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method954(new class123(var4));
                }
                class48.field1066.method3562(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field258[var1] = var3.field1067;
        }
        this.field259 = new boolean[this.field257.length];
        for (int var7 = 0; var7 < this.field257.length; var7++) {
            class54 var8 = (class54) class54.field1164.method3556((long) var7);
            class54 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field584.method3086(15, var7);
                class54 var11 = new class54();
                if (var10 != null) {
                    var11.method1079(new class123(var10));
                }
                class54.field1164.method3562(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field259[var7] = var9.field1157;
        }
        for (int var13 = 0; var13 < this.field260.length; var13++) {
            this.field260[var13] = -1;
        }
        this.method220();
    }

    @ObfuscatedName("t.m(III)V")
    public void method187(int arg0, int arg1) {
        this.field260[arg0] = arg1;
        if (this.field258[arg0]) {
            this.field267 = true;
        }
    }

    @ObfuscatedName("t.w(IB)I")
    public int method186(int arg0) {
        return this.field260[arg0];
    }

    @ObfuscatedName("t.e(ILjava/lang/String;B)V")
    public void method189(int arg0, String arg1) {
        this.field257[arg0] = arg1;
        if (this.field259[arg0]) {
            this.field267 = true;
        }
    }

    @ObfuscatedName("t.o(II)Ljava/lang/String;")
    public String method190(int arg0) {
        return this.field257[arg0];
    }

    @ObfuscatedName("t.g(I)V")
    public void method191() {
        for (int var1 = 0; var1 < this.field260.length; var1++) {
            if (!this.field258[var1]) {
                this.field260[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field257.length; var2++) {
            if (!this.field259[var2]) {
                this.field257[var2] = null;
            }
        }
    }

    @ObfuscatedName("t.l(ZB)Lhz;")
    public class231 method192(boolean arg0) {
        return class153.method92("2", Statics.field1241.field2344, arg0);
    }

    @ObfuscatedName("t.j(I)V")
    public void method193() {
        class231 var1 = this.method192(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field260.length; var4++) {
                if (this.field258[var4] && this.field260[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field257.length; var6++) {
                if (this.field259[var6] && this.field257[var6] != null) {
                    var2 += 2 + class123.method1584(this.field257[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2399(1);
            var7.method2400(var3);
            for (int var8 = 0; var8 < this.field260.length; var8++) {
                if (this.field258[var8] && this.field260[var8] != -1) {
                    var7.method2400(var8);
                    var7.method2402(this.field260[var8]);
                }
            }
            var7.method2400(var5);
            for (int var9 = 0; var9 < this.field257.length; var9++) {
                if (this.field259[var9] && this.field257[var9] != null) {
                    var7.method2400(var9);
                    var7.method2405(this.field257[var9]);
                }
            }
            var1.method3938(var7.field2048, 0, var7.field2046);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3954();
            } catch (Exception var20) {
            }
        }
        this.field267 = false;
        this.field263 = class119.method3544();
    }

    @ObfuscatedName("t.r(I)V")
    public void method220() {
        class231 var1 = this.method192(false);
        try {
            byte[] var2 = new byte[(int) var1.method3945()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3941(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class123 var5 = new class123(var2);
            if (var5.field2048.length - var5.field2046 < 1) {
                return;
            }
            int var7 = var5.method2398();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2548();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2548();
                int var12 = var5.method2419();
                if (this.field258[var11]) {
                    this.field260[var11] = var12;
                }
            }
            int var13 = var5.method2548();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2548();
                String var16 = var5.method2422();
                if (this.field259[var15]) {
                    this.field257[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3954();
            } catch (Exception var29) {
            }
        }
        this.field267 = false;
    }

    @ObfuscatedName("t.x(B)V")
    public void method195() {
        if (this.field267 && this.field263 < class119.method3544() - 60000L) {
            this.method193();
        }
    }

    @ObfuscatedName("t.k(I)Z")
    public boolean method196() {
        return this.field267;
    }
}
