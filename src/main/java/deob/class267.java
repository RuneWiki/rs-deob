package deob;

@ObfuscatedName("jb")
public class class267 {

    @ObfuscatedName("jb.e")
    public static final char[] field3650 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    public class267() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.e(CI)B")
    public static byte method928(char arg0) {
        byte var1;
        if (!(arg0 <= 0 || arg0 >= 128) || !(arg0 < 160 || arg0 > 255)) {
            var1 = (byte) arg0;
        } else if (arg0 == 8364) {
            var1 = -128;
        } else if (arg0 == 8218) {
            var1 = -126;
        } else if (arg0 == 402) {
            var1 = -125;
        } else if (arg0 == 8222) {
            var1 = -124;
        } else if (arg0 == 8230) {
            var1 = -123;
        } else if (arg0 == 8224) {
            var1 = -122;
        } else if (arg0 == 8225) {
            var1 = -121;
        } else if (arg0 == 710) {
            var1 = -120;
        } else if (arg0 == 8240) {
            var1 = -119;
        } else if (arg0 == 352) {
            var1 = -118;
        } else if (arg0 == 8249) {
            var1 = -117;
        } else if (arg0 == 338) {
            var1 = -116;
        } else if (arg0 == 381) {
            var1 = -114;
        } else if (arg0 == 8216) {
            var1 = -111;
        } else if (arg0 == 8217) {
            var1 = -110;
        } else if (arg0 == 8220) {
            var1 = -109;
        } else if (arg0 == 8221) {
            var1 = -108;
        } else if (arg0 == 8226) {
            var1 = -107;
        } else if (arg0 == 8211) {
            var1 = -106;
        } else if (arg0 == 8212) {
            var1 = -105;
        } else if (arg0 == 732) {
            var1 = -104;
        } else if (arg0 == 8482) {
            var1 = -103;
        } else if (arg0 == 353) {
            var1 = -102;
        } else if (arg0 == 8250) {
            var1 = -101;
        } else if (arg0 == 339) {
            var1 = -100;
        } else if (arg0 == 382) {
            var1 = -98;
        } else if (arg0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }
        return var1;
    }

    @ObfuscatedName("at.o(CI)C")
    public static char method476(char arg0) {
        return arg0 == 181 || arg0 == 131 ? arg0 : Character.toTitleCase(arg0);
    }

    @ObfuscatedName("fo.m(Ljava/lang/CharSequence;II[BII)I")
    public static int method3103(CharSequence arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int var5 = arg2 - arg1;
        for (int var6 = 0; var6 < var5; var6++) {
            char var7 = arg0.charAt(arg1 + var6);
            if (!(var7 <= 0 || var7 >= 128) || !(var7 < 160 || var7 > 255)) {
                arg3[arg4 + var6] = (byte) var7;
            } else if (var7 == 8364) {
                arg3[arg4 + var6] = -128;
            } else if (var7 == 8218) {
                arg3[arg4 + var6] = -126;
            } else if (var7 == 402) {
                arg3[arg4 + var6] = -125;
            } else if (var7 == 8222) {
                arg3[arg4 + var6] = -124;
            } else if (var7 == 8230) {
                arg3[arg4 + var6] = -123;
            } else if (var7 == 8224) {
                arg3[arg4 + var6] = -122;
            } else if (var7 == 8225) {
                arg3[arg4 + var6] = -121;
            } else if (var7 == 710) {
                arg3[arg4 + var6] = -120;
            } else if (var7 == 8240) {
                arg3[arg4 + var6] = -119;
            } else if (var7 == 352) {
                arg3[arg4 + var6] = -118;
            } else if (var7 == 8249) {
                arg3[arg4 + var6] = -117;
            } else if (var7 == 338) {
                arg3[arg4 + var6] = -116;
            } else if (var7 == 381) {
                arg3[arg4 + var6] = -114;
            } else if (var7 == 8216) {
                arg3[arg4 + var6] = -111;
            } else if (var7 == 8217) {
                arg3[arg4 + var6] = -110;
            } else if (var7 == 8220) {
                arg3[arg4 + var6] = -109;
            } else if (var7 == 8221) {
                arg3[arg4 + var6] = -108;
            } else if (var7 == 8226) {
                arg3[arg4 + var6] = -107;
            } else if (var7 == 8211) {
                arg3[arg4 + var6] = -106;
            } else if (var7 == 8212) {
                arg3[arg4 + var6] = -105;
            } else if (var7 == 732) {
                arg3[arg4 + var6] = -104;
            } else if (var7 == 8482) {
                arg3[arg4 + var6] = -103;
            } else if (var7 == 353) {
                arg3[arg4 + var6] = -102;
            } else if (var7 == 8250) {
                arg3[arg4 + var6] = -101;
            } else if (var7 == 339) {
                arg3[arg4 + var6] = -100;
            } else if (var7 == 382) {
                arg3[arg4 + var6] = -98;
            } else if (var7 == 376) {
                arg3[arg4 + var6] = -97;
            } else {
                arg3[arg4 + var6] = 63;
            }
        }
        return var5;
    }

    @ObfuscatedName("client.g([BIII)Ljava/lang/String;")
    public static String method1374(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = field3650[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }
}
