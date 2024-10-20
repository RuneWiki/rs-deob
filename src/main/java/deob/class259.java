package deob;

@ObfuscatedName("jc")
public class class259 extends class502 {

    @ObfuscatedName("jc.au")
    public static class315 field2712 = new class315(64);

    @ObfuscatedName("jc.ax")
    public static class315 field2705 = new class315(64);

    @ObfuscatedName("jc.ao")
    public static class315 field2706 = new class315(20);

    @ObfuscatedName("jc.al")
    public int field2714 = -1;

    @ObfuscatedName("jc.aj")
    public int field2702 = 16777215;

    @ObfuscatedName("jc.as")
    public int field2709 = 70;

    @ObfuscatedName("jc.aw")
    public int field2711 = -1;

    @ObfuscatedName("jc.af")
    public int field2717 = -1;

    @ObfuscatedName("jc.aa")
    public int field2710 = -1;

    @ObfuscatedName("jc.ah")
    public int field2713 = -1;

    @ObfuscatedName("jc.ag")
    public int field2715 = 0;

    @ObfuscatedName("jc.av")
    public int field2716 = 0;

    @ObfuscatedName("jc.ar")
    public int field2704 = -1;

    @ObfuscatedName("jc.ap")
    public String field2718 = "";

    @ObfuscatedName("jc.ak")
    public int field2719 = -1;

    @ObfuscatedName("jc.ai")
    public int field2720 = 0;

    @ObfuscatedName("jc.at")
    public int[] field2721;

    @ObfuscatedName("jc.az")
    public int field2722 = -1;

    @ObfuscatedName("jc.bg")
    public int field2723 = -1;

    @ObfuscatedName("tv.ab(II)Ljc;")
    public static class259 method8201(int arg0) {
        class259 var1 = (class259) field2712.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2708.method6670(32, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4672(new class549(var2));
        }
        field2712.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.ay(Lvg;I)V")
    public void method4672(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4673(arg0, var2);
        }
    }

    @ObfuscatedName("jc.an(Lvg;IB)V")
    public void method4673(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2714 = arg0.method8863();
        } else if (arg1 == 2) {
            this.field2702 = arg0.method8801();
        } else if (arg1 == 3) {
            this.field2711 = arg0.method8863();
        } else if (arg1 == 4) {
            this.field2710 = arg0.method8863();
        } else if (arg1 == 5) {
            this.field2717 = arg0.method8863();
        } else if (arg1 == 6) {
            this.field2713 = arg0.method8863();
        } else if (arg1 == 7) {
            this.field2715 = arg0.method8919();
        } else if (arg1 == 8) {
            this.field2718 = arg0.method8827();
        } else if (arg1 == 9) {
            this.field2709 = arg0.method8968();
        } else if (arg1 == 10) {
            this.field2716 = arg0.method8919();
        } else if (arg1 == 11) {
            this.field2704 = 0;
        } else if (arg1 == 12) {
            this.field2719 = arg0.method9025();
        } else if (arg1 == 13) {
            this.field2720 = arg0.method8919();
        } else if (arg1 == 14) {
            this.field2704 = arg0.method8968();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2722 = arg0.method8968();
            if (this.field2722 == 65535) {
                this.field2722 = -1;
            }
            this.field2723 = arg0.method8968();
            if (this.field2723 == 65535) {
                this.field2723 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8968();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method9025();
            this.field2721 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2721[var5] = arg0.method8968();
                if (this.field2721[var5] == 65535) {
                    this.field2721[var5] = -1;
                }
            }
            this.field2721[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jc.au(B)Ljc;")
    public final class259 method4674() {
        int var1 = -1;
        if (this.field2722 != -1) {
            var1 = class349.method3159(this.field2722);
        } else if (this.field2723 != -1) {
            var1 = class349.field3702[this.field2723];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2721.length - 1) {
            var2 = this.field2721[var1];
        } else {
            var2 = this.field2721[this.field2721.length - 1];
        }
        return var2 == -1 ? null : method8201(var2);
    }

    @ObfuscatedName("jc.ax(II)Ljava/lang/String;")
    public String method4675(int arg0) {
        String var2 = this.field2718;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class417.method5506(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jc.ao(I)Lvc;")
    public class563 method4676() {
        if (this.field2711 < 0) {
            return null;
        }
        class563 var1 = (class563) field2705.method5586((long) this.field2711);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field1625, this.field2711, 0);
        if (var2 != null) {
            field2705.method5589(var2, (long) this.field2711);
        }
        return var2;
    }

    @ObfuscatedName("jc.am(B)Lvc;")
    public class563 method4692() {
        if (this.field2717 < 0) {
            return null;
        }
        class563 var1 = (class563) field2705.method5586((long) this.field2717);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field1625, this.field2717, 0);
        if (var2 != null) {
            field2705.method5589(var2, (long) this.field2717);
        }
        return var2;
    }

    @ObfuscatedName("jc.ac(B)Lvc;")
    public class563 method4671() {
        if (this.field2710 < 0) {
            return null;
        }
        class563 var1 = (class563) field2705.method5586((long) this.field2710);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field1625, this.field2710, 0);
        if (var2 != null) {
            field2705.method5589(var2, (long) this.field2710);
        }
        return var2;
    }

    @ObfuscatedName("jc.ae(I)Lvc;")
    public class563 method4679() {
        if (this.field2713 < 0) {
            return null;
        }
        class563 var1 = (class563) field2705.method5586((long) this.field2713);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field1625, this.field2713, 0);
        if (var2 != null) {
            field2705.method5589(var2, (long) this.field2713);
        }
        return var2;
    }

    @ObfuscatedName("jc.ad(I)Lqe;")
    public class433 method4680() {
        if (this.field2714 == -1) {
            return null;
        }
        class433 var1 = (class433) field2706.method5586((long) this.field2714);
        if (var1 != null) {
            return var1;
        }
        class433 var2 = class564.method653(Statics.field1625, Statics.field2703, this.field2714, 0);
        if (var2 != null) {
            field2706.method5589(var2, (long) this.field2714);
        }
        return var2;
    }

    @ObfuscatedName("ji.aq(B)V")
    public static void method4511() {
        field2712.method5588();
        field2705.method5588();
        field2706.method5588();
    }
}
