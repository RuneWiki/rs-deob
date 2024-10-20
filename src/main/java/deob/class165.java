package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("fp")
public final class class165 {

    @ObfuscatedName("fp.g")
    public static byte[] field2075 = new byte[520];

    @ObfuscatedName("fp.r")
    public class112 field2070 = null;

    @ObfuscatedName("fp.e")
    public class112 field2071 = null;

    @ObfuscatedName("fp.q")
    public int field2069;

    @ObfuscatedName("fp.c")
    public int field2073 = 65000;

    public class165(int arg0, class112 arg1, class112 arg2, int arg3) {
        this.field2069 = arg0;
        this.field2070 = arg1;
        this.field2071 = arg2;
        this.field2073 = arg3;
    }

    @ObfuscatedName("fp.g(II)[B")
    public byte[] method3292(int arg0) {
        class112 var2 = this.field2070;
        synchronized (this.field2070) {
            Object var10000;
            try {
                if (this.field2071.method2493() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2071.method2481((long) (arg0 * 6));
                this.field2071.method2484(field2075, 0, 6);
                int var3 = (field2075[2] & 0xFF) + ((field2075[0] & 0xFF) << 16) + ((field2075[1] & 0xFF) << 8);
                int var4 = (field2075[5] & 0xFF) + ((field2075[4] & 0xFF) << 8) + ((field2075[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2073) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2070.method2493() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2070.method2481((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2070.method2484(field2075, 0, var8 + 8);
                        int var9 = ((field2075[0] & 0xFF) << 8) + (field2075[1] & 0xFF);
                        int var10 = ((field2075[2] & 0xFF) << 8) + (field2075[3] & 0xFF);
                        int var11 = (field2075[6] & 0xFF) + ((field2075[5] & 0xFF) << 8) + ((field2075[4] & 0xFF) << 16);
                        int var12 = field2075[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2069 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2070.method2493() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2075[var13 + 8];
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

    @ObfuscatedName("fp.r(I[BIB)Z")
    public boolean method3287(int arg0, byte[] arg1, int arg2) {
        class112 var4 = this.field2070;
        synchronized (this.field2070) {
            if (arg2 < 0 || arg2 > this.field2073) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method3288(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method3288(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("fp.e(I[BIZI)Z")
    public boolean method3288(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class112 var5 = this.field2070;
        synchronized (this.field2070) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2071.method2493() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2071.method2481((long) (arg0 * 6));
                    this.field2071.method2484(field2075, 0, 6);
                    var6 = (field2075[5] & 0xFF) + ((field2075[3] & 0xFF) << 16) + ((field2075[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field2070.method2493() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2070.method2493() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2075[0] = (byte) (arg2 >> 16);
                field2075[1] = (byte) (arg2 >> 8);
                field2075[2] = (byte) arg2;
                field2075[3] = (byte) (var6 >> 16);
                field2075[4] = (byte) (var6 >> 8);
                field2075[5] = (byte) var6;
                this.field2071.method2481((long) (arg0 * 6));
                this.field2071.method2490(field2075, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2070.method2481((long) (var6 * 520));
                                try {
                                    this.field2070.method2484(field2075, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2075[0] & 0xFF) << 8) + (field2075[1] & 0xFF);
                                int var12 = ((field2075[2] & 0xFF) << 8) + (field2075[3] & 0xFF);
                                var9 = (field2075[6] & 0xFF) + ((field2075[4] & 0xFF) << 16) + ((field2075[5] & 0xFF) << 8);
                                int var13 = field2075[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2069 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2070.method2493() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2070.method2493() + 519L) / 520L);
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
                            field2075[0] = (byte) (arg0 >> 8);
                            field2075[1] = (byte) arg0;
                            field2075[2] = (byte) (var8 >> 8);
                            field2075[3] = (byte) var8;
                            field2075[4] = (byte) (var9 >> 16);
                            field2075[5] = (byte) (var9 >> 8);
                            field2075[6] = (byte) var9;
                            field2075[7] = (byte) this.field2069;
                            this.field2070.method2481((long) (var6 * 520));
                            this.field2070.method2490(field2075, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2070.method2490(arg1, var7, var14);
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
