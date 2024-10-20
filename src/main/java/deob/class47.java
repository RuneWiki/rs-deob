package deob;

import java.io.EOFException;

@ObfuscatedName("ap")
public class class47 {

    @ObfuscatedName("ap.x")
    public boolean[] field918 = new boolean[this.field926.length];

    @ObfuscatedName("ap.q")
    public boolean[] field920;

    @ObfuscatedName("ap.d")
    public int[] field926 = new int[Statics.field66.method3068(19)];

    @ObfuscatedName("ap.k")
    public String[] field922 = new String[Statics.field66.method3068(15)];

    @ObfuscatedName("ap.j")
    public boolean field923 = false;

    @ObfuscatedName("ap.s")
    public long field924;

    public class47() {
        for (int var1 = 0; var1 < this.field926.length; var1++) {
            class189 var2 = (class189) class189.field2778.method2169((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2779.method3044(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3185(new class154(var4));
                }
                class189.field2778.method2174(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field918[var1] = var3.field2780;
        }
        this.field920 = new boolean[this.field922.length];
        for (int var7 = 0; var7 < this.field922.length; var7++) {
            class190 var8 = class190.method2527(var7);
            this.field920[var7] = var8.field2785;
        }
        for (int var9 = 0; var9 < this.field926.length; var9++) {
            this.field926[var9] = -1;
        }
        this.method807();
    }

    @ObfuscatedName("ap.p(III)V")
    public void method800(int arg0, int arg1) {
        this.field926[arg0] = arg1;
        if (this.field918[arg0]) {
            this.field923 = true;
        }
    }

    @ObfuscatedName("ap.g(II)I")
    public int method801(int arg0) {
        return this.field926[arg0];
    }

    @ObfuscatedName("ap.x(ILjava/lang/String;I)V")
    public void method837(int arg0, String arg1) {
        this.field922[arg0] = arg1;
        if (this.field920[arg0]) {
            this.field923 = true;
        }
    }

    @ObfuscatedName("ap.q(IB)Ljava/lang/String;")
    public String method816(int arg0) {
        return this.field922[arg0];
    }

    @ObfuscatedName("ap.d(B)V")
    public void method804() {
        for (int var1 = 0; var1 < this.field926.length; var1++) {
            if (!this.field918[var1]) {
                this.field926[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            if (!this.field920[var2]) {
                this.field922[var2] = null;
            }
        }
    }

    @ObfuscatedName("ap.k(ZI)Lbk;")
    public class74 method805(boolean arg0) {
        return class105.method715("2", Statics.field2108.field2689, arg0);
    }

    @ObfuscatedName("ap.j(I)V")
    public void method821() {
        class74 var1 = this.method805(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field926.length; var4++) {
                if (this.field918[var4] && this.field926[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field922.length; var6++) {
                if (this.field920[var6] && this.field922[var6] != null) {
                    var2 += 2 + class154.method724(this.field922[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2578(1);
            var7.method2616(var3);
            for (int var8 = 0; var8 < this.field926.length; var8++) {
                if (this.field918[var8] && this.field926[var8] != -1) {
                    var7.method2616(var8);
                    var7.method2581(this.field926[var8]);
                }
            }
            var7.method2616(var5);
            for (int var9 = 0; var9 < this.field922.length; var9++) {
                if (this.field920[var9] && this.field922[var9] != null) {
                    var7.method2616(var9);
                    var7.method2584(this.field922[var9]);
                }
            }
            var1.method1304(var7.field2092, 0, var7.field2098);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1305();
            } catch (Exception var20) {
            }
        }
        this.field923 = false;
        this.field924 = class156.method1597();
    }

    @ObfuscatedName("ap.s(S)V")
    public void method807() {
        class74 var1 = this.method805(false);
        try {
            byte[] var2 = new byte[(int) var1.method1320()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method1307(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class154 var5 = new class154(var2);
            if (var5.field2092.length - var5.field2098 < 1) {
                return;
            }
            int var7 = var5.method2593();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method2595();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2595();
                int var12 = var5.method2598();
                if (this.field918[var11]) {
                    this.field926[var11] = var12;
                }
            }
            int var13 = var5.method2595();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method2595();
                String var16 = var5.method2625();
                if (this.field920[var15]) {
                    this.field922[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method1305();
            } catch (Exception var29) {
            }
        }
        this.field923 = false;
    }

    @ObfuscatedName("ap.o(I)V")
    public void method808() {
        if (this.field923 && this.field924 < class156.method1597() - 60000L) {
            this.method821();
        }
    }

    @ObfuscatedName("ap.a(I)Z")
    public boolean method809() {
        return this.field923;
    }
}
