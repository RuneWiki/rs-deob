package deob;

import java.io.EOFException;

@ObfuscatedName("r")
public class class20 {

    @ObfuscatedName("r.n")
    public boolean[] field268 = new boolean[this.field270.length];

    @ObfuscatedName("r.t")
    public boolean[] field274;

    @ObfuscatedName("r.v")
    public int[] field270 = new int[Statics.field313.method3124(19)];

    @ObfuscatedName("r.b")
    public String[] field271 = new String[Statics.field313.method3124(15)];

    @ObfuscatedName("r.m")
    public boolean field272 = false;

    @ObfuscatedName("r.k")
    public long field267;

    public class20() {
        for (int var1 = 0; var1 < this.field270.length; var1++) {
            class48 var2 = (class48) class48.field1047.method3569((long) var1);
            class48 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1048.method3107(19, var1);
                class48 var5 = new class48();
                if (var4 != null) {
                    var5.method941(new class123(var4));
                }
                class48.field1047.method3571(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field268[var1] = var3.field1052;
        }
        this.field274 = new boolean[this.field271.length];
        for (int var7 = 0; var7 < this.field271.length; var7++) {
            class54 var8 = (class54) class54.field1138.method3569((long) var7);
            class54 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1139.method3107(15, var7);
                class54 var11 = new class54();
                if (var10 != null) {
                    var11.method1062(new class123(var10));
                }
                class54.field1138.method3571(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field274[var7] = var9.field1140;
        }
        for (int var13 = 0; var13 < this.field270.length; var13++) {
            this.field270[var13] = -1;
        }
        this.method205();
    }

    @ObfuscatedName("r.f(IIB)V")
    public void method191(int arg0, int arg1) {
        this.field270[arg0] = arg1;
        if (this.field268[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("r.e(II)I")
    public int method192(int arg0) {
        return this.field270[arg0];
    }

    @ObfuscatedName("r.n(ILjava/lang/String;I)V")
    public void method197(int arg0, String arg1) {
        this.field271[arg0] = arg1;
        if (this.field274[arg0]) {
            this.field272 = true;
        }
    }

    @ObfuscatedName("r.t(II)Ljava/lang/String;")
    public String method220(int arg0) {
        return this.field271[arg0];
    }

    @ObfuscatedName("r.v(B)V")
    public void method194() {
        for (int var1 = 0; var1 < this.field270.length; var1++) {
            if (!this.field268[var1]) {
                this.field270[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field271.length; var2++) {
            if (!this.field274[var2]) {
                this.field271[var2] = null;
            }
        }
    }

    @ObfuscatedName("r.b(ZB)Lhl;")
    public class231 method195(boolean arg0) {
        return class153.method767("2", Statics.field2677.field2333, arg0);
    }

    @ObfuscatedName("r.m(S)V")
    public void method196() {
        class231 var1 = this.method195(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field270.length; var4++) {
                if (this.field268[var4] && this.field270[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field271.length; var6++) {
                if (this.field274[var6] && this.field271[var6] != null) {
                    var2 += 2 + class123.method1542(this.field271[var6]);
                    var5++;
                }
            }
            class123 var7 = new class123(var2);
            var7.method2384(1);
            var7.method2385(var3);
            for (int var8 = 0; var8 < this.field270.length; var8++) {
                if (this.field268[var8] && this.field270[var8] != -1) {
                    var7.method2385(var8);
                    var7.method2387(this.field270[var8]);
                }
            }
            var7.method2385(var5);
            for (int var9 = 0; var9 < this.field271.length; var9++) {
                if (this.field274[var9] && this.field271[var9] != null) {
                    var7.method2385(var9);
                    var7.method2390(this.field271[var9]);
                }
            }
            var1.method3941(var7.field2053, 0, var7.field2052);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3942();
            } catch (Exception var20) {
            }
        }
        this.field272 = false;
        this.field267 = class119.method137();
    }

    @ObfuscatedName("r.k(S)V")
    public void method205() {
        class231 var1 = this.method195(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3957()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3944(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class123 var5 = new class123(var2);
                if (var5.field2053.length - var5.field2052 < 1) {
                    return;
                }
                int var7 = var5.method2522();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2401();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2401();
                        int var12 = var5.method2404();
                        if (this.field268[var11]) {
                            this.field270[var11] = var12;
                        }
                    }
                    int var13 = var5.method2401();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2401();
                        String var16 = var5.method2407();
                        if (this.field274[var15]) {
                            this.field271[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3942();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field272 = false;
    }

    @ObfuscatedName("r.c(I)V")
    public void method198() {
        if (this.field272 && this.field267 < class119.method137() - 60000L) {
            this.method196();
        }
    }

    @ObfuscatedName("r.w(I)Z")
    public boolean method199() {
        return this.field272;
    }
}
