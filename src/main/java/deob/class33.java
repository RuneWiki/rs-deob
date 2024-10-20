package deob;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.x")
    public static byte[] field756 = new byte[2048];

    @ObfuscatedName("al.b")
    public static byte[] field768 = new byte[2048];

    @ObfuscatedName("al.l")
    public static class120[] field757 = new class120[2048];

    @ObfuscatedName("al.d")
    public static int field754 = 0;

    @ObfuscatedName("al.n")
    public static int[] field762 = new int[2048];

    @ObfuscatedName("al.m")
    public static int field761 = 0;

    @ObfuscatedName("al.g")
    public static int[] field770 = new int[2048];

    @ObfuscatedName("al.s")
    public static int[] field763 = new int[2048];

    @ObfuscatedName("al.r")
    public static int[] field764 = new int[2048];

    @ObfuscatedName("al.k")
    public static int[] field765 = new int[2048];

    @ObfuscatedName("al.o")
    public static int field766 = 0;

    @ObfuscatedName("al.q")
    public static int[] field769 = new int[2048];

    @ObfuscatedName("al.p")
    public static class120 field758 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.x(Ldk;II)V")
    public static void method615(class123 arg0, int arg1) {
        boolean var2 = arg0.method2607(1) == 1;
        if (var2) {
            field769[++field766 - 1] = arg1;
        }
        int var3 = arg0.method2607(2);
        class3 var4 = client.field303[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field59 = false;
            } else if (client.field412 == arg1) {
                throw new RuntimeException();
            } else {
                field763[arg1] = (Statics.field577 + var4.field877[0] >> 6) + (Statics.field2735 + var4.field876[0] >> 6 << 14) + (var4.field36 << 28);
                if (var4.field849 == -1) {
                    field764[arg1] = var4.field872;
                } else {
                    field764[arg1] = var4.field849;
                }
                field765[arg1] = var4.field847;
                client.field303[arg1] = null;
                if (arg0.method2607(1) != 0) {
                    method2597(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2607(3);
            int var6 = var4.field876[0];
            int var7 = var4.field877[0];
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
            if (client.field412 == arg1 && var4.field838 < 1536 || var4.field881 < 1536 || var4.field838 >= 11776 || var4.field881 >= 11776) {
                var4.method34(var6, var7);
                var4.field59 = false;
            } else if (var2) {
                var4.field59 = true;
                var4.field60 = var6;
                var4.field56 = var7;
            } else {
                var4.field59 = false;
                var4.method19(var6, var7, field768[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2607(4);
            int var9 = var4.field876[0];
            int var10 = var4.field877[0];
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
            if (client.field412 == arg1 && var4.field838 < 1536 || var4.field881 < 1536 || var4.field838 >= 11776 || var4.field881 >= 11776) {
                var4.method34(var9, var10);
                var4.field59 = false;
            } else if (var2) {
                var4.field59 = true;
                var4.field60 = var9;
                var4.field56 = var10;
            } else {
                var4.field59 = false;
                var4.method19(var9, var10, field768[arg1]);
            }
        } else {
            int var11 = arg0.method2607(1);
            if (var11 == 0) {
                int var12 = arg0.method2607(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field876[0] + var14;
                int var17 = var4.field877[0] + var15;
                if (client.field412 == arg1 && var4.field838 < 1536 || var4.field881 < 1536 || var4.field838 >= 11776 || var4.field881 >= 11776) {
                    var4.method34(var16, var17);
                    var4.field59 = false;
                } else if (var2) {
                    var4.field59 = true;
                    var4.field60 = var16;
                    var4.field56 = var17;
                } else {
                    var4.field59 = false;
                    var4.method19(var16, var17, field768[arg1]);
                }
                var4.field36 = (byte) (var4.field36 + var13 & 0x3);
                if (client.field412 == arg1) {
                    Statics.field213 = var4.field36;
                }
            } else {
                int var18 = arg0.method2607(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2735 + var4.field876[0] + var20 & 0x3FFF) - Statics.field2735;
                int var23 = (Statics.field577 + var4.field877[0] + var21 & 0x3FFF) - Statics.field577;
                if (client.field412 == arg1 && var4.field838 < 1536 || var4.field881 < 1536 || var4.field838 >= 11776 || var4.field881 >= 11776) {
                    var4.method34(var22, var23);
                    var4.field59 = false;
                } else if (var2) {
                    var4.field59 = true;
                    var4.field60 = var22;
                    var4.field56 = var23;
                } else {
                    var4.field59 = false;
                    var4.method19(var22, var23, field768[arg1]);
                }
                var4.field36 = (byte) (var4.field36 + var19 & 0x3);
                if (client.field412 == arg1) {
                    Statics.field213 = var4.field36;
                }
            }
        }
    }

    @ObfuscatedName("dm.b(Ldk;II)Z")
    public static boolean method2597(class123 arg0, int arg1) {
        int var2 = arg0.method2607(2);
        if (var2 == 0) {
            if (arg0.method2607(1) != 0) {
                method2597(arg0, arg1);
            }
            int var3 = arg0.method2607(6);
            int var4 = arg0.method2607(6);
            boolean var5 = arg0.method2607(1) == 1;
            if (var5) {
                field769[++field766 - 1] = arg1;
            }
            if (client.field303[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field303[arg1] = new class3();
            var6.field38 = arg1;
            if (field757[arg1] != null) {
                var6.method16(field757[arg1]);
            }
            var6.field872 = field764[arg1];
            var6.field847 = field765[arg1];
            int var7 = field763[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field829[0] = field768[arg1];
            var6.field36 = (byte) var8;
            var6.method34((var9 << 6) + var3 - Statics.field2735, (var10 << 6) + var4 - Statics.field577);
            var6.field59 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2607(2);
            int var12 = field763[arg1];
            field763[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2607(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field763[arg1];
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
            field763[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2607(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field763[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field763[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ce.l(Ldk;ILx;II)V")
    public static final void method2183(class123 arg0, int arg1, class3 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x20) != 0) {
            int var5 = arg0.method2385();
            byte[] var6 = new byte[var5];
            class120 var7 = new class120(var6);
            arg0.method2396(var6, 0, var5);
            field757[arg1] = var7;
            arg2.method16(var7);
        }
        if ((arg3 & 0x80) != 0) {
            int var8 = arg0.method2387();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2385();
            client.method107(arg2, var8, var9);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field847 = arg0.method2387();
            if (arg2.field847 == 65535) {
                arg2.field847 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field825 = arg0.method2499();
            if (arg2.field825.charAt(0) == '~') {
                arg2.field825 = arg2.field825.substring(1);
                class12.method1120(2, arg2.field61, arg2.field825);
            } else if (Statics.field226 == arg2) {
                class12.method1120(2, arg2.field61, arg2.field825);
            }
            arg2.field836 = false;
            arg2.field853 = 0;
            arg2.field878 = 0;
            arg2.field883 = 150;
        }
        if ((arg3 & 0x10) != 0) {
            int var10 = arg0.method2387();
            int var11 = arg0.method2385();
            arg2.method779(var10, var11, client.field302);
            arg2.field844 = client.field302 + 300;
            arg2.field862 = arg0.method2385();
            arg2.field835 = arg0.method2385();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field849 = arg0.method2387();
            if (arg2.field875 == 0) {
                arg2.field872 = arg2.field849;
                arg2.field849 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var12 = arg0.method2387();
            class153 var13 = (class153) class110.method170(class153.method132(), arg0.method2385());
            boolean var14 = arg0.method2385() == 1;
            int var15 = arg0.method2385();
            int var16 = arg0.field1999;
            if (arg2.field61 != null && arg2.field37 != null) {
                boolean var17 = false;
                if (var13.field2263 && client.method44(arg2.field61)) {
                    var17 = true;
                }
                if (!var17 && client.field410 == 0 && !arg2.field47) {
                    field758.field1999 = 0;
                    arg0.method2396(field758.field2001, 0, var15);
                    field758.field1999 = 0;
                    class120 var18 = field758;
                    String var19 = class223.method3267(var18, 32767);
                    String var20 = class224.method3802(class164.method178(var19));
                    arg2.field825 = var20.trim();
                    arg2.field853 = var12 >> 8;
                    arg2.field878 = var12 & 0xFF;
                    arg2.field883 = 150;
                    arg2.field836 = var14;
                    arg2.field837 = Statics.field226 != arg2 && var13.field2263 && client.field508 != "" && var20.toLowerCase().indexOf(client.field508) == -1;
                    int var21;
                    if (var13.field2262) {
                        var21 = var14 ? 91 : 1;
                    } else {
                        var21 = var14 ? 90 : 2;
                    }
                    if (var13.field2261 == -1) {
                        class12.method1120(var21, arg2.field61, var20);
                    } else {
                        class12.method1120(var21, class2.method2318(var13.field2261) + arg2.field61, var20);
                    }
                }
            }
            arg0.field1999 = var15 + var16;
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field858 = arg0.method2387();
            int var22 = arg0.method2527();
            arg2.field843 = var22 >> 16;
            arg2.field861 = (var22 & 0xFFFF) + client.field302;
            arg2.field822 = 0;
            arg2.field860 = 0;
            if (arg2.field861 > client.field302) {
                arg2.field822 = -1;
            }
            if (arg2.field858 == 65535) {
                arg2.field858 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field863 = arg0.method2369();
            arg2.field865 = arg0.method2369();
            arg2.field839 = arg0.method2369();
            arg2.field845 = arg0.method2369();
            arg2.field824 = arg0.method2387() + client.field302;
            arg2.field867 = arg0.method2387() + client.field302;
            arg2.field851 = arg0.method2387();
            if (arg2.field59) {
                arg2.field863 += arg2.field60;
                arg2.field865 += arg2.field56;
                arg2.field839 += arg2.field60;
                arg2.field845 += arg2.field56;
                arg2.field875 = 0;
            } else {
                arg2.field863 += arg2.field876[0];
                arg2.field865 += arg2.field877[0];
                arg2.field839 += arg2.field876[0];
                arg2.field845 += arg2.field877[0];
                arg2.field875 = 1;
            }
            arg2.field880 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            int var23 = arg0.method2387();
            int var24 = arg0.method2385();
            arg2.method779(var23, var24, client.field302);
            arg2.field844 = client.field302 + 300;
            arg2.field862 = arg0.method2385();
            arg2.field835 = arg0.method2385();
        }
        if ((arg3 & 0x100) != 0) {
            field768[arg1] = arg0.method2369();
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method2369();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var25 = 0; var25 < 3; var25++) {
                arg2.field40[var25] = arg0.method2499();
            }
        }
        if (!arg2.field59) {
            return;
        }
        if (var4 == 127) {
            arg2.method34(arg2.field60, arg2.field56);
            return;
        }
        byte var26;
        if (var4 == -1) {
            var26 = field768[arg1];
        } else {
            var26 = var4;
        }
        arg2.method19(arg2.field60, arg2.field56, var26);
    }
}
