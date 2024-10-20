package deob;

import java.io.EOFException;

@ObfuscatedName("as")
public class class47 {

    @ObfuscatedName("as.u")
    public boolean[] field938 = new boolean[this.field940.length];

    @ObfuscatedName("as.h")
    public boolean[] field937;

    @ObfuscatedName("as.r")
    public int[] field940 = new int[Statics.field991.method3127(19)];

    @ObfuscatedName("as.o")
    public String[] field941 = new String[Statics.field991.method3127(15)];

    @ObfuscatedName("as.l")
    public boolean field939 = false;

    @ObfuscatedName("as.n")
    public long field943;

    public class47() {
        for (int var1 = 0; var1 < this.field940.length; var1++) {
            class189 var2 = (class189) class189.field2796.method2240((long) var1);
            class189 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field2798.method3163(19, var1);
                class189 var5 = new class189();
                if (var4 != null) {
                    var5.method3276(new class154(var4));
                }
                class189.field2796.method2246(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field938[var1] = var3.field2795;
        }
        this.field937 = new boolean[this.field941.length];
        for (int var7 = 0; var7 < this.field941.length; var7++) {
            class190 var8 = class190.method189(var7);
            this.field937[var7] = var8.field2801;
        }
        for (int var9 = 0; var9 < this.field940.length; var9++) {
            this.field940[var9] = -1;
        }
        this.method883();
    }

    @ObfuscatedName("as.f(III)V")
    public void method851(int arg0, int arg1) {
        this.field940[arg0] = arg1;
        if (this.field938[arg0]) {
            this.field939 = true;
        }
    }

    @ObfuscatedName("as.i(II)I")
    public int method852(int arg0) {
        return this.field940[arg0];
    }

    @ObfuscatedName("as.u(ILjava/lang/String;I)V")
    public void method878(int arg0, String arg1) {
        this.field941[arg0] = arg1;
        if (this.field937[arg0]) {
            this.field939 = true;
        }
    }

    @ObfuscatedName("as.r(IB)Ljava/lang/String;")
    public String method854(int arg0) {
        return this.field941[arg0];
    }

    @ObfuscatedName("as.o(I)V")
    public void method867() {
        for (int var1 = 0; var1 < this.field940.length; var1++) {
            if (!this.field938[var1]) {
                this.field940[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field941.length; var2++) {
            if (!this.field937[var2]) {
                this.field941[var2] = null;
            }
        }
    }

    @ObfuscatedName("as.l(ZB)Lbx;")
    public class74 method864(boolean arg0) {
        return class105.method849("2", Statics.field305.field2710, arg0);
    }

    @ObfuscatedName("as.n(B)V")
    public void method857() {
        class74 var1 = this.method864(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field940.length; var4++) {
                if (this.field938[var4] && this.field940[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field941.length; var6++) {
                if (this.field937[var6] && this.field941[var6] != null) {
                    var2 += 2 + class154.method1352(this.field941[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2651(1);
            var7.method2793(var3);
            for (int var8 = 0; var8 < this.field940.length; var8++) {
                if (this.field938[var8] && this.field940[var8] != -1) {
                    var7.method2793(var8);
                    var7.method2654(this.field940[var8]);
                }
            }
            var7.method2793(var5);
            for (int var9 = 0; var9 < this.field941.length; var9++) {
                if (this.field937[var9] && this.field941[var9] != null) {
                    var7.method2793(var9);
                    var7.method2730(this.field941[var9]);
                }
            }
            var1.method1360(var7.field2114, 0, var7.field2111);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1361();
            } catch (Exception var20) {
            }
        }
        this.field939 = false;
        this.field943 = class156.method848();
    }

    @ObfuscatedName("as.m(B)V")
    public void method883() {
        class74 var1 = this.method864(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method1362()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1363(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2114.length - var5.field2111 >= 1) {
                    int var7 = var5.method2666();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2668();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2668();
                            int var12 = var5.method2695();
                            if (this.field938[var11]) {
                                this.field940[var11] = var12;
                            }
                        }
                        int var13 = var5.method2668();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2668();
                            String var16 = var5.method2674();
                            if (this.field937[var15]) {
                                this.field941[var15] = var16;
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
                    var1.method1361();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field939 = false;
    }

    @ObfuscatedName("as.w(I)V")
    public void method859() {
        if (this.field939 && this.field943 < class156.method848() - 60000L) {
            this.method857();
        }
    }

    @ObfuscatedName("as.j(I)Z")
    public boolean method871() {
        return this.field939;
    }
}
