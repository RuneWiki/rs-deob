package deob;

import java.io.EOFException;

@ObfuscatedName("z")
public class class20 {

    @ObfuscatedName("z.e")
    public boolean[] field290 = new boolean[this.field292.length];

    @ObfuscatedName("z.g")
    public boolean[] field288;

    @ObfuscatedName("z.n")
    public int[] field292 = new int[Statics.field234.method3093(19)];

    @ObfuscatedName("z.u")
    public String[] field295 = new String[Statics.field234.method3093(15)];

    @ObfuscatedName("z.d")
    public boolean field291 = false;

    @ObfuscatedName("z.l")
    public long field294;

    public class20() {
        for (int var1 = 0; var1 < this.field292.length; var1++) {
            class48 var2 = (class48) class48.field1064.method3541((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1065.method3086(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method947(new class123(var4));
                }
                class48.field1064.method3532(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field290[var1] = var3.field1066;
        }
        this.field288 = new boolean[this.field295.length];
        for (int var7 = 0; var7 < this.field295.length; var7++) {
            class54 var8 = (class54) class54.field1147.method3541((long) var7);
            class54 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1148.method3086(15, var7);
                class54 var11 = new class54();
                if (var10 != null) {
                    var11.method1056(new class123(var10));
                }
                class54.field1147.method3532(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field288[var7] = var9.field1152;
        }
        for (int var13 = 0; var13 < this.field292.length; var13++) {
            this.field292[var13] = -1;
        }
        this.method202();
    }

    @ObfuscatedName("z.i(III)V")
    public void method210(int arg0, int arg1) {
        this.field292[arg0] = arg1;
        if (this.field290[arg0]) {
            this.field291 = true;
        }
    }

    @ObfuscatedName("z.h(II)I")
    public int method216(int arg0) {
        return this.field292[arg0];
    }

    @ObfuscatedName("z.e(ILjava/lang/String;I)V")
    public void method197(int arg0, String arg1) {
        this.field295[arg0] = arg1;
        if (this.field288[arg0]) {
            this.field291 = true;
        }
    }

    @ObfuscatedName("z.g(II)Ljava/lang/String;")
    public String method195(int arg0) {
        return this.field295[arg0];
    }

    @ObfuscatedName("z.n(I)V")
    public void method199() {
        for (int var1 = 0; var1 < this.field292.length; var1++) {
            if (!this.field290[var1]) {
                this.field292[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field295.length; var2++) {
            if (!this.field288[var2]) {
                this.field295[var2] = null;
            }
        }
    }

    @ObfuscatedName("z.u(ZB)Lhi;")
    public class231 method221(boolean arg0) {
        return class153.method2958("2", Statics.field2005.field2342, arg0);
    }

    @ObfuscatedName("z.d(I)V")
    public void method201() {
        class231 var1 = this.method221(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field292.length; var4++) {
                if (this.field290[var4] && this.field292[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field295.length; var6++) {
                if (this.field288[var6] && this.field295[var6] != null) {
                    var2 += 2 + class123.method538(this.field295[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2389(1);
            var7.method2561(var3);
            for (int var8 = 0; var8 < this.field292.length; var8++) {
                if (this.field290[var8] && this.field292[var8] != -1) {
                    var7.method2561(var8);
                    var7.method2569(this.field292[var8]);
                }
            }
            var7.method2561(var5);
            for (int var9 = 0; var9 < this.field295.length; var9++) {
                if (this.field288[var9] && this.field295[var9] != null) {
                    var7.method2561(var9);
                    var7.method2395(this.field295[var9]);
                }
            }
            var1.method3901(var7.field2049, 0, var7.field2046);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3904();
            } catch (Exception var20) {
            }
        }
        this.field291 = false;
        this.field294 = class119.method719();
    }

    @ObfuscatedName("z.l(I)V")
    public void method202() {
        class231 var1 = this.method221(false);
        try {
            byte[] var2 = new byte[(int) var1.method3908()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method3905(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class123 var5 = new class123(var2);
            if (var5.field2049.length - var5.field2046 < 1) {
                return;
            }
            int var7 = var5.method2404();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2406();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2406();
                int var12 = var5.method2409();
                if (this.field290[var11]) {
                    this.field292[var11] = var12;
                }
            }
            int var13 = var5.method2406();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2406();
                String var16 = var5.method2412();
                if (this.field288[var15]) {
                    this.field295[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method3904();
            } catch (Exception var29) {
            }
        }
        this.field291 = false;
    }

    @ObfuscatedName("z.m(I)V")
    public void method217() {
        if (this.field291 && this.field294 < class119.method719() - 60000L) {
            this.method201();
        }
    }

    @ObfuscatedName("z.j(I)Z")
    public boolean method227() {
        return this.field291;
    }
}
