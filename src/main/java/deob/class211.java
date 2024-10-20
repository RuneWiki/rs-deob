package deob;

@ObfuscatedName("ir")
public class class211 extends class484 {

    @ObfuscatedName("ir.ak")
    public static class302 field2116 = new class302(64);

    @ObfuscatedName("ir.ax")
    public static class302 field2121 = new class302(30);

    @ObfuscatedName("ir.ao")
    public int field2128;

    @ObfuscatedName("ir.ah")
    public int field2119;

    @ObfuscatedName("ir.ar")
    public int field2127 = -1;

    @ObfuscatedName("ir.ab")
    public short[] field2115;

    @ObfuscatedName("ir.am")
    public short[] field2122;

    @ObfuscatedName("ir.av")
    public short[] field2123;

    @ObfuscatedName("ir.ag")
    public short[] field2120;

    @ObfuscatedName("ir.aa")
    public int field2125 = 128;

    @ObfuscatedName("ir.ap")
    public int field2126 = 128;

    @ObfuscatedName("ir.ay")
    public int field2114 = 0;

    @ObfuscatedName("ir.as")
    public int field2124 = 0;

    @ObfuscatedName("ir.aj")
    public int field2129 = 0;

    @ObfuscatedName("pm.ac(II)Lir;")
    public static class211 method6757(int arg0) {
        class211 var1 = (class211) field2116.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2118.method6342(13, arg0);
        class211 var3 = new class211();
        var3.field2128 = arg0;
        if (var2 != null) {
            var3.method3536(new class530(var2));
        }
        field2116.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.al(Lul;I)V")
    public void method3536(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3555(arg0, var2);
        }
    }

    @ObfuscatedName("ir.ak(Lul;II)V")
    public void method3555(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2119 = arg0.method8598();
        } else if (arg1 == 2) {
            this.field2127 = arg0.method8598();
        } else if (arg1 == 4) {
            this.field2125 = arg0.method8598();
        } else if (arg1 == 5) {
            this.field2126 = arg0.method8598();
        } else if (arg1 == 6) {
            this.field2114 = arg0.method8598();
        } else if (arg1 == 7) {
            this.field2124 = arg0.method8365();
        } else if (arg1 == 8) {
            this.field2129 = arg0.method8365();
        } else if (arg1 == 40) {
            int var3 = arg0.method8365();
            this.field2115 = new short[var3];
            this.field2122 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2115[var4] = (short) arg0.method8598();
                this.field2122[var4] = (short) arg0.method8598();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8365();
            this.field2123 = new short[var5];
            this.field2120 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2123[var6] = (short) arg0.method8598();
                this.field2120[var6] = (short) arg0.method8598();
            }
        }
    }

    @ObfuscatedName("ir.ax(II)Ljn;")
    public final class254 method3537(int arg0) {
        class254 var2 = this.method3546();
        class254 var3;
        if (this.field2127 == -1 || arg0 == -1) {
            var3 = var2.method4540(true);
        } else {
            var3 = class223.method687(this.field2127).method3847(var2, arg0);
        }
        if (this.field2125 != 128 || this.field2126 != 128) {
            var3.method4559(this.field2125, this.field2126, this.field2125);
        }
        if (this.field2114 != 0) {
            if (this.field2114 == 90) {
                var3.method4636();
            }
            if (this.field2114 == 180) {
                var3.method4636();
                var3.method4636();
            }
            if (this.field2114 == 270) {
                var3.method4636();
                var3.method4636();
                var3.method4636();
            }
        }
        return var3;
    }

    @ObfuscatedName("ir.ao(B)Ljn;")
    public final class254 method3546() {
        class254 var1 = (class254) field2121.method5286((long) this.field2128);
        if (var1 == null) {
            class236 var2 = class236.method4058(Statics.field2117, this.field2119, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2115 != null) {
                for (int var3 = 0; var3 < this.field2115.length; var3++) {
                    var2.method4132(this.field2115[var3], this.field2122[var3]);
                }
            }
            if (this.field2123 != null) {
                for (int var4 = 0; var4 < this.field2123.length; var4++) {
                    var2.method4074(this.field2123[var4], this.field2120[var4]);
                }
            }
            var1 = var2.method4080(this.field2124 + 64, this.field2129 + 850, -30, -50, -30);
            field2121.method5289(var1, (long) this.field2128);
        }
        return var1;
    }

    @ObfuscatedName("hc.ah(I)V")
    public static void method3432() {
        field2116.method5288();
        field2121.method5288();
    }
}
