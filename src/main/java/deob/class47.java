package deob;

import java.io.EOFException;

@ObfuscatedName("ak")
public class class47 {

    @ObfuscatedName("ak.i")
    public boolean[] field913 = new boolean[this.field915.length];

    @ObfuscatedName("ak.t")
    public boolean[] field914;

    @ObfuscatedName("ak.k")
    public int[] field915 = new int[Statics.field314.method3200(19)];

    @ObfuscatedName("ak.h")
    public String[] field917 = new String[Statics.field314.method3200(15)];

    @ObfuscatedName("ak.n")
    public boolean field920 = false;

    @ObfuscatedName("ak.f")
    public long field918;

    public class47() {
        for (int var1 = 0; var1 < this.field915.length; var1++) {
            class189 var2 = (class189) class189.field2782.method2256((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2333.method3226(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3311(new class154(var4));
                }
                class189.field2782.method2258(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field913[var1] = var3.field2781;
        }
        this.field914 = new boolean[this.field917.length];
        for (int var7 = 0; var7 < this.field917.length; var7++) {
            class190 var8 = class190.method3186(var7);
            this.field914[var7] = var8.field2787;
        }
        for (int var9 = 0; var9 < this.field915.length; var9++) {
            this.field915[var9] = -1;
        }
        this.method903();
    }

    @ObfuscatedName("ak.b(IIB)V")
    public void method879(int arg0, int arg1) {
        this.field915[arg0] = arg1;
        if (this.field913[arg0]) {
            this.field920 = true;
        }
    }

    @ObfuscatedName("ak.l(II)I")
    public int method880(int arg0) {
        return this.field915[arg0];
    }

    @ObfuscatedName("ak.i(ILjava/lang/String;I)V")
    public void method904(int arg0, String arg1) {
        this.field917[arg0] = arg1;
        if (this.field914[arg0]) {
            this.field920 = true;
        }
    }

    @ObfuscatedName("ak.t(II)Ljava/lang/String;")
    public String method878(int arg0) {
        return this.field917[arg0];
    }

    @ObfuscatedName("ak.k(I)V")
    public void method883() {
        for (int var1 = 0; var1 < this.field915.length; var1++) {
            if (!this.field913[var1]) {
                this.field915[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field917.length; var2++) {
            if (!this.field914[var2]) {
                this.field917[var2] = null;
            }
        }
    }

    @ObfuscatedName("ak.x(ZI)Lbz;")
    public class74 method884(boolean arg0) {
        return class105.method1160("2", Statics.field414.field2684, arg0);
    }

    @ObfuscatedName("ak.z(I)V")
    public void method885() {
        class74 var1 = this.method884(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field915.length; var4++) {
                if (this.field913[var4] && this.field915[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field917.length; var6++) {
                if (this.field914[var6] && this.field917[var6] != null) {
                    var2 += 2 + class154.method616(this.field917[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2832(1);
            var7.method2664(var3);
            for (int var8 = 0; var8 < this.field915.length; var8++) {
                if (this.field913[var8] && this.field915[var8] != -1) {
                    var7.method2664(var8);
                    var7.method2666(this.field915[var8]);
                }
            }
            var7.method2664(var5);
            for (int var9 = 0; var9 < this.field917.length; var9++) {
                if (this.field914[var9] && this.field917[var9] != null) {
                    var7.method2664(var9);
                    var7.method2715(this.field917[var9]);
                }
            }
            var1.method1391(var7.field2083, 0, var7.field2085);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1394();
            } catch (Exception var20) {
            }
        }
        this.field920 = false;
        this.field918 = class156.method910();
    }

    @ObfuscatedName("ak.p(I)V")
    public void method903() {
        class74 var1 = this.method884(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method1393()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1392(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2083.length - var5.field2085 < 1) {
                    return;
                }
                int var7 = var5.method2678();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2801();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2801();
                        int var12 = var5.method2683();
                        if (this.field913[var11]) {
                            this.field915[var11] = var12;
                        }
                    }
                    int var13 = var5.method2801();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2801();
                        String var16 = var5.method2686();
                        if (this.field914[var15]) {
                            this.field917[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method1394();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field920 = false;
    }

    @ObfuscatedName("ak.s(I)V")
    public void method887() {
        if (this.field920 && this.field918 < class156.method910() - 60000L) {
            this.method885();
        }
    }

    @ObfuscatedName("ak.o(B)Z")
    public boolean method888() {
        return this.field920;
    }
}
