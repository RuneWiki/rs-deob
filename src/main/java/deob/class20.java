package deob;

import java.io.EOFException;

@ObfuscatedName("p")
public class class20 {

    @ObfuscatedName("p.a")
    public boolean[] field275 = new boolean[this.field272.length];

    @ObfuscatedName("p.i")
    public boolean[] field271;

    @ObfuscatedName("p.f")
    public int[] field272 = new int[Statics.field1979.method3015(19)];

    @ObfuscatedName("p.m")
    public String[] field273 = new String[Statics.field1979.method3015(15)];

    @ObfuscatedName("p.o")
    public boolean field282 = false;

    @ObfuscatedName("p.h")
    public long field279;

    public class20() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            class46 var2 = Statics.method460(var1);
            this.field275[var1] = var2.field1041;
        }
        this.field271 = new boolean[this.field273.length];
        for (int var3 = 0; var3 < this.field273.length; var3++) {
            class50 var4 = class50.method1562(var3);
            this.field271[var3] = var4.field1091;
        }
        for (int var5 = 0; var5 < this.field272.length; var5++) {
            this.field272[var5] = -1;
        }
        this.method201();
    }

    @ObfuscatedName("p.j(III)V")
    public void method197(int arg0, int arg1) {
        this.field272[arg0] = arg1;
        if (this.field275[arg0]) {
            this.field282 = true;
        }
    }

    @ObfuscatedName("p.l(II)I")
    public int method213(int arg0) {
        return this.field272[arg0];
    }

    @ObfuscatedName("p.a(ILjava/lang/String;I)V")
    public void method199(int arg0, String arg1) {
        this.field273[arg0] = arg1;
        if (this.field271[arg0]) {
            this.field282 = true;
        }
    }

    @ObfuscatedName("p.i(II)Ljava/lang/String;")
    public String method200(int arg0) {
        return this.field273[arg0];
    }

    @ObfuscatedName("p.f(I)V")
    public void method205() {
        for (int var1 = 0; var1 < this.field272.length; var1++) {
            if (!this.field275[var1]) {
                this.field272[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field273.length; var2++) {
            if (!this.field271[var2]) {
                this.field273[var2] = null;
            }
        }
    }

    @ObfuscatedName("p.m(ZI)Lhk;")
    public class227 method202(boolean arg0) {
        return class149.method2("2", Statics.field351.field2296, arg0);
    }

    @ObfuscatedName("p.o(I)V")
    public void method210() {
        class227 var1 = this.method202(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field272.length; var4++) {
                if (this.field275[var4] && this.field272[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field273.length; var6++) {
                if (this.field271[var6] && this.field273[var6] != null) {
                    var2 += 2 + class119.method730(this.field273[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2301(1);
            var7.method2404(var3);
            for (int var8 = 0; var8 < this.field272.length; var8++) {
                if (this.field275[var8] && this.field272[var8] != -1) {
                    var7.method2404(var8);
                    var7.method2304(this.field272[var8]);
                }
            }
            var7.method2404(var5);
            for (int var9 = 0; var9 < this.field273.length; var9++) {
                if (this.field271[var9] && this.field273[var9] != null) {
                    var7.method2404(var9);
                    var7.method2307(this.field273[var9]);
                }
            }
            var1.method3810(var7.field1996, 0, var7.field1999);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3818();
            } catch (Exception var20) {
            }
        }
        this.field282 = false;
        this.field279 = class115.method2249();
    }

    @ObfuscatedName("p.h(I)V")
    public void method201() {
        class227 var1 = this.method202(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method3816()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3817(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1996.length - var5.field1999 < 1) {
                    return;
                }
                int var7 = var5.method2316();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2318();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2318();
                        int var12 = var5.method2321();
                        if (this.field275[var11]) {
                            this.field272[var11] = var12;
                        }
                    }
                    int var13 = var5.method2318();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2318();
                        String var16 = var5.method2324();
                        if (this.field271[var15]) {
                            this.field273[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method3818();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field282 = false;
    }

    @ObfuscatedName("p.n(I)V")
    public void method219() {
        if (this.field282 && this.field279 < class115.method2249() - 60000L) {
            this.method210();
        }
    }

    @ObfuscatedName("p.k(I)Z")
    public boolean method206() {
        return this.field282;
    }
}
