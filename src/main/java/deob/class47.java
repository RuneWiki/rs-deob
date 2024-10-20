package deob;

import java.io.EOFException;

@ObfuscatedName("am")
public class class47 {

    @ObfuscatedName("am.c")
    public boolean[] field936 = new boolean[this.field929.length];

    @ObfuscatedName("am.l")
    public boolean[] field932;

    @ObfuscatedName("am.y")
    public int[] field929 = new int[Statics.field1069.method3136(19)];

    @ObfuscatedName("am.j")
    public String[] field934 = new String[Statics.field1069.method3136(15)];

    @ObfuscatedName("am.g")
    public boolean field935 = false;

    @ObfuscatedName("am.s")
    public long field933;

    public class47() {
        for (int var1 = 0; var1 < this.field929.length; var1++) {
            class189 var2 = class189.method572(var1);
            this.field936[var1] = var2.field2789;
        }
        this.field932 = new boolean[this.field934.length];
        for (int var3 = 0; var3 < this.field934.length; var3++) {
            class190 var4 = (class190) class190.field2794.method2246((long) var3);
            class190 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field2792.method3126(15, var3);
                class190 var7 = new class190();
                if (var6 != null) {
                    var7.method3295(new class154(var6));
                }
                class190.field2794.method2250(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field932[var3] = var5.field2793;
        }
        for (int var9 = 0; var9 < this.field929.length; var9++) {
            this.field929[var9] = -1;
        }
        this.method847();
    }

    @ObfuscatedName("am.b(III)V")
    public void method846(int arg0, int arg1) {
        this.field929[arg0] = arg1;
        if (this.field936[arg0]) {
            this.field935 = true;
        }
    }

    @ObfuscatedName("am.e(IB)I")
    public int method853(int arg0) {
        return this.field929[arg0];
    }

    @ObfuscatedName("am.c(ILjava/lang/String;B)V")
    public void method856(int arg0, String arg1) {
        this.field934[arg0] = arg1;
        if (this.field932[arg0]) {
            this.field935 = true;
        }
    }

    @ObfuscatedName("am.l(II)Ljava/lang/String;")
    public String method849(int arg0) {
        return this.field934[arg0];
    }

    @ObfuscatedName("am.y(I)V")
    public void method850() {
        for (int var1 = 0; var1 < this.field929.length; var1++) {
            if (!this.field936[var1]) {
                this.field929[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field934.length; var2++) {
            if (!this.field932[var2]) {
                this.field934[var2] = null;
            }
        }
    }

    @ObfuscatedName("am.j(ZB)Lby;")
    public class74 method851(boolean arg0) {
        return class105.method717("2", Statics.field77.field2695, arg0);
    }

    @ObfuscatedName("am.t(I)V")
    public void method852() {
        class74 var1 = this.method851(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field929.length; var4++) {
                if (this.field936[var4] && this.field929[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field934.length; var6++) {
                if (this.field932[var6] && this.field934[var6] != null) {
                    var2 += 2 + class154.method2198(this.field934[var6]);
                    var5++;
                }
            }
            class154 var7 = new class154(var2);
            var7.method2780(1);
            var7.method2793(var3);
            for (int var8 = 0; var8 < this.field929.length; var8++) {
                if (this.field936[var8] && this.field929[var8] != -1) {
                    var7.method2793(var8);
                    var7.method2658(this.field929[var8]);
                }
            }
            var7.method2793(var5);
            for (int var9 = 0; var9 < this.field934.length; var9++) {
                if (this.field932[var9] && this.field934[var9] != null) {
                    var7.method2793(var9);
                    var7.method2764(this.field934[var9]);
                }
            }
            var1.method1368(var7.field2084, 0, var7.field2079);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1356();
            } catch (Exception var20) {
            }
        }
        this.field935 = false;
        this.field933 = class156.method81();
    }

    @ObfuscatedName("am.k(B)V")
    public void method847() {
        class74 var1 = this.method851(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method1362()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1375(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class154 var5 = new class154(var2);
                if (var5.field2084.length - var5.field2079 < 1) {
                    return;
                }
                int var7 = var5.method2669();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2671();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2671();
                        int var12 = var5.method2815();
                        if (this.field936[var11]) {
                            this.field929[var11] = var12;
                        }
                    }
                    int var13 = var5.method2671();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2671();
                        String var16 = var5.method2677();
                        if (this.field932[var15]) {
                            this.field934[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method1356();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field935 = false;
    }

    @ObfuscatedName("am.f(I)V")
    public void method854() {
        if (this.field935 && this.field933 < class156.method81() - 60000L) {
            this.method852();
        }
    }

    @ObfuscatedName("am.a(I)Z")
    public boolean method855() {
        return this.field935;
    }
}
