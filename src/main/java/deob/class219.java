package deob;

@ObfuscatedName("iw")
public class class219 extends class484 {

    @ObfuscatedName("iw.ax")
    public static class302 field2170 = new class302(64);

    @ObfuscatedName("iw.ao")
    public static class302 field2171 = new class302(64);

    @ObfuscatedName("iw.ah")
    public static class302 field2184 = new class302(20);

    @ObfuscatedName("iw.aa")
    public int field2169 = -1;

    @ObfuscatedName("iw.ap")
    public int field2175 = 16777215;

    @ObfuscatedName("iw.ay")
    public int field2176 = 70;

    @ObfuscatedName("iw.as")
    public int field2179 = -1;

    @ObfuscatedName("iw.aj")
    public int field2186 = -1;

    @ObfuscatedName("iw.an")
    public int field2185 = -1;

    @ObfuscatedName("iw.au")
    public int field2180 = -1;

    @ObfuscatedName("iw.ai")
    public int field2181 = 0;

    @ObfuscatedName("iw.ae")
    public int field2172 = 0;

    @ObfuscatedName("iw.aw")
    public int field2183 = -1;

    @ObfuscatedName("iw.aq")
    public String field2177 = "";

    @ObfuscatedName("iw.az")
    public int field2178 = -1;

    @ObfuscatedName("iw.at")
    public int field2174 = 0;

    @ObfuscatedName("iw.af")
    public int[] field2187;

    @ObfuscatedName("iw.ad")
    public int field2188 = -1;

    @ObfuscatedName("iw.bn")
    public int field2189 = -1;

    @ObfuscatedName("ee.ac(Lom;Lom;Lom;I)V")
    public static void method2782(class374 arg0, class374 arg1, class374 arg2) {
        Statics.field2182 = arg0;
        Statics.field2168 = arg1;
        Statics.field1596 = arg2;
    }

    @ObfuscatedName("hn.al(IB)Liw;")
    public static class219 method3322(int arg0) {
        class219 var1 = (class219) field2170.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2182.method6342(32, arg0);
        class219 var3 = new class219();
        if (var2 != null) {
            var3.method3652(new class530(var2));
        }
        field2170.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.ak(Lul;S)V")
    public void method3652(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3669(arg0, var2);
        }
    }

    @ObfuscatedName("iw.ax(Lul;II)V")
    public void method3669(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2169 = arg0.method8385();
        } else if (arg1 == 2) {
            this.field2175 = arg0.method8445();
        } else if (arg1 == 3) {
            this.field2179 = arg0.method8385();
        } else if (arg1 == 4) {
            this.field2185 = arg0.method8385();
        } else if (arg1 == 5) {
            this.field2186 = arg0.method8385();
        } else if (arg1 == 6) {
            this.field2180 = arg0.method8385();
        } else if (arg1 == 7) {
            this.field2181 = arg0.method8368();
        } else if (arg1 == 8) {
            this.field2177 = arg0.method8377();
        } else if (arg1 == 9) {
            this.field2176 = arg0.method8598();
        } else if (arg1 == 10) {
            this.field2172 = arg0.method8368();
        } else if (arg1 == 11) {
            this.field2183 = 0;
        } else if (arg1 == 12) {
            this.field2178 = arg0.method8365();
        } else if (arg1 == 13) {
            this.field2174 = arg0.method8368();
        } else if (arg1 == 14) {
            this.field2183 = arg0.method8598();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2188 = arg0.method8598();
            if (this.field2188 == 65535) {
                this.field2188 = -1;
            }
            this.field2189 = arg0.method8598();
            if (this.field2189 == 65535) {
                this.field2189 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method8598();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method8365();
            this.field2187 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2187[var5] = arg0.method8598();
                if (this.field2187[var5] == 65535) {
                    this.field2187[var5] = -1;
                }
            }
            this.field2187[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("iw.ao(I)Liw;")
    public final class219 method3654() {
        int var1 = -1;
        if (this.field2188 != -1) {
            var1 = class336.method686(this.field2188);
        } else if (this.field2189 != -1) {
            var1 = class336.field3568[this.field2189];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2187.length - 1) {
            var2 = this.field2187[var1];
        } else {
            var2 = this.field2187[this.field2187.length - 1];
        }
        return var2 == -1 ? null : method3322(var2);
    }

    @ObfuscatedName("iw.ah(II)Ljava/lang/String;")
    public String method3681(int arg0) {
        String var2 = this.field2177;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class402.method5163(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("iw.ar(I)Lud;")
    public class544 method3656() {
        if (this.field2179 < 0) {
            return null;
        }
        class544 var1 = (class544) field2171.method5286((long) this.field2179);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field2168, this.field2179, 0);
        if (var2 != null) {
            field2171.method5289(var2, (long) this.field2179);
        }
        return var2;
    }

    @ObfuscatedName("iw.ab(I)Lud;")
    public class544 method3657() {
        if (this.field2186 < 0) {
            return null;
        }
        class544 var1 = (class544) field2171.method5286((long) this.field2186);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field2168, this.field2186, 0);
        if (var2 != null) {
            field2171.method5289(var2, (long) this.field2186);
        }
        return var2;
    }

    @ObfuscatedName("iw.am(B)Lud;")
    public class544 method3658() {
        if (this.field2185 < 0) {
            return null;
        }
        class544 var1 = (class544) field2171.method5286((long) this.field2185);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field2168, this.field2185, 0);
        if (var2 != null) {
            field2171.method5289(var2, (long) this.field2185);
        }
        return var2;
    }

    @ObfuscatedName("iw.av(I)Lud;")
    public class544 method3659() {
        if (this.field2180 < 0) {
            return null;
        }
        class544 var1 = (class544) field2171.method5286((long) this.field2180);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field2168, this.field2180, 0);
        if (var2 != null) {
            field2171.method5289(var2, (long) this.field2180);
        }
        return var2;
    }

    @ObfuscatedName("iw.ag(B)Lpu;")
    public class409 method3685() {
        if (this.field2169 == -1) {
            return null;
        }
        class409 var1 = (class409) field2184.method5286((long) this.field2169);
        if (var1 != null) {
            return var1;
        }
        class374 var2 = Statics.field2168;
        class374 var3 = Statics.field1596;
        int var4 = this.field2169;
        class409 var5;
        if (class545.method3115(var2, var4, 0)) {
            byte[] var6 = var3.method6342(var4, 0);
            class409 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class409 var8 = new class409(var6, Statics.field3506, Statics.field2854, Statics.field443, Statics.field5247, Statics.field4323, Statics.field4559);
                Statics.method6787();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field2184.method5289(var5, (long) this.field2169);
        }
        return var5;
    }
}
