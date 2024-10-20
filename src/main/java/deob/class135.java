package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("et")
public final class class135 {

    @ObfuscatedName("et.j")
    public static byte[] field2057 = new byte[520];

    @ObfuscatedName("et.h")
    public class229 field2054 = null;

    @ObfuscatedName("et.m")
    public class229 field2055 = null;

    @ObfuscatedName("et.z")
    public int field2056;

    @ObfuscatedName("et.x")
    public int field2058 = 65000;

    public class135(int arg0, class229 arg1, class229 arg2, int arg3) {
        this.field2056 = arg0;
        this.field2054 = arg1;
        this.field2055 = arg2;
        this.field2058 = arg3;
    }

    @ObfuscatedName("et.j(II)[B")
    public byte[] method2686(int arg0) {
        class229 var2 = this.field2054;
        synchronized (this.field2054) {
            Object var10000;
            try {
                if (this.field2055.method3856() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2055.method3880((long) (arg0 * 6));
                this.field2055.method3871(field2057, 0, 6);
                int var3 = (field2057[2] & 0xFF) + ((field2057[0] & 0xFF) << 16) + ((field2057[1] & 0xFF) << 8);
                int var4 = (field2057[5] & 0xFF) + ((field2057[4] & 0xFF) << 8) + ((field2057[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2058) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2054.method3856() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2054.method3880((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2054.method3871(field2057, 0, var8 + 8);
                        int var9 = ((field2057[0] & 0xFF) << 8) + (field2057[1] & 0xFF);
                        int var10 = ((field2057[2] & 0xFF) << 8) + (field2057[3] & 0xFF);
                        int var11 = (field2057[6] & 0xFF) + ((field2057[4] & 0xFF) << 16) + ((field2057[5] & 0xFF) << 8);
                        int var12 = field2057[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2056 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2054.method3856() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2057[var13 + 8];
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

    @ObfuscatedName("et.h(I[BIB)Z")
    public boolean method2687(int arg0, byte[] arg1, int arg2) {
        class229 var4 = this.field2054;
        synchronized (this.field2054) {
            if (arg2 < 0 || arg2 > this.field2058) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2688(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2688(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("et.m(I[BIZI)Z")
    public boolean method2688(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class229 var5 = this.field2054;
        synchronized (this.field2054) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2055.method3856() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2055.method3880((long) (arg0 * 6));
                    this.field2055.method3871(field2057, 0, 6);
                    var6 = (field2057[5] & 0xFF) + ((field2057[4] & 0xFF) << 8) + ((field2057[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field2054.method3856() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2054.method3856() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2057[0] = (byte) (arg2 >> 16);
                field2057[1] = (byte) (arg2 >> 8);
                field2057[2] = (byte) arg2;
                field2057[3] = (byte) (var6 >> 16);
                field2057[4] = (byte) (var6 >> 8);
                field2057[5] = (byte) var6;
                this.field2055.method3880((long) (arg0 * 6));
                this.field2055.method3860(field2057, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2054.method3880((long) (var6 * 520));
                                try {
                                    this.field2054.method3871(field2057, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2057[0] & 0xFF) << 8) + (field2057[1] & 0xFF);
                                int var12 = ((field2057[2] & 0xFF) << 8) + (field2057[3] & 0xFF);
                                var9 = (field2057[6] & 0xFF) + ((field2057[5] & 0xFF) << 8) + ((field2057[4] & 0xFF) << 16);
                                int var13 = field2057[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2056 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2054.method3856() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2054.method3856() + 519L) / 520L);
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
                            field2057[0] = (byte) (arg0 >> 8);
                            field2057[1] = (byte) arg0;
                            field2057[2] = (byte) (var8 >> 8);
                            field2057[3] = (byte) var8;
                            field2057[4] = (byte) (var9 >> 16);
                            field2057[5] = (byte) (var9 >> 8);
                            field2057[6] = (byte) var9;
                            field2057[7] = (byte) this.field2056;
                            this.field2054.method3880((long) (var6 * 520));
                            this.field2054.method3860(field2057, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2054.method3860(arg1, var7, var14);
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
