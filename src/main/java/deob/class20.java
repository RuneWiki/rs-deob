package deob;

import java.io.EOFException;

@ObfuscatedName("i")
public class class20 {

    @ObfuscatedName("i.v")
    public boolean[] field272 = new boolean[this.field274.length];

    @ObfuscatedName("i.l")
    public boolean[] field273;

    @ObfuscatedName("i.y")
    public int[] field274 = new int[Statics.field410.method3101(19)];

    @ObfuscatedName("i.w")
    public String[] field275 = new String[Statics.field410.method3101(15)];

    @ObfuscatedName("i.u")
    public boolean field276 = false;

    @ObfuscatedName("i.a")
    public long field277;

    public class20() {
        for (int var1 = 0; var1 < this.field274.length; var1++) {
            class46 var2 = class46.method2839(var1);
            this.field272[var1] = var2.field1049;
        }
        this.field273 = new boolean[this.field275.length];
        for (int var3 = 0; var3 < this.field275.length; var3++) {
            class50 var4 = class50.method579(var3);
            this.field273[var3] = var4.field1099;
        }
        for (int var5 = 0; var5 < this.field274.length; var5++) {
            this.field274[var5] = -1;
        }
        this.method211();
    }

    @ObfuscatedName("i.d(III)V")
    public void method204(int arg0, int arg1) {
        this.field274[arg0] = arg1;
        if (this.field272[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("i.p(IB)I")
    public int method237(int arg0) {
        return this.field274[arg0];
    }

    @ObfuscatedName("i.v(ILjava/lang/String;B)V")
    public void method239(int arg0, String arg1) {
        this.field275[arg0] = arg1;
        if (this.field273[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("i.l(II)Ljava/lang/String;")
    public String method207(int arg0) {
        return this.field275[arg0];
    }

    @ObfuscatedName("i.y(I)V")
    public void method215() {
        for (int var1 = 0; var1 < this.field274.length; var1++) {
            if (!this.field272[var1]) {
                this.field274[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field275.length; var2++) {
            if (!this.field273[var2]) {
                this.field275[var2] = null;
            }
        }
    }

    @ObfuscatedName("i.w(ZB)Lhv;")
    public class227 method228(boolean arg0) {
        return class149.method1954("2", Statics.field395.field2251, arg0);
    }

    @ObfuscatedName("i.u(I)V")
    public void method209() {
        class227 var1 = this.method228(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field274.length; var4++) {
                if (this.field272[var4] && this.field274[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field275.length; var6++) {
                if (this.field273[var6] && this.field275[var6] != null) {
                    var2 += 2 + class119.method2041(this.field275[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2388(1);
            var7.method2343(var3);
            for (int var8 = 0; var8 < this.field274.length; var8++) {
                if (this.field272[var8] && this.field274[var8] != -1) {
                    var7.method2343(var8);
                    var7.method2345(this.field274[var8]);
                }
            }
            var7.method2343(var5);
            for (int var9 = 0; var9 < this.field275.length; var9++) {
                if (this.field273[var9] && this.field275[var9] != null) {
                    var7.method2343(var9);
                    var7.method2348(this.field275[var9]);
                }
            }
            var1.method3931(var7.field1973, 0, var7.field1966);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3927();
            } catch (Exception var20) {
            }
        }
        this.field276 = false;
        this.field277 = class115.method2142();
    }

    @ObfuscatedName("i.a(B)V")
    public void method211() {
        class227 var1 = this.method228(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3912()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3910(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1973.length - var5.field1966 >= 1) {
                    int var7 = var5.method2357();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2359();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2359();
                            int var12 = var5.method2362();
                            if (this.field272[var11]) {
                                this.field274[var11] = var12;
                            }
                        }
                        int var13 = var5.method2359();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2359();
                            String var16 = var5.method2365();
                            if (this.field273[var15]) {
                                this.field275[var15] = var16;
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
                    var1.method3927();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field276 = false;
    }

    @ObfuscatedName("i.e(I)V")
    public void method212() {
        if (this.field276 && this.field277 < class115.method2142() - 60000L) {
            this.method209();
        }
    }

    @ObfuscatedName("i.b(I)Z")
    public boolean method213() {
        return this.field276;
    }
}
