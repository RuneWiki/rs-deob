package deob;

@ObfuscatedName("fs")
public class class171 extends class199 {

    @ObfuscatedName("fs.b")
    public class187 field2810;

    @ObfuscatedName("fs.e")
    public byte[] field2811;

    @ObfuscatedName("fs.b(Lfj;II)Lfs;")
    public static class171 method3053(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2819(arg1, arg2);
        return var3 == null ? null : new class171(new class111(var3));
    }

    public class171(class111 arg0) {
        arg0.field1894 = arg0.field1897.length - 3;
        int var2 = arg0.method2127();
        int var3 = arg0.method2129();
        int var4 = var2 * 10 + 14;
        arg0.field1894 = 0;
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
                int var15 = arg0.method2127();
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
        int var19 = arg0.field1894;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method2143();
        }
        int var22 = arg0.field1894 - var19 + var18;
        int var23 = arg0.field1894;
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
            var36 = var36 + arg0.method2127() & 0x7F;
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
        int var39 = arg0.field1894;
        arg0.field1894 += var34;
        int var40 = arg0.field1894;
        arg0.field1894 += var11;
        int var41 = arg0.field1894;
        arg0.field1894 += var10;
        int var42 = arg0.field1894;
        arg0.field1894 += var9;
        int var43 = arg0.field1894;
        arg0.field1894 += var24;
        int var44 = arg0.field1894;
        arg0.field1894 += var26;
        int var45 = arg0.field1894;
        arg0.field1894 += var28;
        int var46 = arg0.field1894;
        arg0.field1894 += var7 + var8 + var11;
        int var47 = arg0.field1894;
        arg0.field1894 += var7;
        int var48 = arg0.field1894;
        arg0.field1894 += var35;
        int var49 = arg0.field1894;
        arg0.field1894 += var8;
        int var50 = arg0.field1894;
        arg0.field1894 += var25;
        int var51 = arg0.field1894;
        arg0.field1894 += var27;
        int var52 = arg0.field1894;
        arg0.field1894 += var29;
        int var53 = arg0.field1894;
        arg0.field1894 += var12;
        int var54 = arg0.field1894;
        arg0.field1894 += var9;
        int var55 = arg0.field1894;
        arg0.field1894 += var30;
        int var56 = arg0.field1894;
        arg0.field1894 += var31;
        int var57 = arg0.field1894;
        arg0.field1894 += var32;
        int var58 = arg0.field1894;
        arg0.field1894 += var33;
        int var59 = arg0.field1894;
        arg0.field1894 += var5 * 3;
        this.field2811 = new byte[var22];
        class111 var60 = new class111(this.field2811);
        var60.method2115(1297377380);
        var60.method2115(6);
        var60.method2201(var2 > 1 ? 1 : 0);
        var60.method2201(var2);
        var60.method2201(var3);
        arg0.field1894 = var19;
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
            var60.method2115(1297379947);
            var60.field1894 += 4;
            int var71 = var60.field1894;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method2143();
                    var60.method2126(var73);
                    int var74 = arg0.field1897[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method2112(255);
                        }
                        var60.method2112(47);
                        var60.method2112(0);
                        var60.method2122(var60.field1894 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method2112(255);
                        }
                        var60.method2112(81);
                        var60.method2112(3);
                        var60.method2112(arg0.field1897[var59++]);
                        var60.method2112(arg0.field1897[var59++]);
                        var60.method2112(arg0.field1897[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method2112(var61 + 144);
                            }
                            var62 += arg0.field1897[var46++];
                            var63 += arg0.field1897[var47++];
                            var60.method2112(var62 & 0x7F);
                            var60.method2112(var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method2112(var61 + 128);
                            }
                            var62 += arg0.field1897[var46++];
                            var64 += arg0.field1897[var49++];
                            var60.method2112(var62 & 0x7F);
                            var60.method2112(var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method2112(var61 + 176);
                            }
                            var69 = var69 + arg0.field1897[var23++] & 0x7F;
                            var60.method2112(var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field1897[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field1897[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field1897[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field1897[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field1897[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field1897[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field1897[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field1897[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field1897[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field1897[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field1897[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field1897[var39++];
                            } else {
                                var76 = arg0.field1897[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method2112(var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method2112(var61 + 224);
                            }
                            int var78 = var65 + arg0.field1897[var54++];
                            var65 = var78 + (arg0.field1897[var42++] << 7);
                            var60.method2112(var65 & 0x7F);
                            var60.method2112(var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method2112(var61 + 208);
                            }
                            var66 += arg0.field1897[var41++];
                            var60.method2112(var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method2112(var61 + 160);
                            }
                            var62 += arg0.field1897[var46++];
                            var67 += arg0.field1897[var40++];
                            var60.method2112(var62 & 0x7F);
                            var60.method2112(var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method2112(var61 + 192);
                            }
                            var60.method2112(arg0.field1897[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fs.e()V")
    public void method3056() {
        if (this.field2810 != null) {
            return;
        }
        this.field2810 = new class187(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var2[9] = 128;
        var1[9] = 128;
        class173 var4 = new class173(this.field2811);
        int var5 = var4.method3108();
        for (int var6 = 0; var6 < var5; var6++) {
            var4.method3079(var6);
            var4.method3081(var6);
            var4.method3114(var6);
        }
        label52: do {
            while (true) {
                int var7 = var4.method3087();
                int var8 = var4.field2821[var7];
                while (var4.field2821[var7] == var8) {
                    var4.method3079(var7);
                    int var9 = var4.method3083(var7);
                    if (var9 == 1) {
                        var4.method3115();
                        var4.method3114(var7);
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
                            class188 var20 = (class188) this.field2810.method3297((long) var19);
                            if (var20 == null) {
                                var20 = new class188(new byte[128]);
                                this.field2810.method3288(var20, (long) var19);
                            }
                            var20.field2985[var17] = 1;
                        }
                    }
                    var4.method3081(var7);
                    var4.method3114(var7);
                }
            }
        } while (!var4.method3086());
    }

    @ObfuscatedName("fs.a()V")
    public void method3054() {
        this.field2810 = null;
    }
}
