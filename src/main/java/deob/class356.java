package deob;

@ObfuscatedName("mk")
public class class356 {

    @ObfuscatedName("mk.a")
    public static final char[] field4294 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    public class356() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.a(CI)B")
    public static byte method2561(char arg0) {
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

    @ObfuscatedName("js.f(CI)Z")
    public static boolean method4926(char arg0) {
        if (!(arg0 < ' ' || arg0 >= 127) || !(arg0 <= 127 || arg0 >= 160) || !(arg0 <= 160 || arg0 > 255)) {
            return true;
        }
        if (arg0 != 0) {
            char[] var1 = field4294;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("fc.c(CI)C")
    public static char method2994(char arg0) {
        return arg0 == 181 || arg0 == 402 ? arg0 : Character.toTitleCase(arg0);
    }

    @ObfuscatedName("jb.x(Ljava/lang/CharSequence;I)[B")
    public static byte[] method4848(CharSequence arg0) {
        int var1 = arg0.length();
        byte[] var2 = new byte[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (!(var4 <= 0 || var4 >= 128) || !(var4 < 160 || var4 > 255)) {
                var2[var3] = (byte) var4;
            } else if (var4 == 8364) {
                var2[var3] = -128;
            } else if (var4 == 8218) {
                var2[var3] = -126;
            } else if (var4 == 402) {
                var2[var3] = -125;
            } else if (var4 == 8222) {
                var2[var3] = -124;
            } else if (var4 == 8230) {
                var2[var3] = -123;
            } else if (var4 == 8224) {
                var2[var3] = -122;
            } else if (var4 == 8225) {
                var2[var3] = -121;
            } else if (var4 == 710) {
                var2[var3] = -120;
            } else if (var4 == 8240) {
                var2[var3] = -119;
            } else if (var4 == 352) {
                var2[var3] = -118;
            } else if (var4 == 8249) {
                var2[var3] = -117;
            } else if (var4 == 338) {
                var2[var3] = -116;
            } else if (var4 == 381) {
                var2[var3] = -114;
            } else if (var4 == 8216) {
                var2[var3] = -111;
            } else if (var4 == 8217) {
                var2[var3] = -110;
            } else if (var4 == 8220) {
                var2[var3] = -109;
            } else if (var4 == 8221) {
                var2[var3] = -108;
            } else if (var4 == 8226) {
                var2[var3] = -107;
            } else if (var4 == 8211) {
                var2[var3] = -106;
            } else if (var4 == 8212) {
                var2[var3] = -105;
            } else if (var4 == 732) {
                var2[var3] = -104;
            } else if (var4 == 8482) {
                var2[var3] = -103;
            } else if (var4 == 353) {
                var2[var3] = -102;
            } else if (var4 == 8250) {
                var2[var3] = -101;
            } else if (var4 == 339) {
                var2[var3] = -100;
            } else if (var4 == 382) {
                var2[var3] = -98;
            } else if (var4 == 376) {
                var2[var3] = -97;
            } else {
                var2[var3] = 63;
            }
        }
        return var2;
    }

    @ObfuscatedName("dv.j([BIIB)Ljava/lang/String;")
    public static String method2782(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = field4294[var6 - 128];
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
