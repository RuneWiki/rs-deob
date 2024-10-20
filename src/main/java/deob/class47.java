package deob;

import java.io.EOFException;

@ObfuscatedName("as")
public class class47 {

    @ObfuscatedName("as.c")
    public boolean[] field941 = new boolean[this.field943.length];

    @ObfuscatedName("as.d")
    public boolean[] field944;

    @ObfuscatedName("as.w")
    public int[] field943 = new int[Statics.field28.method3108(19)];

    @ObfuscatedName("as.h")
    public String[] field939 = new String[Statics.field28.method3108(15)];

    @ObfuscatedName("as.u")
    public boolean field945 = false;

    @ObfuscatedName("as.k")
    public long field946;

    public class47() {
        for (int var1 = 0; var1 < this.field943.length; var1++) {
            class189 var2 = (class189) class189.field2780.method2221((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2776.method3121(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3246(new class154(var4));
                }
                class189.field2780.method2223(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field941[var1] = var3.field2775;
        }
        this.field944 = new boolean[this.field939.length];
        for (int var7 = 0; var7 < this.field939.length; var7++) {
            class190 var8 = class190.method2896(var7);
            this.field944[var7] = var8.field2783;
        }
        for (int var9 = 0; var9 < this.field943.length; var9++) {
            this.field943[var9] = -1;
        }
        this.method910();
    }

    @ObfuscatedName("as.x(IIB)V")
    public void method893(int arg0, int arg1) {
        this.field943[arg0] = arg1;
        if (this.field941[arg0]) {
            this.field945 = true;
        }
    }

    @ObfuscatedName("as.j(II)I")
    public int method894(int arg0) {
        return this.field943[arg0];
    }

    @ObfuscatedName("as.c(ILjava/lang/String;I)V")
    public void method895(int arg0, String arg1) {
        this.field939[arg0] = arg1;
        if (this.field944[arg0]) {
            this.field945 = true;
        }
    }

    @ObfuscatedName("as.d(II)Ljava/lang/String;")
    public String method896(int arg0) {
        return this.field939[arg0];
    }

    @ObfuscatedName("as.w(B)V")
    public void method899() {
        for (int var1 = 0; var1 < this.field943.length; var1++) {
            if (!this.field941[var1]) {
                this.field943[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field939.length; var2++) {
            if (!this.field944[var2]) {
                this.field939[var2] = null;
            }
        }
    }

    @ObfuscatedName("as.u(ZB)Lbz;")
    public class74 method897(boolean arg0) {
        return class105.method34("2", Statics.field219.field2678, arg0);
    }

    @ObfuscatedName("as.y(I)V")
    public void method898() {
        class74 var1 = this.method897(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                if (this.field941[var4] && this.field943[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field939.length; var6++) {
                if (this.field944[var6] && this.field939[var6] != null) {
                    var2 += 2 + class154.method2955(this.field939[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2651(1);
            var7.method2625(var3);
            for (int var8 = 0; var8 < this.field943.length; var8++) {
                if (this.field941[var8] && this.field943[var8] != -1) {
                    var7.method2625(var8);
                    var7.method2627(this.field943[var8]);
                }
            }
            var7.method2625(var5);
            for (int var9 = 0; var9 < this.field939.length; var9++) {
                if (this.field944[var9] && this.field939[var9] != null) {
                    var7.method2625(var9);
                    var7.method2630(this.field939[var9]);
                }
            }
            var1.method1396(var7.field2091, 0, var7.field2086);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1394();
            } catch (Exception var20) {
            }
        }
        this.field945 = false;
        this.field946 = class156.method1888();
    }

    @ObfuscatedName("as.e(I)V")
    public void method910() {
        class74 var1 = this.method897(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method1395()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1391(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2091.length - var5.field2086 >= 1) {
                    int var7 = var5.method2701();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2745();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2745();
                        int var12 = var5.method2644();
                        if (this.field941[var11]) {
                            this.field943[var11] = var12;
                        }
                    }
                    int var13 = var5.method2745();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2745();
                        String var16 = var5.method2699();
                        if (this.field944[var15]) {
                            this.field939[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method1394();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field945 = false;
    }

    @ObfuscatedName("as.q(I)V")
    public void method902() {
        if (this.field945 && this.field946 < class156.method1888() - 60000L) {
            this.method898();
        }
    }

    @ObfuscatedName("as.v(B)Z")
    public boolean method916() {
        return this.field945;
    }
}
