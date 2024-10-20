package deob;

@ObfuscatedName("hi")
public class class202 extends class488 {

    @ObfuscatedName("hi.ai")
    public static class304 field2087 = new class304(64);

    @ObfuscatedName("hi.ar")
    public static class304 field2103 = new class304(64);

    @ObfuscatedName("hi.as")
    public static class304 field2089 = new class304(20);

    @ObfuscatedName("hi.ah")
    public int field2088 = -1;

    @ObfuscatedName("hi.aj")
    public int field2097 = 16777215;

    @ObfuscatedName("hi.af")
    public int field2093 = 70;

    @ObfuscatedName("hi.ax")
    public int field2094 = -1;

    @ObfuscatedName("hi.an")
    public int field2102 = -1;

    @ObfuscatedName("hi.ag")
    public int field2096 = -1;

    @ObfuscatedName("hi.am")
    public int field2092 = -1;

    @ObfuscatedName("hi.ad")
    public int field2101 = 0;

    @ObfuscatedName("hi.at")
    public int field2099 = 0;

    @ObfuscatedName("hi.ay")
    public int field2100 = -1;

    @ObfuscatedName("hi.ae")
    public String field2095 = "";

    @ObfuscatedName("hi.ac")
    public int field2085 = -1;

    @ObfuscatedName("hi.ab")
    public int field2091 = 0;

    @ObfuscatedName("hi.av")
    public int[] field2104;

    @ObfuscatedName("hi.ap")
    public int field2105 = -1;

    @ObfuscatedName("hi.bu")
    public int field2106 = -1;

    @ObfuscatedName("pe.aq(II)Lhi;")
    public static class202 method6652(int arg0) {
        class202 var1 = (class202) field2087.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2098.method6489(32, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3546(new class534(var2));
        }
        field2087.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.aw(Luq;I)V")
    public void method3546(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3547(arg0, var2);
        }
    }

    @ObfuscatedName("hi.al(Luq;IB)V")
    public void method3547(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2088 = arg0.method8811();
        } else if (arg1 == 2) {
            this.field2097 = arg0.method8595();
        } else if (arg1 == 3) {
            this.field2094 = arg0.method8811();
        } else if (arg1 == 4) {
            this.field2096 = arg0.method8811();
        } else if (arg1 == 5) {
            this.field2102 = arg0.method8811();
        } else if (arg1 == 6) {
            this.field2092 = arg0.method8811();
        } else if (arg1 == 7) {
            this.field2101 = arg0.method8594();
        } else if (arg1 == 8) {
            this.field2095 = arg0.method8603();
        } else if (arg1 == 9) {
            this.field2093 = arg0.method8593();
        } else if (arg1 == 10) {
            this.field2099 = arg0.method8594();
        } else if (arg1 == 11) {
            this.field2100 = 0;
        } else if (arg1 == 12) {
            this.field2085 = arg0.method8591();
        } else if (arg1 == 13) {
            this.field2091 = arg0.method8594();
        } else if (arg1 == 14) {
            this.field2100 = arg0.method8593();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2105 = arg0.method8593();
            if (this.field2105 == 65535) {
                this.field2105 = -1;
            }
            this.field2106 = arg0.method8593();
            if (this.field2106 == 65535) {
                this.field2106 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8593();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8591();
            this.field2104 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2104[var5] = arg0.method8593();
                if (this.field2104[var5] == 65535) {
                    this.field2104[var5] = -1;
                }
            }
            this.field2104[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("hi.ai(I)Lhi;")
    public final class202 method3576() {
        int var1 = -1;
        if (this.field2105 != -1) {
            var1 = class338.method5735(this.field2105);
        } else if (this.field2106 != -1) {
            var1 = class338.field3620[this.field2106];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2104.length - 1) {
            var2 = this.field2104[var1];
        } else {
            var2 = this.field2104[this.field2104.length - 1];
        }
        return var2 == -1 ? null : method6652(var2);
    }

    @ObfuscatedName("hi.ar(II)Ljava/lang/String;")
    public String method3563(int arg0) {
        String var2 = this.field2095;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class406.method4512(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("hi.as(I)Lvd;")
    public class548 method3581() {
        if (this.field2094 < 0) {
            return null;
        }
        class548 var1 = (class548) field2103.method5414((long) this.field2094);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field82, this.field2094, 0);
        if (var2 != null) {
            field2103.method5421(var2, (long) this.field2094);
        }
        return var2;
    }

    @ObfuscatedName("hi.aa(I)Lvd;")
    public class548 method3551() {
        if (this.field2102 < 0) {
            return null;
        }
        class548 var1 = (class548) field2103.method5414((long) this.field2102);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field82, this.field2102, 0);
        if (var2 != null) {
            field2103.method5421(var2, (long) this.field2102);
        }
        return var2;
    }

    @ObfuscatedName("hi.az(I)Lvd;")
    public class548 method3571() {
        if (this.field2096 < 0) {
            return null;
        }
        class548 var1 = (class548) field2103.method5414((long) this.field2096);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field82, this.field2096, 0);
        if (var2 != null) {
            field2103.method5421(var2, (long) this.field2096);
        }
        return var2;
    }

    @ObfuscatedName("hi.ao(S)Lvd;")
    public class548 method3553() {
        if (this.field2092 < 0) {
            return null;
        }
        class548 var1 = (class548) field2103.method5414((long) this.field2092);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field82, this.field2092, 0);
        if (var2 != null) {
            field2103.method5421(var2, (long) this.field2092);
        }
        return var2;
    }

    @ObfuscatedName("hi.au(B)Lpb;")
    public class413 method3573() {
        if (this.field2088 == -1) {
            return null;
        }
        class413 var1 = (class413) field2089.method5414((long) this.field2088);
        if (var1 != null) {
            return var1;
        }
        class378 var2 = Statics.field82;
        class378 var3 = Statics.field2086;
        int var4 = this.field2088;
        class413 var5;
        if (class549.method2926(var2, var4, 0)) {
            var5 = class549.method8535(var3.method6489(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2089.method5421(var5, (long) this.field2088);
        }
        return var5;
    }

    @ObfuscatedName("ci.ak(I)V")
    public static void method1059() {
        field2087.method5418();
        field2103.method5418();
        field2089.method5418();
    }
}
