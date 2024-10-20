package deob;

@ObfuscatedName("hw")
public class class197 extends class489 {

    @ObfuscatedName("hw.at")
    public static class304 field2010 = new class304(256);

    @ObfuscatedName("hw.an")
    public final int field2006;

    @ObfuscatedName("hw.ao")
    public int field2016 = -1;

    @ObfuscatedName("hw.ab")
    public int field2008 = -1;

    @ObfuscatedName("hw.aw")
    public String field2009;

    @ObfuscatedName("hw.ad")
    public int field2012;

    @ObfuscatedName("hw.al")
    public int field2011 = 0;

    @ObfuscatedName("hw.ag")
    public boolean field2005 = true;

    @ObfuscatedName("hw.ai")
    public boolean field2013 = false;

    @ObfuscatedName("hw.ax")
    public String[] field2015 = new String[5];

    @ObfuscatedName("hw.ar")
    public String field2017;

    @ObfuscatedName("hw.aj")
    public int[] field2014;

    @ObfuscatedName("hw.au")
    public int field2003 = Integer.MAX_VALUE;

    @ObfuscatedName("hw.ay")
    public int field2018 = Integer.MAX_VALUE;

    @ObfuscatedName("hw.ap")
    public int field2019 = Integer.MIN_VALUE;

    @ObfuscatedName("hw.av")
    public int field2020 = Integer.MIN_VALUE;

    @ObfuscatedName("hw.aa")
    public class206 field2021 = class206.field2087;

    @ObfuscatedName("hw.aq")
    public class210 field2022 = class210.field2152;

    @ObfuscatedName("hw.am")
    public int[] field2023;

    @ObfuscatedName("hw.ac")
    public byte[] field2024;

    @ObfuscatedName("hw.ae")
    public int field2025 = -1;

    public class197(int arg0) {
        this.field2006 = arg0;
    }

    @ObfuscatedName("nm.az(II)Lhw;")
    public static class197 method5698(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field2004.length || Statics.field2004[arg0] == null ? new class197(arg0) : Statics.field2004[arg0];
    }

    @ObfuscatedName("hw.ah(Lur;I)V")
    public void method3422(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3425(arg0, var2);
        }
    }

    @ObfuscatedName("hw.af(Lur;IS)V")
    public void method3425(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2016 = arg0.method8633();
        } else if (arg1 == 2) {
            this.field2008 = arg0.method8633();
        } else if (arg1 == 3) {
            this.field2009 = arg0.method8473();
        } else if (arg1 == 4) {
            this.field2012 = arg0.method8466();
        } else if (arg1 == 5) {
            arg0.method8466();
        } else if (arg1 == 6) {
            this.field2011 = arg0.method8462();
        } else if (arg1 == 7) {
            int var3 = arg0.method8462();
            if ((var3 & 0x1) == 0) {
                this.field2005 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field2013 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8462();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2015[arg1 - 10] = arg0.method8473();
        } else if (arg1 == 15) {
            int var4 = arg0.method8462();
            this.field2014 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2014[var5] = arg0.method8465();
            }
            arg0.method8682();
            int var6 = arg0.method8462();
            this.field2023 = new int[var6];
            for (int var7 = 0; var7 < this.field2023.length; var7++) {
                this.field2023[var7] = arg0.method8682();
            }
            this.field2024 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field2024[var8] = arg0.method8463();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field2017 = arg0.method8473();
            } else if (arg1 == 18) {
                arg0.method8633();
            } else if (arg1 == 19) {
                this.field2025 = arg0.method8670();
            } else if (arg1 == 21) {
                arg0.method8682();
            } else if (arg1 == 22) {
                arg0.method8682();
            } else if (arg1 == 23) {
                arg0.method8462();
                arg0.method8462();
                arg0.method8462();
            } else if (arg1 == 24) {
                arg0.method8465();
                arg0.method8465();
            } else if (arg1 == 25) {
                arg0.method8633();
            } else if (arg1 == 28) {
                arg0.method8462();
            } else if (arg1 == 29) {
                class206[] var9 = new class206[] { class206.field2088, class206.field2091, class206.field2087 };
                this.field2021 = (class206) class393.method3484(var9, arg0.method8462());
            } else if (arg1 == 30) {
                this.field2022 = (class210) class393.method3484(class210.method2877(), arg0.method8462());
            }
        }
    }

    @ObfuscatedName("hw.at(I)V")
    public void method3421() {
        if (this.field2014 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field2014.length; var1 += 2) {
            if (this.field2014[var1] < this.field2003) {
                this.field2003 = this.field2014[var1];
            } else if (this.field2014[var1] > this.field2019) {
                this.field2019 = this.field2014[var1];
            }
            if (this.field2014[var1 + 1] < this.field2018) {
                this.field2018 = this.field2014[var1 + 1];
            } else if (this.field2014[var1 + 1] > this.field2020) {
                this.field2020 = this.field2014[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hw.an(ZI)Lvg;")
    public class549 method3426(boolean arg0) {
        int var2 = arg0 ? this.field2008 : this.field2016;
        return this.method3423(var2);
    }

    @ObfuscatedName("hw.ao(IB)Lvg;")
    public class549 method3423(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class549 var2 = (class549) field2010.method5336((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class549 var3 = class550.method1978(Statics.field2026, arg0, 0);
        if (var3 != null) {
            field2010.method5346(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hw.ab(I)I")
    public int method3424() {
        return this.field2006;
    }
}
