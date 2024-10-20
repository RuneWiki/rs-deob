package deob;

import java.io.EOFException;

@ObfuscatedName("u")
public class class20 {

    @ObfuscatedName("u.q")
    public boolean[] field291 = new boolean[this.field288.length];

    @ObfuscatedName("u.o")
    public boolean[] field278;

    @ObfuscatedName("u.g")
    public int[] field288 = new int[Statics.field1971.method3085(19)];

    @ObfuscatedName("u.m")
    public String[] field289 = new String[Statics.field1971.method3085(15)];

    @ObfuscatedName("u.b")
    public boolean field281 = false;

    @ObfuscatedName("u.p")
    public long field279;

    public class20() {
        for (int var1 = 0; var1 < this.field288.length; var1++) {
            class46 var2 = class46.method2789(var1);
            this.field291[var1] = var2.field1041;
        }
        this.field278 = new boolean[this.field289.length];
        for (int var3 = 0; var3 < this.field289.length; var3++) {
            class50 var4 = (class50) class50.field1075.method3478((long) var3);
            class50 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field1080.method3050(15, var3);
                class50 var7 = new class50();
                if (var6 != null) {
                    var7.method998(new class119(var6));
                }
                class50.field1075.method3479(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field278[var3] = var5.field1076;
        }
        for (int var9 = 0; var9 < this.field288.length; var9++) {
            this.field288[var9] = -1;
        }
        this.method204();
    }

    @ObfuscatedName("u.l(III)V")
    public void method197(int arg0, int arg1) {
        this.field288[arg0] = arg1;
        if (this.field291[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("u.e(II)I")
    public int method198(int arg0) {
        return this.field288[arg0];
    }

    @ObfuscatedName("u.q(ILjava/lang/String;I)V")
    public void method199(int arg0, String arg1) {
        this.field289[arg0] = arg1;
        if (this.field278[arg0]) {
            this.field281 = true;
        }
    }

    @ObfuscatedName("u.o(II)Ljava/lang/String;")
    public String method200(int arg0) {
        return this.field289[arg0];
    }

    @ObfuscatedName("u.g(B)V")
    public void method213() {
        for (int var1 = 0; var1 < this.field288.length; var1++) {
            if (!this.field291[var1]) {
                this.field288[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field289.length; var2++) {
            if (!this.field278[var2]) {
                this.field289[var2] = null;
            }
        }
    }

    @ObfuscatedName("u.m(ZI)Lhg;")
    public class227 method202(boolean arg0) {
        return class149.method1596("2", Statics.field2613.field2277, arg0);
    }

    @ObfuscatedName("u.b(I)V")
    public void method203() {
        class227 var1 = this.method202(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field288.length; var4++) {
                if (this.field291[var4] && this.field288[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field289.length; var6++) {
                if (this.field278[var6] && this.field289[var6] != null) {
                    var2 += 2 + class119.method156(this.field289[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2503(1);
            var7.method2374(var3);
            for (int var8 = 0; var8 < this.field288.length; var8++) {
                if (this.field291[var8] && this.field288[var8] != -1) {
                    var7.method2374(var8);
                    var7.method2376(this.field288[var8]);
                }
            }
            var7.method2374(var5);
            for (int var9 = 0; var9 < this.field289.length; var9++) {
                if (this.field278[var9] && this.field289[var9] != null) {
                    var7.method2374(var9);
                    var7.method2379(this.field289[var9]);
                }
            }
            var1.method3829(var7.field1986, 0, var7.field1988);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3817();
            } catch (Exception var20) {
            }
        }
        this.field281 = false;
        this.field279 = class115.method2266();
    }

    @ObfuscatedName("u.p(I)V")
    public void method204() {
        class227 var1 = this.method202(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3816()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3812(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1986.length - var5.field1988 >= 1) {
                    int var7 = var5.method2388();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2440();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2440();
                            int var12 = var5.method2393();
                            if (this.field291[var11]) {
                                this.field288[var11] = var12;
                            }
                        }
                        int var13 = var5.method2440();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2440();
                            String var16 = var5.method2396();
                            if (this.field278[var15]) {
                                this.field289[var15] = var16;
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
                    var1.method3817();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field281 = false;
    }

    @ObfuscatedName("u.t(I)V")
    public void method205() {
        if (this.field281 && this.field279 < class115.method2266() - 60000L) {
            this.method203();
        }
    }

    @ObfuscatedName("u.w(I)Z")
    public boolean method229() {
        return this.field281;
    }
}
