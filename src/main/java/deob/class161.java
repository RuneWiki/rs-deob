package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("fz")
public final class class161 {

    @ObfuscatedName("fz.a")
    public static byte[] field2280 = new byte[520];

    @ObfuscatedName("fz.j")
    public class124 field2274 = null;

    @ObfuscatedName("fz.n")
    public class124 field2275 = null;

    @ObfuscatedName("fz.r")
    public int field2273;

    @ObfuscatedName("fz.v")
    public int field2277 = 65000;

    public class161(int arg0, class124 arg1, class124 arg2, int arg3) {
        this.field2273 = arg0;
        this.field2274 = arg1;
        this.field2275 = arg2;
        this.field2277 = arg3;
    }

    @ObfuscatedName("fz.a(II)[B")
    public byte[] method2747(int arg0) {
        class124 var2 = this.field2274;
        synchronized (this.field2274) {
            Object var10000;
            try {
                if (this.field2275.method2108() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2275.method2107((long) (arg0 * 6));
                this.field2275.method2115(field2280, 0, 6);
                int var3 = (field2280[2] & 0xFF) + ((field2280[0] & 0xFF) << 16) + ((field2280[1] & 0xFF) << 8);
                int var4 = (field2280[5] & 0xFF) + ((field2280[4] & 0xFF) << 8) + ((field2280[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2277) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2274.method2108() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2274.method2107((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2274.method2115(field2280, 0, var8 + 8);
                        int var9 = ((field2280[0] & 0xFF) << 8) + (field2280[1] & 0xFF);
                        int var10 = ((field2280[2] & 0xFF) << 8) + (field2280[3] & 0xFF);
                        int var11 = (field2280[6] & 0xFF) + ((field2280[4] & 0xFF) << 16) + ((field2280[5] & 0xFF) << 8);
                        int var12 = field2280[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2273 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2274.method2108() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2280[var13 + 8];
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

    @ObfuscatedName("fz.j(I[BIB)Z")
    public boolean method2753(int arg0, byte[] arg1, int arg2) {
        class124 var4 = this.field2274;
        synchronized (this.field2274) {
            if (arg2 < 0 || arg2 > this.field2277) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2744(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2744(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("fz.n(I[BIZI)Z")
    public boolean method2744(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class124 var5 = this.field2274;
        synchronized (this.field2274) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2275.method2108() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2275.method2107((long) (arg0 * 6));
                    this.field2275.method2115(field2280, 0, 6);
                    var6 = (field2280[5] & 0xFF) + ((field2280[3] & 0xFF) << 16) + ((field2280[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field2274.method2108() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2274.method2108() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2280[0] = (byte) (arg2 >> 16);
                field2280[1] = (byte) (arg2 >> 8);
                field2280[2] = (byte) arg2;
                field2280[3] = (byte) (var6 >> 16);
                field2280[4] = (byte) (var6 >> 8);
                field2280[5] = (byte) var6;
                this.field2275.method2107((long) (arg0 * 6));
                this.field2275.method2111(field2280, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2274.method2107((long) (var6 * 520));
                                try {
                                    this.field2274.method2115(field2280, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2280[0] & 0xFF) << 8) + (field2280[1] & 0xFF);
                                int var12 = ((field2280[2] & 0xFF) << 8) + (field2280[3] & 0xFF);
                                var9 = (field2280[6] & 0xFF) + ((field2280[5] & 0xFF) << 8) + ((field2280[4] & 0xFF) << 16);
                                int var13 = field2280[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2273 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2274.method2108() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2274.method2108() + 519L) / 520L);
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
                            field2280[0] = (byte) (arg0 >> 8);
                            field2280[1] = (byte) arg0;
                            field2280[2] = (byte) (var8 >> 8);
                            field2280[3] = (byte) var8;
                            field2280[4] = (byte) (var9 >> 16);
                            field2280[5] = (byte) (var9 >> 8);
                            field2280[6] = (byte) var9;
                            field2280[7] = (byte) this.field2273;
                            this.field2274.method2107((long) (var6 * 520));
                            this.field2274.method2111(field2280, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2274.method2111(arg1, var7, var14);
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
