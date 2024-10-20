package deob;

import java.io.EOFException;

@ObfuscatedName("ab")
public class class47 {

    @ObfuscatedName("ab.h")
    public boolean[] field944 = new boolean[this.field939.length];

    @ObfuscatedName("ab.p")
    public boolean[] field938;

    @ObfuscatedName("ab.j")
    public int[] field939 = new int[Statics.field834.method3126(19)];

    @ObfuscatedName("ab.n")
    public String[] field940 = new String[Statics.field834.method3126(15)];

    @ObfuscatedName("ab.r")
    public boolean field941 = false;

    @ObfuscatedName("ab.c")
    public long field942;

    public class47() {
        for (int var1 = 0; var1 < this.field939.length; var1++) {
            class189 var2 = (class189) class189.field2787.method2258((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2790.method3133(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3259(new class154(var4));
                }
                class189.field2787.method2248(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field944[var1] = var3.field2789;
        }
        this.field938 = new boolean[this.field940.length];
        for (int var7 = 0; var7 < this.field940.length; var7++) {
            class190 var8 = class190.method1894(var7);
            this.field938[var7] = var8.field2795;
        }
        for (int var9 = 0; var9 < this.field939.length; var9++) {
            this.field939[var9] = -1;
        }
        this.method899();
    }

    @ObfuscatedName("ab.q(IIB)V")
    public void method892(int arg0, int arg1) {
        this.field939[arg0] = arg1;
        if (this.field944[arg0]) {
            this.field941 = true;
        }
    }

    @ObfuscatedName("ab.d(II)I")
    public int method906(int arg0) {
        return this.field939[arg0];
    }

    @ObfuscatedName("ab.h(ILjava/lang/String;B)V")
    public void method894(int arg0, String arg1) {
        this.field940[arg0] = arg1;
        if (this.field938[arg0]) {
            this.field941 = true;
        }
    }

    @ObfuscatedName("ab.p(IB)Ljava/lang/String;")
    public String method895(int arg0) {
        return this.field940[arg0];
    }

    @ObfuscatedName("ab.j(B)V")
    public void method896() {
        for (int var1 = 0; var1 < this.field939.length; var1++) {
            if (!this.field944[var1]) {
                this.field939[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field940.length; var2++) {
            if (!this.field938[var2]) {
                this.field940[var2] = null;
            }
        }
    }

    @ObfuscatedName("ab.n(ZI)Lbf;")
    public class74 method897(boolean arg0) {
        return class105.method221("2", Statics.field307.field2690, arg0);
    }

    @ObfuscatedName("ab.c(B)V")
    public void method898() {
        class74 var1 = this.method897(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field939.length; var4++) {
                if (this.field944[var4] && this.field939[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field940.length; var6++) {
                if (this.field938[var6] && this.field940[var6] != null) {
                    var2 += 2 + class154.method2202(this.field940[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2751(1);
            var7.method2664(var3);
            for (int var8 = 0; var8 < this.field939.length; var8++) {
                if (this.field944[var8] && this.field939[var8] != -1) {
                    var7.method2664(var8);
                    var7.method2654(this.field939[var8]);
                }
            }
            var7.method2664(var5);
            for (int var9 = 0; var9 < this.field940.length; var9++) {
                if (this.field938[var9] && this.field940[var9] != null) {
                    var7.method2664(var9);
                    var7.method2657(this.field940[var9]);
                }
            }
            var1.method1404(var7.field2092, 0, var7.field2091);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1410();
            } catch (Exception var20) {
            }
        }
        this.field941 = false;
        this.field942 = class156.method12();
    }

    @ObfuscatedName("ab.o(B)V")
    public void method899() {
        class74 var1 = this.method897(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method1412()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1407(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2092.length - var5.field2091 >= 1) {
                    int var7 = var5.method2666();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2668();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2668();
                        int var12 = var5.method2798();
                        if (this.field944[var11]) {
                            this.field939[var11] = var12;
                        }
                    }
                    int var13 = var5.method2668();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2668();
                        String var16 = var5.method2701();
                        if (this.field938[var15]) {
                            this.field940[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method1410();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field941 = false;
    }

    @ObfuscatedName("ab.s(I)V")
    public void method900() {
        if (this.field941 && this.field942 < class156.method12() - 60000L) {
            this.method898();
        }
    }

    @ObfuscatedName("ab.u(I)Z")
    public boolean method904() {
        return this.field941;
    }
}
