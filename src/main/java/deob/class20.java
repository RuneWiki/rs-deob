package deob;

import java.io.EOFException;

@ObfuscatedName("e")
public class class20 {

    @ObfuscatedName("e.k")
    public boolean[] field266 = new boolean[this.field275.length];

    @ObfuscatedName("e.f")
    public boolean[] field267;

    @ObfuscatedName("e.d")
    public int[] field275 = new int[Statics.field2900.method2996(19)];

    @ObfuscatedName("e.l")
    public String[] field269 = new String[Statics.field2900.method2996(15)];

    @ObfuscatedName("e.r")
    public boolean field270 = false;

    @ObfuscatedName("e.g")
    public long field271;

    public class20() {
        for (int var1 = 0; var1 < this.field275.length; var1++) {
            class46 var2 = class46.method532(var1);
            this.field266[var1] = var2.field1032;
        }
        this.field267 = new boolean[this.field269.length];
        for (int var3 = 0; var3 < this.field269.length; var3++) {
            class50 var4 = (class50) class50.field1084.method3439((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1082.method2986(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method963(new class119(var6));
                }
                class50.field1084.method3429(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field267[var3] = var5.field1083;
        }
        for (int var9 = 0; var9 < this.field275.length; var9++) {
            this.field275[var9] = -1;
        }
        this.method200();
    }

    @ObfuscatedName("e.z(III)V")
    public void method187(int arg0, int arg1) {
        this.field275[arg0] = arg1;
        if (this.field266[arg0]) {
            this.field270 = true;
        }
    }

    @ObfuscatedName("e.q(II)I")
    public int method191(int arg0) {
        return this.field275[arg0];
    }

    @ObfuscatedName("e.k(ILjava/lang/String;I)V")
    public void method189(int arg0, String arg1) {
        this.field269[arg0] = arg1;
        if (this.field267[arg0]) {
            this.field270 = true;
        }
    }

    @ObfuscatedName("e.f(IB)Ljava/lang/String;")
    public String method190(int arg0) {
        return this.field269[arg0];
    }

    @ObfuscatedName("e.d(I)V")
    public void method192() {
        for (int var1 = 0; var1 < this.field275.length; var1++) {
            if (!this.field266[var1]) {
                this.field275[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field269.length; var2++) {
            if (!this.field267[var2]) {
                this.field269[var2] = null;
            }
        }
    }

    @ObfuscatedName("e.l(ZI)Lhr;")
    public class227 method194(boolean arg0) {
        return class149.method2227("2", Statics.field284.field2283, arg0);
    }

    @ObfuscatedName("e.r(B)V")
    public void method193() {
        class227 var1 = this.method194(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field275.length; var4++) {
                if (this.field266[var4] && this.field275[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field269.length; var6++) {
                if (this.field267[var6] && this.field269[var6] != null) {
                    var2 += 2 + class119.method2618(this.field269[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2285(1);
            var7.method2287(var3);
            for (int var8 = 0; var8 < this.field275.length; var8++) {
                if (this.field266[var8] && this.field275[var8] != -1) {
                    var7.method2287(var8);
                    var7.method2289(this.field275[var8]);
                }
            }
            var7.method2287(var5);
            for (int var9 = 0; var9 < this.field269.length; var9++) {
                if (this.field267[var9] && this.field269[var9] != null) {
                    var7.method2287(var9);
                    var7.method2393(this.field269[var9]);
                }
            }
            var1.method3767(var7.field1987, 0, var7.field1986);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3769();
            } catch (Exception var20) {
            }
        }
        this.field270 = false;
        this.field271 = class115.method82();
    }

    @ObfuscatedName("e.g(I)V")
    public void method200() {
        class227 var1 = this.method194(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3770()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3771(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1987.length - var5.field1986 >= 1) {
                    int var7 = var5.method2457();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2415();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2415();
                            int var12 = var5.method2306();
                            if (this.field266[var11]) {
                                this.field275[var11] = var12;
                            }
                        }
                        int var13 = var5.method2415();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2415();
                            String var16 = var5.method2309();
                            if (this.field267[var15]) {
                                this.field269[var15] = var16;
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
                    var1.method3769();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field270 = false;
    }

    @ObfuscatedName("e.h(I)V")
    public void method195() {
        if (this.field270 && this.field271 < class115.method82() - 60000L) {
            this.method193();
        }
    }

    @ObfuscatedName("e.n(B)Z")
    public boolean method196() {
        return this.field270;
    }
}
