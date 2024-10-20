package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ff")
public final class class163 {

    @ObfuscatedName("ff.w")
    public static byte[] field2028 = new byte[520];

    @ObfuscatedName("ff.m")
    public class110 field2024 = null;

    @ObfuscatedName("ff.q")
    public class110 field2026 = null;

    @ObfuscatedName("ff.b")
    public int field2027;

    @ObfuscatedName("ff.f")
    public int field2025 = 65000;

    public class163(int arg0, class110 arg1, class110 arg2, int arg3) {
        this.field2027 = arg0;
        this.field2024 = arg1;
        this.field2026 = arg2;
        this.field2025 = arg3;
    }

    @ObfuscatedName("ff.w(IB)[B")
    public byte[] method3085(int arg0) {
        class110 var2 = this.field2024;
        synchronized (this.field2024) {
            Object var10000;
            try {
                if (this.field2026.method2318() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2026.method2308((long) (arg0 * 6));
                this.field2026.method2315(field2028, 0, 6);
                int var3 = (field2028[2] & 0xFF) + ((field2028[1] & 0xFF) << 8) + ((field2028[0] & 0xFF) << 16);
                int var4 = (field2028[5] & 0xFF) + ((field2028[4] & 0xFF) << 8) + ((field2028[3] & 0xFF) << 16);
                if (var3 < 0 || var3 > this.field2025) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field2024.method2318() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field2024.method2308((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field2024.method2315(field2028, 0, var8 + 8);
                        int var9 = ((field2028[0] & 0xFF) << 8) + (field2028[1] & 0xFF);
                        int var10 = ((field2028[2] & 0xFF) << 8) + (field2028[3] & 0xFF);
                        int var11 = (field2028[6] & 0xFF) + ((field2028[4] & 0xFF) << 16) + ((field2028[5] & 0xFF) << 8);
                        int var12 = field2028[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field2027 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field2024.method2318() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field2028[var13 + 8];
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

    @ObfuscatedName("ff.m(I[BIB)Z")
    public boolean method3086(int arg0, byte[] arg1, int arg2) {
        class110 var4 = this.field2024;
        synchronized (this.field2024) {
            if (arg2 < 0 || arg2 > this.field2025) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method3087(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method3087(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("ff.q(I[BIZB)Z")
    public boolean method3087(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class110 var5 = this.field2024;
        synchronized (this.field2024) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field2026.method2318() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2026.method2308((long) (arg0 * 6));
                    this.field2026.method2315(field2028, 0, 6);
                    var6 = (field2028[5] & 0xFF) + ((field2028[4] & 0xFF) << 8) + ((field2028[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field2024.method2318() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field2024.method2318() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field2028[0] = (byte) (arg2 >> 16);
                field2028[1] = (byte) (arg2 >> 8);
                field2028[2] = (byte) arg2;
                field2028[3] = (byte) (var6 >> 16);
                field2028[4] = (byte) (var6 >> 8);
                field2028[5] = (byte) var6;
                this.field2026.method2308((long) (arg0 * 6));
                this.field2026.method2313(field2028, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field2024.method2308((long) (var6 * 520));
                                try {
                                    this.field2024.method2315(field2028, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field2028[0] & 0xFF) << 8) + (field2028[1] & 0xFF);
                                int var12 = ((field2028[2] & 0xFF) << 8) + (field2028[3] & 0xFF);
                                var9 = (field2028[6] & 0xFF) + ((field2028[4] & 0xFF) << 16) + ((field2028[5] & 0xFF) << 8);
                                int var13 = field2028[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field2027 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field2024.method2318() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field2024.method2318() + 519L) / 520L);
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
                            field2028[0] = (byte) (arg0 >> 8);
                            field2028[1] = (byte) arg0;
                            field2028[2] = (byte) (var8 >> 8);
                            field2028[3] = (byte) var8;
                            field2028[4] = (byte) (var9 >> 16);
                            field2028[5] = (byte) (var9 >> 8);
                            field2028[6] = (byte) var9;
                            field2028[7] = (byte) this.field2027;
                            this.field2024.method2308((long) (var6 * 520));
                            this.field2024.method2313(field2028, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field2024.method2313(arg1, var7, var14);
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
