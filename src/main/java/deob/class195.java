package deob;

@ObfuscatedName("ha")
public class class195 extends class439 {

    @ObfuscatedName("ha.ac")
    public static class276 field2052 = new class276(64);

    @ObfuscatedName("ha.ab")
    public static class276 field2046 = new class276(30);

    @ObfuscatedName("ha.an")
    public int field2047;

    @ObfuscatedName("ha.ao")
    public int field2048;

    @ObfuscatedName("ha.av")
    public int field2057 = -1;

    @ObfuscatedName("ha.aq")
    public short[] field2049;

    @ObfuscatedName("ha.ap")
    public short[] field2051;

    @ObfuscatedName("ha.ar")
    public short[] field2050;

    @ObfuscatedName("ha.ak")
    public short[] field2053;

    @ObfuscatedName("ha.ax")
    public int field2054 = 128;

    @ObfuscatedName("ha.as")
    public int field2059 = 128;

    @ObfuscatedName("ha.ay")
    public int field2056 = 0;

    @ObfuscatedName("ha.am")
    public int field2055 = 0;

    @ObfuscatedName("ha.az")
    public int field2058 = 0;

    @ObfuscatedName("aw.aj(II)Lha;")
    public static class195 method298(int arg0) {
        class195 var1 = (class195) field2052.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2045.method5860(13, arg0);
        class195 var3 = new class195();
        var3.field2047 = arg0;
        if (var2 != null) {
            var3.method3403(new class478(var2));
        }
        field2052.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.al(Lsy;I)V")
    public void method3403(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3404(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ac(Lsy;II)V")
    public void method3404(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2048 = arg0.method7905();
        } else if (arg1 == 2) {
            this.field2057 = arg0.method7905();
        } else if (arg1 == 4) {
            this.field2054 = arg0.method7905();
        } else if (arg1 == 5) {
            this.field2059 = arg0.method7905();
        } else if (arg1 == 6) {
            this.field2056 = arg0.method7905();
        } else if (arg1 == 7) {
            this.field2055 = arg0.method7909();
        } else if (arg1 == 8) {
            this.field2058 = arg0.method7909();
        } else if (arg1 == 40) {
            int var3 = arg0.method7909();
            this.field2049 = new short[var3];
            this.field2051 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2049[var4] = (short) arg0.method7905();
                this.field2051[var4] = (short) arg0.method7905();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7909();
            this.field2050 = new short[var5];
            this.field2053 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2050[var6] = (short) arg0.method7905();
                this.field2053[var6] = (short) arg0.method7905();
            }
        }
    }

    @ObfuscatedName("ha.ab(IB)Lix;")
    public final class231 method3405(int arg0) {
        class231 var2 = (class231) field2046.method4921((long) this.field2047);
        if (var2 == null) {
            class215 var3 = class215.method3812(Statics.field2043, this.field2048, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2049 != null) {
                for (int var4 = 0; var4 < this.field2049.length; var4++) {
                    var3.method3817(this.field2049[var4], this.field2051[var4]);
                }
            }
            if (this.field2050 != null) {
                for (int var5 = 0; var5 < this.field2050.length; var5++) {
                    var3.method3826(this.field2050[var5], this.field2053[var5]);
                }
            }
            var2 = var3.method3833(this.field2055 + 64, this.field2058 + 850, -30, -50, -30);
            field2046.method4923(var2, (long) this.field2047);
        }
        class231 var6;
        if (this.field2057 == -1 || arg0 == -1) {
            var6 = var2.method4299(true);
        } else {
            var6 = class206.method5217(this.field2057).method3690(var2, arg0);
        }
        if (this.field2054 != 128 || this.field2059 != 128) {
            var6.method4266(this.field2054, this.field2059, this.field2054);
        }
        if (this.field2056 != 0) {
            if (this.field2056 == 90) {
                var6.method4254();
            }
            if (this.field2056 == 180) {
                var6.method4254();
                var6.method4254();
            }
            if (this.field2056 == 270) {
                var6.method4254();
                var6.method4254();
                var6.method4254();
            }
        }
        return var6;
    }
}
