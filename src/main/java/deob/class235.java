package deob;

@ObfuscatedName("ja")
public class class235 extends class502 {

    @ObfuscatedName("ja.au")
    public static class315 field2467 = new class315(256);

    @ObfuscatedName("ja.ax")
    public final int field2468;

    @ObfuscatedName("ja.ao")
    public int field2478 = -1;

    @ObfuscatedName("ja.am")
    public int field2469 = -1;

    @ObfuscatedName("ja.ac")
    public String field2465;

    @ObfuscatedName("ja.ae")
    public int field2474;

    @ObfuscatedName("ja.ad")
    public int field2476 = 0;

    @ObfuscatedName("ja.al")
    public boolean field2470 = true;

    @ObfuscatedName("ja.aj")
    public boolean field2475 = false;

    @ObfuscatedName("ja.as")
    public String[] field2485 = new String[5];

    @ObfuscatedName("ja.aw")
    public String field2482;

    @ObfuscatedName("ja.af")
    public int[] field2471;

    @ObfuscatedName("ja.aa")
    public int field2479 = Integer.MAX_VALUE;

    @ObfuscatedName("ja.ah")
    public int field2472 = Integer.MAX_VALUE;

    @ObfuscatedName("ja.ag")
    public int field2481 = Integer.MIN_VALUE;

    @ObfuscatedName("ja.av")
    public int field2480 = Integer.MIN_VALUE;

    @ObfuscatedName("ja.ar")
    public class244 field2483 = class244.field2551;

    @ObfuscatedName("ja.ap")
    public class248 field2484 = class248.field2621;

    @ObfuscatedName("ja.ak")
    public int[] field2477;

    @ObfuscatedName("ja.ai")
    public byte[] field2486;

    @ObfuscatedName("ja.at")
    public int field2487 = -1;

    public class235(int arg0) {
        this.field2468 = arg0;
    }

    @ObfuscatedName("hx.ab(Lob;Lob;I)Z")
    public static boolean method3828(class389 arg0, class389 arg1) {
        Statics.field2473 = arg1;
        if (!arg0.method6652()) {
            return false;
        }
        Statics.field2466 = arg0.method6685(35);
        Statics.field4782 = new class235[Statics.field2466];
        for (int var2 = 0; var2 < Statics.field2466; var2++) {
            byte[] var3 = arg0.method6670(35, var2);
            Statics.field4782[var2] = new class235(var2);
            if (var3 != null) {
                Statics.field4782[var2].method4395(new class549(var3));
                Statics.field4782[var2].method4397();
            }
        }
        return true;
    }

    @ObfuscatedName("ep.ay(IB)Lja;")
    public static class235 method2700(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field4782.length || Statics.field4782[arg0] == null ? new class235(arg0) : Statics.field4782[arg0];
    }

    @ObfuscatedName("ja.an(Lvg;B)V")
    public void method4395(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4396(arg0, var2);
        }
    }

    @ObfuscatedName("ja.au(Lvg;II)V")
    public void method4396(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2478 = arg0.method8863();
        } else if (arg1 == 2) {
            this.field2469 = arg0.method8863();
        } else if (arg1 == 3) {
            this.field2465 = arg0.method8808();
        } else if (arg1 == 4) {
            this.field2474 = arg0.method8801();
        } else if (arg1 == 5) {
            arg0.method8801();
        } else if (arg1 == 6) {
            this.field2476 = arg0.method9025();
        } else if (arg1 == 7) {
            int var3 = arg0.method9025();
            if ((var3 & 0x1) == 0) {
                this.field2470 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field2475 = true;
            }
        } else if (arg1 == 8) {
            arg0.method9025();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2485[arg1 - 10] = arg0.method8808();
        } else if (arg1 == 15) {
            int var4 = arg0.method9025();
            this.field2471 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2471[var5] = arg0.method8919();
            }
            arg0.method8803();
            int var6 = arg0.method9025();
            this.field2477 = new int[var6];
            for (int var7 = 0; var7 < this.field2477.length; var7++) {
                this.field2477[var7] = arg0.method8803();
            }
            this.field2486 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field2486[var8] = arg0.method8798();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field2482 = arg0.method8808();
            } else if (arg1 == 18) {
                arg0.method8863();
            } else if (arg1 == 19) {
                this.field2487 = arg0.method8968();
            } else if (arg1 == 21) {
                arg0.method8803();
            } else if (arg1 == 22) {
                arg0.method8803();
            } else if (arg1 == 23) {
                arg0.method9025();
                arg0.method9025();
                arg0.method9025();
            } else if (arg1 == 24) {
                arg0.method8919();
                arg0.method8919();
            } else if (arg1 == 25) {
                arg0.method8863();
            } else if (arg1 == 28) {
                arg0.method9025();
            } else if (arg1 == 29) {
                this.field2483 = (class244) class403.method3083(class244.method3869(), arg0.method9025());
            } else if (arg1 == 30) {
                this.field2484 = (class248) class403.method3083(class248.method4615(), arg0.method9025());
            }
        }
    }

    @ObfuscatedName("ja.ax(B)V")
    public void method4397() {
        if (this.field2471 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field2471.length; var1 += 2) {
            if (this.field2471[var1] < this.field2479) {
                this.field2479 = this.field2471[var1];
            } else if (this.field2471[var1] > this.field2481) {
                this.field2481 = this.field2471[var1];
            }
            if (this.field2471[var1 + 1] < this.field2472) {
                this.field2472 = this.field2471[var1 + 1];
            } else if (this.field2471[var1 + 1] > this.field2480) {
                this.field2480 = this.field2471[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ja.ao(ZB)Lvc;")
    public class563 method4398(boolean arg0) {
        int var2 = arg0 ? this.field2469 : this.field2478;
        return this.method4399(var2);
    }

    @ObfuscatedName("ja.am(II)Lvc;")
    public class563 method4399(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class563 var2 = (class563) field2467.method5586((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class563 var3 = class564.method3898(Statics.field2473, arg0, 0);
        if (var3 != null) {
            field2467.method5589(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ja.ac(B)I")
    public int method4400() {
        return this.field2468;
    }

    @ObfuscatedName("eo.ae(B)V")
    public static void method2762() {
        field2467.method5588();
    }
}
