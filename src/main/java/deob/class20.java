package deob;

import java.io.EOFException;

@ObfuscatedName("e")
public class class20 {

    @ObfuscatedName("e.j")
    public boolean[] field269 = new boolean[this.field273.length];

    @ObfuscatedName("e.z")
    public boolean[] field274;

    @ObfuscatedName("e.i")
    public int[] field273 = new int[Statics.field645.method3088(19)];

    @ObfuscatedName("e.b")
    public String[] field275 = new String[Statics.field645.method3088(15)];

    @ObfuscatedName("e.l")
    public boolean field272 = false;

    @ObfuscatedName("e.m")
    public long field276;

    public class20() {
        for (int var1 = 0; var1 < this.field273.length; var1++) {
            class48 var2 = class48.method2331(var1);
            this.field269[var1] = var2.field1048;
        }
        this.field274 = new boolean[this.field275.length];
        for (int var3 = 0; var3 < this.field275.length; var3++) {
            class54 var4 = (class54) class54.field1135.method3533((long) var3);
            class54 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1134.method3079(15, var3);
                class54 var7 = new class54();
                if (var6 != null) {
                    var7.method1041(new class123(var6));
                }
                class54.field1135.method3535(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field274[var3] = var5.field1136;
        }
        for (int var9 = 0; var9 < this.field273.length; var9++) {
            this.field273[var9] = -1;
        }
        this.method209();
    }

    @ObfuscatedName("e.x(IIB)V")
    public void method195(int arg0, int arg1) {
        this.field273[arg0] = arg1;
        if (this.field269[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("e.r(II)I")
    public int method196(int arg0) {
        return this.field273[arg0];
    }

    @ObfuscatedName("e.j(ILjava/lang/String;I)V")
    public void method197(int arg0, String arg1) {
        this.field275[arg0] = arg1;
        if (this.field274[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("e.z(II)Ljava/lang/String;")
    public String method201(int arg0) {
        return this.field275[arg0];
    }

    @ObfuscatedName("e.i(B)V")
    public void method198() {
        for (int var1 = 0; var1 < this.field273.length; var1++) {
            if (!this.field269[var1]) {
                this.field273[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field275.length; var2++) {
            if (!this.field274[var2]) {
                this.field275[var2] = null;
            }
        }
    }

    @ObfuscatedName("e.b(ZI)Lhz;")
    public class231 method199(boolean arg0) {
        return class153.method2099("2", Statics.field776.field2340, arg0);
    }

    @ObfuscatedName("e.l(I)V")
    public void method200() {
        class231 var1 = this.method199(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field273.length; var4++) {
                if (this.field269[var4] && this.field273[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field275.length; var6++) {
                if (this.field274[var6] && this.field275[var6] != null) {
                    var2 += 2 + class123.method826(this.field275[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2567(1);
            var7.method2394(var3);
            for (int var8 = 0; var8 < this.field273.length; var8++) {
                if (this.field269[var8] && this.field273[var8] != -1) {
                    var7.method2394(var8);
                    var7.method2396(this.field273[var8]);
                }
            }
            var7.method2394(var5);
            for (int var9 = 0; var9 < this.field275.length; var9++) {
                if (this.field274[var9] && this.field275[var9] != null) {
                    var7.method2394(var9);
                    var7.method2468(this.field275[var9]);
                }
            }
            var1.method3879(var7.field2056, 0, var7.field2057);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3880();
            } catch (Exception var20) {
            }
        }
        this.field272 = false;
        this.field276 = class119.method698();
    }

    @ObfuscatedName("e.m(I)V")
    public void method209() {
        class231 var1 = this.method199(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3881()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3898(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2056.length - var5.field2057 < 1) {
                    return;
                }
                int var7 = var5.method2408();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2403();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2403();
                        int var12 = var5.method2413();
                        if (this.field269[var11]) {
                            this.field273[var11] = var12;
                        }
                    }
                    int var13 = var5.method2403();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2403();
                        String var16 = var5.method2626();
                        if (this.field274[var15]) {
                            this.field275[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3880();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field272 = false;
    }

    @ObfuscatedName("e.p(I)V")
    public void method202() {
        if (this.field272 && this.field276 < class119.method698() - 60000L) {
            this.method200();
        }
    }

    @ObfuscatedName("e.f(I)Z")
    public boolean method203() {
        return this.field272;
    }
}
