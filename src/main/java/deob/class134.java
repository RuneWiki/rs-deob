package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("el")
public final class class134 {

    @ObfuscatedName("el.c")
    public static byte[] field2044 = new byte[520];

    @ObfuscatedName("el.h")
    public class228 field2042 = null;

    @ObfuscatedName("el.k")
    public class228 field2043 = null;

    @ObfuscatedName("el.t")
    public int field2041;

    @ObfuscatedName("el.g")
    public int field2047 = 65000;

    public class134(int arg0, class228 arg1, class228 arg2, int arg3) {
        this.field2041 = arg0;
        this.field2042 = arg1;
        this.field2043 = arg2;
        this.field2047 = arg3;
    }

    @ObfuscatedName("el.c(II)[B")
    public byte[] method2645(int arg0) {
        class228 var2 = this.field2042;
        synchronized (this.field2042) {
            Object var10000;
            try {
                if (this.field2043.method3843() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2043.method3842((long) (arg0 * 6));
                this.field2043.method3865(field2044, 0, 6);
                int var3 = (field2044[2] & 0xFF) + ((field2044[0] & 0xFF) << 16) + ((field2044[1] & 0xFF) << 8);
                int var4 = (field2044[5] & 0xFF) + ((field2044[3] & 0xFF) << 16) + ((field2044[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field2047) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2042.method3843() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2042.method3842((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2042.method3865(field2044, 0, var8 + 8);
                        int var9 = ((field2044[0] & 0xFF) << 8) + (field2044[1] & 0xFF);
                        int var10 = ((field2044[2] & 0xFF) << 8) + (field2044[3] & 0xFF);
                        int var11 = (field2044[6] & 0xFF) + ((field2044[5] & 0xFF) << 8) + ((field2044[4] & 0xFF) << 16);
                        int var12 = field2044[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2041 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2042.method3843() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2044[var13 + 8];
                        }
                        var4 = var11;
                        var7++;
                    }
                    byte[] var18 = var5;
                    return var18;
                }
                var10000 = null;
            } catch (IOException var16) {
                return null;
            }
            return (byte[]) var10000;
        }
    }

    @ObfuscatedName("el.h(I[BIB)Z")
    public boolean method2646(int arg0, byte[] arg1, int arg2) {
        class228 var4 = this.field2042;
        synchronized (this.field2042) {
            if (arg2 < 0 || arg2 > this.field2047) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2647(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2647(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("el.k(I[BIZB)Z")
    public boolean method2647(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class228 var5 = this.field2042;
        synchronized (this.field2042) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2043.method3843() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2043.method3842((long) (arg0 * 6));
                    this.field2043.method3865(field2044, 0, 6);
                    var6 = (field2044[5] & 0xFF) + ((field2044[3] & 0xFF) << 16) + ((field2044[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field2042.method3843() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2042.method3843() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2044[0] = (byte) (arg2 >> 16);
                field2044[1] = (byte) (arg2 >> 8);
                field2044[2] = (byte) arg2;
                field2044[3] = (byte) (var6 >> 16);
                field2044[4] = (byte) (var6 >> 8);
                field2044[5] = (byte) var6;
                this.field2043.method3842((long) (arg0 * 6));
                this.field2043.method3847(field2044, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2042.method3842((long) (var6 * 520));
                                try {
                                    this.field2042.method3865(field2044, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2044[0] & 0xFF) << 8) + (field2044[1] & 0xFF);
                                int var12 = ((field2044[2] & 0xFF) << 8) + (field2044[3] & 0xFF);
                                var9 = (field2044[6] & 0xFF) + ((field2044[5] & 0xFF) << 8) + ((field2044[4] & 0xFF) << 16);
                                int var13 = field2044[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2041 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2042.method3843() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2042.method3843() + 519L) / 520L);
                                if (var9 == 0) {
                                    var9++;
                                }
                                if (var6 == var9) {
                                    var9++;
                                }
                            }
                            if (arg2 - var7 <= 512) {
                                var9 = 0;
                            }
                            field2044[0] = (byte) (arg0 >> 8);
                            field2044[1] = (byte) arg0;
                            field2044[2] = (byte) (var8 >> 8);
                            field2044[3] = (byte) var8;
                            field2044[4] = (byte) (var9 >> 16);
                            field2044[5] = (byte) (var9 >> 8);
                            field2044[6] = (byte) var9;
                            field2044[7] = (byte) this.field2041;
                            this.field2042.method3842((long) (var6 * 520));
                            this.field2042.method3847(field2044, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2042.method3847(arg1, var7, var14);
                            var7 += var14;
                            var6 = var9;
                            var8++;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var18) {
                return false;
            }
        }
    }
}
