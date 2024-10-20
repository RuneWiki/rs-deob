package deob;

import java.io.EOFException;

@ObfuscatedName("y")
public class class20 {

    @ObfuscatedName("y.v")
    public boolean[] field268 = new boolean[this.field271.length];

    @ObfuscatedName("y.r")
    public boolean[] field269;

    @ObfuscatedName("y.z")
    public int[] field271 = new int[Statics.field2719.method3127(19)];

    @ObfuscatedName("y.t")
    public String[] field276 = new String[Statics.field2719.method3127(15)];

    @ObfuscatedName("y.n")
    public boolean field272 = false;

    @ObfuscatedName("y.i")
    public long field273;

    public class20() {
        for (int var1 = 0; var1 < this.field271.length; var1++) {
            class48 var2 = (class48) class48.field1064.method3544((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1065.method3117(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method959(new class123(var4));
                }
                class48.field1064.method3546(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field268[var1] = var3.field1072;
        }
        this.field269 = new boolean[this.field276.length];
        for (int var7 = 0; var7 < this.field276.length; var7++) {
            class54 var8 = (class54) class54.field1165.method3544((long) var7);
            class54 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1156.method3117(15, var7);
                class54 var11 = new class54();
                if (var10 != null) {
                    var11.method1082(new class123(var10));
                }
                class54.field1165.method3546(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field269[var7] = var9.field1158;
        }
        for (int var13 = 0; var13 < this.field271.length; var13++) {
            this.field271[var13] = -1;
        }
        this.method201();
    }

    @ObfuscatedName("y.a(IIB)V")
    public void method211(int arg0, int arg1) {
        this.field271[arg0] = arg1;
        if (this.field268[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("y.d(IS)I")
    public int method197(int arg0) {
        return this.field271[arg0];
    }

    @ObfuscatedName("y.v(ILjava/lang/String;I)V")
    public void method198(int arg0, String arg1) {
        this.field276[arg0] = arg1;
        if (this.field269[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("y.r(IB)Ljava/lang/String;")
    public String method199(int arg0) {
        return this.field276[arg0];
    }

    @ObfuscatedName("y.z(B)V")
    public void method200() {
        for (int var1 = 0; var1 < this.field271.length; var1++) {
            if (!this.field268[var1]) {
                this.field271[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field276.length; var2++) {
            if (!this.field269[var2]) {
                this.field276[var2] = null;
            }
        }
    }

    @ObfuscatedName("y.t(ZI)Lht;")
    public class231 method225(boolean arg0) {
        return class153.method2099("2", Statics.field549.field2348, arg0);
    }

    @ObfuscatedName("y.n(B)V")
    public void method202() {
        class231 var1 = this.method225(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field271.length; var4++) {
                if (this.field268[var4] && this.field271[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field276.length; var6++) {
                if (this.field269[var6] && this.field276[var6] != null) {
                    var2 += 2 + class123.method224(this.field276[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2380(1);
            var7.method2381(var3);
            for (int var8 = 0; var8 < this.field271.length; var8++) {
                if (this.field268[var8] && this.field271[var8] != -1) {
                    var7.method2381(var8);
                    var7.method2467(this.field271[var8]);
                }
            }
            var7.method2381(var5);
            for (int var9 = 0; var9 < this.field276.length; var9++) {
                if (this.field269[var9] && this.field276[var9] != null) {
                    var7.method2381(var9);
                    var7.method2386(this.field276[var9]);
                }
            }
            var1.method3932(var7.field2076, 0, var7.field2071);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3954();
            } catch (Exception var20) {
            }
        }
        this.field272 = false;
        this.field273 = class119.method64();
    }

    @ObfuscatedName("y.i(B)V")
    public void method201() {
        class231 var1 = this.method225(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method3937()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3935(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2076.length - var5.field2071 >= 1) {
                    int var7 = var5.method2395();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2584();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2584();
                            int var12 = var5.method2400();
                            if (this.field268[var11]) {
                                this.field271[var11] = var12;
                            }
                        }
                        int var13 = var5.method2584();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2584();
                            String var16 = var5.method2397();
                            if (this.field269[var15]) {
                                this.field276[var15] = var16;
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
                    var1.method3954();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field272 = false;
    }

    @ObfuscatedName("y.g(I)V")
    public void method195() {
        if (this.field272 && this.field273 < class119.method64() - 60000L) {
            this.method202();
        }
    }

    @ObfuscatedName("y.m(I)Z")
    public boolean method204() {
        return this.field272;
    }
}
