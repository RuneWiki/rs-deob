package deob;

@ObfuscatedName("af")
public class class33 {

    @ObfuscatedName("af.j")
    public static byte[] field749 = new byte[2048];

    @ObfuscatedName("af.d")
    public static byte[] field737 = new byte[2048];

    @ObfuscatedName("af.x")
    public static class120[] field738 = new class120[2048];

    @ObfuscatedName("af.y")
    public static int field739 = 0;

    @ObfuscatedName("af.r")
    public static int[] field740 = new int[2048];

    @ObfuscatedName("af.c")
    public static int field736 = 0;

    @ObfuscatedName("af.l")
    public static int[] field735 = new int[2048];

    @ObfuscatedName("af.u")
    public static int[] field742 = new int[2048];

    @ObfuscatedName("af.p")
    public static int[] field744 = new int[2048];

    @ObfuscatedName("af.n")
    public static int[] field745 = new int[2048];

    @ObfuscatedName("af.w")
    public static int field746 = 0;

    @ObfuscatedName("af.z")
    public static int[] field747 = new int[2048];

    @ObfuscatedName("af.k")
    public static class120 field741 = new class120(new byte[5000]);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.b(Lda;B)V")
    public static final void method2283(class123 arg0) {
        arg0.method2622();
        int var1 = client.field431;
        class3 var2 = Statics.field2263 = client.field411[var1] = new class3();
        var2.field49 = var1;
        int var3 = arg0.method2614(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field845[0] = var5 - Statics.field63;
        var2.field814 = (var2.field845[0] << 7) + (var2.method15() << 6);
        var2.field832[0] = var6 - Statics.field1435;
        var2.field792 = (var2.field832[0] << 7) + (var2.method15() << 6);
        Statics.field2194 = var2.field48 = var4;
        if (field738[var1] != null) {
            var2.method14(field738[var1]);
        }
        field739 = 0;
        field740[++field739 - 1] = var1;
        field749[var1] = 0;
        field736 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method2614(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0xFF;
                int var11 = var8 & 0xFF;
                field742[var7] = (var9 << 28) + (var10 << 14) + var11;
                field744[var7] = 0;
                field745[var7] = -1;
                field735[++field736 - 1] = var7;
                field749[var7] = 0;
            }
        }
        arg0.method2615();
    }

    @ObfuscatedName("dv.g(Lda;II)V")
    public static final void method2292(class123 arg0, int arg1) {
        int var2 = arg0.field1977;
        field746 = 0;
        int var3 = 0;
        arg0.method2622();
        for (int var4 = 0; var4 < field739; var4++) {
            int var5 = field740[var4];
            if ((field749[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var5] = (byte) (field749[var5] | 0x2);
                } else {
                    int var6 = arg0.method2614(1);
                    if (var6 == 0) {
                        var3 = Statics.method1154(arg0);
                        field749[var5] = (byte) (field749[var5] | 0x2);
                    } else {
                        method2697(arg0, var5);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2622();
        for (int var7 = 0; var7 < field739; var7++) {
            int var8 = field740[var7];
            if ((field749[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var8] = (byte) (field749[var8] | 0x2);
                } else {
                    int var9 = arg0.method2614(1);
                    if (var9 == 0) {
                        var3 = Statics.method1154(arg0);
                        field749[var8] = (byte) (field749[var8] | 0x2);
                    } else {
                        method2697(arg0, var8);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2622();
        for (int var10 = 0; var10 < field736; var10++) {
            int var11 = field735[var10];
            if ((field749[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var11] = (byte) (field749[var11] | 0x2);
                } else {
                    int var12 = arg0.method2614(1);
                    if (var12 == 0) {
                        var3 = Statics.method1154(arg0);
                        field749[var11] = (byte) (field749[var11] | 0x2);
                    } else if (method2131(arg0, var11)) {
                        field749[var11] = (byte) (field749[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method2622();
        for (int var13 = 0; var13 < field736; var13++) {
            int var14 = field735[var13];
            if ((field749[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field749[var14] = (byte) (field749[var14] | 0x2);
                } else {
                    int var15 = arg0.method2614(1);
                    if (var15 == 0) {
                        var3 = Statics.method1154(arg0);
                        field749[var14] = (byte) (field749[var14] | 0x2);
                    } else if (method2131(arg0, var14)) {
                        field749[var14] = (byte) (field749[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method2615();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field739 = 0;
        field736 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field749[var16] = (byte) (field749[var16] >> 1);
            class3 var17 = client.field411[var16];
            if (var17 == null) {
                field735[++field736 - 1] = var16;
            } else {
                field740[++field739 - 1] = var16;
            }
        }
        method2823(arg0);
        if (arg0.field1977 - var2 != arg1) {
            throw new RuntimeException(arg0.field1977 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ei.d(Lda;IB)V")
    public static void method2697(class123 arg0, int arg1) {
        boolean var2 = arg0.method2614(1) == 1;
        if (var2) {
            field747[++field746 - 1] = arg1;
        }
        int var3 = arg0.method2614(2);
        class3 var4 = client.field411[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field30 = false;
            } else if (client.field431 == arg1) {
                throw new RuntimeException();
            } else {
                field742[arg1] = (Statics.field1435 + var4.field832[0] >> 6) + (Statics.field63 + var4.field845[0] >> 6 << 14) + (var4.field48 << 28);
                if (var4.field818 == -1) {
                    field744[arg1] = var4.field841;
                } else {
                    field744[arg1] = var4.field818;
                }
                field745[arg1] = var4.field816;
                client.field411[arg1] = null;
                if (arg0.method2614(1) != 0) {
                    method2131(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2614(3);
            int var6 = var4.field845[0];
            int var7 = var4.field832[0];
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
            if (client.field431 == arg1 && var4.field814 < 1536 || var4.field792 < 1536 || var4.field814 >= 11776 || var4.field792 >= 11776) {
                var4.method18(var6, var7);
                var4.field30 = false;
            } else if (var2) {
                var4.field30 = true;
                var4.field51 = var6;
                var4.field52 = var7;
            } else {
                var4.field30 = false;
                var4.method17(var6, var7, field737[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2614(4);
            int var9 = var4.field845[0];
            int var10 = var4.field832[0];
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
            if (client.field431 == arg1 && var4.field814 < 1536 || var4.field792 < 1536 || var4.field814 >= 11776 || var4.field792 >= 11776) {
                var4.method18(var9, var10);
                var4.field30 = false;
            } else if (var2) {
                var4.field30 = true;
                var4.field51 = var9;
                var4.field52 = var10;
            } else {
                var4.field30 = false;
                var4.method17(var9, var10, field737[arg1]);
            }
        } else {
            int var11 = arg0.method2614(1);
            if (var11 == 0) {
                int var12 = arg0.method2614(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field845[0] + var14;
                int var17 = var4.field832[0] + var15;
                if (client.field431 == arg1 && var4.field814 < 1536 || var4.field792 < 1536 || var4.field814 >= 11776 || var4.field792 >= 11776) {
                    var4.method18(var16, var17);
                    var4.field30 = false;
                } else if (var2) {
                    var4.field30 = true;
                    var4.field51 = var16;
                    var4.field52 = var17;
                } else {
                    var4.field30 = false;
                    var4.method17(var16, var17, field737[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var13 & 0x3);
                if (client.field431 == arg1) {
                    Statics.field2194 = var4.field48;
                }
            } else {
                int var18 = arg0.method2614(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field63 + var4.field845[0] + var20 & 0x3FFF) - Statics.field63;
                int var23 = (Statics.field1435 + var4.field832[0] + var21 & 0x3FFF) - Statics.field1435;
                if (client.field431 == arg1 && var4.field814 < 1536 || var4.field792 < 1536 || var4.field814 >= 11776 || var4.field792 >= 11776) {
                    var4.method18(var22, var23);
                    var4.field30 = false;
                } else if (var2) {
                    var4.field30 = true;
                    var4.field51 = var22;
                    var4.field52 = var23;
                } else {
                    var4.field30 = false;
                    var4.method17(var22, var23, field737[arg1]);
                }
                var4.field48 = (byte) (var4.field48 + var19 & 0x3);
                if (client.field431 == arg1) {
                    Statics.field2194 = var4.field48;
                }
            }
        }
    }

    @ObfuscatedName("cw.x(Lda;IB)Z")
    public static boolean method2131(class123 arg0, int arg1) {
        int var2 = arg0.method2614(2);
        if (var2 == 0) {
            if (arg0.method2614(1) != 0) {
                method2131(arg0, arg1);
            }
            int var3 = arg0.method2614(6);
            int var4 = arg0.method2614(6);
            boolean var5 = arg0.method2614(1) == 1;
            if (var5) {
                field747[++field746 - 1] = arg1;
            }
            if (client.field411[arg1] != null) {
                throw new RuntimeException();
            }
            class3 var6 = client.field411[arg1] = new class3();
            var6.field49 = arg1;
            if (field738[arg1] != null) {
                var6.method14(field738[arg1]);
            }
            var6.field841 = field744[arg1];
            var6.field816 = field745[arg1];
            int var7 = field742[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field847[0] = field737[arg1];
            var6.field48 = (byte) var8;
            var6.method18((var9 << 6) + var3 - Statics.field63, (var10 << 6) + var4 - Statics.field1435);
            var6.field30 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2614(2);
            int var12 = field742[arg1];
            field742[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2614(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field742[arg1];
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
            field742[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2614(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field742[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field742[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("es.y(Lda;B)V")
    public static final void method2823(class123 arg0) {
        for (int var1 = 0; var1 < field746; var1++) {
            int var2 = field747[var1];
            class3 var3 = client.field411[var2];
            int var4 = arg0.method2344();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method2344() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x1) != 0) {
                int var6 = arg0.method2344();
                byte[] var7 = new byte[var6];
                class120 var8 = new class120(var7);
                arg0.method2355(var7, 0, var6);
                field738[var2] = var8;
                var3.method14(var8);
            }
            if ((var4 & 0x40) != 0) {
                int var9 = arg0.method2346();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2344();
                client.method2941(var3, var9, var10);
            }
            if ((var4 & 0x8) != 0) {
                var3.field816 = arg0.method2346();
                if (var3.field816 == 65535) {
                    var3.field816 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field804 = arg0.method2352();
                if (var3.field804.charAt(0) == '~') {
                    var3.field804 = var3.field804.substring(1);
                    class12.method936(2, var3.field27, var3.field804);
                } else if (Statics.field2263 == var3) {
                    class12.method936(2, var3.field27, var3.field804);
                }
                var3.field842 = false;
                var3.field808 = 0;
                var3.field805 = 0;
                var3.field807 = 150;
            }
            if ((var4 & 0x80) != 0) {
                int var11 = arg0.method2346();
                int var12 = arg0.method2344();
                var3.method740(var11, var12, client.field297);
                var3.field813 = client.field297 + 300;
                var3.field795 = arg0.method2344();
                var3.field815 = arg0.method2344();
            }
            if ((var4 & 0x20) != 0) {
                var3.field818 = arg0.method2346();
                if (var3.field809 == 0) {
                    var3.field841 = var3.field818;
                    var3.field818 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var13 = arg0.method2346();
                class153 var14 = (class153) class110.method2955(class153.method40(), arg0.method2344());
                boolean var15 = arg0.method2344() == 1;
                int var16 = arg0.method2344();
                int var17 = arg0.field1977;
                if (var3.field27 != null && var3.field50 != null) {
                    boolean var18 = false;
                    if (var14.field2253 && client.method934(var3.field27)) {
                        var18 = true;
                    }
                    if (!var18 && client.field410 == 0 && !var3.field41) {
                        field741.field1977 = 0;
                        arg0.method2355(field741.field1983, 0, var16);
                        field741.field1977 = 0;
                        class120 var19 = field741;
                        String var20 = class223.method3220(var19, 32767);
                        String var21 = class224.method3763(class164.method1755(var20));
                        var3.field804 = var21.trim();
                        var3.field808 = var13 >> 8;
                        var3.field805 = var13 & 0xFF;
                        var3.field807 = 150;
                        var3.field842 = var15;
                        var3.field806 = Statics.field2263 != var3 && var14.field2253 && client.field504 != "" && var21.toLowerCase().indexOf(client.field504) == -1;
                        int var22;
                        if (var14.field2251) {
                            var22 = var15 ? 91 : 1;
                        } else {
                            var22 = var15 ? 90 : 2;
                        }
                        if (var14.field2250 == -1) {
                            class12.method936(var22, var3.field27, var21);
                        } else {
                            class12.method936(var22, class2.method1152(var14.field2250) + var3.field27, var21);
                        }
                    }
                }
                arg0.field1977 = var16 + var17;
            }
            if ((var4 & 0x100) != 0) {
                var3.field836 = arg0.method2346();
                int var23 = arg0.method2349();
                var3.field835 = var23 >> 16;
                var3.field830 = (var23 & 0xFFFF) + client.field297;
                var3.field812 = 0;
                var3.field829 = 0;
                if (var3.field830 > client.field297) {
                    var3.field812 = -1;
                }
                if (var3.field836 == 65535) {
                    var3.field836 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field838 = arg0.method2345();
                var3.field834 = arg0.method2345();
                var3.field825 = arg0.method2345();
                var3.field800 = arg0.method2345();
                var3.field844 = arg0.method2346() + client.field297;
                var3.field846 = arg0.method2346() + client.field297;
                var3.field827 = arg0.method2346();
                if (var3.field30) {
                    var3.field838 += var3.field51;
                    var3.field834 += var3.field52;
                    var3.field825 += var3.field51;
                    var3.field800 += var3.field52;
                    var3.field809 = 0;
                } else {
                    var3.field838 += var3.field845[0];
                    var3.field834 += var3.field832[0];
                    var3.field825 += var3.field845[0];
                    var3.field800 += var3.field832[0];
                    var3.field809 = 1;
                }
                var3.field837 = 0;
            }
            if ((var4 & 0x200) != 0) {
                int var24 = arg0.method2346();
                int var25 = arg0.method2344();
                var3.method740(var24, var25, client.field297);
                var3.field813 = client.field297 + 300;
                var3.field795 = arg0.method2344();
                var3.field815 = arg0.method2344();
            }
            if ((var4 & 0x800) != 0) {
                field737[var2] = arg0.method2345();
            }
            if ((var4 & 0x2000) != 0) {
                var5 = arg0.method2345();
            }
            if ((var4 & 0x1000) != 0) {
                for (int var26 = 0; var26 < 3; var26++) {
                    var3.field31[var26] = arg0.method2352();
                }
            }
            if (var3.field30) {
                if (var5 == 127) {
                    var3.method18(var3.field51, var3.field52);
                } else {
                    byte var27;
                    if (var5 == -1) {
                        var27 = field737[var2];
                    } else {
                        var27 = var5;
                    }
                    var3.method17(var3.field51, var3.field52, var27);
                }
            }
        }
    }
}
