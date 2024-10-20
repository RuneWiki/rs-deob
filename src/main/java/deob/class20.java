package deob;

import java.io.EOFException;

@ObfuscatedName("v")
public class class20 {

    @ObfuscatedName("v.x")
    public boolean[] field276 = new boolean[this.field278.length];

    @ObfuscatedName("v.b")
    public boolean[] field277;

    @ObfuscatedName("v.l")
    public int[] field278 = new int[Statics.field178.method3096(19)];

    @ObfuscatedName("v.d")
    public String[] field281 = new String[Statics.field178.method3096(15)];

    @ObfuscatedName("v.n")
    public boolean field280 = false;

    @ObfuscatedName("v.m")
    public long field282;

    public class20() {
        for (int var1 = 0; var1 < this.field278.length; var1++) {
            class46 var2 = class46.method693(var1);
            this.field276[var1] = var2.field1054;
        }
        this.field277 = new boolean[this.field281.length];
        for (int var3 = 0; var3 < this.field281.length; var3++) {
            class50 var4 = class50.method3316(var3);
            this.field277[var3] = var4.field1102;
        }
        for (int var5 = 0; var5 < this.field278.length; var5++) {
            this.field278[var5] = -1;
        }
        this.method211();
    }

    @ObfuscatedName("v.f(III)V")
    public void method204(int arg0, int arg1) {
        this.field278[arg0] = arg1;
        if (this.field276[arg0]) {
            this.field280 = true;
        }
    }

    @ObfuscatedName("v.u(II)I")
    public int method205(int arg0) {
        return this.field278[arg0];
    }

    @ObfuscatedName("v.x(ILjava/lang/String;I)V")
    public void method232(int arg0, String arg1) {
        this.field281[arg0] = arg1;
        if (this.field277[arg0]) {
            this.field280 = true;
        }
    }

    @ObfuscatedName("v.b(II)Ljava/lang/String;")
    public String method236(int arg0) {
        return this.field281[arg0];
    }

    @ObfuscatedName("v.l(B)V")
    public void method203() {
        for (int var1 = 0; var1 < this.field278.length; var1++) {
            if (!this.field276[var1]) {
                this.field278[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field281.length; var2++) {
            if (!this.field277[var2]) {
                this.field281[var2] = null;
            }
        }
    }

    @ObfuscatedName("v.d(ZB)Lhz;")
    public class228 method209(boolean arg0) {
        return class150.method869("2", Statics.field2131.field2281, arg0);
    }

    @ObfuscatedName("v.n(I)V")
    public void method220() {
        class228 var1 = this.method209(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field278.length; var4++) {
                if (this.field276[var4] && this.field278[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field281.length; var6++) {
                if (this.field277[var6] && this.field281[var6] != null) {
                    var2 += 2 + class120.method622(this.field281[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2485(1);
            var7.method2371(var3);
            for (int var8 = 0; var8 < this.field278.length; var8++) {
                if (this.field276[var8] && this.field278[var8] != -1) {
                    var7.method2371(var8);
                    var7.method2370(this.field278[var8]);
                }
            }
            var7.method2371(var5);
            for (int var9 = 0; var9 < this.field281.length; var9++) {
                if (this.field277[var9] && this.field281[var9] != null) {
                    var7.method2371(var9);
                    var7.method2376(this.field281[var9]);
                }
            }
            var1.method3883(var7.field2001, 0, var7.field1999);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3874();
            } catch (Exception var20) {
            }
        }
        this.field280 = false;
        this.field282 = class116.method2672();
    }

    @ObfuscatedName("v.m(I)V")
    public void method211() {
        class228 var1 = this.method209(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3875()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3871(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field2001.length - var5.field1999 >= 1) {
                    int var7 = var5.method2385();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2387();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2387();
                        int var12 = var5.method2527();
                        if (this.field276[var11]) {
                            this.field278[var11] = var12;
                        }
                    }
                    int var13 = var5.method2387();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2387();
                        String var16 = var5.method2499();
                        if (this.field277[var15]) {
                            this.field281[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3874();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field280 = false;
    }

    @ObfuscatedName("v.g(S)V")
    public void method212() {
        if (this.field280 && this.field282 < class116.method2672() - 60000L) {
            this.method220();
        }
    }

    @ObfuscatedName("v.s(B)Z")
    public boolean method219() {
        return this.field280;
    }
}
