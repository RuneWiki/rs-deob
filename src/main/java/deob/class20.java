package deob;

import java.io.EOFException;

@ObfuscatedName("m")
public class class20 {

    @ObfuscatedName("m.i")
    public boolean[] field272 = new boolean[this.field274.length];

    @ObfuscatedName("m.d")
    public boolean[] field282;

    @ObfuscatedName("m.o")
    public int[] field274 = new int[Statics.field915.method3093(19)];

    @ObfuscatedName("m.c")
    public String[] field270 = new String[Statics.field915.method3093(15)];

    @ObfuscatedName("m.p")
    public boolean field276 = false;

    @ObfuscatedName("m.j")
    public long field283;

    public class20() {
        for (int var1 = 0; var1 < this.field274.length; var1++) {
            class46 var2 = class46.method903(var1);
            this.field272[var1] = var2.field1039;
        }
        this.field282 = new boolean[this.field270.length];
        for (int var3 = 0; var3 < this.field270.length; var3++) {
            class50 var4 = class50.method158(var3);
            this.field282[var3] = var4.field1087;
        }
        for (int var5 = 0; var5 < this.field274.length; var5++) {
            this.field274[var5] = -1;
        }
        this.method222();
    }

    @ObfuscatedName("m.v(IIB)V")
    public void method202(int arg0, int arg1) {
        this.field274[arg0] = arg1;
        if (this.field272[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("m.f(IB)I")
    public int method213(int arg0) {
        return this.field274[arg0];
    }

    @ObfuscatedName("m.i(ILjava/lang/String;I)V")
    public void method237(int arg0, String arg1) {
        this.field270[arg0] = arg1;
        if (this.field282[arg0]) {
            this.field276 = true;
        }
    }

    @ObfuscatedName("m.d(II)Ljava/lang/String;")
    public String method215(int arg0) {
        return this.field270[arg0];
    }

    @ObfuscatedName("m.o(I)V")
    public void method206() {
        for (int var1 = 0; var1 < this.field274.length; var1++) {
            if (!this.field272[var1]) {
                this.field274[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field270.length; var2++) {
            if (!this.field282[var2]) {
                this.field270[var2] = null;
            }
        }
    }

    @ObfuscatedName("m.c(ZB)Lhs;")
    public class227 method207(boolean arg0) {
        return class149.method3213("2", Statics.field377.field2301, arg0);
    }

    @ObfuscatedName("m.p(B)V")
    public void method204() {
        class227 var1 = this.method207(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field274.length; var4++) {
                if (this.field272[var4] && this.field274[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field270.length; var6++) {
                if (this.field282[var6] && this.field270[var6] != null) {
                    var2 += 2 + class119.method2931(this.field270[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2398(1);
            var7.method2336(var3);
            for (int var8 = 0; var8 < this.field274.length; var8++) {
                if (this.field272[var8] && this.field274[var8] != -1) {
                    var7.method2336(var8);
                    var7.method2338(this.field274[var8]);
                }
            }
            var7.method2336(var5);
            for (int var9 = 0; var9 < this.field270.length; var9++) {
                if (this.field282[var9] && this.field270[var9] != null) {
                    var7.method2336(var9);
                    var7.method2440(this.field270[var9]);
                }
            }
            var1.method3839(var7.field1988, 0, var7.field1984);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3848();
            } catch (Exception var20) {
            }
        }
        this.field276 = false;
        this.field283 = class115.method819();
    }

    @ObfuscatedName("m.j(I)V")
    public void method222() {
        class227 var1 = this.method207(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3840()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3841(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1988.length - var5.field1984 < 1) {
                    return;
                }
                int var7 = var5.method2400();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2334();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2334();
                        int var12 = var5.method2354();
                        if (this.field272[var11]) {
                            this.field274[var11] = var12;
                        }
                    }
                    int var13 = var5.method2334();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2334();
                        String var16 = var5.method2357();
                        if (this.field282[var15]) {
                            this.field270[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3848();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field276 = false;
    }

    @ObfuscatedName("m.a(B)V")
    public void method210() {
        if (this.field276 && this.field283 < class115.method819() - 60000L) {
            this.method204();
        }
    }

    @ObfuscatedName("m.y(B)Z")
    public boolean method211() {
        return this.field276;
    }
}
