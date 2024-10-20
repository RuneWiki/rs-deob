package deob;

import java.io.EOFException;

@ObfuscatedName("u")
public class class20 {

    @ObfuscatedName("u.r")
    public boolean[] field269 = new boolean[this.field271.length];

    @ObfuscatedName("u.n")
    public boolean[] field270;

    @ObfuscatedName("u.x")
    public int[] field271 = new int[Statics.field684.method3044(19)];

    @ObfuscatedName("u.q")
    public String[] field268 = new String[Statics.field684.method3044(15)];

    @ObfuscatedName("u.h")
    public boolean field276 = false;

    @ObfuscatedName("u.d")
    public long field274;

    public class20() {
        for (int var1 = 0; var1 < this.field271.length; var1++) {
            class46 var2 = class46.method646(var1);
            this.field269[var1] = var2.field1037;
        }
        this.field270 = new boolean[this.field268.length];
        for (int var3 = 0; var3 < this.field268.length; var3++) {
            class50 var4 = (class50) class50.field1095.method3464((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1091.method3035(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method994(new class119(var6));
                }
                class50.field1095.method3466(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field270[var3] = var5.field1092;
        }
        for (int var9 = 0; var9 < this.field271.length; var9++) {
            this.field271[var9] = -1;
        }
        this.method208();
    }

    @ObfuscatedName("u.i(IIS)V")
    public void method182(int arg0, int arg1) {
        this.field271[arg0] = arg1;
        if (this.field269[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("u.v(II)I")
    public int method183(int arg0) {
        return this.field271[arg0];
    }

    @ObfuscatedName("u.r(ILjava/lang/String;I)V")
    public void method209(int arg0, String arg1) {
        this.field268[arg0] = arg1;
        if (this.field270[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("u.n(II)Ljava/lang/String;")
    public String method185(int arg0) {
        return this.field268[arg0];
    }

    @ObfuscatedName("u.x(B)V")
    public void method186() {
        for (int var1 = 0; var1 < this.field271.length; var1++) {
            if (!this.field269[var1]) {
                this.field271[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field268.length; var2++) {
            if (!this.field270[var2]) {
                this.field268[var2] = null;
            }
        }
    }

    @ObfuscatedName("u.q(ZI)Lhk;")
    public class227 method187(boolean arg0) {
        return class149.method681("2", Statics.field1360.field2276, arg0);
    }

    @ObfuscatedName("u.h(S)V")
    public void method184() {
        class227 var1 = this.method187(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field271.length; var4++) {
                if (this.field269[var4] && this.field271[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field268.length; var6++) {
                if (this.field270[var6] && this.field268[var6] != null) {
                    var2 += 2 + class119.method141(this.field268[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2436(1);
            var7.method2331(var3);
            for (int var8 = 0; var8 < this.field271.length; var8++) {
                if (this.field269[var8] && this.field271[var8] != -1) {
                    var7.method2331(var8);
                    var7.method2333(this.field271[var8]);
                }
            }
            var7.method2331(var5);
            for (int var9 = 0; var9 < this.field268.length; var9++) {
                if (this.field270[var9] && this.field268[var9] != null) {
                    var7.method2331(var9);
                    var7.method2336(this.field268[var9]);
                }
            }
            var1.method3813(var7.field1982, 0, var7.field1980);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3819();
            } catch (Exception var20) {
            }
        }
        this.field276 = false;
        this.field274 = class115.method2134();
    }

    @ObfuscatedName("u.d(I)V")
    public void method208() {
        class227 var1 = this.method187(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3815()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3816(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1982.length - var5.field1980 >= 1) {
                    int var7 = var5.method2380();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2347();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2347();
                        int var12 = var5.method2350();
                        if (this.field269[var11]) {
                            this.field271[var11] = var12;
                        }
                    }
                    int var13 = var5.method2347();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2347();
                        String var16 = var5.method2356();
                        if (this.field270[var15]) {
                            this.field268[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3819();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field276 = false;
    }

    @ObfuscatedName("u.c(I)V")
    public void method190() {
        if (this.field276 && this.field274 < class115.method2134() - 60000L) {
            this.method184();
        }
    }

    @ObfuscatedName("u.y(B)Z")
    public boolean method215() {
        return this.field276;
    }
}
