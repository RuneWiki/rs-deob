package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("fj")
public final class class163 {

    @ObfuscatedName("fj.w")
    public static byte[] field2296 = new byte[520];

    @ObfuscatedName("fj.o")
    public class124 field2294 = null;

    @ObfuscatedName("fj.x")
    public class124 field2295 = null;

    @ObfuscatedName("fj.k")
    public int field2297;

    @ObfuscatedName("fj.f")
    public int field2293 = 65000;

    public class163(int arg0, class124 arg1, class124 arg2, int arg3) {
        this.field2297 = arg0;
        this.field2294 = arg1;
        this.field2295 = arg2;
        this.field2293 = arg3;
    }

    @ObfuscatedName("fj.w(II)[B")
    public byte[] method2733(int arg0) {
        class124 var2 = this.field2294;
        synchronized (this.field2294) {
            Object var10000;
            try {
                if (this.field2295.method2088() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2295.method2087((long) (arg0 * 6));
                this.field2295.method2090(field2296, 0, 6);
                int var3 = (field2296[2] & 0xFF) + ((field2296[0] & 0xFF) << 16) + ((field2296[1] & 0xFF) << 8);
                int var4 = (field2296[5] & 0xFF) + ((field2296[4] & 0xFF) << 8) + ((field2296[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2293) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2294.method2088() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2294.method2087((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2294.method2090(field2296, 0, var8 + 8);
                        int var9 = ((field2296[0] & 0xFF) << 8) + (field2296[1] & 0xFF);
                        int var10 = ((field2296[2] & 0xFF) << 8) + (field2296[3] & 0xFF);
                        int var11 = (field2296[6] & 0xFF) + ((field2296[4] & 0xFF) << 16) + ((field2296[5] & 0xFF) << 8);
                        int var12 = field2296[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2297 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2294.method2088() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2296[var13 + 8];
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

    @ObfuscatedName("fj.o(I[BII)Z")
    public boolean method2732(int arg0, byte[] arg1, int arg2) {
        class124 var4 = this.field2294;
        synchronized (this.field2294) {
            if (arg2 < 0 || arg2 > this.field2293) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2735(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2735(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("fj.x(I[BIZI)Z")
    public boolean method2735(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class124 var5 = this.field2294;
        synchronized (this.field2294) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2295.method2088() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2295.method2087((long) (arg0 * 6));
                    this.field2295.method2090(field2296, 0, 6);
                    var6 = (field2296[5] & 0xFF) + ((field2296[3] & 0xFF) << 16) + ((field2296[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field2294.method2088() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2294.method2088() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2296[0] = (byte) (arg2 >> 16);
                field2296[1] = (byte) (arg2 >> 8);
                field2296[2] = (byte) arg2;
                field2296[3] = (byte) (var6 >> 16);
                field2296[4] = (byte) (var6 >> 8);
                field2296[5] = (byte) var6;
                this.field2295.method2087((long) (arg0 * 6));
                this.field2295.method2096(field2296, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2294.method2087((long) (var6 * 520));
                                try {
                                    this.field2294.method2090(field2296, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2296[0] & 0xFF) << 8) + (field2296[1] & 0xFF);
                                int var12 = ((field2296[2] & 0xFF) << 8) + (field2296[3] & 0xFF);
                                var9 = (field2296[6] & 0xFF) + ((field2296[5] & 0xFF) << 8) + ((field2296[4] & 0xFF) << 16);
                                int var13 = field2296[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2297 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2294.method2088() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2294.method2088() + 519L) / 520L);
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
                            field2296[0] = (byte) (arg0 >> 8);
                            field2296[1] = (byte) arg0;
                            field2296[2] = (byte) (var8 >> 8);
                            field2296[3] = (byte) var8;
                            field2296[4] = (byte) (var9 >> 16);
                            field2296[5] = (byte) (var9 >> 8);
                            field2296[6] = (byte) var9;
                            field2296[7] = (byte) this.field2297;
                            this.field2294.method2087((long) (var6 * 520));
                            this.field2294.method2096(field2296, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2294.method2096(arg1, var7, var14);
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
