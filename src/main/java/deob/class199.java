package deob;

@ObfuscatedName("hr")
public class class199 extends class500 {

    @ObfuscatedName("hr.az")
    public static class312 field2017 = new class312(256);

    @ObfuscatedName("hr.af")
    public final int field2018;

    @ObfuscatedName("hr.aa")
    public int field2019 = -1;

    @ObfuscatedName("hr.at")
    public int field2035 = -1;

    @ObfuscatedName("hr.ab")
    public String field2021;

    @ObfuscatedName("hr.ac")
    public int field2026;

    @ObfuscatedName("hr.ao")
    public int field2023 = 0;

    @ObfuscatedName("hr.av")
    public boolean field2025 = true;

    @ObfuscatedName("hr.aq")
    public boolean field2029 = false;

    @ObfuscatedName("hr.ap")
    public String[] field2027 = new String[5];

    @ObfuscatedName("hr.ae")
    public String field2028;

    @ObfuscatedName("hr.ax")
    public int[] field2033;

    @ObfuscatedName("hr.ay")
    public int field2030 = Integer.MAX_VALUE;

    @ObfuscatedName("hr.au")
    public int field2031 = Integer.MAX_VALUE;

    @ObfuscatedName("hr.as")
    public int field2015 = Integer.MIN_VALUE;

    @ObfuscatedName("hr.aw")
    public int field2020 = Integer.MIN_VALUE;

    @ObfuscatedName("hr.ad")
    public class208 field2022 = class208.field2105;

    @ObfuscatedName("hr.ai")
    public class212 field2032 = class212.field2169;

    @ObfuscatedName("hr.an")
    public int[] field2036;

    @ObfuscatedName("hr.am")
    public byte[] field2037;

    @ObfuscatedName("hr.ar")
    public int field2038 = -1;

    public class199(int arg0) {
        this.field2018 = arg0;
    }

    @ObfuscatedName("ju.ak(Lor;Lor;B)Z")
    public static boolean method4736(class387 arg0, class387 arg1) {
        Statics.field2024 = arg1;
        if (!arg0.method6604()) {
            return false;
        }
        Statics.field1993 = arg0.method6591(35);
        Statics.field2016 = new class199[Statics.field1993];
        for (int var2 = 0; var2 < Statics.field1993; var2++) {
            byte[] var3 = arg0.method6573(35, var2);
            Statics.field2016[var2] = new class199(var2);
            if (var3 != null) {
                Statics.field2016[var2].method3524(new class546(var3));
                Statics.field2016[var2].method3526();
            }
        }
        return true;
    }

    @ObfuscatedName("hr.al(II)Lhr;")
    public static class199 method3551(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field2016.length || Statics.field2016[arg0] == null ? new class199(arg0) : Statics.field2016[arg0];
    }

    @ObfuscatedName("hr.aj(Lua;I)V")
    public void method3524(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3525(arg0, var2);
        }
    }

    @ObfuscatedName("hr.az(Lua;IB)V")
    public void method3525(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2019 = arg0.method8814();
        } else if (arg1 == 2) {
            this.field2035 = arg0.method8814();
        } else if (arg1 == 3) {
            this.field2021 = arg0.method8806();
        } else if (arg1 == 4) {
            this.field2026 = arg0.method8790();
        } else if (arg1 == 5) {
            arg0.method8790();
        } else if (arg1 == 6) {
            this.field2023 = arg0.method8796();
        } else if (arg1 == 7) {
            int var3 = arg0.method8796();
            if ((var3 & 0x1) == 0) {
                this.field2025 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field2029 = true;
            }
        } else if (arg1 == 8) {
            arg0.method8796();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2027[arg1 - 10] = arg0.method8806();
        } else if (arg1 == 15) {
            int var4 = arg0.method8796();
            this.field2033 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2033[var5] = arg0.method8926();
            }
            arg0.method8801();
            int var6 = arg0.method8796();
            this.field2036 = new int[var6];
            for (int var7 = 0; var7 < this.field2036.length; var7++) {
                this.field2036[var7] = arg0.method8801();
            }
            this.field2037 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field2037[var8] = arg0.method8797();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field2028 = arg0.method8806();
            } else if (arg1 == 18) {
                arg0.method8814();
            } else if (arg1 == 19) {
                this.field2038 = arg0.method8798();
            } else if (arg1 == 21) {
                arg0.method8801();
            } else if (arg1 == 22) {
                arg0.method8801();
            } else if (arg1 == 23) {
                arg0.method8796();
                arg0.method8796();
                arg0.method8796();
            } else if (arg1 == 24) {
                arg0.method8926();
                arg0.method8926();
            } else if (arg1 == 25) {
                arg0.method8814();
            } else if (arg1 == 28) {
                arg0.method8796();
            } else if (arg1 == 29) {
                this.field2022 = (class208) class401.method2027(class208.method2315(), arg0.method8796());
            } else if (arg1 == 30) {
                this.field2032 = (class212) class401.method2027(class212.method2637(), arg0.method8796());
            }
        }
    }

    @ObfuscatedName("hr.af(I)V")
    public void method3526() {
        if (this.field2033 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field2033.length; var1 += 2) {
            if (this.field2033[var1] < this.field2030) {
                this.field2030 = this.field2033[var1];
            } else if (this.field2033[var1] > this.field2015) {
                this.field2015 = this.field2033[var1];
            }
            if (this.field2033[var1 + 1] < this.field2031) {
                this.field2031 = this.field2033[var1 + 1];
            } else if (this.field2033[var1 + 1] > this.field2020) {
                this.field2020 = this.field2033[var1 + 1];
            }
        }
    }

    @ObfuscatedName("hr.aa(ZI)Lvc;")
    public class560 method3527(boolean arg0) {
        int var2 = arg0 ? this.field2035 : this.field2019;
        return this.method3528(var2);
    }

    @ObfuscatedName("hr.at(II)Lvc;")
    public class560 method3528(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class560 var2 = (class560) field2017.method5570((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class560 var3 = class561.method8728(Statics.field2024, arg0, 0);
        if (var3 != null) {
            field2017.method5564(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("hr.ab(I)I")
    public int method3529() {
        return this.field2018;
    }
}
