package deob;

import java.io.EOFException;

@ObfuscatedName("u")
public class class20 {

    @ObfuscatedName("u.q")
    public boolean[] field285 = new boolean[this.field292.length];

    @ObfuscatedName("u.g")
    public boolean[] field286;

    @ObfuscatedName("u.m")
    public int[] field292 = new int[Statics.field140.method3047(19)];

    @ObfuscatedName("u.t")
    public String[] field283 = new String[Statics.field140.method3047(15)];

    @ObfuscatedName("u.j")
    public boolean field289 = false;

    @ObfuscatedName("u.n")
    public long field290;

    public class20() {
        for (int var1 = 0; var1 < this.field292.length; var1++) {
            class46 var2 = class46.method3261(var1);
            this.field285[var1] = var2.field1046;
        }
        this.field286 = new boolean[this.field283.length];
        for (int var3 = 0; var3 < this.field283.length; var3++) {
            class50 var4 = class50.method937(var3);
            this.field286[var3] = var4.field1093;
        }
        for (int var5 = 0; var5 < this.field292.length; var5++) {
            this.field292[var5] = -1;
        }
        this.method197();
    }

    @ObfuscatedName("u.f(III)V")
    public void method219(int arg0, int arg1) {
        this.field292[arg0] = arg1;
        if (this.field285[arg0]) {
            this.field289 = true;
        }
    }

    @ObfuscatedName("u.s(IB)I")
    public int method192(int arg0) {
        return this.field292[arg0];
    }

    @ObfuscatedName("u.q(ILjava/lang/String;B)V")
    public void method193(int arg0, String arg1) {
        this.field283[arg0] = arg1;
        if (this.field286[arg0]) {
            this.field289 = true;
        }
    }

    @ObfuscatedName("u.g(IB)Ljava/lang/String;")
    public String method199(int arg0) {
        return this.field283[arg0];
    }

    @ObfuscatedName("u.m(I)V")
    public void method194() {
        for (int var1 = 0; var1 < this.field292.length; var1++) {
            if (!this.field285[var1]) {
                this.field292[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field283.length; var2++) {
            if (!this.field286[var2]) {
                this.field283[var2] = null;
            }
        }
    }

    @ObfuscatedName("u.t(ZI)Lhn;")
    public class227 method195(boolean arg0) {
        return class149.method697("2", Statics.field1974.field2270, arg0);
    }

    @ObfuscatedName("u.j(I)V")
    public void method196() {
        class227 var1 = this.method195(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field292.length; var4++) {
                if (this.field285[var4] && this.field292[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field283.length; var6++) {
                if (this.field286[var6] && this.field283[var6] != null) {
                    var2 += 2 + class119.method1572(this.field283[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2426(1);
            var7.method2349(var3);
            for (int var8 = 0; var8 < this.field292.length; var8++) {
                if (this.field285[var8] && this.field292[var8] != -1) {
                    var7.method2349(var8);
                    var7.method2351(this.field292[var8]);
                }
            }
            var7.method2349(var5);
            for (int var9 = 0; var9 < this.field283.length; var9++) {
                if (this.field286[var9] && this.field283[var9] != null) {
                    var7.method2349(var9);
                    var7.method2354(this.field283[var9]);
                }
            }
            var1.method3846(var7.field2000, 0, var7.field1994);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3859();
            } catch (Exception var20) {
            }
        }
        this.field289 = false;
        this.field290 = class115.method645();
    }

    @ObfuscatedName("u.n(B)V")
    public void method197() {
        class227 var1 = this.method195(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3858()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3857(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field2000.length - var5.field1994 >= 1) {
                    int var7 = var5.method2363();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2353();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2353();
                        int var12 = var5.method2368();
                        if (this.field285[var11]) {
                            this.field292[var11] = var12;
                        }
                    }
                    int var13 = var5.method2353();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2353();
                        String var16 = var5.method2365();
                        if (this.field286[var15]) {
                            this.field283[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3859();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field289 = false;
    }

    @ObfuscatedName("u.l(I)V")
    public void method198() {
        if (this.field289 && this.field290 < class115.method645() - 60000L) {
            this.method196();
        }
    }

    @ObfuscatedName("u.i(B)Z")
    public boolean method225() {
        return this.field289;
    }
}
