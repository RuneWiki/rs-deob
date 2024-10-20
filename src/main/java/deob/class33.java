package deob;

@ObfuscatedName("ar")
public class class33 {

    @ObfuscatedName("ar.f")
    public static byte[] field741 = new byte[2048];

    @ObfuscatedName("ar.s")
    public static byte[] field731 = new byte[2048];

    @ObfuscatedName("ar.p")
    public static class120[] field730 = new class120[2048];

    @ObfuscatedName("ar.h")
    public static int field732 = 0;

    @ObfuscatedName("ar.g")
    public static int[] field733 = new int[2048];

    @ObfuscatedName("ar.a")
    public static int field734 = 0;

    @ObfuscatedName("ar.r")
    public static int[] field735 = new int[2048];

    @ObfuscatedName("ar.k")
    public static int[] field736 = new int[2048];

    @ObfuscatedName("ar.m")
    public static int[] field737 = new int[2048];

    @ObfuscatedName("ar.n")
    public static int[] field738 = new int[2048];

    @ObfuscatedName("ar.y")
    public static int field742 = 0;

    @ObfuscatedName("ar.i")
    public static int[] field740 = new int[2048];

    @ObfuscatedName("ar.j")
    public static class120 field727 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.e(Ldm;I)V")
    public static final void method134(class123 arg0) {
        arg0.method2587();
        int var1 = client.field402;
        class3 var2 = Statics.field573 = client.field388[var1] = new class3();
        var2.field57 = var1;
        int var3 = arg0.method2588(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field843[0] = var5 - Statics.field1440;
        var2.field805 = (var2.field843[0] << 7) + (var2.method23() << 6);
        var2.field844[0] = var6 - Statics.field129;
        var2.field815 = (var2.field844[0] << 7) + (var2.method23() << 6);
        Statics.field1064 = var2.field56 = var4;
        if (field730[var1] != null) {
            var2.method22(field730[var1]);
        }
        field732 = 0;
        field733[++field732 - 1] = var1;
        field741[var1] = 0;
        field734 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2588(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field736[var7] = (var9 << 28) + (var10 << 14) + var11;
                field737[var7] = 0;
                field738[var7] = -1;
                field735[++field734 - 1] = var7;
                field741[var7] = 0;
            }
        }
        arg0.method2586();
    }

    @ObfuscatedName("ae.w(Ldm;I)I")
    public static int method653(class123 arg0) {
        int var1 = arg0.method2588(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2588(5);
        } else if (var1 == 2) {
            var2 = arg0.method2588(8);
        } else {
            var2 = arg0.method2588(11);
        }
        return var2;
    }

    @ObfuscatedName("s.f(Ldm;II)V")
    public static void method41(class123 arg0, int arg1) {
        boolean var2 = arg0.method2588(1) == 1;
        if (var2) {
            field740[++field742 - 1] = arg1;
        }
        int var3 = arg0.method2588(2);
        class3 var4 = client.field388[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field45 = false;
            } else if (client.field402 == arg1) {
                throw new RuntimeException();
            } else {
                field736[arg1] = (Statics.field129 + var4.field844[0] >> 6) + (Statics.field1440 + var4.field843[0] >> 6 << 14) + (var4.field56 << 28);
                if (var4.field816 == -1) {
                    field737[arg1] = var4.field794;
                } else {
                    field737[arg1] = var4.field816;
                }
                field738[arg1] = var4.field846;
                client.field388[arg1] = null;
                if (arg0.method2588(1) != 0) {
                    method646(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2588(3);
            int var6 = var4.field843[0];
            int var7 = var4.field844[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field402 == arg1 && var4.field805 < 1536 || var4.field815 < 1536 || var4.field805 >= 11776 || var4.field815 >= 11776) {
                var4.method26(var6, var7);
                var4.field45 = false;
            } else if (var2) {
                var4.field45 = true;
                var4.field59 = var6;
                var4.field37 = var7;
            } else {
                var4.field45 = false;
                var4.method24(var6, var7, field731[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2588(4);
            int var9 = var4.field843[0];
            int var10 = var4.field844[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field402 == arg1 && var4.field805 < 1536 || var4.field815 < 1536 || var4.field805 >= 11776 || var4.field815 >= 11776) {
                var4.method26(var9, var10);
                var4.field45 = false;
            } else if (var2) {
                var4.field45 = true;
                var4.field59 = var9;
                var4.field37 = var10;
            } else {
                var4.field45 = false;
                var4.method24(var9, var10, field731[arg1]);
            }
        } else {
            int var11 = arg0.method2588(1);
            if (var11 == 0) {
                int var12 = arg0.method2588(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field843[0] + var14;
                int var17 = var4.field844[0] + var15;
                if (client.field402 == arg1 && var4.field805 < 1536 || var4.field815 < 1536 || var4.field805 >= 11776 || var4.field815 >= 11776) {
                    var4.method26(var16, var17);
                    var4.field45 = false;
                } else if (var2) {
                    var4.field45 = true;
                    var4.field59 = var16;
                    var4.field37 = var17;
                } else {
                    var4.field45 = false;
                    var4.method24(var16, var17, field731[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var13 & 0x3);
                if (client.field402 == arg1) {
                    Statics.field1064 = var4.field56;
                }
            } else {
                int var18 = arg0.method2588(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1440 + var4.field843[0] + var20 & 0x3FFF) - Statics.field1440;
                int var23 = (Statics.field129 + var4.field844[0] + var21 & 0x3FFF) - Statics.field129;
                if (client.field402 == arg1 && var4.field805 < 1536 || var4.field815 < 1536 || var4.field805 >= 11776 || var4.field815 >= 11776) {
                    var4.method26(var22, var23);
                    var4.field45 = false;
                } else if (var2) {
                    var4.field45 = true;
                    var4.field59 = var22;
                    var4.field37 = var23;
                } else {
                    var4.field45 = false;
                    var4.method24(var22, var23, field731[arg1]);
                }
                var4.field56 = (byte) (var4.field56 + var19 & 0x3);
                if (client.field402 == arg1) {
                    Statics.field1064 = var4.field56;
                }
            }
        }
    }

    @ObfuscatedName("ai.s(Ldm;II)Z")
    public static boolean method646(class123 arg0, int arg1) {
        int var2 = arg0.method2588(2);
        if (var2 == 0) {
            if (arg0.method2588(1) != 0) {
                method646(arg0, arg1);
            }
            int var3 = arg0.method2588(6);
            int var4 = arg0.method2588(6);
            boolean var5 = arg0.method2588(1) == 1;
            if (var5) {
                field740[++field742 - 1] = arg1;
            }
            if (client.field388[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field388[arg1] = new class3();
            var6.field57 = arg1;
            if (field730[arg1] != null) {
                var6.method22(field730[arg1]);
            }
            var6.field794 = field737[arg1];
            var6.field846 = field738[arg1];
            int var7 = field736[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field845[0] = field731[arg1];
            var6.field56 = (byte) var8;
            var6.method26((var9 << 6) + var3 - Statics.field1440, (var10 << 6) + var4 - Statics.field129);
            var6.field45 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2588(2);
            int var12 = field736[arg1];
            field736[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2588(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field736[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field736[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2588(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field736[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field736[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("w.p(Ldm;S)V")
    public static final void method15(class123 arg0) {
        for (int var1 = 0; var1 < field742; var1++) {
            int var2 = field740[var1];
            class3 var3 = client.field388[var2];
            int var4 = arg0.method2355();
            if ((var4 & 0x2) != 0) {
                var4 += arg0.method2355() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method2355();
                byte[] var7 = new byte[var6];
                class120 var8 = new class120(var7);
                arg0.method2541(var7, 0, var6);
                field730[var2] = var8;
                var3.method22(var8);
            }
            if ((var4 & 0x8) != 0) {
                int var9 = arg0.method2532();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2355();
                client.method1953(var3, var9, var10);
            }
            if ((var4 & 0x4) != 0) {
                var3.field846 = arg0.method2532();
                if (var3.field846 == 65535) {
                    var3.field846 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field802 = arg0.method2363();
                if (var3.field802.charAt(0) == '~') {
                    var3.field802 = var3.field802.substring(1);
                    class12.method1945(2, var3.field46, var3.field802);
                } else if (Statics.field573 == var3) {
                    class12.method1945(2, var3.field46, var3.field802);
                }
                var3.field803 = false;
                var3.field806 = 0;
                var3.field807 = 0;
                var3.field838 = 150;
            }
            if ((var4 & 0x40) != 0) {
                int var11 = arg0.method2532();
                int var12 = arg0.method2355();
                var3.method720(var11, var12, client.field290);
                var3.field811 = client.field290 + 300;
                var3.field837 = arg0.method2355();
                var3.field813 = arg0.method2355();
            }
            if ((var4 & 0x20) != 0) {
                var3.field816 = arg0.method2532();
                if (var3.field835 == 0) {
                    var3.field794 = var3.field816;
                    var3.field816 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var13 = arg0.method2532();
                class153 var14 = (class153) class110.method709(class153.method2676(), arg0.method2355());
                boolean var15 = arg0.method2355() == 1;
                int var16 = arg0.method2355();
                int var17 = arg0.field1977;
                if (var3.field46 != null && var3.field36 != null) {
                    boolean var18 = false;
                    if (var14.field2258 && client.method3002(var3.field46)) {
                        var18 = true;
                    }
                    if (!var18 && client.field308 == 0 && !var3.field55) {
                        field727.field1977 = 0;
                        arg0.method2541(field727.field1981, 0, var16);
                        field727.field1977 = 0;
                        class120 var19 = field727;
                        String var20 = class223.method1560(var19, 32767);
                        String var21 = class224.method3791(class164.method574(var20));
                        var3.field802 = var21.trim();
                        var3.field806 = var13 >> 8;
                        var3.field807 = var13 & 0xFF;
                        var3.field838 = 150;
                        var3.field803 = var15;
                        var3.field804 = Statics.field573 != var3 && var14.field2258 && client.field496 != "" && var21.toLowerCase().indexOf(client.field496) == -1;
                        int var22;
                        if (var14.field2255) {
                            var22 = var15 ? 91 : 1;
                        } else {
                            var22 = var15 ? 90 : 2;
                        }
                        if (var14.field2259 == -1) {
                            class12.method1945(var22, var3.field46, var21);
                        } else {
                            class12.method1945(var22, class2.method2037(var14.field2259) + var3.field46, var21);
                        }
                    }
                }
                arg0.field1977 = var16 + var17;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field825 = arg0.method2532();
                int var23 = arg0.method2360();
                var3.field829 = var23 >> 16;
                var3.field828 = (var23 & 0xFFFF) + client.field290;
                var3.field818 = 0;
                var3.field827 = 0;
                if (var3.field828 > client.field290) {
                    var3.field818 = -1;
                }
                if (var3.field825 == 65535) {
                    var3.field825 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field817 = arg0.method2465();
                var3.field832 = arg0.method2465();
                var3.field831 = arg0.method2465();
                var3.field789 = arg0.method2465();
                var3.field834 = arg0.method2532() + client.field290;
                var3.field821 = arg0.method2532() + client.field290;
                var3.field841 = arg0.method2532();
                if (var3.field45) {
                    var3.field817 += var3.field59;
                    var3.field832 += var3.field37;
                    var3.field831 += var3.field59;
                    var3.field789 += var3.field37;
                    var3.field835 = 0;
                } else {
                    var3.field817 += var3.field843[0];
                    var3.field832 += var3.field844[0];
                    var3.field831 += var3.field843[0];
                    var3.field789 += var3.field844[0];
                    var3.field835 = 1;
                }
                var3.field812 = 0;
            }
            if ((var4 & 0x400) != 0) {
                int var24 = arg0.method2532();
                int var25 = arg0.method2355();
                var3.method720(var24, var25, client.field290);
                var3.field811 = client.field290 + 300;
                var3.field837 = arg0.method2355();
                var3.field813 = arg0.method2355();
            }
            if ((var4 & 0x200) != 0) {
                field731[var2] = arg0.method2465();
            }
            if ((var4 & 0x800) != 0) {
                var5 = arg0.method2465();
            }
            if ((var4 & 0x100) != 0) {
                for (int var26 = 0; var26 < 3; var26++) {
                    var3.field47[var26] = arg0.method2363();
                }
            }
            if (var3.field45) {
                if (var5 == 127) {
                    var3.method26(var3.field59, var3.field37);
                } else {
                    byte var27;
                    if (var5 == -1) {
                        var27 = field731[var2];
                    } else {
                        var27 = var5;
                    }
                    var3.method24(var3.field59, var3.field37, var27);
                }
            }
        }
    }
}
