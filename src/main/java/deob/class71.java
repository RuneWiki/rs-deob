package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bt")
public final class class71 {

    @ObfuscatedName("bt.x")
    public static byte[] field1268 = new byte[520];

    @ObfuscatedName("bt.p")
    public class30 field1274 = null;

    @ObfuscatedName("bt.k")
    public class30 field1270 = null;

    @ObfuscatedName("bt.a")
    public int field1269;

    @ObfuscatedName("bt.q")
    public int field1271 = 65000;

    public class71(int arg0, class30 arg1, class30 arg2, int arg3) {
        this.field1269 = arg0;
        this.field1274 = arg1;
        this.field1270 = arg2;
        this.field1271 = arg3;
    }

    @ObfuscatedName("bt.x(IB)[B")
    public byte[] method1374(int arg0) {
        class30 var2 = this.field1274;
        synchronized (this.field1274) {
            Object var10000;
            try {
                if (this.field1270.method554() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1270.method553((long) (arg0 * 6));
                this.field1270.method567(field1268, 0, 6);
                int var3 = (field1268[2] & 0xFF) + ((field1268[0] & 0xFF) << 16) + ((field1268[1] & 0xFF) << 8);
                int var4 = (field1268[5] & 0xFF) + ((field1268[3] & 0xFF) << 16) + ((field1268[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field1271) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1274.method554() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1274.method553((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1274.method567(field1268, 0, var8 + 8);
                        int var9 = ((field1268[0] & 0xFF) << 8) + (field1268[1] & 0xFF);
                        int var10 = ((field1268[2] & 0xFF) << 8) + (field1268[3] & 0xFF);
                        int var11 = (field1268[6] & 0xFF) + ((field1268[5] & 0xFF) << 8) + ((field1268[4] & 0xFF) << 16);
                        int var12 = field1268[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1269 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1274.method554() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1268[var13 + 8];
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

    @ObfuscatedName("bt.p(I[BIB)Z")
    public boolean method1375(int arg0, byte[] arg1, int arg2) {
        class30 var4 = this.field1274;
        synchronized (this.field1274) {
            if (arg2 < 0 || arg2 > this.field1271) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method1376(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method1376(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("bt.k(I[BIZI)Z")
    public boolean method1376(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class30 var5 = this.field1274;
        synchronized (this.field1274) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1270.method554() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1270.method553((long) (arg0 * 6));
                    this.field1270.method567(field1268, 0, 6);
                    var6 = (field1268[5] & 0xFF) + ((field1268[4] & 0xFF) << 8) + ((field1268[3] & 0xFF) << 16);
                    if (var6 <= 0 || (long) var6 > this.field1274.method554() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1274.method554() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1268[0] = (byte) (arg2 >> 16);
                field1268[1] = (byte) (arg2 >> 8);
                field1268[2] = (byte) arg2;
                field1268[3] = (byte) (var6 >> 16);
                field1268[4] = (byte) (var6 >> 8);
                field1268[5] = (byte) var6;
                this.field1270.method553((long) (arg0 * 6));
                this.field1270.method558(field1268, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1274.method553((long) (var6 * 520));
                                try {
                                    this.field1274.method567(field1268, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1268[0] & 0xFF) << 8) + (field1268[1] & 0xFF);
                                int var12 = ((field1268[2] & 0xFF) << 8) + (field1268[3] & 0xFF);
                                var9 = (field1268[6] & 0xFF) + ((field1268[5] & 0xFF) << 8) + ((field1268[4] & 0xFF) << 16);
                                int var13 = field1268[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1269 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1274.method554() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1274.method554() + 519L) / 520L);
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
                            field1268[0] = (byte) (arg0 >> 8);
                            field1268[1] = (byte) arg0;
                            field1268[2] = (byte) (var8 >> 8);
                            field1268[3] = (byte) var8;
                            field1268[4] = (byte) (var9 >> 16);
                            field1268[5] = (byte) (var9 >> 8);
                            field1268[6] = (byte) var9;
                            field1268[7] = (byte) this.field1269;
                            this.field1274.method553((long) (var6 * 520));
                            this.field1274.method558(field1268, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1274.method558(arg1, var7, var14);
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
