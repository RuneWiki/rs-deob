package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ea")
public final class class134 {

    @ObfuscatedName("ea.z")
    public static byte[] field2072 = new byte[520];

    @ObfuscatedName("ea.q")
    public class228 field2068 = null;

    @ObfuscatedName("ea.k")
    public class228 field2073 = null;

    @ObfuscatedName("ea.f")
    public int field2070;

    @ObfuscatedName("ea.d")
    public int field2071 = 65000;

    public class134(int arg0, class228 arg1, class228 arg2, int arg3) {
        this.field2070 = arg0;
        this.field2068 = arg1;
        this.field2073 = arg2;
        this.field2071 = arg3;
    }

    @ObfuscatedName("ea.z(II)[B")
    public byte[] method2658(int arg0) {
        class228 var2 = this.field2068;
        synchronized (this.field2068) {
            Object var10000;
            try {
                if (this.field2073.method3797() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2073.method3811((long) (arg0 * 6));
                this.field2073.method3808(field2072, 0, 6);
                int var3 = (field2072[2] & 0xFF) + ((field2072[1] & 0xFF) << 8) + ((field2072[0] & 0xFF) << 16);
                int var4 = (field2072[5] & 0xFF) + ((field2072[3] & 0xFF) << 16) + ((field2072[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field2071) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2068.method3797() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2068.method3811((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2068.method3808(field2072, 0, var8 + 8);
                        int var9 = ((field2072[0] & 0xFF) << 8) + (field2072[1] & 0xFF);
                        int var10 = ((field2072[2] & 0xFF) << 8) + (field2072[3] & 0xFF);
                        int var11 = (field2072[6] & 0xFF) + ((field2072[4] & 0xFF) << 16) + ((field2072[5] & 0xFF) << 8);
                        int var12 = field2072[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2070 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2068.method3797() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2072[var13 + 8];
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

    @ObfuscatedName("ea.q(I[BII)Z")
    public boolean method2659(int arg0, byte[] arg1, int arg2) {
        class228 var4 = this.field2068;
        synchronized (this.field2068) {
            if (arg2 < 0 || arg2 > this.field2071) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method2660(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method2660(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("ea.k(I[BIZI)Z")
    public boolean method2660(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class228 var5 = this.field2068;
        synchronized (this.field2068) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2073.method3797() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2073.method3811((long) (arg0 * 6));
                    this.field2073.method3808(field2072, 0, 6);
                    var6 = (field2072[5] & 0xFF) + ((field2072[4] & 0xFF) << 8) + ((field2072[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field2068.method3797() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2068.method3797() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2072[0] = (byte) (arg2 >> 16);
                field2072[1] = (byte) (arg2 >> 8);
                field2072[2] = (byte) arg2;
                field2072[3] = (byte) (var6 >> 16);
                field2072[4] = (byte) (var6 >> 8);
                field2072[5] = (byte) var6;
                this.field2073.method3811((long) (arg0 * 6));
                this.field2073.method3790(field2072, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2068.method3811((long) (var6 * 520));
                                try {
                                    this.field2068.method3808(field2072, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2072[0] & 0xFF) << 8) + (field2072[1] & 0xFF);
                                int var12 = ((field2072[2] & 0xFF) << 8) + (field2072[3] & 0xFF);
                                var9 = (field2072[6] & 0xFF) + ((field2072[5] & 0xFF) << 8) + ((field2072[4] & 0xFF) << 16);
                                int var13 = field2072[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2070 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2068.method3797() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2068.method3797() + 519L) / 520L);
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
                            field2072[0] = (byte) (arg0 >> 8);
                            field2072[1] = (byte) arg0;
                            field2072[2] = (byte) (var8 >> 8);
                            field2072[3] = (byte) var8;
                            field2072[4] = (byte) (var9 >> 16);
                            field2072[5] = (byte) (var9 >> 8);
                            field2072[6] = (byte) var9;
                            field2072[7] = (byte) this.field2070;
                            this.field2068.method3811((long) (var6 * 520));
                            this.field2068.method3790(field2072, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2068.method3790(arg1, var7, var14);
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
