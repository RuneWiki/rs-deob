package deob;

import java.io.EOFException;

@ObfuscatedName("u")
public class class20 {

    @ObfuscatedName("u.s")
    public boolean[] field261 = new boolean[this.field263.length];

    @ObfuscatedName("u.q")
    public boolean[] field266;

    @ObfuscatedName("u.j")
    public int[] field263 = new int[Statics.field1594.method3020(19)];

    @ObfuscatedName("u.k")
    public String[] field260 = new String[Statics.field1594.method3020(15)];

    @ObfuscatedName("u.i")
    public boolean field265 = false;

    @ObfuscatedName("u.m")
    public long field264;

    public class20() {
        for (int var1 = 0; var1 < this.field263.length; var1++) {
            class46 var2 = class46.method694(var1);
            this.field261[var1] = var2.field1024;
        }
        this.field266 = new boolean[this.field260.length];
        for (int var3 = 0; var3 < this.field260.length; var3++) {
            class50 var4 = class50.method640(var3);
            this.field266[var3] = var4.field1078;
        }
        for (int var5 = 0; var5 < this.field263.length; var5++) {
            this.field263[var5] = -1;
        }
        this.method185();
    }

    @ObfuscatedName("u.n(IIB)V")
    public void method178(int arg0, int arg1) {
        this.field263[arg0] = arg1;
        if (this.field261[arg0]) {
            this.field265 = true;
        }
    }

    @ObfuscatedName("u.d(II)I")
    public int method179(int arg0) {
        return this.field263[arg0];
    }

    @ObfuscatedName("u.s(ILjava/lang/String;B)V")
    public void method180(int arg0, String arg1) {
        this.field260[arg0] = arg1;
        if (this.field266[arg0]) {
            this.field265 = true;
        }
    }

    @ObfuscatedName("u.q(II)Ljava/lang/String;")
    public String method181(int arg0) {
        return this.field260[arg0];
    }

    @ObfuscatedName("u.j(I)V")
    public void method182() {
        for (int var1 = 0; var1 < this.field263.length; var1++) {
            if (!this.field261[var1]) {
                this.field263[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field260.length; var2++) {
            if (!this.field266[var2]) {
                this.field260[var2] = null;
            }
        }
    }

    @ObfuscatedName("u.k(ZI)Lhz;")
    public class227 method204(boolean arg0) {
        return class149.method1921("2", Statics.field276.field2270, arg0);
    }

    @ObfuscatedName("u.i(I)V")
    public void method203() {
        class227 var1 = this.method204(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field263.length; var4++) {
                if (this.field261[var4] && this.field263[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field260.length; var6++) {
                if (this.field266[var6] && this.field260[var6] != null) {
                    var2 += 2 + class119.method2648(this.field260[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2323(1);
            var7.method2324(var3);
            for (int var8 = 0; var8 < this.field263.length; var8++) {
                if (this.field261[var8] && this.field263[var8] != -1) {
                    var7.method2324(var8);
                    var7.method2326(this.field263[var8]);
                }
            }
            var7.method2324(var5);
            for (int var9 = 0; var9 < this.field260.length; var9++) {
                if (this.field266[var9] && this.field260[var9] != null) {
                    var7.method2324(var9);
                    var7.method2329(this.field260[var9]);
                }
            }
            var1.method3831(var7.field1981, 0, var7.field1977);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3832();
            } catch (Exception var20) {
            }
        }
        this.field265 = false;
        this.field264 = class115.method1998();
    }

    @ObfuscatedName("u.m(I)V")
    public void method185() {
        class227 var1 = this.method204(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3833()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3835(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1981.length - var5.field1977 >= 1) {
                    int var7 = var5.method2338();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2377();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2377();
                        int var12 = var5.method2343();
                        if (this.field261[var11]) {
                            this.field263[var11] = var12;
                        }
                    }
                    int var13 = var5.method2377();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2377();
                        String var16 = var5.method2492();
                        if (this.field266[var15]) {
                            this.field260[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3832();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field265 = false;
    }

    @ObfuscatedName("u.p(B)V")
    public void method202() {
        if (this.field265 && this.field264 < class115.method1998() - 60000L) {
            this.method203();
        }
    }

    @ObfuscatedName("u.h(I)Z")
    public boolean method187() {
        return this.field265;
    }
}
