package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("bq")
public final class class71 {

    @ObfuscatedName("bq.a")
    public static byte[] field1300 = new byte[520];

    @ObfuscatedName("bq.x")
    public class30 field1299 = null;

    @ObfuscatedName("bq.e")
    public class30 field1306 = null;

    @ObfuscatedName("bq.r")
    public int field1301;

    @ObfuscatedName("bq.p")
    public int field1302 = 65000;

    public class71(int arg0, class30 arg1, class30 arg2, int arg3) {
        this.field1301 = arg0;
        this.field1299 = arg1;
        this.field1306 = arg2;
        this.field1302 = arg3;
    }

    @ObfuscatedName("bq.a(II)[B")
    public byte[] method1376(int arg0) {
        class30 var2 = this.field1299;
        synchronized (this.field1299) {
            Object var10000;
            try {
                if (this.field1306.method578() < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1306.method588((long) (arg0 * 6));
                this.field1306.method596(field1300, 0, 6);
                int var3 = (field1300[2] & 0xFF) + ((field1300[0] & 0xFF) << 16) + ((field1300[1] & 0xFF) << 8);
                int var4 = (field1300[5] & 0xFF) + ((field1300[3] & 0xFF) << 16) + ((field1300[4] & 0xFF) << 8);
                if (var3 < 0 || var3 > this.field1302) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (var4 > 0 && (long) var4 <= this.field1299.method578() / 520L) {
                    byte[] var5 = new byte[var3];
                    int var6 = 0;
                    int var7 = 0;
                    while (var6 < var3) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1299.method588((long) (var4 * 520));
                        int var8 = var3 - var6;
                        if (var8 > 512) {
                            var8 = 512;
                        }
                        this.field1299.method596(field1300, 0, var8 + 8);
                        int var9 = ((field1300[0] & 0xFF) << 8) + (field1300[1] & 0xFF);
                        int var10 = ((field1300[2] & 0xFF) << 8) + (field1300[3] & 0xFF);
                        int var11 = (field1300[6] & 0xFF) + ((field1300[5] & 0xFF) << 8) + ((field1300[4] & 0xFF) << 16);
                        int var12 = field1300[7] & 0xFF;
                        if (arg0 != var9 || var7 != var10 || this.field1301 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field1299.method578() / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var13 = 0; var13 < var8; var13++) {
                            var5[var6++] = field1300[var13 + 8];
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

    @ObfuscatedName("bq.x(I[BII)Z")
    public boolean method1375(int arg0, byte[] arg1, int arg2) {
        class30 var4 = this.field1299;
        synchronized (this.field1299) {
            if (arg2 < 0 || arg2 > this.field1302) {
                throw new IllegalArgumentException();
            }
            boolean var5 = this.method1378(arg0, arg1, arg2, true);
            if (!var5) {
                var5 = this.method1378(arg0, arg1, arg2, false);
            }
            return var5;
        }
    }

    @ObfuscatedName("bq.e(I[BIZI)Z")
    public boolean method1378(int arg0, byte[] arg1, int arg2, boolean arg3) {
        class30 var5 = this.field1299;
        synchronized (this.field1299) {
            try {
                int var6;
                boolean var10000;
                if (arg3) {
                    if (this.field1306.method578() < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1306.method588((long) (arg0 * 6));
                    this.field1306.method596(field1300, 0, 6);
                    var6 = (field1300[5] & 0xFF) + ((field1300[3] & 0xFF) << 16) + ((field1300[4] & 0xFF) << 8);
                    if (var6 <= 0 || (long) var6 > this.field1299.method578() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var6 = (int) ((this.field1299.method578() + 519L) / 520L);
                    if (var6 == 0) {
                        var6 = 1;
                    }
                }
                field1300[0] = (byte) (arg2 >> 16);
                field1300[1] = (byte) (arg2 >> 8);
                field1300[2] = (byte) arg2;
                field1300[3] = (byte) (var6 >> 16);
                field1300[4] = (byte) (var6 >> 8);
                field1300[5] = (byte) var6;
                this.field1306.method588((long) (arg0 * 6));
                this.field1306.method582(field1300, 0, 6);
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    if (var7 < arg2) {
                        label129: {
                            int var9 = 0;
                            if (arg3) {
                                this.field1299.method588((long) (var6 * 520));
                                try {
                                    this.field1299.method596(field1300, 0, 8);
                                } catch (EOFException var17) {
                                    break label129;
                                }
                                int var11 = ((field1300[0] & 0xFF) << 8) + (field1300[1] & 0xFF);
                                int var12 = ((field1300[2] & 0xFF) << 8) + (field1300[3] & 0xFF);
                                var9 = (field1300[6] & 0xFF) + ((field1300[5] & 0xFF) << 8) + ((field1300[4] & 0xFF) << 16);
                                int var13 = field1300[7] & 0xFF;
                                if (arg0 != var11 || var8 != var12 || this.field1301 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var9 < 0 || (long) var9 > this.field1299.method578() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var9 == 0) {
                                arg3 = false;
                                var9 = (int) ((this.field1299.method578() + 519L) / 520L);
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
                            field1300[0] = (byte) (arg0 >> 8);
                            field1300[1] = (byte) arg0;
                            field1300[2] = (byte) (var8 >> 8);
                            field1300[3] = (byte) var8;
                            field1300[4] = (byte) (var9 >> 16);
                            field1300[5] = (byte) (var9 >> 8);
                            field1300[6] = (byte) var9;
                            field1300[7] = (byte) this.field1301;
                            this.field1299.method588((long) (var6 * 520));
                            this.field1299.method582(field1300, 0, 8);
                            int var14 = arg2 - var7;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1299.method582(arg1, var7, var14);
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
