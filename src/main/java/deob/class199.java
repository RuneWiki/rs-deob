package deob;

@ObfuscatedName("ha")
public class class199 extends class469 {

    @ObfuscatedName("ha.ao")
    public static class288 field2098 = new class288(64);

    @ObfuscatedName("ha.at")
    public static class288 field2099 = new class288(30);

    @ObfuscatedName("ha.ac")
    public int field2100;

    @ObfuscatedName("ha.ai")
    public int field2112;

    @ObfuscatedName("ha.az")
    public int field2102 = -1;

    @ObfuscatedName("ha.ap")
    public short[] field2107;

    @ObfuscatedName("ha.aa")
    public short[] field2104;

    @ObfuscatedName("ha.af")
    public short[] field2105;

    @ObfuscatedName("ha.ad")
    public short[] field2106;

    @ObfuscatedName("ha.aq")
    public int field2096 = 128;

    @ObfuscatedName("ha.al")
    public int field2108 = 128;

    @ObfuscatedName("ha.an")
    public int field2109 = 0;

    @ObfuscatedName("ha.ar")
    public int field2101 = 0;

    @ObfuscatedName("ha.ab")
    public int field2111 = 0;

    @ObfuscatedName("hc.au(IS)Lha;")
    public static class199 method3551(int arg0) {
        class199 var1 = (class199) field2098.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2110.method6128(13, arg0);
        class199 var3 = new class199();
        var3.field2100 = arg0;
        if (var2 != null) {
            var3.method3470(new class515(var2));
        }
        field2098.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.ae(Ltm;B)V")
    public void method3470(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3459(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ao(Ltm;IB)V")
    public void method3459(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2112 = arg0.method8448();
        } else if (arg1 == 2) {
            this.field2102 = arg0.method8448();
        } else if (arg1 == 4) {
            this.field2096 = arg0.method8448();
        } else if (arg1 == 5) {
            this.field2108 = arg0.method8448();
        } else if (arg1 == 6) {
            this.field2109 = arg0.method8448();
        } else if (arg1 == 7) {
            this.field2101 = arg0.method8300();
        } else if (arg1 == 8) {
            this.field2111 = arg0.method8300();
        } else if (arg1 == 40) {
            int var3 = arg0.method8300();
            this.field2107 = new short[var3];
            this.field2104 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2107[var4] = (short) arg0.method8448();
                this.field2104[var4] = (short) arg0.method8448();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8300();
            this.field2105 = new short[var5];
            this.field2106 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2105[var6] = (short) arg0.method8448();
                this.field2106[var6] = (short) arg0.method8448();
            }
        }
    }

    @ObfuscatedName("ha.at(II)Ljr;")
    public final class240 method3462(int arg0) {
        class240 var2 = this.method3463();
        class240 var3;
        if (this.field2102 == -1 || arg0 == -1) {
            var3 = var2.method4538(true);
        } else {
            var3 = class209.method3394(this.field2102).method3742(var2, arg0);
        }
        if (this.field2096 != 128 || this.field2108 != 128) {
            var3.method4467(this.field2096, this.field2108, this.field2096);
        }
        if (this.field2109 != 0) {
            if (this.field2109 == 90) {
                var3.method4462();
            }
            if (this.field2109 == 180) {
                var3.method4462();
                var3.method4462();
            }
            if (this.field2109 == 270) {
                var3.method4462();
                var3.method4462();
                var3.method4462();
            }
        }
        return var3;
    }

    @ObfuscatedName("ha.ac(B)Ljr;")
    public final class240 method3463() {
        class240 var1 = (class240) field2099.method5182((long) this.field2100);
        if (var1 == null) {
            class222 var2 = class222.method4002(Statics.field2097, this.field2112, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2107 != null) {
                for (int var3 = 0; var3 < this.field2107.length; var3++) {
                    var2.method3996(this.field2107[var3], this.field2104[var3]);
                }
            }
            if (this.field2105 != null) {
                for (int var4 = 0; var4 < this.field2105.length; var4++) {
                    var2.method3958(this.field2105[var4], this.field2106[var4]);
                }
            }
            var1 = var2.method3965(this.field2101 + 64, this.field2111 + 850, -30, -50, -30);
            field2099.method5177(var1, (long) this.field2100);
        }
        return var1;
    }
}
