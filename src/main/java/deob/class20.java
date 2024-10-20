package deob;

import java.io.EOFException;

@ObfuscatedName("t")
public class class20 {

    @ObfuscatedName("t.w")
    public boolean[] field287 = new boolean[this.field281.length];

    @ObfuscatedName("t.d")
    public boolean[] field280;

    @ObfuscatedName("t.z")
    public int[] field281 = new int[Statics.field3213.method3088(19)];

    @ObfuscatedName("t.l")
    public String[] field284 = new String[Statics.field3213.method3088(15)];

    @ObfuscatedName("t.m")
    public boolean field283 = false;

    @ObfuscatedName("t.p")
    public long field279;

    public class20() {
        for (int var1 = 0; var1 < this.field281.length; var1++) {
            class46 var2 = (class46) class46.field1043.method3529((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1048.method3112(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method952(new class119(var4));
                }
                class46.field1043.method3528(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field287[var1] = var3.field1045;
        }
        this.field280 = new boolean[this.field284.length];
        for (int var7 = 0; var7 < this.field284.length; var7++) {
            class50 var8 = class50.method2690(var7);
            this.field280[var7] = var8.field1090;
        }
        for (int var9 = 0; var9 < this.field281.length; var9++) {
            this.field281[var9] = -1;
        }
        this.method211();
    }

    @ObfuscatedName("t.g(IIS)V")
    public void method204(int arg0, int arg1) {
        this.field281[arg0] = arg1;
        if (this.field287[arg0]) {
            this.field283 = true;
        }
    }

    @ObfuscatedName("t.b(II)I")
    public int method205(int arg0) {
        return this.field281[arg0];
    }

    @ObfuscatedName("t.w(ILjava/lang/String;I)V")
    public void method218(int arg0, String arg1) {
        this.field284[arg0] = arg1;
        if (this.field280[arg0]) {
            this.field283 = true;
        }
    }

    @ObfuscatedName("t.d(II)Ljava/lang/String;")
    public String method207(int arg0) {
        return this.field284[arg0];
    }

    @ObfuscatedName("t.z(I)V")
    public void method208() {
        for (int var1 = 0; var1 < this.field281.length; var1++) {
            if (!this.field287[var1]) {
                this.field281[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field284.length; var2++) {
            if (!this.field280[var2]) {
                this.field284[var2] = null;
            }
        }
    }

    @ObfuscatedName("t.l(ZI)Lhd;")
    public class227 method209(boolean arg0) {
        return class149.method736("2", Statics.field144.field2283, arg0);
    }

    @ObfuscatedName("t.m(I)V")
    public void method232() {
        class227 var1 = this.method209(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field281.length; var4++) {
                if (this.field287[var4] && this.field281[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field284.length; var6++) {
                if (this.field280[var6] && this.field284[var6] != null) {
                    var2 += 2 + class119.method50(this.field284[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2476(1);
            var7.method2349(var3);
            for (int var8 = 0; var8 < this.field281.length; var8++) {
                if (this.field287[var8] && this.field281[var8] != -1) {
                    var7.method2349(var8);
                    var7.method2351(this.field281[var8]);
                }
            }
            var7.method2349(var5);
            for (int var9 = 0; var9 < this.field284.length; var9++) {
                if (this.field280[var9] && this.field284[var9] != null) {
                    var7.method2349(var9);
                    var7.method2354(this.field284[var9]);
                }
            }
            var1.method3918(var7.field1986, 0, var7.field1977);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3900();
            } catch (Exception var20) {
            }
        }
        this.field283 = false;
        this.field279 = class115.method579();
    }

    @ObfuscatedName("t.p(I)V")
    public void method211() {
        class227 var1 = this.method209(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3908()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3902(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1986.length - var5.field1977 >= 1) {
                    int var7 = var5.method2362();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2376();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2376();
                        int var12 = var5.method2367();
                        if (this.field287[var11]) {
                            this.field281[var11] = var12;
                        }
                    }
                    int var13 = var5.method2376();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2376();
                        String var16 = var5.method2370();
                        if (this.field280[var15]) {
                            this.field284[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3900();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field283 = false;
    }

    @ObfuscatedName("t.u(B)V")
    public void method212() {
        if (this.field283 && this.field279 < class115.method579() - 60000L) {
            this.method232();
        }
    }

    @ObfuscatedName("t.c(I)Z")
    public boolean method213() {
        return this.field283;
    }
}
