package deob;

@ObfuscatedName("ju")
public class class279 extends class409 {

    @ObfuscatedName("ju.v")
    public class419 field3234;

    @ObfuscatedName("ju.c")
    public byte[] field3235;

    @ObfuscatedName("ju.v(Lln;II)Lju;")
    public static class279 method4930(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5296(arg1, arg2);
        return var3 == null ? null : new class279(new class438(var3));
    }

    public class279(class438 arg0) {
        arg0.field4621 = arg0.field4618.length - 3;
        int var2 = arg0.method6971();
        int var3 = arg0.method7148();
        int var4 = var2 * 10 + 14;
        arg0.field4621 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var14 = -1;
            while (true) {
                int var15 = arg0.method6971();
                if (var14 != var15) {
                    var4++;
                }
                var14 = var15 & 0xF;
                if (var15 == 7) {
                    break;
                }
                if (var15 == 23) {
                    var5++;
                } else if (var14 == 0) {
                    var7++;
                } else if (var14 == 1) {
                    var8++;
                } else if (var14 == 2) {
                    var6++;
                } else if (var14 == 3) {
                    var9++;
                } else if (var14 == 4) {
                    var10++;
                } else if (var14 == 5) {
                    var11++;
                } else if (var14 == 6) {
                    var12++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        int var16 = var5 * 5 + var4;
        int var17 = (var7 + var8 + var6 + var9 + var11) * 2 + var16;
        int var18 = var10 + var12 + var17;
        int var19 = arg0.field4621;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method6990();
        }
        int var22 = arg0.field4621 - var19 + var18;
        int var23 = arg0.field4621;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        for (int var37 = 0; var37 < var6; var37++) {
            var36 = var36 + arg0.method6971() & 0x7F;
            if (var36 == 0 || var36 == 32) {
                var12++;
            } else if (var36 == 1) {
                var24++;
            } else if (var36 == 33) {
                var25++;
            } else if (var36 == 7) {
                var26++;
            } else if (var36 == 39) {
                var27++;
            } else if (var36 == 10) {
                var28++;
            } else if (var36 == 42) {
                var29++;
            } else if (var36 == 99) {
                var30++;
            } else if (var36 == 98) {
                var31++;
            } else if (var36 == 101) {
                var32++;
            } else if (var36 == 100) {
                var33++;
            } else if (var36 == 64 || var36 == 65 || var36 == 120 || var36 == 121 || var36 == 123) {
                var34++;
            } else {
                var35++;
            }
        }
        int var38 = 0;
        int var39 = arg0.field4621;
        arg0.field4621 += var34;
        int var40 = arg0.field4621;
        arg0.field4621 += var11;
        int var41 = arg0.field4621;
        arg0.field4621 += var10;
        int var42 = arg0.field4621;
        arg0.field4621 += var9;
        int var43 = arg0.field4621;
        arg0.field4621 += var24;
        int var44 = arg0.field4621;
        arg0.field4621 += var26;
        int var45 = arg0.field4621;
        arg0.field4621 += var28;
        int var46 = arg0.field4621;
        arg0.field4621 += var7 + var8 + var11;
        int var47 = arg0.field4621;
        arg0.field4621 += var7;
        int var48 = arg0.field4621;
        arg0.field4621 += var35;
        int var49 = arg0.field4621;
        arg0.field4621 += var8;
        int var50 = arg0.field4621;
        arg0.field4621 += var25;
        int var51 = arg0.field4621;
        arg0.field4621 += var27;
        int var52 = arg0.field4621;
        arg0.field4621 += var29;
        int var53 = arg0.field4621;
        arg0.field4621 += var12;
        int var54 = arg0.field4621;
        arg0.field4621 += var9;
        int var55 = arg0.field4621;
        arg0.field4621 += var30;
        int var56 = arg0.field4621;
        arg0.field4621 += var31;
        int var57 = arg0.field4621;
        arg0.field4621 += var32;
        int var58 = arg0.field4621;
        arg0.field4621 += var33;
        int var59 = arg0.field4621;
        arg0.field4621 += var5 * 3;
        this.field3235 = new byte[var22];
        class438 var60 = new class438(this.field3235);
        var60.method6957(1297377380);
        var60.method6957(6);
        var60.method6955(var2 > 1 ? 1 : 0);
        var60.method6955(var2);
        var60.method6955(var3);
        arg0.field4621 = var19;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int[] var68 = new int[128];
        int var69 = 0;
        label223: for (int var70 = 0; var70 < var2; var70++) {
            var60.method6957(1297379947);
            var60.field4621 += 4;
            int var71 = var60.field4621;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method6990();
                    var60.method7033(var73);
                    int var74 = arg0.field4618[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method6954(255);
                        }
                        var60.method6954(47);
                        var60.method6954(0);
                        var60.method6966(var60.field4621 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method6954(255);
                        }
                        var60.method6954(81);
                        var60.method6954(3);
                        var60.method6954(arg0.field4618[var59++]);
                        var60.method6954(arg0.field4618[var59++]);
                        var60.method6954(arg0.field4618[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method6954(var61 + 144);
                            }
                            var62 += arg0.field4618[var46++];
                            var63 += arg0.field4618[var47++];
                            var60.method6954(var62 & 0x7F);
                            var60.method6954(var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method6954(var61 + 128);
                            }
                            var62 += arg0.field4618[var46++];
                            var64 += arg0.field4618[var49++];
                            var60.method6954(var62 & 0x7F);
                            var60.method6954(var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method6954(var61 + 176);
                            }
                            var69 = var69 + arg0.field4618[var23++] & 0x7F;
                            var60.method6954(var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field4618[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field4618[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field4618[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field4618[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field4618[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field4618[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field4618[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field4618[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field4618[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field4618[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field4618[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field4618[var39++];
                            } else {
                                var76 = arg0.field4618[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method6954(var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method6954(var61 + 224);
                            }
                            int var78 = var65 + arg0.field4618[var54++];
                            var65 = var78 + (arg0.field4618[var42++] << 7);
                            var60.method6954(var65 & 0x7F);
                            var60.method6954(var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method6954(var61 + 208);
                            }
                            var66 += arg0.field4618[var41++];
                            var60.method6954(var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method6954(var61 + 160);
                            }
                            var62 += arg0.field4618[var46++];
                            var67 += arg0.field4618[var40++];
                            var60.method6954(var62 & 0x7F);
                            var60.method6954(var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method6954(var61 + 192);
                            }
                            var60.method6954(arg0.field4618[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ju.c()V")
    public void method4921() {
        if (this.field3234 != null) {
            return;
        }
        this.field3234 = new class419(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var2[9] = 128;
        var1[9] = 128;
        class276 var4 = new class276(this.field3235);
        int var5 = var4.method4844();
        for (int var6 = 0; var6 < var5; var6++) {
            var4.method4847(var6);
            var4.method4883(var6);
            var4.method4842(var6);
        }
        label52: do {
            while (true) {
                int var7 = var4.method4854();
                int var8 = var4.field3207[var7];
                while (var4.field3207[var7] == var8) {
                    var4.method4847(var7);
                    int var9 = var4.method4846(var7);
                    if (var9 == 1) {
                        var4.method4848();
                        var4.method4842(var7);
                        continue label52;
                    }
                    int var10 = var9 & 0xF0;
                    if (var10 == 176) {
                        int var11 = var9 & 0xF;
                        int var12 = var9 >> 8 & 0x7F;
                        int var13 = var9 >> 16 & 0x7F;
                        if (var12 == 0) {
                            var1[var11] = (var13 << 14) + (var1[var11] & 0xFFE03FFF);
                        }
                        if (var12 == 32) {
                            var1[var11] = (var13 << 7) + (var1[var11] & 0xFFFFC07F);
                        }
                    }
                    if (var10 == 192) {
                        int var14 = var9 & 0xF;
                        int var15 = var9 >> 8 & 0x7F;
                        var2[var14] = var1[var14] + var15;
                    }
                    if (var10 == 144) {
                        int var16 = var9 & 0xF;
                        int var17 = var9 >> 8 & 0x7F;
                        int var18 = var9 >> 16 & 0x7F;
                        if (var18 > 0) {
                            int var19 = var2[var16];
                            class406 var20 = (class406) this.field3234.method6772((long) var19);
                            if (var20 == null) {
                                var20 = new class406(new byte[128]);
                                this.field3234.method6773(var20, (long) var19);
                            }
                            var20.field4407[var17] = 1;
                        }
                    }
                    var4.method4883(var7);
                    var4.method4842(var7);
                }
            }
        } while (!var4.method4855());
    }

    @ObfuscatedName("ju.i()V")
    public void method4920() {
        this.field3234 = null;
    }
}
