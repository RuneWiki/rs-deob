package deob;

import java.io.EOFException;

@ObfuscatedName("c")
public class class20 {

    @ObfuscatedName("c.t")
    public boolean[] field255 = new boolean[this.field259.length];

    @ObfuscatedName("c.y")
    public boolean[] field256;

    @ObfuscatedName("c.p")
    public int[] field259 = new int[Statics.field155.method3079(19)];

    @ObfuscatedName("c.g")
    public String[] field260 = new String[Statics.field155.method3079(15)];

    @ObfuscatedName("c.m")
    public boolean field258 = false;

    @ObfuscatedName("c.f")
    public long field262;

    public class20() {
        for (int var1 = 0; var1 < this.field259.length; var1++) {
            class48 var2 = (class48) class48.field1020.method3523((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1027.method3091(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method928(new class123(var4));
                }
                class48.field1020.method3521(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field255[var1] = var3.field1021;
        }
        this.field256 = new boolean[this.field260.length];
        for (int var7 = 0; var7 < this.field260.length; var7++) {
            class54 var8 = class54.method127(var7);
            this.field256[var7] = var8.field1122;
        }
        for (int var9 = 0; var9 < this.field259.length; var9++) {
            this.field259[var9] = -1;
        }
        this.method216();
    }

    @ObfuscatedName("c.s(IIB)V")
    public void method193(int arg0, int arg1) {
        this.field259[arg0] = arg1;
        if (this.field255[arg0]) {
            this.field258 = true;
        }
    }

    @ObfuscatedName("c.z(II)I")
    public int method194(int arg0) {
        return this.field259[arg0];
    }

    @ObfuscatedName("c.t(ILjava/lang/String;I)V")
    public void method195(int arg0, String arg1) {
        this.field260[arg0] = arg1;
        if (this.field256[arg0]) {
            this.field258 = true;
        }
    }

    @ObfuscatedName("c.y(IS)Ljava/lang/String;")
    public String method196(int arg0) {
        return this.field260[arg0];
    }

    @ObfuscatedName("c.p(B)V")
    public void method202() {
        for (int var1 = 0; var1 < this.field259.length; var1++) {
            if (!this.field255[var1]) {
                this.field259[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field260.length; var2++) {
            if (!this.field256[var2]) {
                this.field260[var2] = null;
            }
        }
    }

    @ObfuscatedName("c.g(ZB)Lhh;")
    public class231 method215(boolean arg0) {
        return class153.method930("2", Statics.field467.field2331, arg0);
    }

    @ObfuscatedName("c.m(I)V")
    public void method199() {
        class231 var1 = this.method215(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field259.length; var4++) {
                if (this.field255[var4] && this.field259[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field260.length; var6++) {
                if (this.field256[var6] && this.field260[var6] != null) {
                    var2 += 2 + class123.method2281(this.field260[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2349(1);
            var7.method2350(var3);
            for (int var8 = 0; var8 < this.field259.length; var8++) {
                if (this.field255[var8] && this.field259[var8] != -1) {
                    var7.method2350(var8);
                    var7.method2524(this.field259[var8]);
                }
            }
            var7.method2350(var5);
            for (int var9 = 0; var9 < this.field260.length; var9++) {
                if (this.field256[var9] && this.field260[var9] != null) {
                    var7.method2350(var9);
                    var7.method2354(this.field260[var9]);
                }
            }
            var1.method3894(var7.field2033, 0, var7.field2028);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3898();
            } catch (Exception var20) {
            }
        }
        this.field258 = false;
        this.field262 = class119.method2280();
    }

    @ObfuscatedName("c.f(I)V")
    public void method216() {
        class231 var1 = this.method215(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3900()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3897(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2033.length - var5.field2028 < 1) {
                    return;
                }
                int var7 = var5.method2363();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2550();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2550();
                        int var12 = var5.method2408();
                        if (this.field255[var11]) {
                            this.field259[var11] = var12;
                        }
                    }
                    int var13 = var5.method2550();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2550();
                        String var16 = var5.method2385();
                        if (this.field256[var15]) {
                            this.field260[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3898();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field258 = false;
    }

    @ObfuscatedName("c.k(I)V")
    public void method201() {
        if (this.field258 && this.field262 < class119.method2280() - 60000L) {
            this.method199();
        }
    }

    @ObfuscatedName("c.h(B)Z")
    public boolean method198() {
        return this.field258;
    }
}
