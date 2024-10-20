package deob;

@ObfuscatedName("ja")
public class class279 extends class411 {

    @ObfuscatedName("ja.s")
    public class421 field3262;

    @ObfuscatedName("ja.h")
    public byte[] field3263;

    @ObfuscatedName("ja.s(Lls;II)Lja;")
    public static class279 method4849(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5179(arg1, arg2);
        return var3 == null ? null : new class279(new class444(var3));
    }

    public class279(class444 arg0) {
        arg0.field4708 = arg0.field4707.length - 3;
        int var2 = arg0.method6929();
        int var3 = arg0.method7120();
        int var4 = var2 * 10 + 14;
        arg0.field4708 = 0;
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
                int var15 = arg0.method6929();
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
        int var19 = arg0.field4708;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method7119();
        }
        int var22 = arg0.field4708 - var19 + var18;
        int var23 = arg0.field4708;
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
            var36 = var36 + arg0.method6929() & 0x7F;
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
        int var39 = arg0.field4708;
        arg0.field4708 += var34;
        int var40 = arg0.field4708;
        arg0.field4708 += var11;
        int var41 = arg0.field4708;
        arg0.field4708 += var10;
        int var42 = arg0.field4708;
        arg0.field4708 += var9;
        int var43 = arg0.field4708;
        arg0.field4708 += var24;
        int var44 = arg0.field4708;
        arg0.field4708 += var26;
        int var45 = arg0.field4708;
        arg0.field4708 += var28;
        int var46 = arg0.field4708;
        arg0.field4708 += var7 + var8 + var11;
        int var47 = arg0.field4708;
        arg0.field4708 += var7;
        int var48 = arg0.field4708;
        arg0.field4708 += var35;
        int var49 = arg0.field4708;
        arg0.field4708 += var8;
        int var50 = arg0.field4708;
        arg0.field4708 += var25;
        int var51 = arg0.field4708;
        arg0.field4708 += var27;
        int var52 = arg0.field4708;
        arg0.field4708 += var29;
        int var53 = arg0.field4708;
        arg0.field4708 += var12;
        int var54 = arg0.field4708;
        arg0.field4708 += var9;
        int var55 = arg0.field4708;
        arg0.field4708 += var30;
        int var56 = arg0.field4708;
        arg0.field4708 += var31;
        int var57 = arg0.field4708;
        arg0.field4708 += var32;
        int var58 = arg0.field4708;
        arg0.field4708 += var33;
        int var59 = arg0.field4708;
        arg0.field4708 += var5 * 3;
        this.field3263 = new byte[var22];
        class444 var60 = new class444(this.field3263);
        var60.method6915(1297377380);
        var60.method6915(6);
        var60.method6913(var2 > 1 ? 1 : 0);
        var60.method6913(var2);
        var60.method6913(var3);
        arg0.field4708 = var19;
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
            var60.method6915(1297379947);
            var60.field4708 += 4;
            int var71 = var60.field4708;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method7119();
                    var60.method6928(var73);
                    int var74 = arg0.field4707[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method6912(255);
                        }
                        var60.method6912(47);
                        var60.method6912(0);
                        var60.method7052(var60.field4708 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method6912(255);
                        }
                        var60.method6912(81);
                        var60.method6912(3);
                        var60.method6912(arg0.field4707[var59++]);
                        var60.method6912(arg0.field4707[var59++]);
                        var60.method6912(arg0.field4707[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method6912(var61 + 144);
                            }
                            var62 += arg0.field4707[var46++];
                            var63 += arg0.field4707[var47++];
                            var60.method6912(var62 & 0x7F);
                            var60.method6912(var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method6912(var61 + 128);
                            }
                            var62 += arg0.field4707[var46++];
                            var64 += arg0.field4707[var49++];
                            var60.method6912(var62 & 0x7F);
                            var60.method6912(var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method6912(var61 + 176);
                            }
                            var69 = var69 + arg0.field4707[var23++] & 0x7F;
                            var60.method6912(var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field4707[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field4707[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field4707[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field4707[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field4707[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field4707[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field4707[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field4707[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field4707[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field4707[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field4707[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field4707[var39++];
                            } else {
                                var76 = arg0.field4707[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method6912(var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method6912(var61 + 224);
                            }
                            int var78 = var65 + arg0.field4707[var54++];
                            var65 = var78 + (arg0.field4707[var42++] << 7);
                            var60.method6912(var65 & 0x7F);
                            var60.method6912(var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method6912(var61 + 208);
                            }
                            var66 += arg0.field4707[var41++];
                            var60.method6912(var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method6912(var61 + 160);
                            }
                            var62 += arg0.field4707[var46++];
                            var67 += arg0.field4707[var40++];
                            var60.method6912(var62 & 0x7F);
                            var60.method6912(var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method6912(var61 + 192);
                            }
                            var60.method6912(arg0.field4707[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.h()V")
    public void method4854() {
        if (this.field3262 != null) {
            return;
        }
        this.field3262 = new class421(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var2[9] = 128;
        var1[9] = 128;
        class276 var4 = new class276(this.field3263);
        int var5 = var4.method4826();
        for (int var6 = 0; var6 < var5; var6++) {
            var4.method4792(var6);
            var4.method4825(var6);
            var4.method4790(var6);
        }
        label52: do {
            while (true) {
                int var7 = var4.method4797();
                int var8 = var4.field3247[var7];
                while (var4.field3247[var7] == var8) {
                    var4.method4792(var7);
                    int var9 = var4.method4793(var7);
                    if (var9 == 1) {
                        var4.method4791();
                        var4.method4790(var7);
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
                            class408 var20 = (class408) this.field3262.method6695((long) var19);
                            if (var20 == null) {
                                var20 = new class408(new byte[128]);
                                this.field3262.method6683(var20, (long) var19);
                            }
                            var20.field4465[var17] = 1;
                        }
                    }
                    var4.method4825(var7);
                    var4.method4790(var7);
                }
            }
        } while (!var4.method4804());
    }

    @ObfuscatedName("ja.w()V")
    public void method4855() {
        this.field3262 = null;
    }
}
