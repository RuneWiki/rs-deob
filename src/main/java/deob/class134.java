package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("en")
public final class class134 {

    @ObfuscatedName("en.f")
    public static byte[] field2080 = new byte[520];

    @ObfuscatedName("en.s")
    public class228 field2079 = null;

    @ObfuscatedName("en.q")
    public class228 field2078 = null;

    @ObfuscatedName("en.g")
    public int field2081;

    @ObfuscatedName("en.m")
    public int field2082 = 65000;

    public class134(int arg0, class228 arg1, class228 arg2, int arg3) {
        this.field2081 = arg0;
        this.field2079 = arg1;
        this.field2078 = arg2;
        this.field2082 = arg3;
    }

    @ObfuscatedName("en.f(II)[B")
    public byte[] method2693(int arg0) {
        class228 var2 = this.field2079;
        synchronized (this.field2079) {
            Object var10000;
            try {
                if (this.field2078.method3869() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2078.method3868((long) (arg0 * 6));
                this.field2078.method3871(field2080, 0, 6);
                int var3 = (field2080[2] & 0xFF) + ((field2080[0] & 0xFF) << 16) + ((field2080[1] & 0xFF) << 8);
                int var4 = (field2080[5] & 0xFF) + ((field2080[4] & 0xFF) << 8) + ((field2080[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2082) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2079.method3869() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2079.method3868((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2079.method3871(field2080, 0, var8 + 8);
                        int var9 = ((field2080[0] & 0xFF) << 8) + (field2080[1] & 0xFF);
                        int var10 = ((field2080[2] & 0xFF) << 8) + (field2080[3] & 0xFF);
                        int var11 = (field2080[6] & 0xFF) + ((field2080[4] & 0xFF) << 16) + ((field2080[5] & 0xFF) << 8);
                        int var12 = field2080[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2081 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2079.method3869() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2080[var13 + 8];
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

    @ObfuscatedName("en.s(I[BII)Z")
    public boolean method2694(int arg0, byte[] arg1, int arg2) {
        class228 var4 = this.field2079;
        synchronized (this.field2079) {
            if (arg2 < 0 || arg2 > this.field2082) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2692(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2692(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("en.q(I[BIZB)Z")
    public boolean method2692(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class228 var5 = this.field2079;
        synchronized (this.field2079) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2078.method3869() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2078.method3868((long) (arg0 * 6));
                    this.field2078.method3871(field2080, 0, 6);
                    var6 = (field2080[5] & 0xFF) + ((field2080[4] & 0xFF) << 8) + ((field2080[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field2079.method3869() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2079.method3869() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2080[0] = (byte) (arg2 >> 16);
                field2080[1] = (byte) (arg2 >> 8);
                field2080[2] = (byte) arg2;
                field2080[3] = (byte) (var6 >> 16);
                field2080[4] = (byte) (var6 >> 8);
                field2080[5] = (byte) var6;
                this.field2078.method3868((long) (arg0 * 6));
                this.field2078.method3867(field2080, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2079.method3868((long) (var6 * 520));
                                try {
                                    this.field2079.method3871(field2080, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2080[0] & 0xFF) << 8) + (field2080[1] & 0xFF);
                                int var12 = ((field2080[2] & 0xFF) << 8) + (field2080[3] & 0xFF);
                                var9 = (field2080[6] & 0xFF) + ((field2080[4] & 0xFF) << 16) + ((field2080[5] & 0xFF) << 8);
                                int var13 = field2080[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2081 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2079.method3869() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2079.method3869() + 519L) / 520L);
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
                            field2080[0] = (byte) (arg0 >> 8);
                            field2080[1] = (byte) arg0;
                            field2080[2] = (byte) (var8 >> 8);
                            field2080[3] = (byte) var8;
                            field2080[4] = (byte) (var9 >> 16);
                            field2080[5] = (byte) (var9 >> 8);
                            field2080[6] = (byte) var9;
                            field2080[7] = (byte) this.field2081;
                            this.field2079.method3868((long) (var6 * 520));
                            this.field2079.method3867(field2080, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2079.method3867(arg1, var7, var14);
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
