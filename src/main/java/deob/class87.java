package deob;

@ObfuscatedName("el")
public class class87 extends class177 {

    @ObfuscatedName("el.f")
    public int[] field1012 = new int[16];

    @ObfuscatedName("el.g")
    public int[] field1009 = new int[16];

    @ObfuscatedName("el.d")
    public int[] field1032 = new int[16];

    @ObfuscatedName("el.e")
    public int[] field1003 = new int[16];

    @ObfuscatedName("el.b")
    public int[] field1017 = new int[16];

    @ObfuscatedName("el.a")
    public class83[][] field1008 = new class83[16][128];

    @ObfuscatedName("el.n")
    public int[] field1025 = new int[16];

    @ObfuscatedName("el.o")
    public int field1005 = 1000000;

    @ObfuscatedName("el.j")
    public class2 field1015 = new class2(128);

    @ObfuscatedName("el.k")
    public int[] field1010 = new int[16];

    @ObfuscatedName("el.h")
    public int[] field1007 = new int[16];

    @ObfuscatedName("el.u")
    public int[] field1018 = new int[16];

    @ObfuscatedName("el.t")
    public int[] field1006 = new int[16];

    @ObfuscatedName("el.r")
    public int[] field1016 = new int[16];

    @ObfuscatedName("el.q")
    public int[] field1019 = new int[16];

    @ObfuscatedName("el.p")
    public int field1004 = 256;

    @ObfuscatedName("el.z")
    public int[] field1014 = new int[16];

    @ObfuscatedName("el.y")
    public int[] field1013 = new int[16];

    @ObfuscatedName("el.x")
    public int[] field1011 = new int[16];

    @ObfuscatedName("el.at")
    public class96 field1030 = new class96();

    @ObfuscatedName("el.aq")
    public class104 field1029 = new class104(this);

    @ObfuscatedName("el.ax")
    public int field1027;

    @ObfuscatedName("el.au")
    public boolean field1024;

    @ObfuscatedName("el.ad")
    public long field1028;

    @ObfuscatedName("el.aa")
    public class83[][] field1022 = new class83[16][128];

    @ObfuscatedName("el.ag")
    public int field1026;

    @ObfuscatedName("el.ah")
    public long field1021;

    @ObfuscatedName("el.j(II)V")
    public synchronized void method1190(int arg0) {
        this.field1004 = arg0;
    }

    @ObfuscatedName("el.p(S)I")
    public int method1191() {
        return this.field1004;
    }

    @ObfuscatedName("el.t(Lex;Leg;Lbg;II)Z")
    public synchronized boolean method1192(class55 arg0, class81 arg1, class126 arg2, int arg3) {
        arg0.method801();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class9 var7 = (class9) arg0.field474.method25(); var7 != null; var7 = (class9) arg0.field474.method23()) {
            int var8 = (int) var7.field11;
            class63 var9 = (class63) this.field1015.method20((long) var8);
            if (var9 == null) {
                var9 = class63.method1341(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1015.method22(var9, (long) var8);
            }
            if (!var9.method876(arg2, var7.field53, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method802();
        }
        return var5;
    }

    @ObfuscatedName("el.h(I)V")
    public synchronized void method1193() {
        for (class63 var1 = (class63) this.field1015.method25(); var1 != null; var1 = (class63) this.field1015.method23()) {
            var1.method870();
        }
    }

    @ObfuscatedName("el.r(I)V")
    public synchronized void method1194() {
        for (class63 var1 = (class63) this.field1015.method25(); var1 != null; var1 = (class63) this.field1015.method23()) {
            var1.method44();
        }
    }

    @ObfuscatedName("el.n(Lex;ZB)V")
    public synchronized void method1195(class55 arg0, boolean arg1) {
        this.method1196();
        this.field1030.method1417(arg0.field475);
        this.field1024 = arg1;
        this.field1021 = 0L;
        int var3 = this.field1030.method1416();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1030.method1364(var4);
            this.field1030.method1410(var4);
            this.field1030.method1365(var4);
        }
        this.field1027 = this.field1030.method1372();
        this.field1026 = this.field1030.field1113[this.field1027];
        this.field1028 = this.field1030.method1371(this.field1026);
    }

    @ObfuscatedName("el.g(I)V")
    public synchronized void method1196() {
        this.field1030.method1361();
        this.method1279();
    }

    @ObfuscatedName("el.e(I)Z")
    public synchronized boolean method1197() {
        return this.field1030.method1363();
    }

    @ObfuscatedName("el.f(III)V")
    public synchronized void method1198(int arg0, int arg1) {
        this.method1199(arg0, arg1);
    }

    @ObfuscatedName("el.x(III)V")
    public void method1199(int arg0, int arg1) {
        this.field1025[arg0] = arg1;
        this.field1003[arg0] = arg1 & 0xFFFFFF80;
        this.method1200(arg0, arg1);
    }

    @ObfuscatedName("el.z(IIB)V")
    public void method1200(int arg0, int arg1) {
        if (this.field1009[arg0] != arg1) {
            this.field1009[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1022[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("el.ai(B)V")
    public void method1201() {
        int var1 = this.field1027;
        int var2 = this.field1026;
        long var3 = this.field1028;
        while (this.field1026 == var2) {
            while (this.field1030.field1113[var1] == var2) {
                this.field1030.method1364(var1);
                int var5 = this.field1030.method1368(var1);
                if (var5 == 1) {
                    this.field1030.method1366();
                    this.field1030.method1365(var1);
                    if (this.field1030.method1373()) {
                        if (!this.field1024 || var2 == 0) {
                            this.method1279();
                            this.field1030.method1361();
                            return;
                        }
                        this.field1030.method1374(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method1213(var5);
                }
                this.field1030.method1410(var1);
                this.field1030.method1365(var1);
            }
            var1 = this.field1030.method1372();
            var2 = this.field1030.field1113[var1];
            var3 = this.field1030.method1371(var2);
        }
        this.field1027 = var1;
        this.field1026 = var2;
        this.field1028 = var3;
    }

    @ObfuscatedName("el.w(Lef;ZB)V")
    public void method1202(class83 arg0, boolean arg1) {
        int var3 = arg0.field950.field1779.length;
        int var5;
        if (arg1 && arg0.field950.field1780) {
            int var4 = var3 + var3 - arg0.field950.field1778;
            var5 = (int) ((long) this.field1010[arg0.field943] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field963.method3004(true);
            }
        } else {
            var5 = (int) ((long) this.field1010[arg0.field943] * (long) var3 >> 6);
        }
        arg0.field963.method2894(var5);
    }

    @ObfuscatedName("el.i(IIII)V")
    public void method1203(int arg0, int arg1, int arg2) {
        class83 var4 = this.field1008[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1008[arg0][arg1] = null;
        if ((this.field1018[arg0] & 0x2) == 0) {
            var4.field956 = 0;
            return;
        }
        for (class83 var5 = (class83) this.field1029.field1442.method253(); var5 != null; var5 = (class83) this.field1029.field1442.method255()) {
            if (var4.field943 == var5.field943 && var5.field956 < 0 && var4 != var5) {
                var4.field956 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("el.s(IIII)V")
    public void method1204(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("el.m(III)V")
    public void method1205(int arg0, int arg1) {
    }

    @ObfuscatedName("el.l(IIII)V")
    public void method1206(int arg0, int arg1, int arg2) {
        this.method1203(arg0, arg1, 64);
        if ((this.field1018[arg0] & 0x2) != 0) {
            for (class83 var4 = (class83) this.field1029.field1442.method254(); var4 != null; var4 = (class83) this.field1029.field1442.method256()) {
                if (var4.field943 == arg0 && var4.field956 < 0) {
                    this.field1008[arg0][var4.field945] = null;
                    this.field1008[arg0][arg1] = var4;
                    int var5 = (var4.field952 * var4.field951 >> 12) + var4.field957;
                    var4.field957 += arg1 - var4.field945 << 8;
                    var4.field951 = var5 - var4.field957;
                    var4.field952 = 4096;
                    var4.field945 = arg1;
                    return;
                }
            }
        }
        class63 var6 = (class63) this.field1015.method20((long) this.field1009[arg0]);
        if (var6 == null) {
            return;
        }
        class112 var7 = var6.field570[arg1];
        if (var7 == null) {
            return;
        }
        class83 var8 = new class83();
        var8.field943 = arg0;
        var8.field961 = var6;
        var8.field950 = var7;
        var8.field942 = var6.field575[arg1];
        var8.field946 = var6.field576[arg1];
        var8.field945 = arg1;
        var8.field948 = var6.field577 * arg2 * arg2 * var6.field571[arg1] + 1024 >> 11;
        var8.field960 = var6.field574[arg1] & 0xFF;
        var8.field957 = (arg1 << 8) - (var6.field572[arg1] & 0x7FFF);
        var8.field953 = 0;
        var8.field954 = 0;
        var8.field955 = 0;
        var8.field956 = -1;
        var8.field944 = 0;
        if (this.field1010[arg0] == 0) {
            var8.field963 = class160.method2899(var7, this.method1214(var8), this.method1216(var8), this.method1270(var8));
        } else {
            var8.field963 = class160.method2899(var7, this.method1214(var8), 0, this.method1270(var8));
            this.method1202(var8, var6.field572[arg1] < 0);
        }
        if (var6.field572[arg1] < 0) {
            var8.field963.method2901(-1);
        }
        if (var8.field946 >= 0) {
            class83 var9 = this.field1022[arg0][var8.field946];
            if (var9 != null && var9.field956 < 0) {
                this.field1008[arg0][var9.field945] = null;
                var9.field956 = 0;
            }
            this.field1022[arg0][var8.field946] = var8;
        }
        this.field1029.field1442.method248(var8);
        this.field1008[arg0][arg1] = var8;
    }

    @ObfuscatedName("el.c(II)V")
    public void method1207(int arg0) {
        for (class83 var2 = (class83) this.field1029.field1442.method253(); var2 != null; var2 = (class83) this.field1029.field1442.method255()) {
            if (arg0 < 0 || var2.field943 == arg0) {
                if (var2.field963 != null) {
                    var2.field963.method2911(Statics.field2851 / 100);
                    if (var2.field963.method2915()) {
                        this.field1029.field1437.method3240(var2.field963);
                    }
                    var2.method1169();
                }
                if (var2.field956 < 0) {
                    this.field1008[var2.field943][var2.field945] = null;
                }
                var2.method44();
            }
        }
    }

    @ObfuscatedName("el.u(II)V")
    public void method1208(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method1208(var2);
            }
            return;
        }
        this.field1006[arg0] = 12800;
        this.field1007[arg0] = 8192;
        this.field1016[arg0] = 16383;
        this.field1012[arg0] = 8192;
        this.field1011[arg0] = 0;
        this.field1014[arg0] = 8192;
        this.method1211(arg0);
        this.method1212(arg0);
        this.field1018[arg0] = 0;
        this.field1013[arg0] = 32767;
        this.field1017[arg0] = 256;
        this.field1010[arg0] = 0;
        this.method1261(arg0, 8192);
    }

    @ObfuscatedName("el.y(II)V")
    public void method1209(int arg0) {
        for (class83 var2 = (class83) this.field1029.field1442.method253(); var2 != null; var2 = (class83) this.field1029.field1442.method255()) {
            if ((arg0 < 0 || var2.field943 == arg0) && var2.field956 < 0) {
                this.field1008[var2.field943][var2.field945] = null;
                var2.field956 = 0;
            }
        }
    }

    @ObfuscatedName("el.at(IB)V")
    public void method1211(int arg0) {
        if ((this.field1018[arg0] & 0x2) == 0) {
            return;
        }
        for (class83 var2 = (class83) this.field1029.field1442.method253(); var2 != null; var2 = (class83) this.field1029.field1442.method255()) {
            if (var2.field943 == arg0 && this.field1008[arg0][var2.field945] == null && var2.field956 < 0) {
                var2.field956 = 0;
            }
        }
    }

    @ObfuscatedName("el.au(II)V")
    public void method1212(int arg0) {
        if ((this.field1018[arg0] & 0x4) == 0) {
            return;
        }
        for (class83 var2 = (class83) this.field1029.field1442.method253(); var2 != null; var2 = (class83) this.field1029.field1442.method255()) {
            if (var2.field943 == arg0) {
                var2.field962 = 0;
            }
        }
    }

    @ObfuscatedName("el.ax(IB)V")
    public void method1213(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method1203(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method1206(var6, var7, var8);
            } else {
                this.method1203(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method1204(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1003[var12] = (var14 << 14) + (this.field1003[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1003[var12] = (var14 << 7) + (this.field1003[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1011[var12] = (var14 << 7) + (this.field1011[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1011[var12] = (this.field1011[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1014[var12] = (var14 << 7) + (this.field1014[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1014[var12] = (this.field1014[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1006[var12] = (var14 << 7) + (this.field1006[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1006[var12] = (this.field1006[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1007[var12] = (var14 << 7) + (this.field1007[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1007[var12] = (this.field1007[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1016[var12] = (var14 << 7) + (this.field1016[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1016[var12] = (this.field1016[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1018[var12] |= 0x1;
                } else {
                    this.field1018[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1018[var12] |= 0x2;
                } else {
                    this.method1211(var12);
                    this.field1018[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1013[var12] = (var14 << 7) + (this.field1013[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1013[var12] = (this.field1013[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1013[var12] = (var14 << 7) + (this.field1013[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1013[var12] = (this.field1013[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method1207(var12);
            }
            if (var13 == 121) {
                this.method1208(var12);
            }
            if (var13 == 123) {
                this.method1209(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1013[var12];
                if (var15 == 16384) {
                    this.field1017[var12] = (var14 << 7) + (this.field1017[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1013[var12];
                if (var16 == 16384) {
                    this.field1017[var12] = (this.field1017[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1010[var12] = (var14 << 7) + (this.field1010[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1010[var12] = (this.field1010[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1018[var12] |= 0x4;
                } else {
                    this.method1212(var12);
                    this.field1018[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method1261(var12, (var14 << 7) + (this.field1019[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method1261(var12, (this.field1019[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method1200(var17, this.field1003[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method1205(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method1240(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method1279();
            }
        }
    }

    @ObfuscatedName("el.ah(Lef;I)I")
    public int method1214(class83 arg0) {
        int var2 = (arg0.field952 * arg0.field951 >> 12) + arg0.field957;
        int var3 = ((this.field1012[arg0.field943] - 8192) * this.field1017[arg0.field943] >> 12) + var2;
        class36 var4 = arg0.field942;
        if (var4.field212 > 0 && (var4.field216 > 0 || this.field1011[arg0.field943] > 0)) {
            int var5 = var4.field216 << 2;
            int var6 = var4.field220 << 1;
            if (arg0.field958 < var6) {
                var5 = arg0.field958 * var5 / var6;
            }
            int var7 = (this.field1011[arg0.field943] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field959 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field950.field1782 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2851 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("el.ad(Lef;I)I")
    public int method1216(class83 arg0) {
        class36 var2 = arg0.field942;
        int var3 = this.field1016[arg0.field943] * this.field1006[arg0.field943] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field948 * var4 + 16384 >> 15;
        int var6 = this.field1004 * var5 + 128 >> 8;
        if (var2.field218 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field953 * 1.953125E-5D * (double) var2.field218) + 0.5D);
        }
        if (var2.field219 != null) {
            int var7 = arg0.field954;
            int var8 = var2.field219[arg0.field955 + 1];
            if (arg0.field955 < var2.field219.length - 2) {
                int var9 = (var2.field219[arg0.field955] & 0xFF) << 8;
                int var10 = (var2.field219[arg0.field955 + 2] & 0xFF) << 8;
                var8 += (var2.field219[arg0.field955 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field956 > 0 && var2.field213 != null) {
            int var11 = arg0.field956;
            int var12 = var2.field213[arg0.field944 + 1];
            if (arg0.field944 < var2.field213.length - 2) {
                int var13 = (var2.field213[arg0.field944] & 0xFF) << 8;
                int var14 = (var2.field213[arg0.field944 + 2] & 0xFF) << 8;
                var12 += (var2.field213[arg0.field944 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("el.k()Lam;")
    public synchronized class177 method1218() {
        return this.field1029;
    }

    @ObfuscatedName("el.d()I")
    public synchronized int method1220() {
        return 0;
    }

    public class87() {
        this.method1279();
    }

    @ObfuscatedName("el.aa(I)V")
    public synchronized void method1221(int arg0) {
        if (this.field1030.method1363()) {
            int var2 = this.field1005 * this.field1030.field1110 / Statics.field2851;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1021;
                if (this.field1028 - var3 >= 0L) {
                    this.field1021 = var3;
                    break;
                }
                int var5 = (int) ((this.field1028 - this.field1021 + (long) var2 - 1L) / (long) var2);
                this.field1021 += (long) var2 * (long) var5;
                this.field1029.method1221(var5);
                arg0 -= var5;
                this.method1201();
            } while (this.field1030.method1363());
        }
        this.field1029.method1221(arg0);
    }

    @ObfuscatedName("el.ay(Lef;I)Z")
    public boolean method1223(class83 arg0) {
        if (arg0.field963 != null) {
            return false;
        }
        if (arg0.field956 >= 0) {
            arg0.method44();
            if (arg0.field946 > 0 && this.field1022[arg0.field943][arg0.field946] == arg0) {
                this.field1022[arg0.field943][arg0.field946] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("el.v(IIB)V")
    public void method1240(int arg0, int arg1) {
        this.field1012[arg0] = arg1;
    }

    @ObfuscatedName("el.ag(III)V")
    public void method1261(int arg0, int arg1) {
        this.field1019[arg0] = arg1;
        this.field1032[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("el.as(Lef;[IIII)Z")
    public boolean method1269(class83 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field947 = Statics.field2851 / 100;
        if (arg0.field956 >= 0 && arg0.field963 == null || arg0.field963.method2914()) {
            arg0.method1169();
            arg0.method44();
            if (arg0.field946 > 0 && this.field1022[arg0.field943][arg0.field946] == arg0) {
                this.field1022[arg0.field943][arg0.field946] = null;
            }
            return true;
        }
        int var5 = arg0.field952;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1014[arg0.field943] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field952 = var6;
        }
        arg0.field963.method3013(this.method1214(arg0));
        class36 var7 = arg0.field942;
        boolean var8 = false;
        arg0.field958++;
        arg0.field959 += var7.field212;
        double var9 = (double) ((arg0.field945 - 60 << 8) + (arg0.field952 * arg0.field951 >> 12)) * 5.086263020833333E-6D;
        if (var7.field218 > 0) {
            if (var7.field217 > 0) {
                arg0.field953 += (int) (128.0D * Math.pow(2.0D, (double) var7.field217 * var9) + 0.5D);
            } else {
                arg0.field953 += 128;
            }
        }
        if (var7.field219 != null) {
            if (var7.field215 > 0) {
                arg0.field954 += (int) (128.0D * Math.pow(2.0D, (double) var7.field215 * var9) + 0.5D);
            } else {
                arg0.field954 += 128;
            }
            while (arg0.field955 < var7.field219.length - 2 && arg0.field954 > (var7.field219[arg0.field955 + 2] & 0xFF) << 8) {
                arg0.field955 += 2;
            }
            if (arg0.field955 == var7.field219.length - 2 && var7.field219[arg0.field955 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field956 >= 0 && var7.field213 != null && (this.field1018[arg0.field943] & 0x1) == 0 && (arg0.field946 < 0 || this.field1022[arg0.field943][arg0.field946] != arg0)) {
            if (var7.field214 > 0) {
                arg0.field956 += (int) (128.0D * Math.pow(2.0D, (double) var7.field214 * var9) + 0.5D);
            } else {
                arg0.field956 += 128;
            }
            while (arg0.field944 < var7.field213.length - 2 && arg0.field956 > (var7.field213[arg0.field944 + 2] & 0xFF) << 8) {
                arg0.field944 += 2;
            }
            if (arg0.field944 == var7.field213.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field963.method2910(arg0.field947, this.method1216(arg0), this.method1270(arg0));
            return false;
        }
        arg0.field963.method2911(arg0.field947);
        if (arg1 == null) {
            arg0.field963.method1221(arg3);
        } else {
            arg0.field963.method1274(arg1, arg2, arg3);
        }
        if (arg0.field963.method2915()) {
            this.field1029.field1437.method3240(arg0.field963);
        }
        arg0.method1169();
        if (arg0.field956 >= 0) {
            arg0.method44();
            if (arg0.field946 > 0 && this.field1022[arg0.field943][arg0.field946] == arg0) {
                this.field1022[arg0.field943][arg0.field946] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("el.aq(Lef;B)I")
    public int method1270(class83 arg0) {
        int var2 = this.field1007[arg0.field943];
        return var2 < 8192 ? arg0.field960 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field960) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("el.a([III)V")
    public synchronized void method1274(int[] arg0, int arg1, int arg2) {
        if (this.field1030.method1363()) {
            int var4 = this.field1005 * this.field1030.field1110 / Statics.field2851;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1021;
                if (this.field1028 - var5 >= 0L) {
                    this.field1021 = var5;
                    break;
                }
                int var7 = (int) ((this.field1028 - this.field1021 + (long) var4 - 1L) / (long) var4);
                this.field1021 += (long) var4 * (long) var7;
                this.field1029.method1274(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method1201();
            } while (this.field1030.method1363());
        }
        this.field1029.method1274(arg0, arg1, arg2);
    }

    @ObfuscatedName("el.b(I)V")
    public void method1279() {
        this.method1207(-1);
        this.method1208(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1009[var1] = this.field1025[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1003[var2] = this.field1025[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("el.q()Lam;")
    public synchronized class177 method1289() {
        return null;
    }
}
