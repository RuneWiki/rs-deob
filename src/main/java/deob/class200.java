package deob;

@ObfuscatedName("hu")
public class class200 extends class504 {

    @ObfuscatedName("hu.ag")
    public static class317 field2081 = new class317(64);

    @ObfuscatedName("hu.am")
    public static class317 field2087 = new class317(30);

    @ObfuscatedName("hu.ax")
    public int field2085;

    @ObfuscatedName("hu.aq")
    public int field2084;

    @ObfuscatedName("hu.af")
    public int field2091 = -1;

    @ObfuscatedName("hu.at")
    public short[] field2079;

    @ObfuscatedName("hu.au")
    public short[] field2082;

    @ObfuscatedName("hu.ar")
    public short[] field2088;

    @ObfuscatedName("hu.al")
    public short[] field2086;

    @ObfuscatedName("hu.ad")
    public int field2090 = 128;

    @ObfuscatedName("hu.ah")
    public int field2089 = 128;

    @ObfuscatedName("hu.ap")
    public int field2092 = 0;

    @ObfuscatedName("hu.ab")
    public int field2093 = 0;

    @ObfuscatedName("hu.az")
    public int field2094 = 0;

    @ObfuscatedName("hg.ac(Lpo;Lpo;I)V")
    public static void method3593(class391 arg0, class391 arg1) {
        Statics.field2083 = arg0;
        Statics.field2080 = arg1;
    }

    @ObfuscatedName("he.ae(IB)Lhu;")
    public static class200 method3501(int arg0) {
        class200 var1 = (class200) field2081.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2083.method6782(13, arg0);
        class200 var3 = new class200();
        var3.field2085 = arg0;
        if (var2 != null) {
            var3.method3661(new class551(var2));
        }
        field2081.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hu.ag(Lvf;B)V")
    public void method3661(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3674(arg0, var2);
        }
    }

    @ObfuscatedName("hu.am(Lvf;II)V")
    public void method3674(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2084 = arg0.method9119();
        } else if (arg1 == 2) {
            this.field2091 = arg0.method9119();
        } else if (arg1 == 4) {
            this.field2090 = arg0.method9119();
        } else if (arg1 == 5) {
            this.field2089 = arg0.method9119();
        } else if (arg1 == 6) {
            this.field2092 = arg0.method9119();
        } else if (arg1 == 7) {
            this.field2093 = arg0.method8955();
        } else if (arg1 == 8) {
            this.field2094 = arg0.method8955();
        } else if (arg1 == 40) {
            int var3 = arg0.method8955();
            this.field2079 = new short[var3];
            this.field2082 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2079[var4] = (short) arg0.method9119();
                this.field2082[var4] = (short) arg0.method9119();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8955();
            this.field2088 = new short[var5];
            this.field2086 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2088[var6] = (short) arg0.method9119();
                this.field2086[var6] = (short) arg0.method9119();
            }
        }
    }

    @ObfuscatedName("hu.ax(II)Ljm;")
    public final class256 method3676(int arg0) {
        class256 var2 = this.method3664();
        if (var2 == null) {
            return null;
        }
        class256 var3;
        if (this.field2091 == -1 || arg0 == -1) {
            var3 = var2.method4811(true);
        } else {
            var3 = class213.method2555(this.field2091).method3950(var2, arg0);
        }
        if (this.field2090 != 128 || this.field2089 != 128) {
            var3.method4829(this.field2090, this.field2089, this.field2090);
        }
        if (this.field2092 != 0) {
            if (this.field2092 == 90) {
                var3.method4805();
            }
            if (this.field2092 == 180) {
                var3.method4805();
                var3.method4805();
            }
            if (this.field2092 == 270) {
                var3.method4805();
                var3.method4805();
                var3.method4805();
            }
        }
        return var3;
    }

    @ObfuscatedName("hu.aq(I)Ljm;")
    public final class256 method3664() {
        class256 var1 = (class256) field2087.method5733((long) this.field2085);
        if (var1 == null) {
            class235 var2 = class235.method4302(Statics.field2080, this.field2084, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field2079 != null) {
                for (int var3 = 0; var3 < this.field2079.length; var3++) {
                    var2.method4254(this.field2079[var3], this.field2082[var3]);
                }
            }
            if (this.field2088 != null) {
                for (int var4 = 0; var4 < this.field2088.length; var4++) {
                    var2.method4259(this.field2088[var4], this.field2086[var4]);
                }
            }
            var1 = var2.method4266(this.field2093 + 64, this.field2094 + 850, -30, -50, -30);
            field2087.method5735(var1, (long) this.field2085);
        }
        return var1;
    }
}
