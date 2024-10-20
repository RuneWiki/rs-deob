package deob;

import java.io.EOFException;

@ObfuscatedName("cn")
public class class96 {

    @ObfuscatedName("cn.y")
    public boolean[] field1418 = new boolean[this.field1420.length];

    @ObfuscatedName("cn.r")
    public boolean[] field1419;

    @ObfuscatedName("cn.h")
    public int[] field1420 = new int[Statics.field2664.method3921(19)];

    @ObfuscatedName("cn.d")
    public String[] field1421 = new String[Statics.field2664.method3921(15)];

    @ObfuscatedName("cn.s")
    public boolean field1422 = false;

    @ObfuscatedName("cn.b")
    public long field1423;

    public class96() {
        for (int var1 = 0; var1 < this.field1420.length; var1++) {
            class255 var2 = class255.method3900(var1);
            this.field1418[var1] = var2.field3407;
        }
        this.field1419 = new boolean[this.field1421.length];
        for (int var3 = 0; var3 < this.field1421.length; var3++) {
            class256 var4 = (class256) class256.field3411.method3407((long) var3);
            class256 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field318.method3931(15, var3);
                class256 var7 = new class256();
                if (var6 != null) {
                    var7.method4113(new class185(var6));
                }
                class256.field3411.method3408(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1419[var3] = var5.field3412;
        }
        for (int var9 = 0; var9 < this.field1420.length; var9++) {
            this.field1420[var9] = -1;
        }
        this.method1695();
    }

    @ObfuscatedName("cn.n(III)V")
    public void method1697(int arg0, int arg1) {
        this.field1420[arg0] = arg1;
        if (this.field1418[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cn.v(II)I")
    public int method1676(int arg0) {
        return this.field1420[arg0];
    }

    @ObfuscatedName("cn.y(ILjava/lang/String;I)V")
    public void method1677(int arg0, String arg1) {
        this.field1421[arg0] = arg1;
        if (this.field1419[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cn.r(II)Ljava/lang/String;")
    public String method1688(int arg0) {
        return this.field1421[arg0];
    }

    @ObfuscatedName("cn.h(I)V")
    public void method1679() {
        for (int var1 = 0; var1 < this.field1420.length; var1++) {
            if (!this.field1418[var1]) {
                this.field1420[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1421.length; var2++) {
            if (!this.field1419[var2]) {
                this.field1421[var2] = null;
            }
        }
    }

    @ObfuscatedName("cn.d(ZI)Ldg;")
    public class124 method1680(boolean arg0) {
        return class158.method44("2", Statics.field19.field3296, arg0);
    }

    @ObfuscatedName("cn.s(I)V")
    public void method1681() {
        class124 var1 = this.method1680(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1420.length; var4++) {
                if (this.field1418[var4] && this.field1420[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1421.length; var6++) {
                if (this.field1419[var6] && this.field1421[var6] != null) {
                    var2 += 2 + class185.method166(this.field1421[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3157(1);
            var7.method3006(var3);
            for (int var8 = 0; var8 < this.field1420.length; var8++) {
                if (this.field1418[var8] && this.field1420[var8] != -1) {
                    var7.method3006(var8);
                    var7.method3005(this.field1420[var8]);
                }
            }
            var7.method3006(var5);
            for (int var9 = 0; var9 < this.field1421.length; var9++) {
                if (this.field1419[var9] && this.field1421[var9] != null) {
                    var7.method3006(var9);
                    var7.method3012(this.field1421[var9]);
                }
            }
            var1.method2194(var7.field2528, 0, var7.field2529);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2195();
            } catch (Exception var20) {
            }
        }
        this.field1422 = false;
        this.field1423 = class187.method938();
    }

    @ObfuscatedName("cn.b(B)V")
    public void method1695() {
        class124 var1 = this.method1680(false);
        try {
            byte[] var2 = new byte[(int) var1.method2208()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method2203(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class185 var5 = new class185(var2);
            if (var5.field2528.length - var5.field2529 < 1) {
                return;
            }
            int var7 = var5.method3021();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method3015();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method3015();
                int var12 = var5.method3026();
                if (this.field1418[var11]) {
                    this.field1420[var11] = var12;
                }
            }
            int var13 = var5.method3015();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method3015();
                String var16 = var5.method3030();
                if (this.field1419[var15]) {
                    this.field1421[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method2195();
            } catch (Exception var29) {
            }
        }
        this.field1422 = false;
    }

    @ObfuscatedName("cn.e(I)V")
    public void method1683() {
        if (this.field1422 && this.field1423 < class187.method938() - 60000L) {
            this.method1681();
        }
    }

    @ObfuscatedName("cn.f(I)Z")
    public boolean method1684() {
        return this.field1422;
    }
}
