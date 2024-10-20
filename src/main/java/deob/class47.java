package deob;

import java.io.EOFException;

@ObfuscatedName("av")
public class class47 {

    @ObfuscatedName("av.f")
    public boolean[] field915 = new boolean[this.field918.length];

    @ObfuscatedName("av.h")
    public boolean[] field911;

    @ObfuscatedName("av.a")
    public int[] field918 = new int[Statics.field920.method2996(19)];

    @ObfuscatedName("av.g")
    public String[] field913 = new String[Statics.field920.method2996(15)];

    @ObfuscatedName("av.k")
    public boolean field914 = false;

    @ObfuscatedName("av.u")
    public long field909;

    public class47() {
        for (int var1 = 0; var1 < this.field918.length; var1++) {
            class189 var2 = class189.method447(var1);
            this.field915[var1] = var2.field2786;
        }
        this.field911 = new boolean[this.field913.length];
        for (int var3 = 0; var3 < this.field913.length; var3++) {
            class190 var4 = (class190) class190.field2789.method2121((long) var3);
            class190 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field2131.method2986(15, var3);
                class190 var7 = new class190();
                if (var6 != null) {
                    var7.method3145(new class154(var6));
                }
                class190.field2789.method2123(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field911[var3] = var5.field2790;
        }
        for (int var9 = 0; var9 < this.field918.length; var9++) {
            this.field918[var9] = -1;
        }
        this.method792();
    }

    @ObfuscatedName("av.s(IIS)V")
    public void method783(int arg0, int arg1) {
        this.field918[arg0] = arg1;
        if (this.field915[arg0]) {
            this.field914 = true;
        }
    }

    @ObfuscatedName("av.c(II)I")
    public int method784(int arg0) {
        return this.field918[arg0];
    }

    @ObfuscatedName("av.f(ILjava/lang/String;B)V")
    public void method785(int arg0, String arg1) {
        this.field913[arg0] = arg1;
        if (this.field911[arg0]) {
            this.field914 = true;
        }
    }

    @ObfuscatedName("av.g(II)Ljava/lang/String;")
    public String method786(int arg0) {
        return this.field913[arg0];
    }

    @ObfuscatedName("av.k(B)V")
    public void method787() {
        for (int var1 = 0; var1 < this.field918.length; var1++) {
            if (!this.field915[var1]) {
                this.field918[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field913.length; var2++) {
            if (!this.field911[var2]) {
                this.field913[var2] = null;
            }
        }
    }

    @ObfuscatedName("av.u(ZI)Lbf;")
    public class74 method808(boolean arg0) {
        return class105.method665("2", Statics.field2730.field2689, arg0);
    }

    @ObfuscatedName("av.b(B)V")
    public void method789() {
        class74 var1 = this.method808(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field918.length; var4++) {
                if (this.field915[var4] && this.field918[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field913.length; var6++) {
                if (this.field911[var6] && this.field913[var6] != null) {
                    String var8 = this.field913[var6];
                    int var9 = var8.length() + 1;
                    var2 += var9 + 2;
                    var5++;
                }
            }
            class154 var10 = new class154(var2);
            var10.method2531(1);
            var10.method2532(var3);
            for (int var11 = 0; var11 < this.field918.length; var11++) {
                if (this.field915[var11] && this.field918[var11] != -1) {
                    var10.method2532(var11);
                    var10.method2534(this.field918[var11]);
                }
            }
            var10.method2532(var5);
            for (int var12 = 0; var12 < this.field913.length; var12++) {
                if (this.field911[var12] && this.field913[var12] != null) {
                    var10.method2532(var12);
                    var10.method2537(this.field913[var12]);
                }
            }
            var1.method1321(var10.field2100, 0, var10.field2098);
        } catch (Exception var24) {
        } finally {
            try {
                var1.method1303();
            } catch (Exception var23) {
            }
        }
        this.field914 = false;
        this.field909 = Statics.method28();
    }

    @ObfuscatedName("av.x(B)V")
    public void method792() {
        class74 var1 = this.method808(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method1304()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1305(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2100.length - var5.field2098 < 1) {
                    return;
                }
                int var7 = var5.method2545();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2541();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2541();
                        int var12 = var5.method2550();
                        if (this.field915[var11]) {
                            this.field918[var11] = var12;
                        }
                    }
                    int var13 = var5.method2541();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2541();
                        String var16 = var5.method2734();
                        if (this.field911[var15]) {
                            this.field913[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method1303();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field914 = false;
    }

    @ObfuscatedName("av.r(I)V")
    public void method791() {
        if (this.field914 && this.field909 < Statics.method28() - 60000L) {
            this.method789();
        }
    }

    @ObfuscatedName("av.n(I)Z")
    public boolean method795() {
        return this.field914;
    }
}
