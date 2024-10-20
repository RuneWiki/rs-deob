package deob;

@ObfuscatedName("hk")
public class class206 extends class470 {

    @ObfuscatedName("hk.am")
    public static class289 field2112 = new class289(64);

    @ObfuscatedName("hk.as")
    public static class289 field2113 = new class289(64);

    @ObfuscatedName("hk.aj")
    public static class289 field2114 = new class289(20);

    @ObfuscatedName("hk.at")
    public int field2118 = -1;

    @ObfuscatedName("hk.ah")
    public int field2119 = 16777215;

    @ObfuscatedName("hk.ax")
    public int field2124 = 70;

    @ObfuscatedName("hk.aa")
    public int field2115 = -1;

    @ObfuscatedName("hk.au")
    public int field2125 = -1;

    @ObfuscatedName("hk.ae")
    public int field2123 = -1;

    @ObfuscatedName("hk.ab")
    public int field2122 = -1;

    @ObfuscatedName("hk.ad")
    public int field2130 = 0;

    @ObfuscatedName("hk.ao")
    public int field2126 = 0;

    @ObfuscatedName("hk.ac")
    public int field2127 = -1;

    @ObfuscatedName("hk.ak")
    public String field2128 = "";

    @ObfuscatedName("hk.an")
    public int field2132 = -1;

    @ObfuscatedName("hk.af")
    public int field2110 = 0;

    @ObfuscatedName("hk.ai")
    public int[] field2131;

    @ObfuscatedName("hk.al")
    public int field2121 = -1;

    @ObfuscatedName("hk.bd")
    public int field2133 = -1;

    @ObfuscatedName("gi.aw(II)Lhk;")
    public static class206 method3238(int arg0) {
        class206 var1 = (class206) field2112.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2117.method6117(32, arg0);
        class206 var3 = new class206();
        if (var2 != null) {
            var3.method3545(new class514(var2));
        }
        field2112.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ay(Lty;I)V")
    public void method3545(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3544(arg0, var2);
        }
    }

    @ObfuscatedName("hk.ar(Lty;II)V")
    public void method3544(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2118 = arg0.method8310();
        } else if (arg1 == 2) {
            this.field2119 = arg0.method8248();
        } else if (arg1 == 3) {
            this.field2115 = arg0.method8310();
        } else if (arg1 == 4) {
            this.field2123 = arg0.method8310();
        } else if (arg1 == 5) {
            this.field2125 = arg0.method8310();
        } else if (arg1 == 6) {
            this.field2122 = arg0.method8310();
        } else if (arg1 == 7) {
            this.field2130 = arg0.method8497();
        } else if (arg1 == 8) {
            this.field2128 = arg0.method8256();
        } else if (arg1 == 9) {
            this.field2124 = arg0.method8246();
        } else if (arg1 == 10) {
            this.field2126 = arg0.method8497();
        } else if (arg1 == 11) {
            this.field2127 = 0;
        } else if (arg1 == 12) {
            this.field2132 = arg0.method8244();
        } else if (arg1 == 13) {
            this.field2110 = arg0.method8497();
        } else if (arg1 == 14) {
            this.field2127 = arg0.method8246();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2121 = arg0.method8246();
            if (this.field2121 == 65535) {
                this.field2121 = -1;
            }
            this.field2133 = arg0.method8246();
            if (this.field2133 == 65535) {
                this.field2133 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8246();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8244();
            this.field2131 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2131[var5] = arg0.method8246();
                if (this.field2131[var5] == 65535) {
                    this.field2131[var5] = -1;
                }
            }
            this.field2131[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hk.am(I)Lhk;")
    public final class206 method3565() {
        int var1 = -1;
        if (this.field2121 != -1) {
            var1 = class323.method4655(this.field2121);
        } else if (this.field2133 != -1) {
            var1 = class323.field3532[this.field2133];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2131.length - 1) {
            var2 = this.field2131[var1];
        } else {
            var2 = this.field2131[this.field2131.length - 1];
        }
        return var2 == -1 ? null : method3238(var2);
    }

    @ObfuscatedName("hk.as(II)Ljava/lang/String;")
    public String method3546(int arg0) {
        String var2 = this.field2128;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class388.method8172(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hk.aj(B)Lud;")
    public class528 method3543() {
        if (this.field2115 < 0) {
            return null;
        }
        class528 var1 = (class528) field2113.method5152((long) this.field2115);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field4439, this.field2115, 0);
        if (var2 != null) {
            field2113.method5149(var2, (long) this.field2115);
        }
        return var2;
    }

    @ObfuscatedName("hk.ag(B)Lud;")
    public class528 method3547() {
        if (this.field2125 < 0) {
            return null;
        }
        class528 var1 = (class528) field2113.method5152((long) this.field2125);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field4439, this.field2125, 0);
        if (var2 != null) {
            field2113.method5149(var2, (long) this.field2125);
        }
        return var2;
    }

    @ObfuscatedName("hk.az(B)Lud;")
    public class528 method3548() {
        if (this.field2123 < 0) {
            return null;
        }
        class528 var1 = (class528) field2113.method5152((long) this.field2123);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field4439, this.field2123, 0);
        if (var2 != null) {
            field2113.method5149(var2, (long) this.field2123);
        }
        return var2;
    }

    @ObfuscatedName("hk.av(I)Lud;")
    public class528 method3549() {
        if (this.field2122 < 0) {
            return null;
        }
        class528 var1 = (class528) field2113.method5152((long) this.field2122);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field4439, this.field2122, 0);
        if (var2 != null) {
            field2113.method5149(var2, (long) this.field2122);
        }
        return var2;
    }

    @ObfuscatedName("hk.ap(I)Lpc;")
    public class395 method3576() {
        if (this.field2118 == -1) {
            return null;
        }
        class395 var1 = (class395) field2114.method5152((long) this.field2118);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class529.method6975(Statics.field4439, Statics.field2111, this.field2118, 0);
        if (var2 != null) {
            field2114.method5149(var2, (long) this.field2118);
        }
        return var2;
    }
}
