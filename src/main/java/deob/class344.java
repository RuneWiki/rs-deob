package deob;

@ObfuscatedName("nk")
public class class344 extends class508 {

    @ObfuscatedName("nk.ac")
    public class524 field3701 = new class524(16);

    @ObfuscatedName("nk.ae")
    public byte[] field3700;

    @ObfuscatedName("nk.ac(Lpo;II)Lnk;")
    public static class344 method6047(class391 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6782(arg1, arg2);
        return var3 == null ? null : new class344(new class551(var3));
    }

    public class344(class551 arg0) {
        arg0.field5415 = arg0.field5413.length - 3;
        int var2 = arg0.method8955();
        int var3 = arg0.method9119();
        int var4 = var2 * 10 + 14;
        arg0.field5415 = 0;
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
                int var15 = arg0.method8955();
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
        int var19 = arg0.field5415;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method8994();
        }
        int var22 = arg0.field5415 - var19 + var18;
        int var23 = arg0.field5415;
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
            var36 = var36 + arg0.method8955() & 0x7F;
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
        int var39 = arg0.field5415;
        arg0.field5415 += var34;
        int var40 = arg0.field5415;
        arg0.field5415 += var11;
        int var41 = arg0.field5415;
        arg0.field5415 += var10;
        int var42 = arg0.field5415;
        arg0.field5415 += var9;
        int var43 = arg0.field5415;
        arg0.field5415 += var24;
        int var44 = arg0.field5415;
        arg0.field5415 += var26;
        int var45 = arg0.field5415;
        arg0.field5415 += var28;
        int var46 = arg0.field5415;
        arg0.field5415 += var7 + var8 + var11;
        int var47 = arg0.field5415;
        arg0.field5415 += var7;
        int var48 = arg0.field5415;
        arg0.field5415 += var35;
        int var49 = arg0.field5415;
        arg0.field5415 += var8;
        int var50 = arg0.field5415;
        arg0.field5415 += var25;
        int var51 = arg0.field5415;
        arg0.field5415 += var27;
        int var52 = arg0.field5415;
        arg0.field5415 += var29;
        int var53 = arg0.field5415;
        arg0.field5415 += var12;
        int var54 = arg0.field5415;
        arg0.field5415 += var9;
        int var55 = arg0.field5415;
        arg0.field5415 += var30;
        int var56 = arg0.field5415;
        arg0.field5415 += var31;
        int var57 = arg0.field5415;
        arg0.field5415 += var32;
        int var58 = arg0.field5415;
        arg0.field5415 += var33;
        int var59 = arg0.field5415;
        arg0.field5415 += var5 * 3;
        this.field3700 = new byte[var22];
        class551 var60 = new class551(this.field3700);
        var60.method8960(1297377380);
        var60.method8960(6);
        var60.method8958(var2 > 1 ? 1 : 0);
        var60.method8958(var2);
        var60.method8958(var3);
        arg0.field5415 = var19;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int[] var68 = new int[128];
        int var69 = 0;
        int[] var70 = new int[16];
        int[] var71 = new int[16];
        var71[9] = 128;
        var70[9] = 128;
        label235: for (int var73 = 0; var73 < var2; var73++) {
            var60.method8960(1297379947);
            var60.field5415 += 4;
            int var74 = var60.field5415;
            int var75 = var74;
            int var76 = -1;
            while (true) {
                while (true) {
                    int var77 = arg0.method8994();
                    var60.method9159(var77);
                    var75 += var77;
                    int var78 = arg0.field5413[var38++] & 0xFF;
                    boolean var79 = var76 != var78;
                    var76 = var78 & 0xF;
                    if (var78 == 7) {
                        if (var79) {
                            var60.method9022(255);
                        }
                        var60.method9022(47);
                        var60.method9022(0);
                        var60.method8969(var60.field5415 - var74);
                        continue label235;
                    }
                    if (var78 == 23) {
                        if (var79) {
                            var60.method9022(255);
                        }
                        var60.method9022(81);
                        var60.method9022(3);
                        var60.method9022(arg0.field5413[var59++]);
                        var60.method9022(arg0.field5413[var59++]);
                        var60.method9022(arg0.field5413[var59++]);
                    } else {
                        var61 ^= var78 >> 4;
                        if (var76 == 0) {
                            if (var79) {
                                var60.method9022(var61 + 144);
                            }
                            var62 += arg0.field5413[var46++];
                            var63 += arg0.field5413[var47++];
                            int var80 = var62 & 0x7F;
                            int var81 = var63 & 0x7F;
                            var60.method9022(var80);
                            var60.method9022(var81);
                            if (var81 > 0) {
                                int var82 = var71[var61];
                                class348 var83 = (class348) this.field3701.method8688((long) var82);
                                if (var83 == null) {
                                    var83 = new class348(var75);
                                    this.field3701.method8690(var83, (long) var82);
                                }
                                var83.field3742.set(var80);
                            }
                        } else if (var76 == 1) {
                            if (var79) {
                                var60.method9022(var61 + 128);
                            }
                            var62 += arg0.field5413[var46++];
                            var64 += arg0.field5413[var49++];
                            var60.method9022(var62 & 0x7F);
                            var60.method9022(var64 & 0x7F);
                        } else if (var76 == 2) {
                            if (var79) {
                                var60.method9022(var61 + 176);
                            }
                            var69 = var69 + arg0.field5413[var23++] & 0x7F;
                            var60.method9022(var69);
                            byte var84;
                            if (var69 == 0 || var69 == 32) {
                                var84 = arg0.field5413[var53++];
                            } else if (var69 == 1) {
                                var84 = arg0.field5413[var43++];
                            } else if (var69 == 33) {
                                var84 = arg0.field5413[var50++];
                            } else if (var69 == 7) {
                                var84 = arg0.field5413[var44++];
                            } else if (var69 == 39) {
                                var84 = arg0.field5413[var51++];
                            } else if (var69 == 10) {
                                var84 = arg0.field5413[var45++];
                            } else if (var69 == 42) {
                                var84 = arg0.field5413[var52++];
                            } else if (var69 == 99) {
                                var84 = arg0.field5413[var55++];
                            } else if (var69 == 98) {
                                var84 = arg0.field5413[var56++];
                            } else if (var69 == 101) {
                                var84 = arg0.field5413[var57++];
                            } else if (var69 == 100) {
                                var84 = arg0.field5413[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var84 = arg0.field5413[var39++];
                            } else {
                                var84 = arg0.field5413[var48++];
                            }
                            int var85 = var68[var69] + var84;
                            var68[var69] = var85;
                            int var86 = var85 & 0x7F;
                            var60.method9022(var86);
                            if (var69 == 0) {
                                var70[var61] = (var86 << 14) + (var70[var61] & 0xFFE03FFF);
                            }
                            if (var69 == 32) {
                                var70[var61] = (var86 << 7) + (var70[var61] & 0xFFFFC07F);
                            }
                        } else if (var76 == 3) {
                            if (var79) {
                                var60.method9022(var61 + 224);
                            }
                            int var87 = var65 + arg0.field5413[var54++];
                            var65 = var87 + (arg0.field5413[var42++] << 7);
                            var60.method9022(var65 & 0x7F);
                            var60.method9022(var65 >> 7 & 0x7F);
                        } else if (var76 == 4) {
                            if (var79) {
                                var60.method9022(var61 + 208);
                            }
                            var66 += arg0.field5413[var41++];
                            var60.method9022(var66 & 0x7F);
                        } else if (var76 == 5) {
                            if (var79) {
                                var60.method9022(var61 + 160);
                            }
                            var62 += arg0.field5413[var46++];
                            var67 += arg0.field5413[var40++];
                            var60.method9022(var62 & 0x7F);
                            var60.method9022(var67 & 0x7F);
                        } else if (var76 == 6) {
                            if (var79) {
                                var60.method9022(var61 + 192);
                            }
                            byte var88 = arg0.field5413[var53++];
                            var71[var61] = var70[var61] + var88;
                            var60.method9022(var88);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
